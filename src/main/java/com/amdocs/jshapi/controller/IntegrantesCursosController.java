package com.amdocs.jshapi.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.jshapi.domain.Curso;
import com.amdocs.jshapi.domain.CursoIntegrante;
import com.amdocs.jshapi.domain.Integrante;
import com.amdocs.jshapi.repository.CursoRepository;
import com.amdocs.jshapi.repository.IntegranteCursosRepository;
import com.amdocs.jshapi.repository.IntegranteRepository;
import com.amdocs.jshapi.requests.CursoIntegrantesRequest;
import com.amdocs.jshapi.requests.IntegranteRequest;
import com.amdocs.jshapi.service.IntegranteCursoService;

@RestController
@RequestMapping("/api/IntegrantesCursosNuevo")

public class IntegrantesCursosController {
	
	@Autowired
	IntegranteCursoService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> createPost (@Valid @RequestBody CursoIntegrantesRequest cursointegrante)
	{	
		System.out.println(cursointegrante.toString());
		System.out.println(cursointegrante.getIdCurso());
		String result = "";
		try 
		{
			result = service.AgregarIntegrantesCurso(cursointegrante);
			System.out.println(result);
		}
		catch(Exception ex)
		{
			System.out.println("Se obtuvo una excepcion?");
			result = ex.getLocalizedMessage();
			System.out.println(result);
		}
		return new ResponseEntity<> ( result, HttpStatus.OK);
	}
}
