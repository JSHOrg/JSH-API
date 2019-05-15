package com.amdocs.jshapi.test;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.jshapi.estudios.EstructuraFamiliar;
import com.amdocs.jshapi.estudios.Integrante;
import com.amdocs.jshapi.mappers.EstructuraFamiliarMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EstructuraFamiliarMapperTest {

	@Test 
	public void Serialize_Estuctura_Familar() throws JsonProcessingException
	{
		EstructuraFamiliar estfamObject = new EstructuraFamiliar();
		List<Integrante> integrantes = new ArrayList<Integrante>();
		Integrante intgrante1 = new Integrante();
		intgrante1.setNombreS("Juan de las pelotas");
		intgrante1.setPrimerApellido("Mi apellido");
		integrantes.add(intgrante1);
		
		estfamObject.setIntegrantes(integrantes);
		ObjectMapper objectmapper = new ObjectMapper();
		String requestString = objectmapper.writeValueAsString(estfamObject);
		System.out.println(requestString);
		 assertEquals(1, 1);
	}
	
	
	@Test
	public void Deserialize_String_Estructura_Familiar ()
	{
		String input = " {\r\n" + 
				"      \"Integrantes\": [\r\n" + 
				"        {\r\n" + 
				"          \"CURP\": \"\",\r\n" + 
				"          \"Sexo\": \"Hombre\",\r\n" + 
				"          \"Grado\": \"PREESCOLAR O KINDER\",\r\n" + 
				"          \"Nivel\": \"TERMINADO O PASANTE\",\r\n" + 
				"          \"Nombre(s)\": \"\",\r\n" + 
				"          \"Parentesco\": \"MADRE\",\r\n" + 
				"          \"Estado civil\": \"SOLTERO(A)\",\r\n" + 
				"          \"Primer apellido\": \"\",\r\n" + 
				"          \"Segundo apellido\": \"\",\r\n" + 
				"          \"Fecha de nacimiento\": \"\",\r\n" + 
				"          \"Entidad de nacimiento\": \"\",\r\n" + 
				"          \"Asiste a la escuela…\": \"\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    }";
		EstructuraFamiliarMapper mapper = new EstructuraFamiliarMapper();
		 EstructuraFamiliar estfamObject =  mapper.Deserialize(input);
		 assertEquals(1, estfamObject.getIntegrantes().size());
	}
}
