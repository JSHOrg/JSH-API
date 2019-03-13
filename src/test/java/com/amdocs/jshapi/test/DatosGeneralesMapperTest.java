package com.amdocs.jshapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.amdocs.jshapi.estudios.DatosGenerales;
import com.amdocs.jshapi.mappers.DatosGeneralesMapper;

public class DatosGeneralesMapperTest {
	
	@Test
	public void Deserialize_String_DatosGenerales ()
	{
		String input = "{\r\n" + 
				"      \"Grupo\": \"\",\r\n" + 
				"      \"Estado\": \"\",\r\n" + 
				"      \"Localidad\": \"\",\r\n" + 
				"      \"Municipio\": \"\",\r\n" + 
				"      \"Código postal\": \"\",\r\n" + 
				"      \"Clave de estado\": \"\",\r\n" + 
				"      \"Entre vialidades\": \"\",\r\n" + 
				"      \"Fecha de captura\": \"\",\r\n" + 
				"      \"Número exterior\": \"\",\r\n" + 
				"      \"Número interior\": \"\",\r\n" + 
				"      \"Tipo de vialidad\": \"AMPLIACIÓN\",\r\n" + 
				"      \"Clave de municipio\": \"\",\r\n" + 
				"      \"Nombre de vialidad\": \"\",\r\n" + 
				"      \"Teléfono / celular\": \"\",\r\n" + 
				"      \"Tipo de asentamiento\": \"AEROPUERTO\",\r\n" + 
				"      \"Fecha de levantamiento\": \"\",\r\n" + 
				"      \"Nombre de asentamiento\": \"\",\r\n" + 
				"      \" Descripción de ubicación \": \"\",\r\n" + 
				"      \"Nombre de la comunidad o programa\": \"\"\r\n" + 
				"    }";
		DatosGeneralesMapper mapper = new DatosGeneralesMapper();
		DatosGenerales datosgeneralesObject = mapper.Deserialize(input);
		System.out.println(datosgeneralesObject.getTipoDeVialidad());
		assertEquals( "AMPLIACION", datosgeneralesObject.getTipoDeVialidad());
	}
}
