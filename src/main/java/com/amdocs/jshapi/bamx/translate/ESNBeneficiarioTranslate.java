package com.amdocs.jshapi.bamx.translate;

import com.amdocs.jshapi.bamx.CatDirEstado;
import com.amdocs.jshapi.bamx.CatESNAdiccion;
import com.amdocs.jshapi.bamx.CatESNEscolaridad;
import com.amdocs.jshapi.bamx.CatESNEstadoCivil;
import com.amdocs.jshapi.bamx.CatESNParentesco;
import com.amdocs.jshapi.bamx.CatESNSexo;
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
	
	public static ESNBeneficiario  TranslateBeneficiario ( Integrante integrante )
	{
		
		ESNBeneficiario esnBeneficiario = new ESNBeneficiario();
		//esnBeneficiario.setAsisteEscuela( integrante.getAsisteALaEscuela() ); //Revisar valor de la fuente
		
		
		esnBeneficiario.setCNombre(integrante.getNombreS());
		//esnBeneficiario.setCatESNAdiccion();  // Obligatorio ? 
		esnBeneficiario.setCatESNSexo(translateSexo (integrante.getSexo()));
		esnBeneficiario.setCApellidoPaterno(integrante.getPrimerApellido());		
		esnBeneficiario.setCApellidoMaterno(integrante.getSegundoApellido());
		esnBeneficiario.setCatESNEstadoCivil(translateEstadoCivil(integrante.getEstadoCivil()));
		esnBeneficiario.setCatESNParentesco(translateParentesco(integrante.getParentesco()));
		esnBeneficiario.setCatDirEstado(translateStringToDirEstado(integrante.getEntidadDeNacimiento()));
		esnBeneficiario.setDtFechaNacimiento(integrante.getFechaDeNacimiento());
		esnBeneficiario.setCatESNEscolaridad(translateEscolaridad(integrante.getNivel()));
		//esnBeneficiario.setGradoEscolar(translateGradoEscolar(integrante.getGrado()));
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
	
	 
}

