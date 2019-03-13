package com.amdocs.jshapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.jshapi.proxys.BamxProxy;
import com.amdocs.jshapi.proxys.responses.Catalogo;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/api/Catalogos")
public class CatalogosController {

 	//@Autowired BamxProxy bamxProxy; 
 	
	@RequestMapping(method = RequestMethod.GET,  value = "TipoVialidad")
	public List<Catalogo> getTipoVialidad() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getCatalogoTipoVialidad();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "CondicionesVivienda")
	public List<Catalogo> getCondicionesVivienda() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getCondicionesVivienda();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "PreguntasAlimentacion")
	public List<Catalogo> getPreguntasAlimentacion() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getPreguntasAlimentacion();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "Equipamiento")
	public List<Catalogo> getListaEquipamiento() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListEquipamiento();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "Grupos", params = {"idPDiagnostico"})
	public List<Catalogo> getListaGrupos(int idPDiagnostico) throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListGrupos(idPDiagnostico);
	}
}
