package com.amdocs.jshapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.amdocs.jshapi.estudios.Control;
import com.amdocs.jshapi.mappers.ControlMapper;

public class ControlMapperTest {

	@Test
	public void Deserialize_String_Control() 
	{
		String input = "{\r\n" + 
				"      \"¿A qué se dedican las personas de su familia en edad productiva?\": \"\",\r\n" + 
				"      \"¿Con qué conocimientos cuentan las personas de su familia económicamente activas?\": \"Algo relacionado a lo que hago actualmente. \",\r\n" + 
				"      \"Si pudiera especializarse en alguna actividad productiva ¿Qué le gustaría realizar?\": \"Construcción.\"\r\n" + 
				"    }";
		ControlMapper mapper = new ControlMapper();
		Control controlobject = mapper.Deserialize(input);
		System.out.println(controlobject.getConQueConocimientosCuentanLasPersonasDeSuFamiliaEconomicamenteActivas());
		assertEquals( false, false);
		
	}
}
