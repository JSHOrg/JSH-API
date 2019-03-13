package com.amdocs.jshapi.mappers;

public class BaseMapper{

	protected String remove(String texto) {
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
	
	protected String removeQuestionMarkEncodded (String texto)
	{
		return texto.replace("\\u00bf","");
	}
	protected String removeQuestionMark (String texto)
	{
		return  removeQuestionMarkEncodded( texto.replace("¿",""));
	}
}
