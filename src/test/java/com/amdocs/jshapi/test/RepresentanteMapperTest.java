package com.amdocs.jshapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.amdocs.jshapi.estudios.Alimentacion;
import com.amdocs.jshapi.estudios.Representante;
import com.amdocs.jshapi.mappers.AlimentacionMapper;
import com.amdocs.jshapi.mappers.RepresentanteMapper;


public class RepresentanteMapperTest {

	@Test
	public void Deserialize_Representante_Mapper_Test ()
	{
		String input = "{\r\n" + 
				"      \"Calle\": \"\",\r\n" + 
				"      \"Estado\": \"\",\r\n" + 
				"      \"Colonia\": \"\",\r\n" + 
				"      \"Comunidad\": \"\",\r\n" + 
				"      \"Municipio\": \"\",\r\n" + 
				"      \"Escolaridad\": \"PREESCOLAR O KINDER\",\r\n" + 
				"      \"Número exterior\": \"\",\r\n" + 
				"      \"Número interior\": \"\",\r\n" + 
				"      \"Nombre del titular\": \"\",\r\n" + 
				"      \"Estatus Escolaridad\": \"Completa\"\r\n" + 
				"    }";
		
		RepresentanteMapper mapper = new RepresentanteMapper ();
		Representante representanteObject = mapper.Deserialize(input);
		System.out.println(representanteObject.getEscolaridad());
		assertEquals( "Completa", representanteObject.getEstatusEscolaridad());
	}
}
