package com.amdocs.jshapi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.jshapi.bamx.ESNCompleto;
import com.amdocs.jshapi.bamx.RequestESNCompleto;
import com.amdocs.jshapi.bamx.translate.EstudioToESNCompletoTranslate;
import com.amdocs.jshapi.domain.EstudioEconomico;
import com.amdocs.jshapi.estudios.Estudio;
import com.amdocs.jshapi.mappers.EstudioMapper;
import com.amdocs.jshapi.proxys.EstudioSocioNutricioProxy;
import com.amdocs.jshapi.proxys.responses.ResponseESNCompleto;
import com.amdocs.jshapi.repository.EstudioEconomicoRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/EstudiosSocioNuevo")
public class EstudiosSocioEconomicosController {

	@Autowired
	private EstudioEconomicoRepository estudioeconomicoRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public String createPost (@RequestBody Estudio estudio) throws IOException
	{
		ObjectMapper objectmapper = new ObjectMapper();
		String requestString = objectmapper.writeValueAsString(estudio);
		System.out.println(requestString);
		
		EstudioEconomico entity = new EstudioEconomico();
		entity.setDetalleestudio(requestString);
		Date today = new Date();
		today.getTime();
		entity.setDate(today);
		//entity.setbeneficiario(Long.parseLong("30"));
		entity.setNombreEstudio("Estudio Socio Nutricio Bamx");
		estudioeconomicoRepository.save(entity);
		
		String strESNCompleto = EstudioToESNCompletoTranslate.GetStringESNCompleto(estudio);
		
		System.out.println(strESNCompleto);
 		EstudioSocioNutricioProxy proxy = new EstudioSocioNutricioProxy();
 		ResponseESNCompleto [] responseApi =  proxy.PostSocioNutricio(strESNCompleto);
 		
 		String responseString = objectmapper.writeValueAsString(responseApi);
		return responseString;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Estudio getEstudio ()
	{
		Estudio estudio = new Estudio();
		
		return estudio;
	}
}
