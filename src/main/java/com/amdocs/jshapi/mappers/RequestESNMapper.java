package com.amdocs.jshapi.mappers;

import java.io.IOException;

import com.amdocs.jshapi.bamx.RequestESNCompleto;
import com.amdocs.jshapi.estudios.Alimentacion;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RequestESNMapper {

	public RequestESNCompleto Deserialize(String request)
	{
		 
		System.out.println(request);
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(request, RequestESNCompleto.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
