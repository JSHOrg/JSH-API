package com.amdocs.jshapi.mappers;

import java.io.IOException;

import com.amdocs.jshapi.estudios.Estudio;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperEstudioFromRequest {

	
	public Estudio DeserializeEstudio (String request)
	{
		request = remove(request);
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(request, Estudio.class);
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
	
	private String remove(String texto) {
	    String original = "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýÿ";
	    // Cadena de caracteres ASCII que reemplazarán los originales.
	    String ascii = "AAAAAAACEEEEIIIIDNOOOOOOUUUUYBaaaaaaaceeeeiiiionoooooouuuuyy";
	    String output = texto;
	    for (int i=0; i<original.length(); i++) {
	    // Reemplazamos los caracteres especiales.

	        output = output.replace(original.charAt(i), ascii.charAt(i));

	    }
	    
	    return output;
	}
}
