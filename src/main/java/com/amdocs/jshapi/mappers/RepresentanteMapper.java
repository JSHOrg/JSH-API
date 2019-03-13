package com.amdocs.jshapi.mappers;

import java.io.IOException;

import com.amdocs.jshapi.estudios.Representante;
import com.amdocs.jshapi.estudios.Servicios;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RepresentanteMapper extends BaseMapper {
	
	public Representante Deserialize(String request)
	{
		request = remove(request);
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(request, Representante.class);
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
