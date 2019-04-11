package com.amdocs.jshapi.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.amdocs.jshapi.bamx.CatESNEquipamiento;
import com.amdocs.jshapi.bamx.ESNCompleto;
import com.amdocs.jshapi.bamx.ESNEquipamientosEstudio;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ESNEstudioCompletoTest {

	@Test 
	public void Serialize_ESNCompleto () throws JsonProcessingException
	{
		ESNCompleto esn = new  ESNCompleto();
		esn.setNoCuartos(10);
		List<ESNEquipamientosEstudio> eSNEquipamientosEstudio = new ArrayList<ESNEquipamientosEstudio>();
		ESNEquipamientosEstudio e = new ESNEquipamientosEstudio();
		CatESNEquipamiento catESNEquipamiento = new CatESNEquipamiento();
		catESNEquipamiento.setCValor("Refrigerador");
		
		e.setCatESNEquipamiento(catESNEquipamiento);
		e.setISirve(1);
		e.setITiene(0);
		eSNEquipamientosEstudio.add(e );
		esn.setESNEquipamientosEstudio(eSNEquipamientosEstudio );
		ObjectMapper objectmapper = new ObjectMapper();
 		 
		String requestProxy = objectmapper.writeValueAsString(esn);
		System.out.println(requestProxy);
		//assertEquals("{\"ESNEquipamientosEstudio\":[{\"I_Tiene\":0,\"I_Sirve\":1,\"Cat_ESNEquipamiento\":{\"C_Valor\":\"Refrigerador\"}}],\"No_Cuartos\":10}\r\n" + 
		//		"", requestProxy);
	}
}
