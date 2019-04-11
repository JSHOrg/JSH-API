package com.amdocs.jshapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.jshapi.proxys.BamxProxy;
import com.amdocs.jshapi.proxys.responses.Beneficiario;
import com.amdocs.jshapi.proxys.responses.ResponseBeneficiarios;

import com.fasterxml.jackson.core.JsonProcessingException;
 

@RestController
@RequestMapping("/api/BeneficiariosSIGO")
public class BeneficiariosSIGO {
 
	@RequestMapping(method = RequestMethod.GET,  value = "ByFolio", params = {"FolioFamiliar"})
	public ResponseBeneficiarios getBeneficiarioByFolio(String FolioFamiliar) throws JsonProcessingException 
	{
		ResponseBeneficiarios response = new ResponseBeneficiarios();
		
		BamxProxy bamxProxy = new BamxProxy();
	
		List<Beneficiario> beneficiarios = bamxProxy.getListBeneficiarios(FolioFamiliar);
		response.setBeneficiarios(beneficiarios);
		
		return response;

	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "ByApellido", params = {"Apellido"})
	public ResponseBeneficiarios getBeneficiarioByApellido(String Apellido) throws JsonProcessingException 
	{
		List<Beneficiario> beneficiarios = new ArrayList<Beneficiario>();
		
		Beneficiario beneficiario1 = new Beneficiario();
		beneficiario1.setNombre("Jaun");
		beneficiario1.setApellidoPaterno("Conde");
		beneficiario1.setApellidoMaterno("De Dinamarca");
		beneficiario1.setIdBeneficiario(19200);
		
		Beneficiario beneficiario2 = new Beneficiario();
		beneficiario2.setNombre("Manex");
		beneficiario2.setApellidoPaterno("Conde");
		beneficiario2.setApellidoMaterno("De Dinamarca");
		beneficiario2.setIdBeneficiario(19200);
		
		beneficiarios.add(beneficiario1);
		beneficiarios.add(beneficiario2);
		
		ResponseBeneficiarios response = new ResponseBeneficiarios();
		response.setBeneficiarios(beneficiarios);
		
		return response;
	}	
}
