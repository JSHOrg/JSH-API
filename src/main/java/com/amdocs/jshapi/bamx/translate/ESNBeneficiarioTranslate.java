package com.amdocs.jshapi.bamx.translate;

import com.amdocs.jshapi.bamx.CatDirEstado;
import com.amdocs.jshapi.bamx.CatESNAdiccion;
import com.amdocs.jshapi.bamx.CatESNCapacidadDiferente;
import com.amdocs.jshapi.bamx.CatESNCondicionSalud;
import com.amdocs.jshapi.bamx.CatESNDerechoHabiencia;
import com.amdocs.jshapi.bamx.CatESNDocIdentidad;
import com.amdocs.jshapi.bamx.CatESNEscolaridad;
import com.amdocs.jshapi.bamx.CatESNEstadoCivil;
import com.amdocs.jshapi.bamx.CatESNMotivoDerechoHabiencia;
import com.amdocs.jshapi.bamx.CatESNOcupacion;
import com.amdocs.jshapi.bamx.CatESNParentesco;
import com.amdocs.jshapi.bamx.CatESNSexo;
import com.amdocs.jshapi.bamx.CatESNTipoEmpleo;
import com.amdocs.jshapi.bamx.CatPGralEtniaIndigena;
import com.amdocs.jshapi.bamx.ESNBeneficiario;
import com.amdocs.jshapi.bamx.ESNIngresoSemanal;
import com.amdocs.jshapi.estudios.Integrante;
import com.amdocs.jshapi.estudios.Representante;
public class ESNBeneficiarioTranslate {
	
	final static String Masculino = "Masculino";
	final static String Femenino= "Femenino";
	final static String Preescolar = "PREESCOLAR O KINDER";
	final static String Primaria = "PRIMARIA";
	final static String Secundaria = "SECUNDARIA";
	final static String Bachillerato = "BACHILLERATO";
	final static String Licenciatura = "LICENCIATURA";
	final static String Otro = "OTRO";
	
	private static ESNBeneficiario TranslateRepresentante (Representante representante)
	{
		ESNBeneficiario esnBeneficiario = new ESNBeneficiario(); 
		esnBeneficiario.setCNombre(representante.getNombreDelTitular());
		return esnBeneficiario ;
	}
	
	public static ESNBeneficiario  TranslateBeneficiario 
		( Integrante integrante, 
				Integrante integranteDetalle )
	{
		
		ESNBeneficiario esnBeneficiario = new ESNBeneficiario();
		
		esnBeneficiario.setIMC(0); // Actualmente no se captura el indice de masa corporal
		esnBeneficiario.setStrEmisorCI(""); // No se captura tampoco el emisor de la carta de identidad
		
		esnBeneficiario.setCNombre(integrante.getNombreS());
		esnBeneficiario.setCApellidoPaterno(integrante.getPrimerApellido());		
		esnBeneficiario.setCApellidoMaterno(integrante.getSegundoApellido());
		esnBeneficiario.setDtFechaNacimiento(integrante.getFechaDeNacimiento());
		esnBeneficiario.setCatESNSexo(translateSexo (integrante.getSexo()));
		esnBeneficiario.setCatESNEstadoCivil(translateEstadoCivil(integrante.getEstadoCivil()));
		esnBeneficiario.setCatESNParentesco(translateParentesco(integrante.getParentesco()));
		esnBeneficiario.setCatESNEscolaridad(translateEscolaridad(integrante.getNivel()));
		esnBeneficiario.setGradoEscolar(translateGradoEscolar(integrante.getGrado()));
		esnBeneficiario.setCatDirEstado(translateStringToDirEstado(integrante.getEntidadDeNacimiento()));
		System.out.println("Asiste a la escuela");
		System.out.println(integrante.getAsisteALaEscuela());
		esnBeneficiario.setAsisteEscuela(translateAsisteAlaEscuela(integrante.getAsisteALaEscuela()));

		esnBeneficiario.setCatESNOcupacion(translateOcupacion(integranteDetalle.getOcupacion()));
		esnBeneficiario.setCatESNTipoEmpleo(translateTipoEmpleo(integranteDetalle.getTipoEmpleo()));
		esnBeneficiario.setCatESNAdiccion(translateAddiccion(integranteDetalle.getAdicciones()));
		esnBeneficiario.setCatESNCondicionSalud(translateCondicionSalud(integranteDetalle.getCondicionesSalud()));
		esnBeneficiario.setCatESNCapacidadDiferente(translateCapacidadesDiferentes(integranteDetalle.getCapacidadesdiferentes()));
		esnBeneficiario.setCatESNMotivoDerechoHabiencia(transalteMotivoderechohabiencia(integranteDetalle.getMotivoderechohabiencia()));
		esnBeneficiario.setCatESNDerechoHabiencia(translateDerechohabiencia(integranteDetalle.getDerechohabiencia()));
		esnBeneficiario.setCatPGralEtniaIndigena(translateEtniaIndigena(integranteDetalle.getEtniaIndigena()));
		esnBeneficiario.setPeso(getIntValueFromStringField(integranteDetalle.getPeso()));
		esnBeneficiario.setTalla(getIntValueFromStringField(integranteDetalle.getTalla()));
		esnBeneficiario.setJubiladoPensionado(translateJubiladoPensionado(integranteDetalle.getJubilacionoPensionado()));
		
		
		
		//esnBeneficiario.setPLaboralA(pLaboralA);
		int noPrestaciones = 0;
		System.out.println("obtener prestaciones por integrante");
		if(integrante.getPrestaciones() != null)
		{
			noPrestaciones = integrante.getPrestaciones().size();
			System.out.println(noPrestaciones );
		}
		int[] arrayPrestaciones = new int[9];
		 for (int i = 0; i < 9; i++)
		 {
			 if(noPrestaciones>=(i+1))
				 arrayPrestaciones [i] = 1;
			 else 
				 arrayPrestaciones [i] = 0;
		 }
		 
		 esnBeneficiario.setPLaboralA(arrayPrestaciones[0]);
		 esnBeneficiario.setPLaboralB(arrayPrestaciones[1]);
		 esnBeneficiario.setPLaboralC(arrayPrestaciones[2]);
		 esnBeneficiario.setPLaboralD(arrayPrestaciones[3]);
		 esnBeneficiario.setPLaboralE(arrayPrestaciones[4]);
		 esnBeneficiario.setPLaboralF(arrayPrestaciones[5]);
		 esnBeneficiario.setPLaboralG(arrayPrestaciones[6]);
		 esnBeneficiario.setPLaboralH(arrayPrestaciones[7]);
		 esnBeneficiario.setPLaboralI(arrayPrestaciones[8]);
		 
			
		return esnBeneficiario;
		
	}
	
