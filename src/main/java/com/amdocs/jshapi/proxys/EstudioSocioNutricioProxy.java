package com.amdocs.jshapi.proxys;
 
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.amdocs.jshapi.bamx.ESNCompleto;
import com.amdocs.jshapi.bamx.ESNEquipamientosEstudio;
import com.amdocs.jshapi.bamx.RequestESNCompleto;
import com.amdocs.jshapi.proxys.responses.ResponseBeneficiarios;
import com.amdocs.jshapi.proxys.responses.ResponseESNCompleto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EstudioSocioNutricioProxy extends BaseProxy {

	final String estudioSocioNutricioEndPoint ="/api/EstudioSocioNutricio/guardarESNCompleto";
	
	public ResponseESNCompleto[] PostSocioNutricio (String esnCompleto) throws JsonProcessingException
	{
		 
		
		StringBuilder urlGetLisBeneficiarios = new StringBuilder(urlPost);
		urlGetLisBeneficiarios.append(estudioSocioNutricioEndPoint);
		
		 
		String requestBody = "{ \"UserIntegra\": ";
		requestBody +=  this.getUserUnescaped()+ ",";
		requestBody += "\"ListESNEstudioSocioNutricio\": [" + esnCompleto + "]}";
  		
		//return requestBody;
		
		 System.out.println(requestBody);
		URI uri = URI.create(urlGetLisBeneficiarios.toString());

		 
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> entity = new HttpEntity<String>(requestBody ,headers);
		RestTemplate restTemplate = new  RestTemplate();
		ResponseEntity<ResponseESNCompleto[]> response 
			= restTemplate.postForEntity(uri, entity, ResponseESNCompleto[].class);
		
		 ResponseESNCompleto[] respuesta = response.getBody();
		 
		 return respuesta;
		/* String responseProxy = 
				 respuesta[0].getResultado() + "  " + respuesta[0].getFolioFamiliar() 
				 + respuesta[0].getError();
		 
		System.out.println(respuesta[0].getResultado() );
		System.out.println(respuesta[0].getFolioFamiliar());

		System.out.println(respuesta[0].getErrorAcceso() );
		System.out.println(respuesta[0].getError());
		return responseProxy; */

	}
	
}
