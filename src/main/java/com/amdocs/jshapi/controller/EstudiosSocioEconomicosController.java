package com.amdocs.jshapi.controller;

import java.io.IOException;
import java.util.ArrayList;
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
import com.amdocs.jshapi.estudios.Estudio;
import com.amdocs.jshapi.mappers.EstudioMapper;
import com.amdocs.jshapi.proxys.EstudioSocioNutricioProxy;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/EstudiosSocioNuevo")
public class EstudiosSocioEconomicosController {

	//@Autowired
//	private EstudioEconomicoRepository estudioeconomicoRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public String createPost (@RequestBody Estudio estudio) throws IOException
	{
		System.out.println ( estudio.getEmbedded().getAlimentacion().getPreguntas().size());
		//ESNCompleto esn = EstudioToESNCompletoTranslate.TranslateEstudioCompleto(estudio);
		String strESNCompleto = EstudioToESNCompletoTranslate.GetStringESNCompleto(estudio);
		 
 		//EstudioSocioNutricioProxy proxy = new EstudioSocioNutricioProxy();
 		//String responseString =  proxy.PostSocioNutricio(esn);
		return strESNCompleto;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Estudio getEstudio ()
	{
		Estudio estudio = new Estudio();
		
		return estudio;
	}
}
