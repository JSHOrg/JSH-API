package com.amdocs.jshapi.mappers;

import java.io.IOException;

import com.amdocs.jshapi.estudios.DatosGenerales;
import com.amdocs.jshapi.estudios.InfraestructuraDeVivienda;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DatosGeneralesMapper extends BaseMapper{
	
	public DatosGenerales Deserialize(String request)
	{
		request = remove(request);
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(request, DatosGenerales.class);
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
