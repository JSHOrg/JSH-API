package com.amdocs.jshapi.test;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import com.amdocs.jshapi.bamx.*;
import com.amdocs.jshapi.estudios.Automovil;
import com.amdocs.jshapi.estudios.Estudio;
import com.amdocs.jshapi.estudios.InfraestructuraDeVivienda;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import antlr.collections.List;
public class MappersTest {
	@Test
	public void check_DeserializeThenReturnClass ()
		throws Exception
	{
		esn request = new esn();
		CatDirAsentamiento catdirasentamiento = new CatDirAsentamiento();
		catdirasentamiento.setCValor("Ramon Romo Franco");
		
		CatDirEstado estado = new CatDirEstado();
		estado.setCValor("Aguascalientes");
		
		request.setCP("99100");
		
		request.setFolioFamiliar("BAGDL0090696");
		request.setCatDirEstado(estado);
		request.setCatDirAsentamiento(catdirasentamiento);
		
		ObjectMapper objectmapper = new ObjectMapper();
		String requestString = objectmapper.writeValueAsString(request);
		System.out.println(requestString);
		
	}
	
	@Test 
	public void check_Serialize ()
	 throws Exception
	 {
 
		InfraestructuraDeVivienda infraestructuradevivienda = new InfraestructuraDeVivienda();
		Automovil auto = new Automovil();
		 auto.setSirve(true);
		 auto.setTiene(false);
		java.util.List<Automovil> listAuto = new ArrayList<Automovil>(); //= new java.util.List<Automovil>();
		listAuto.add(auto);
		infraestructuradevivienda.setAutomovil(listAuto);
		 
		 ObjectMapper objectmapper = new ObjectMapper();
			String requestString = objectmapper.writeValueAsString(infraestructuradevivienda);
			System.out.println(requestString);
	 }
}
