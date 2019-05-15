package com.amdocs.jshapi.proxys;

import java.net.URI;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.amdocs.jshapi.bamx.user;
import com.amdocs.jshapi.proxys.responses.Catalogo;
import com.amdocs.jshapi.proxys.responses.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseProxy {

	final String urlPost = "https://webapiservice.bamx.org.mx";
	final String accesoJsonParameter = "?accesoJSON=";
	
	final String gruposEndPoint = "/api/GruposEsn/listarGrupos?accesoJSON=";
	
	final String catalogosEndPoint = "https://webapiservice.bamx.org.mx/api/CatESN/";
	
	 
	
	final int idbanco =34;
	final String username = "elsa.dominguez@prosociedad.org";
	final String password = "y9Z5";
	final String token = "4z8qt8SzrIEMIvOdYsoeWqYmbSY31QSHQL9IjBJkor0=";
	
	public static String encodeURIComponent(String s)
	  {
	    String result = null;

	    try
	    {
	    	s = s.replace("\"elsa.dominguez@prosociedad.org\"", "'elsa.dominguez@prosociedad.org'");
	    	s = s.replace("\"y9Z5\"", "'y9Z5'");
	    	s = s.replace("\"4z8qt8SzrIEMIvOdYsoeWqYmbSY31QSHQL9IjBJkor0=\"", "'4z8qt8SzrIEMIvOdYsoeWqYmbSY31QSHQL9IjBJkor0='");
	   
	    			result = s.replace("{", "%7B")
	    		  .replace("\"", "%22")
	    		  .replace("}", "%7D");
	    }

	    // This exception should never occur.
	    catch (Exception e)
	    {
	      result = s;
	    }

	    return result;
	  }  
	public static String encodeURIComponentOnlyValues(String s)
	  {
	    String result = null;

	    try
	    {
	    	s = s.replace("\"elsa.dominguez@prosociedad.org\"", "'elsa.dominguez@prosociedad.org'");
	    	s = s.replace("\"y9Z5\"", "'y9Z5'");
	    	s = s.replace("\"4z8qt8SzrIEMIvOdYsoeWqYmbSY31QSHQL9IjBJkor0=\"", "'4z8qt8SzrIEMIvOdYsoeWqYmbSY31QSHQL9IjBJkor0='");
	   
	    			result = s.replace("{", "%7B")
	    		  .replace("\"", "%22")
	    		  .replace("}", "%7D");
	    }

	    // This exception should never occur.
	    catch (Exception e)
	    {
	      result = s;
	    }

	    return result;
	  }  


	public List<Catalogo> getList (String EndPoint) throws JsonProcessingException 
	{
		StringBuilder urlget = new StringBuilder(catalogosEndPoint);
		urlget.append(EndPoint);
		urlget.append(accesoJsonParameter);
		urlget.append(getUser());
		
		URI uri = URI.create(urlget.toString());
		
		RestTemplate restTemplate = new  RestTemplate();
		Response response = restTemplate.getForObject(uri, Response.class );
		
		System.out.println( response.getError());
		
		return response.getCatalogo();
	}
	
	public List<Catalogo> getListAsentamientos (String EndPoint) throws JsonProcessingException 
	{
		StringBuilder urlget = new StringBuilder(catalogosEndPoint);
		urlget.append(EndPoint);
		urlget.append(accesoJsonParameter);
		urlget.append(getUserUnescaped ());
		urlget.append("&idMunicipio=538");
		System.out.println(urlget.toString());
		URI uri = URI.create(urlget.toString());
		
		RestTemplate restTemplate = new  RestTemplate();
		Response response = restTemplate.getForObject(uri, Response.class );
		
		System.out.println( response.getError());
		
		return response.getCatalogo();
	}
	
	protected String getUser () throws JsonProcessingException
	{
		user userapp = new user();
		
		userapp.setIdBanco(idbanco);
		userapp.setPass(password);
		userapp.setUserName(username);
		userapp.setToken(token);
		
		ObjectMapper objectmapper = new ObjectMapper();
		String requestString = objectmapper.writeValueAsString(userapp);
		System.out.println(requestString);
		return BamxProxy.encodeURIComponent(requestString);
	}
	
	protected String getUserUnescaped () throws JsonProcessingException
	{
		user userapp = new user();
		
		userapp.setIdBanco(idbanco);
		userapp.setPass(password);
		userapp.setUserName(username);
		userapp.setToken(token);
		
		ObjectMapper objectmapper = new ObjectMapper();
		String requestString = objectmapper.writeValueAsString(userapp);
		System.out.println(requestString);
		return requestString;
	}
	
	protected user getUserObject()
	{
		user userapp = new user();
		userapp.setIdBanco(idbanco);
		userapp.setPass(password);
		userapp.setUserName(username);
		userapp.setToken(token);
		return userapp;
	}
}
