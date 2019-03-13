package com.amdocs.jshapi.bamx.translate;

import com.amdocs.jshapi.estudios.CondicionesEconomicas;
import com.amdocs.jshapi.estudios.DatosGenerales;
import com.amdocs.jshapi.estudios.Estudio;
import com.amdocs.jshapi.estudios.Representante;
import com.amdocs.jshapi.estudios.Servicios;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.amdocs.jshapi.bamx.CatDirAsentamiento;
import com.amdocs.jshapi.bamx.CatDirEstado;
import com.amdocs.jshapi.bamx.CatDirMunicipio;
import com.amdocs.jshapi.bamx.CatESNTipoAsentamiento;
import com.amdocs.jshapi.bamx.CatESNTipoVialidad;
import com.amdocs.jshapi.bamx.CatPGralServiciosAgua;
import com.amdocs.jshapi.bamx.CatPGralServiciosLuz;
import com.amdocs.jshapi.bamx.CatPGralServiciosSanitarios;
import com.amdocs.jshapi.bamx.PDiagDiagnostico;
import com.amdocs.jshapi.bamx.PDiagGrupo;
import com.amdocs.jshapi.bamx.esn;

public class EstudioToESNTranslate {

	
	public static String SerializeESN (esn bmxesn)
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
	
	public static esn TranslateEstudio (Estudio estudio )
	{
		esn bmxesn = new esn();
		DatosGenerales datosGenerales = estudio.getEmbedded().getDatosGenerales();
		CondicionesEconomicas condicionesEconomicas = estudio.getEmbedded().getCondicionesEconomicas();
		Servicios servicios = estudio.getEmbedded().getServicios();
		Representante representante = estudio.getEmbedded().getRepresentante();
		
		bmxesn.setStrCalle(representante.getCalle());
		bmxesn.setStrNoExterior(representante.getNumeroExterior());
		bmxesn.setTelefono(datosGenerales.getTelefonoCelular());
		bmxesn.setCDescripcionUbicacion(datosGenerales.getDescripcionDeUbicacion());
		bmxesn.setCP(datosGenerales.getCodigoPostal());
		bmxesn.setStrEntreCalles(datosGenerales.getEntreVialidades());
	//	bmxesn.setStrNoInterior(Integer.parseInt(representante.getNumeroInterior()) );
		bmxesn.setStrNombreAsentamiento(datosGenerales.getNombreDeAsentamiento());
		
		
		bmxesn.setCatESNTipoAsentamiento((translateTipoAsentamiento(datosGenerales)));
		bmxesn.setCatESNTipoVialidad(translateTipoVialidad(datosGenerales));
		bmxesn.setCatDirAsentamiento(translateDirAsentamiento(datosGenerales));
		bmxesn.setCatDirEstado(translateCarDirEstado(datosGenerales));
		bmxesn.setCatDirMunicipio(translateCatDirMunicipio(datosGenerales));
		bmxesn.setCatPGralServiciosAgua(translateCatPGralServiciosAgua (condicionesEconomicas));
		bmxesn.setCatPGralServiciosLuz(translateCatPGralServiciosLuz(condicionesEconomicas));
		bmxesn.setCatPGralServiciosSanitarios(translateCatPGralServiciosSanitarios(servicios));
		
		bmxesn.setPDiagDiagnostico(translatePDiagDiagnostico()); // Revisar fuente de este campo
		bmxesn.setPDiagGrupo(translatePDiagGrupo()); // Revisar fuente de este campo
		
		return bmxesn;
	}
	
	 
	
	
	public static CatESNTipoAsentamiento translateTipoAsentamiento (DatosGenerales datosGenerales)
	{
		CatESNTipoAsentamiento catEsnTipoAsentamiento = new CatESNTipoAsentamiento();
		System.out.println(datosGenerales.getTipoDeAsentamiento());
		catEsnTipoAsentamiento.setCValor(datosGenerales.getTipoDeAsentamiento());
		return catEsnTipoAsentamiento;
	}
	
	public static CatESNTipoVialidad translateTipoVialidad (DatosGenerales datosGenerales)
	{
		CatESNTipoVialidad  catEsnTipoVialidad = new CatESNTipoVialidad();
		catEsnTipoVialidad.setCValor(datosGenerales.getTipoDeVialidad() );
		return catEsnTipoVialidad;
	}
	
	public static CatDirAsentamiento translateDirAsentamiento (DatosGenerales datosGenerales)
	{
		CatDirAsentamiento catDirAsentamiento = new CatDirAsentamiento();
		catDirAsentamiento.setCValor(datosGenerales.getNombreDeAsentamiento());
		return catDirAsentamiento;
	}
	
	public static CatDirEstado translateCarDirEstado (DatosGenerales datosGenerales)
	{
		CatDirEstado catDirEstado = new CatDirEstado();
		catDirEstado.setCValor(datosGenerales.getEstado() );
		return catDirEstado;
	}
	
	public static CatDirMunicipio translateCatDirMunicipio (DatosGenerales datosGenerales)
	{
		CatDirMunicipio catDirMunicipio = new CatDirMunicipio ();
		catDirMunicipio.setCValor(datosGenerales.getMunicipio());
		return catDirMunicipio;
	}
	
	public static CatPGralServiciosAgua translateCatPGralServiciosAgua (CondicionesEconomicas condicionesEconomicas)
	{
		CatPGralServiciosAgua catpGralServicioAgua = new CatPGralServiciosAgua();
		catpGralServicioAgua.setCValor(condicionesEconomicas.getAgua());
		return catpGralServicioAgua;
	}
	
	public static CatPGralServiciosLuz translateCatPGralServiciosLuz (CondicionesEconomicas condicionesEconomicas)
	{
		CatPGralServiciosLuz catPgralServiciosLuz = new CatPGralServiciosLuz();
		catPgralServiciosLuz.setCValor(condicionesEconomicas.getLuz());
		return catPgralServiciosLuz;
	}
	
	public static CatPGralServiciosSanitarios translateCatPGralServiciosSanitarios(Servicios servicios)
	{
		CatPGralServiciosSanitarios catpgralServiciosSanitarios = new CatPGralServiciosSanitarios();
		catpgralServiciosSanitarios.setCValor(servicios.getDrenaje());
		return catpgralServiciosSanitarios;
	}
	
	public static PDiagDiagnostico translatePDiagDiagnostico ()
	{
		PDiagDiagnostico pdiagDiagnostico = new PDiagDiagnostico();
		pdiagDiagnostico.setCNombre("No se cual es la fuente de este");
		return pdiagDiagnostico;
	}
	
	public static PDiagGrupo translatePDiagGrupo()
	{
		PDiagGrupo pdiagGrupo = new PDiagGrupo ();
		pdiagGrupo.setCValor("VOLUNTARIADO");
		return pdiagGrupo;
	}
	
}
