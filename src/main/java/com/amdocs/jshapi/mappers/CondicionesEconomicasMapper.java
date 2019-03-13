package com.amdocs.jshapi.mappers;

import java.io.IOException;

import com.amdocs.jshapi.estudios.CondicionesEconomicas;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CondicionesEconomicasMapper extends BaseMapper {
	
	public CondicionesEconomicas Deserialize (String request)
	{
		request = remove(request);
		request = removeQuestionMark(request);
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(request, CondicionesEconomicas.class);
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
