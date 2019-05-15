package com.amdocs.jshapi.bamx.translate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.amdocs.jshapi.bamx.CatESNBanoEscusado;
import com.amdocs.jshapi.bamx.CatESNCondicionVivienda;
import com.amdocs.jshapi.bamx.CatESNDocIdentidad;
import com.amdocs.jshapi.bamx.CatESNEquipamiento;
import com.amdocs.jshapi.bamx.CatESNServicioGas;
import com.amdocs.jshapi.bamx.CatESNTenencia;
import com.amdocs.jshapi.bamx.CatESNTipoApoyo;
import com.amdocs.jshapi.bamx.CatGralDuracionMeses;
import com.amdocs.jshapi.bamx.CatPGralFrecuencia;
import com.amdocs.jshapi.bamx.CatPGralFrecuenciaApoyoEspecie;
import com.amdocs.jshapi.bamx.CatPGralFrecuenciaRemesas;
import com.amdocs.jshapi.bamx.CatPGralParedes;
import com.amdocs.jshapi.bamx.CatPGralTechos;
import com.amdocs.jshapi.bamx.CatPGralTipoVivienda;
import com.amdocs.jshapi.bamx.CatPGralTiposPisos;
import com.amdocs.jshapi.bamx.ESNAlimentacionRespuesta;
import com.amdocs.jshapi.bamx.ESNBeneficiario;
import com.amdocs.jshapi.bamx.ESNCompleto;
import com.amdocs.jshapi.bamx.ESNEgresoSemanal;
import com.amdocs.jshapi.bamx.ESNEquipamientosEstudio;
import com.amdocs.jshapi.bamx.ESNIngresoSemanal;
import com.amdocs.jshapi.estudios.Alimentacion;
import com.amdocs.jshapi.estudios.CondicionesEconomicas;
import com.amdocs.jshapi.estudios.DatosGenerales;
import com.amdocs.jshapi.estudios.Estudio;
import com.amdocs.jshapi.estudios.InfraestructuraDeVivienda;
import com.amdocs.jshapi.estudios.Integrante;
import com.amdocs.jshapi.estudios.Representante;
import com.amdocs.jshapi.estudios.Servicios;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EstudioToESNCompletoTranslate extends EstudioToESNTranslate {
	
	public static int No_Menor18 = 0;
	
	public static String SerializeESN (ESNCompleto bmxesn)
	{
		 
		ObjectMapper objectmapper = new ObjectMapper();
		String requestString = "";
		try {
			requestString = objectmapper.writeValueAsString(bmxesn);
			System.out.println(requestString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return requestString; 
	}
	
	public static String GetStringESNCompleto(Estudio estudio) throws JsonProcessingException 
	{
		/* Se Serializan las secciones del objeto por separado y se unen al final
		 *  porque el Jackson no funciona con objetos tan grandes */ 
		
		InfraestructuraDeVivienda infraestructura = estudio.getEmbedded().getInfraestructuraDeVivienda();
		Alimentacion alimentacion = estudio.getEmbedded().getAlimentacion();
		List<Integrante> integrantes = estudio.getEmbedded().getEstructuraFamiliar().getIntegrantes();
		List<Integrante> integrantesDetalle = estudio.getEmbedded().getEstructuraFamiliarDetalles().getIntegrantes();
		CondicionesEconomicas condicionesEconomicas = estudio.getEmbedded().getCondicionesEconomicas();
		Representante representante = estudio.getEmbedded().getRepresentante();
		
		if(condicionesEconomicas == null)
		{
			return "No se han recibido las condiciones economicas";
		}
		
		if(infraestructura == null)
		{
			return "no se han recibido datos de la infraestructura";
		}
		
		if (integrantes == null)
		{
			return "No se han recibido integrantes en la peticion";
		}
		
		if(integrantesDetalle == null)
		{
			return "No se han recibido los detalles de los integrantes";
		}
		
		if(alimentacion == null)
		{
			return "no se han recibido la encuesta de alimentacion";
		}
		
		No_Menor18 = GetNo_Menor18(integrantes);
		System.out.println("No_Menor18");
		String strESNCompleto = GetStringEstudio(estudio);
		System.out.println(strESNCompleto);
		strESNCompleto = "{,\"ESNEquipamientosEstudio\":" + GetStringEquipamiento(infraestructura) + "," +getPreparedJson(strESNCompleto);
		System.out.println(strESNCompleto);
		strESNCompleto = "{,\"ESNEgresoSemanal\":" + GetStringEgresos(condicionesEconomicas) + getPreparedJson(strESNCompleto) ;
		System.out.println(strESNCompleto);
		strESNCompleto = "{,\"ESNIngresoSemanal\":" + GetStringIngresos(condicionesEconomicas) + getPreparedJson(strESNCompleto);
		System.out.println(strESNCompleto);
		strESNCompleto = "{,\"ESNBeneficiario\":" + GetStringIntegrantes(integrantes,integrantesDetalle, representante) + getPreparedJson(strESNCompleto);
		System.out.println(strESNCompleto);
		strESNCompleto =  "{\"ESNAlimentacionRespuesta\":" + GetStringAlimentacion(alimentacion) + getPreparedJson(strESNCompleto) ;
		System.out.println(strESNCompleto);
		return strESNCompleto;
		
	}
	
	public static String GetStringIngresos(CondicionesEconomicas condiciones) throws JsonProcessingException
	{
		ObjectMapper objectmapper = new ObjectMapper(); 
		List<ESNIngresoSemanal> listaIngresos = IngresosTranslate.TranslateIngresoSemana(condiciones);
		return objectmapper.writeValueAsString(listaIngresos);
	}
	
	public static String GetStringEgresos(CondicionesEconomicas condiciones) throws JsonProcessingException
	{
		ObjectMapper objectmapper = new ObjectMapper(); 
		List<ESNEgresoSemanal> listaIngresos = EgresosTranslate.TranslateEgresos(condiciones);
		return objectmapper.writeValueAsString(listaIngresos);
	}
	
	
	public static String GetStringAlimentacion (Alimentacion alimentacion) throws JsonProcessingException {
		ObjectMapper objectmapper = new ObjectMapper(); 
		System.out.println("Estatico no menor 18");
		System.out.println(No_Menor18);
		List<ESNAlimentacionRespuesta> listAlimentacion = AlimentacionTranslate.translateAlimentacion(alimentacion, No_Menor18);
		return objectmapper.writeValueAsString(listAlimentacion);
	}
	
	public static String GetStringIntegrantes(List<Integrante> integrantes, 
			List<Integrante> integrantesDetalle, 
			Representante representante) throws JsonProcessingException {
		ObjectMapper objectmapper = new ObjectMapper(); 
		List<ESNBeneficiario> listaBeneficiarios = new ArrayList<ESNBeneficiario>();
		for(Integrante item : integrantes)
		{			
			Integrante integranteDetalle = findIntegranteDetalleById(integrantesDetalle, item.getId());
			listaBeneficiarios.add(ESNBeneficiarioTranslate.TranslateBeneficiario(item, integranteDetalle));
		}
		
		listaBeneficiarios.iterator().next().setDocIdentidad(representante.getIdDocumentoIdentidad());
		listaBeneficiarios.iterator().next().setCatESNDocIdentidad(translateDocIdentidad (representante));
		
		return objectmapper.writeValueAsString(listaBeneficiarios);
	}
	
	public static String GetStringEstudio (Estudio estudio) throws JsonProcessingException {
		ObjectMapper objectmapper = new ObjectMapper(); 
		ESNCompleto esn = TranslateEstudioCompleto(estudio);
		return objectmapper.writeValueAsString(esn);
	}
	
	
	public static String GetStringEquipamiento(InfraestructuraDeVivienda infraestructura ) throws JsonProcessingException
	{
		ObjectMapper objectmapper = new ObjectMapper(); 
		List<ESNEquipamientosEstudio> listaEquipamiento = EquipamientoTranslate.translateEquipamientos(infraestructura);
		return objectmapper.writeValueAsString(listaEquipamiento);
	}
	
	public static ESNCompleto TranslateEstudioCompleto (Estudio estudio ) throws JsonProcessingException
	{
		ESNCompleto esnCompleto = new ESNCompleto();
		
		DatosGenerales datosGenerales = estudio.getEmbedded().getDatosGenerales();
		CondicionesEconomicas condicionesEconomicas = estudio.getEmbedded().getCondicionesEconomicas();
		Servicios servicios = estudio.getEmbedded().getServicios();
		Representante representante = estudio.getEmbedded().getRepresentante();
		InfraestructuraDeVivienda infraestructura = estudio.getEmbedded().getInfraestructuraDeVivienda();
		Alimentacion alimentacion = estudio.getEmbedded().getAlimentacion();

		if (infraestructura == null)
			System.out.println("no parseo la infrastructura");
		else 
			System.out.println("si parseo la infrastructura");
		
		if (datosGenerales == null)
			System.out.println("no parseo los datos grales");
		else 
			System.out.println("si parseo la datos grales");

		
		if (alimentacion == null)
			System.out.println("no parseo alimentacion");
		else 
			System.out.println("si parseo la alimentacion");
		
		esnCompleto.setDtFechaLevantamiento(datosGenerales.getFechaDeLevantamiento().replaceAll("\\s+",""));
		
		esnCompleto.setProporcionaApoyo("");
		esnCompleto.setCatPGralFrecuenciaApoyoEspecie(translateFrecuenciaApoyoEspecie(condicionesEconomicas));
		esnCompleto.setApoyoEspecie("");
		
		
		esnCompleto.setStrCalle(representante.getCalle());
		esnCompleto.setObservacionesVivienda("Ninguna");
		esnCompleto.setStrNoExterior(representante.getNumeroExterior()); // Validar este campo como numerico 
		esnCompleto.setTelefono(datosGenerales.getTelefonoCelular());
		esnCompleto.setCDescripcionUbicacion("N/A");
		//esnCompleto.setCDescripcionUbicacion(datosGenerales.getDescripcionDeUbicacion());
		esnCompleto.setCP(datosGenerales.getCodigoPostal());
		esnCompleto.setStrEntreCalles(datosGenerales.getEntreVialidades());
		System.out.println("imprimir cuartos para dormir");
		esnCompleto.setNoCuartos(getIntValueFromStringField( infraestructura.getNoDeCuartos()));
		System.out.println(infraestructura.getCuartosParaDormir());
	 	esnCompleto.setStrNoInterior(getIntValueFromStringField(datosGenerales.getNumeroInterior()));
		esnCompleto.setStrNombreAsentamiento(datosGenerales.getNombreDeAsentamiento());
			// esnCompleto.setApoyoEspecie(); Revisar de donde obtengo este campo // valor Alimento\
		esnCompleto.setNoCuartosParaDormir(getIntValueFromStringField(infraestructura.getCuartosParaDormir()));
 		
		esnCompleto.setCatESNBanoEscusado(translateBanoEscusado(servicios));
		esnCompleto.setCatESNCondicionVivienda(translateCondicionVivienda (infraestructura));
		esnCompleto.setCatESNTenencia(translateTenencia (infraestructura));
		
		esnCompleto.setCatESNTipoApoyo(translateTipoApoyo(condicionesEconomicas));
		 esnCompleto.setCatGralDuracionMeses(translateDuracionMeses ()); // fijo valor de 1 mes
		esnCompleto.setCatPGralFrecuencia(translateFrecuencia(condicionesEconomicas) );
			//esnCompleto.setRemesas();
		
 		esnCompleto.setCatPGralFrecuenciaApoyoEspecie(translateFrecuenciaApoyoEspecie(condicionesEconomicas) );
		esnCompleto.setCatPGralFrecuenciaRemesas(translateFrecuenciaRemesas()); // Revisar si este campo existe en la fuente
		 
 		esnCompleto.setCatPGralTechos(translateTechos(infraestructura) );
		esnCompleto.setCatPGralParedes(translateParedes(infraestructura));
		esnCompleto.setCatPGralTiposPisos(translatePisos(infraestructura));
		esnCompleto.setCatPGralTipoVivienda(translateTipoVivienda (infraestructura));
		// esnCompleto.setCocinaSeparada();  // Campo no mapeado
		 		
		esnCompleto.setCatESNTipoAsentamiento((translateTipoAsentamiento(datosGenerales)));
		esnCompleto.setCatESNTipoVialidad(translateTipoVialidad(datosGenerales));
		esnCompleto.setCatDirAsentamiento(translateDirAsentamiento(datosGenerales));
		esnCompleto.setCatDirEstado(translateCarDirEstado(datosGenerales));
		esnCompleto.setCatDirMunicipio(translateCatDirMunicipio(datosGenerales));
		esnCompleto.setCatPGralServiciosAgua(translateCatPGralServiciosAgua (servicios));
		esnCompleto.setCatESNServicioGas(translateServicioGas (servicios));
		
		esnCompleto.setCatPGralServiciosLuz(translateCatPGralServiciosLuz(servicios));
		esnCompleto.setCatPGralServiciosSanitarios(translateCatPGralServiciosSanitarios(servicios));
		
		esnCompleto.setPDiagDiagnostico(translatePDiagDiagnostico()); // Revisar fuente de este campo
		esnCompleto.setPDiagGrupo(translatePDiagGrupo(datosGenerales)); // Revisar fuente de este campo
		esnCompleto.setNoMenor18(No_Menor18);
 		return esnCompleto;
	}

	public static CatESNBanoEscusado translateBanoEscusado (Servicios servicios)
	{
		CatESNBanoEscusado catEsnBanoEscusado = new CatESNBanoEscusado();
		catEsnBanoEscusado.setCValor(servicios.getEscusado() );
		return catEsnBanoEscusado;
	}
	
	public static CatESNTenencia translateTenencia (InfraestructuraDeVivienda infraestructura)
	{
		CatESNTenencia catEsnTenencia = new CatESNTenencia();
		catEsnTenencia.setCValor(infraestructura.getTenencia());
		return catEsnTenencia;
	}
	
	public static CatESNCondicionVivienda translateCondicionVivienda (InfraestructuraDeVivienda infraestructura)
	{
		CatESNCondicionVivienda catEsnCondicionVivienda = new CatESNCondicionVivienda();
		catEsnCondicionVivienda.setCValor(infraestructura.getCondiciones());
		return catEsnCondicionVivienda;
	}
	
	public static CatESNServicioGas translateServicioGas (Servicios servicios)
	{
		CatESNServicioGas catEsnServicioGas = new CatESNServicioGas();
		catEsnServicioGas.setCValor(servicios.getCombustible());
		return catEsnServicioGas;
	}
	
	
	
	public static CatESNTipoApoyo translateTipoApoyo (CondicionesEconomicas condiciones)
	{
		System.out.println(condiciones.getTipoDeApoyo());
		CatESNTipoApoyo catEsnTipoApoyo = new CatESNTipoApoyo();
		catEsnTipoApoyo.setCValor(condiciones.getTipoDeApoyo());
		return catEsnTipoApoyo;
	}
	
	public static CatGralDuracionMeses translateDuracionMeses ()
	{
		CatGralDuracionMeses catGralDuracionMeses = new CatGralDuracionMeses();
		catGralDuracionMeses.setCValor("1 Mes");
		return catGralDuracionMeses;
	}
	
	public static CatPGralFrecuencia translateFrecuencia (CondicionesEconomicas condiciones)
	{
		CatPGralFrecuencia catpGralFrecuencia = new CatPGralFrecuencia();
		catpGralFrecuencia.setCValor(condiciones.getFrecuenciaDelApoyo()); //No hay campo mapeado
		return catpGralFrecuencia;
	}
	
	public static CatPGralFrecuenciaApoyoEspecie translateFrecuenciaApoyoEspecie (CondicionesEconomicas condiciones)
	{
		CatPGralFrecuenciaApoyoEspecie catpGralFrecuenciaApoyoEspecie = new CatPGralFrecuenciaApoyoEspecie();
		catpGralFrecuenciaApoyoEspecie.setCValor("Ninguno");
		return catpGralFrecuenciaApoyoEspecie ;
	}
	
	public static CatPGralFrecuenciaRemesas translateFrecuenciaRemesas ()
	{
		CatPGralFrecuenciaRemesas catFrecuenciaRemesas = new CatPGralFrecuenciaRemesas();
		catFrecuenciaRemesas.setCValor("Ninguno");
		return catFrecuenciaRemesas;
	}
	
	public static CatPGralParedes translateParedes (InfraestructuraDeVivienda infraestructura)
	{
		CatPGralParedes catGralParedes = new CatPGralParedes();
		catGralParedes.setCValor(infraestructura.getMayorParteDeMuros() );
		return catGralParedes ;
	}
	
	public static CatPGralTechos translateTechos (InfraestructuraDeVivienda infraestructura)
	{
		CatPGralTechos catGralTechos = new CatPGralTechos();
		catGralTechos.setCValor(infraestructura.getMayorParteDeTecho());
		return catGralTechos;
	}
	
	public static CatPGralTiposPisos translatePisos (InfraestructuraDeVivienda infraestructura)
	{
		CatPGralTiposPisos catTiposPisos = new CatPGralTiposPisos();
		catTiposPisos.setCValor(infraestructura.getMayorParteDePiso());
		return catTiposPisos;
	}
	
	public static CatPGralTipoVivienda translateTipoVivienda (InfraestructuraDeVivienda infraestructura)
	{
		CatPGralTipoVivienda  catGralTipoVivienda = new CatPGralTipoVivienda();
		catGralTipoVivienda.setCValor( infraestructura.getTipoDeCasa());
		return catGralTipoVivienda;
	}	
	
	public static CatESNDocIdentidad translateDocIdentidad (Representante representante)
	{
		CatESNDocIdentidad catDocIdentidad = new CatESNDocIdentidad();
		catDocIdentidad.setCValor(representante.getTipoIdentidad());
		return catDocIdentidad;
	}
	
	public static int GetNo_Menor18(List<Integrante> integrantes)
	{
		int no_Menor18 = 0;
		
		for(Integrante item : integrantes)
		{
			String sDate1 = item.getFechaDeNacimiento().replaceAll("\\s+", "");
			try {
				Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
				Calendar cal = Calendar. getInstance();
				cal.setTime(date1);
				
				Calendar today = new GregorianCalendar();
		        today.setTime(new Date());
		        
		        int yearsInBetween = today.get(Calendar.YEAR) 
                        - cal.get(Calendar.YEAR);
		        
		        if(yearsInBetween <18)
		        	no_Menor18 = 1;
		        
		        System.out.println("años del integrante ");
		        System.out.println(yearsInBetween);
				  
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return no_Menor18;
		
	}
	
	public static int getIntValueFromStringField (String value)
	{
		 if(tryParseInt (value))
			 return Integer.parseInt(value);
		 else 
			 return 0;
	}
	
	public static boolean tryParseInt(String value) {  
	     try {  
	         Integer.parseInt(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
	
	private static String getPreparedJson(String input) {
		return input.substring(1, input.length());
	}
	
	static Integrante findIntegranteDetalleById (List<Integrante> integrantesDetalle, int id) {
		for (Integrante item : integrantesDetalle) {
			if(item.getId() == id)
			{
				return item;
			}
		}
		return null;
	}
	
	
}