	private static CatESNSexo translateSexo (String sexo)
	{
		CatESNSexo  catEsnSexo = new CatESNSexo ();
		if(sexo == "hombre")
			catEsnSexo.setCValor( Masculino);
		else 
			catEsnSexo.setCValor( Femenino);
		return catEsnSexo;
	}
	
	private static CatESNEstadoCivil translateEstadoCivil (String estadoCivil) 
	{
		CatESNEstadoCivil catEsnEstadoCivil = new CatESNEstadoCivil();
		catEsnEstadoCivil.setCValor(estadoCivil);
		return catEsnEstadoCivil;
	}
	
	private static CatESNParentesco translateParentesco (String parentesco)
	{
		CatESNParentesco catesnParentesco = new CatESNParentesco();
		catesnParentesco.setCValor(parentesco);
		return catesnParentesco;
	}
	
	private static CatDirEstado translateStringToDirEstado (String estado)
	{
		CatDirEstado catDirEstado = new CatDirEstado();
		catDirEstado.setCValor(estado);
		return catDirEstado;
	}
	
	private static CatESNEscolaridad translateEscolaridad (String Nivel)
	{		
		CatESNEscolaridad catEsnEscolaridad = new CatESNEscolaridad ();
		catEsnEscolaridad.setCValor( Nivel);
		return catEsnEscolaridad;
	}
	
	private static CatESNOcupacion translateOcupacion (String Ocupacion)
	{
		CatESNOcupacion catEsnOcupacion = new CatESNOcupacion();
		catEsnOcupacion.setCValor(Ocupacion);
		return catEsnOcupacion;
	}
	
	private static CatESNTipoEmpleo translateTipoEmpleo (String TipoEmpleo)
	{
		CatESNTipoEmpleo catEsntipoempleo = new CatESNTipoEmpleo();
		catEsntipoempleo.setCValor(TipoEmpleo);
		return catEsntipoempleo;
	}
	
	private static CatESNAdiccion translateAddiccion(String adiccion) {
		CatESNAdiccion catesnAdiccion = new CatESNAdiccion();
		catesnAdiccion.setCValor(adiccion);
		return catesnAdiccion;
	}
	
	private static CatESNCondicionSalud translateCondicionSalud (String condicionSalud) {
		CatESNCondicionSalud catesnCondicionSalud = new CatESNCondicionSalud();
		catesnCondicionSalud.setCValor(condicionSalud);
		return catesnCondicionSalud;
	}
	 
	private static CatESNCapacidadDiferente translateCapacidadesDiferentes(String capacidadesDiferentes) {
		CatESNCapacidadDiferente catesnCapacidadDiferente = new CatESNCapacidadDiferente();
		catesnCapacidadDiferente.setCValor(capacidadesDiferentes);
		return catesnCapacidadDiferente;
	}
	
	private static CatESNMotivoDerechoHabiencia transalteMotivoderechohabiencia (String motivoderechohabiencia) {
		CatESNMotivoDerechoHabiencia catesnmotivoderechohabiencia = new CatESNMotivoDerechoHabiencia();
		catesnmotivoderechohabiencia.setCValor(motivoderechohabiencia);
		return catesnmotivoderechohabiencia;
	}
	private static CatESNDerechoHabiencia translateDerechohabiencia (String DerechoHabiencia) {
		CatESNDerechoHabiencia catesnDerechohabiencia = new  CatESNDerechoHabiencia ();
		catesnDerechohabiencia.setCValor(DerechoHabiencia);
		return catesnDerechohabiencia;
	}
	
	private static CatPGralEtniaIndigena translateEtniaIndigena (String EtniaIndigena) {
		CatPGralEtniaIndigena catEtniaIndigena = new CatPGralEtniaIndigena();
		catEtniaIndigena.setCValor(EtniaIndigena);
		return catEtniaIndigena;
	}
	
	private static int translateAsisteAlaEscuela (String asistealaescuela)
	{
		if(asistealaescuela.toLowerCase() == "si")
			return 1;
		else return 0;		
	}
	
	private static int translateJubiladoPensionado (String jubiladoPensionado)
	{
		if(jubiladoPensionado.toLowerCase() == "si")
			return 1;
		else return 0;	
	}
	
	private static int translateGradoEscolar (String grado)
	{
		switch(grado)
		{
			case Preescolar:
				return 1;
				 
			case Primaria:
				return 2;
			
			case Secundaria:
				return 3;
			
			case Bachillerato:
				return 4;
			
			case Licenciatura:
				return 5;
			
			case Otro:
				return 6;
			
			default:
				return 0;
		}
		
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

