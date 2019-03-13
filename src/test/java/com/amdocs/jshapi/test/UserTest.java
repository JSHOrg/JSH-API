package com.amdocs.jshapi.test;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.amdocs.jshapi.bamx.*;

public class UserTest {

	@Test
	public void SerializeUserTest() throws JsonProcessingException {

	    user usert = new user();
	    usert.setUserName("elsa.dominguez@prosociedad.org");
	    usert.setIdBanco(34);
	    usert.setPass("y925");
	    usert.setToken("4z8qt8SzrIEMIvOdYsoeWqYmbSY31QSHQL9IjBJkor0=");
	    
		ObjectMapper objectmapper = new ObjectMapper();
		String requestString = objectmapper.writeValueAsString(usert);
		System.out.println(requestString);
	}

}
