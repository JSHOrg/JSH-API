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
	
	public String PostSocioNutricio (ESNCompleto esnCompleto) throws JsonProcessingException
	{
		List<ESNEquipamientosEstudio> lista = esnCompleto.getESNEquipamientosEstudio();
		 
		System.out.println ( lista.iterator().next().getCatESNEquipamiento().getCValor());
		
		StringBuilder urlGetLisBeneficiarios = new StringBuilder(urlPost);
		urlGetLisBeneficiarios.append(estudioSocioNutricioEndPoint);
		
		RequestESNCompleto request = new RequestESNCompleto();
		ObjectMapper objectmapper = new ObjectMapper(); 
		
		List<ESNCompleto> list = new ArrayList<ESNCompleto>();
		list.add(esnCompleto);
		
		request.setListESNEstudioSocioNutricio(list);
		
		request.setUserIntegra(this.getUserObject());
		
		String requestBody =   objectmapper.writeValueAsString(request);
		
		System.out.println("Aqui se imprime el body");
		System.out.println(requestBody);
		System.out.println(urlGetLisBeneficiarios.toString());
		
		URI uri = URI.create(urlGetLisBeneficiarios.toString());

		 
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<RequestESNCompleto> entity = new HttpEntity<RequestESNCompleto>(request ,headers);
		RestTemplate restTemplate = new  RestTemplate();
		ResponseEntity<ResponseESNCompleto[]> response 
			= restTemplate.postForEntity(uri, entity, ResponseESNCompleto[].class);
		
		 ResponseESNCompleto[] respuesta = response.getBody();
		 String responseProxy = 
				 respuesta[0].getResultado() + "  " + respuesta[0].getFolioFamiliar() 
				 + respuesta[0].getError();
		 
		System.out.println(respuesta[0].getResultado() );
		System.out.println(respuesta[0].getFolioFamiliar());

		System.out.println(respuesta[0].getErrorAcceso() );
		System.out.println(respuesta[0].getError());
		return responseProxy;

	}
	
}
