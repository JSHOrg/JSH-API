package com.amdocs.jshapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.amdocs.jshapi.estudios.Servicios;
import com.amdocs.jshapi.mappers.ServiciosMapper;

public class ServiciosMapperTest {

	@Test
	public void Deserialize_String_Servicios_Test()
	{
		String input = " {\r\n" + 
				"      \"Luz\": \"Servicio público\",\r\n" + 
				"      \"Agua\": \"Toma domiciliaria\",\r\n" + 
				"      \"Drenaje\": \"Red pública\",\r\n" + 
				"      \"Escusado\": \"Descarga directa\",\r\n" + 
				"      \"Combustible\": \"Gas tanque\"\r\n" + 
				"    }";
		
		ServiciosMapper mapper = new ServiciosMapper();
		Servicios serviciosObject = mapper.Deserialize(input);
		 System.out.println(serviciosObject.getLuz());
		assertEquals( "Servicio publico" ,serviciosObject.getLuz());
	}
}
