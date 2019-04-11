package com.amdocs.jshapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.amdocs.jshapi.estudios.DatosGenerales;
import com.amdocs.jshapi.mappers.DatosGeneralesMapper;

public class DatosGeneralesMapperTest {
	
	@Test
	public void Deserialize_String_DatosGenerales ()
	{
		String input =  "{  \"Nombre de la comunidad o programa\": \"Comunidad\",\r\n" + 
				"      \"Grupo\": \"1\",\r\n" + 
				"      \"Fecha de levantamiento\": \"9 / 4 / 2019\",\r\n" + 
				"      \"Fecha de captura\": \"9 / 4 / 2019\",\r\n" + 
				"      \"Tipo de vialidad\": \"Andador\",\r\n" + 
				"      \"Nombre de vialidad\": \"vialidad\",\r\n" + 
				"      \"Numero exterior\": \"0000\",\r\n" + 
				"      \"Numero interior\": \"0000\",\r\n" + 
				"      \"Tipo de asentamiento\": \"Ampliacion\",\r\n" + 
				"      \"Nombre de asentamiento\": \"asentamiento\",\r\n" + 
				"      \"Codigo postal\": \"00000\",\r\n" + 
				"      \"Localidad\": \"localidad\",\r\n" + 
				"      \"Municipio\": \"Municipio\",\r\n" + 
				"      \"Clave de municipio\": \"123\",\r\n" + 
				"      \"Estado\": \"Estado\",\r\n" + 
				"      \"Clave de estado\": \"123\",\r\n" + 
				"      \"Entre vialidades\": \"Vialidades\",\r\n" + 
				"      \" Descripcion de ubicacion \": \"\",\r\n" + 
				"      \"Telefono / celular\": \"\"}";
		DatosGeneralesMapper mapper = new DatosGeneralesMapper();
		DatosGenerales datosgeneralesObject = mapper.Deserialize(input);
		System.out.println(datosgeneralesObject.getTipoDeVialidad());
		assertEquals( "Andador", datosgeneralesObject.getTipoDeVialidad());
		assertEquals("0000", datosgeneralesObject.getNumeroExterior());
		assertEquals("0000", datosgeneralesObject.getNumeroInterior());
	}
}
