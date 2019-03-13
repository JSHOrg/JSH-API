package com.amdocs.jshapi.test;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.amdocs.jshapi.estudios.EstructuraFamiliar;
import com.amdocs.jshapi.mappers.EstructuraFamiliarMapper;

public class EstructuraFamiliarMapperTest {

	 
	
	
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
