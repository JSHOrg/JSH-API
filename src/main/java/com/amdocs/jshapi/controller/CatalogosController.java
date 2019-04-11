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
	
	@RequestMapping(method = RequestMethod.GET,  value = "BanoExcusado")
	public List<Catalogo> getListaBanoExcusado() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getBanoExcusado();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "BanoDuracionMeses")
	public List<Catalogo> getListaDuracionMeses() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getDuracionMeses();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "Escolaridad")
	public List<Catalogo> getListaEscolaridad() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getEscolaridad();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "EstadoCivil")
	public List<Catalogo> getListaEstadoCivil() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getEstadoCivil();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "Frecuencia")
	public List<Catalogo> getListaFrecuencia() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getFrecuencia();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "InseguridadAlimentaria")
	public List<Catalogo> getListaInseguridadAlimentaria() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getInseguridadAlimentaria();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "Comunidades")
	public List<Catalogo> getListaComunidades() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListComunidades();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "DerechoHabiencia")
	public List<Catalogo> getListaDerechoHabiencia() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListDerechoHabiencia();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "DocIdentidad")
	public List<Catalogo> getListaDocIdentidad() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListDocIdentidad();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "MotivoDerechoHabiencia")
	public List<Catalogo> getListaMotivoDerechoHabiencia() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListMotivoDerechoHabiencia();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "Ocupacion")
	public List<Catalogo> getListaOcupacion() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListOcupacion();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "Paredes")
	public List<Catalogo> getListaParedes() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListParedes();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "ServiciosGas")
	public List<Catalogo> getListaServiciosGas() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListSeriviciosGas();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "ServiciosAgua")
	public List<Catalogo> getListaServiciosAgua() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListServiciosAgua();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "ServiciosLuz")
	public List<Catalogo> getListaServiciosLuz() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListServiciosLuz();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "ServiciosSanitarios")
	public List<Catalogo> getListaServiciosSanitarios() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListServiciosSanitarios();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "Techos")
	public List<Catalogo> getListaTechos() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListTechos();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "Tenencia")
	public List<Catalogo> getListaTenencia() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListTenencia();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "TipoAsentamiento")
	public List<Catalogo> getListaTipoAsentamiento() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListTipoAsentamiento();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "TipoEgreso")
	public List<Catalogo> getListaTipoEgreso() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListTipoEgreso();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "TipoEmpleo")
	public List<Catalogo> getListaTipoEmpleo() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListTipoEmpleo();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "TipoIngreso")
	public List<Catalogo> getListaTipoIngreso() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListTipoIngreso();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "TipoPisos")
	public List<Catalogo> getListaTipoPisos() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListTipoPisos();
	}
	
	@RequestMapping(method = RequestMethod.GET,  value = "TipoVivienda")
	public List<Catalogo> getListaTipoVivienda() throws JsonProcessingException 
	{
		BamxProxy bamxProxy = new BamxProxy();
		return bamxProxy.getListTipoVivienda();
	}
}
