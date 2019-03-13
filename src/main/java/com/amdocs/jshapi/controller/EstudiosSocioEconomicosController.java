package com.amdocs.jshapi.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.jshapi.domain.Benefactor;
import com.amdocs.jshapi.domain.EstudioEconomico;

@RestController
@RequestMapping("/api/EstudiosSocioNuevo")
public class EstudiosSocioEconomicosController {

	@RequestMapping(method = RequestMethod.POST)
	public EstudioEconomico createPost (@Valid @RequestBody EstudioEconomico estudio)
	{
		 
		return null;	
		 
		
	}
}
