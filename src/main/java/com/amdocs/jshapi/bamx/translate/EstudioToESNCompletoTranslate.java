package com.amdocs.jshapi.bamx.translate;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.jshapi.bamx.CatESNBanoEscusado;
import com.amdocs.jshapi.bamx.CatESNCondicionVivienda;
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
import com.amdocs.jshapi.bamx.ESNBeneficiario;
import com.amdocs.jshapi.bamx.ESNCompleto;
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
	
	public static ESNCompleto TranslateEstudioCompleto (Estudio estudio )
	{
		ESNCompleto esnCompleto = new ESNCompleto();
		
		DatosGenerales datosGenerales = estudio.getEmbedded().getDatosGenerales();
		CondicionesEconomicas condicionesEconomicas = estudio.getEmbedded().getCondicionesEconomicas();
		Servicios servicios = estudio.getEmbedded().getServicios();
		Representante representante = estudio.getEmbedded().getRepresentante();
		InfraestructuraDeVivienda infraestructura = estudio.getEmbedded().getInfraestructuraDeVivienda();
		Alimentacion alimentacion = estudio.getEmbedded().getAlimentacion();
		List<Integrante> integrantes = estudio.getEmbedded().getEstructuraFamiliar().getIntegrantes();
		
		List<ESNBeneficiario> listaBeneficiarios = new ArrayList<ESNBeneficiario>();
		for(Integrante item : integrantes)
		{
			listaBeneficiarios.add(ESNBeneficiarioTranslate.TranslateBeneficiario(item));
		}
		
		esnCompleto.setESNBeneficiario(listaBeneficiarios);
		esnCompleto.setStrCalle(representante.getCalle());
		esnCompleto.setStrNoExterior(representante.getNumeroExterior()); // Validar este campo como numerico 
		esnCompleto.setTelefono(datosGenerales.getTelefonoCelular());
		esnCompleto.setCDescripcionUbicacion(datosGenerales.getDescripcionDeUbicacion());
		esnCompleto.setCP(datosGenerales.getCodigoPostal());
		esnCompleto.setStrEntreCalles(datosGenerales.getEntreVialidades());
	//	bmxesn.setStrNoInterior(Integer.parseInt(representante.getNumeroInterior()) );
		esnCompleto.setStrNombreAsentamiento(datosGenerales.getNombreDeAsentamiento());
		// esnCompleto.setApoyoEspecie(); Revisar de donde obtengo este campo // valor Alimento
 		
		
		esnCompleto.setNoCuartosParaDormir(getIntValueFromStringField(infraestructura.getCuartosParaDormir()));
		//esnCompleto.setCuartoBano();
		
		esnCompleto.setCatESNBanoEscusado(translateBanoEscusado(infraestructura));
		esnCompleto.setCatESNCondicionVivienda(translateCondicionVivienda (infraestructura));
		esnCompleto.setCatESNTenencia(translateTenencia (infraestructura));
		
		esnCompleto.setCatESNTipoApoyo(translateTipoApoyo(condicionesEconomicas));
		esnCompleto.setCatGralDuracionMeses(translateDuracionMeses ()); // revisar fuente de este campo
		esnCompleto.setCatPGralFrecuencia(translateFrecuencia(alimentacion) );
		//esnCompleto.setRemesas();
		
		esnCompleto.setCatPGralFrecuenciaApoyoEspecie(translateFrecuenciaApoyoEspecie(condicionesEconomicas) );
		esnCompleto.setCatPGralFrecuenciaRemesas(translateFrecuenciaRemesas()); // Revisar si este campo existe en la fuente
		
		//esnCompleto.setCatPGralParedes(translateParedes(infraestructura) );
		esnCompleto.setCatPGralTechos(translateTechos(infraestructura) );
		esnCompleto.setCatPGralParedes(translateParedes(infraestructura));
		esnCompleto.setCatPGralTiposPisos(translatePisos(infraestructura));
		esnCompleto.setCatPGralTipoVivienda(translateTipoVivienda (infraestructura));
		// esnCompleto.setCocinaSeparada();  // Campo no mapeado
		//esnCompleto.setESNAlimentacionRespuesta( AlimentacionTranslate.translateAlimentacion(alimentacion));
		
		
		esnCompleto.setCatESNTipoAsentamiento((translateTipoAsentamiento(datosGenerales)));
		esnCompleto.setCatESNTipoVialidad(translateTipoVialidad(datosGenerales));
		esnCompleto.setCatDirAsentamiento(translateDirAsentamiento(datosGenerales));
		esnCompleto.setCatDirEstado(translateCarDirEstado(datosGenerales));
		esnCompleto.setCatDirMunicipio(translateCatDirMunicipio(datosGenerales));
		esnCompleto.setCatPGralServiciosAgua(translateCatPGralServiciosAgua (condicionesEconomicas));
		esnCompleto.setCatESNServicioGas(translateServicioGas (condicionesEconomicas));
		
		esnCompleto.setCatPGralServiciosLuz(translateCatPGralServiciosLuz(condicionesEconomicas));
		esnCompleto.setCatPGralServiciosSanitarios(translateCatPGralServiciosSanitarios(servicios));
		
		esnCompleto.setPDiagDiagnostico(translatePDiagDiagnostico()); // Revisar fuente de este campo
		esnCompleto.setPDiagGrupo(translatePDiagGrupo()); // Revisar fuente de este campo
		
		return esnCompleto;
	}

	public static CatESNBanoEscusado translateBanoEscusado (InfraestructuraDeVivienda infraestructura)
	{
		CatESNBanoEscusado catEsnBanoEscusado = new CatESNBanoEscusado();
		catEsnBanoEscusado.setCValor(infraestructura.getBanoEscusado() );
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
	
	public static CatESNServicioGas translateServicioGas (CondicionesEconomicas condiciones)
	{
		CatESNServicioGas catEsnServicioGas = new CatESNServicioGas();
		catEsnServicioGas.setCValor(condiciones.getGas());
		return catEsnServicioGas;
	}
	
	
	
	public static CatESNTipoApoyo translateTipoApoyo (CondicionesEconomicas condiciones)
	{
		CatESNTipoApoyo catEsnTipoApoyo = new CatESNTipoApoyo();
		catEsnTipoApoyo.setCValor(condiciones.getTipoDeApoyo());
		return catEsnTipoApoyo;
	}
	
	public static CatGralDuracionMeses translateDuracionMeses ()
	{
		CatGralDuracionMeses catGralDuracionMeses = new CatGralDuracionMeses();
		catGralDuracionMeses.setCValor("4 meses");
		return catGralDuracionMeses;
	}
	
	public static CatPGralFrecuencia translateFrecuencia (Alimentacion alimentacion )
	{
		CatPGralFrecuencia catpGralFrecuencia = new CatPGralFrecuencia();
		catpGralFrecuencia.setCValor(alimentacion.getFrecuencia());
		return catpGralFrecuencia;
	}
	
	public static CatPGralFrecuenciaApoyoEspecie translateFrecuenciaApoyoEspecie (CondicionesEconomicas condiciones)
	{
		CatPGralFrecuenciaApoyoEspecie catpGralFrecuenciaApoyoEspecie = new CatPGralFrecuenciaApoyoEspecie();
		//catpGralFrecuenciaApoyoEspecie.setCValor(condiciones.getFrecuenciaDelApoyo());
		return catpGralFrecuenciaApoyoEspecie ;
	}
	
	public static CatPGralFrecuenciaRemesas translateFrecuenciaRemesas ()
	{
		CatPGralFrecuenciaRemesas catFrecuenciaRemesas = new CatPGralFrecuenciaRemesas();
		catFrecuenciaRemesas.setCValor("");
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
		//catTiposPisos.setCValor(infraestructura.get);
		return catTiposPisos;
	}
	
	public static CatPGralTipoVivienda translateTipoVivienda (InfraestructuraDeVivienda infraestructura)
	{
		CatPGralTipoVivienda  catGralTipoVivienda = new CatPGralTipoVivienda();
		catGralTipoVivienda.setCValor( infraestructura.getTipoDeCasa());
		return catGralTipoVivienda;
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
	
}
