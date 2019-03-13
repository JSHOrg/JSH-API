package com.amdocs.jshapi.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.amdocs.jshapi.proxys.BamxProxy;
import com.amdocs.jshapi.proxys.responses.Catalogo;
import com.fasterxml.jackson.core.JsonProcessingException;

public class bamxproxytest {

	@Test 
	public void bamxproxy_GetGroups_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListGrupos(43);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(2, lista.size());		
	}
	
	@Test
	public void bamxproxy_getServiciosSanitarios_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListServiciosSanitarios();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(8, lista.size());	
	}
	
	@Test
	public void bamxproxy_getServiciosLuz_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListServiciosLuz();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(7, lista.size());	
	}
	
	@Test
	public void bamxproxy_getServiciosAgua_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListServiciosAgua();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(7, lista.size());	
	}
	
	@Test
	public void bamxproxy_getServiciosGas_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListSeriviciosGas();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(7, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Tenencia_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListTenencia();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(9, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Paredes_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListParedes();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(9, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Techos_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListTechos();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(9, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_TipoVivienda_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListTipoVivienda();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(9, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Condicionvivienda_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getCondicionesVivienda();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(2, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_TipoApoyo_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getCondicionesVivienda();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(2, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_PreguntasAlimentacion_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getPreguntasAlimentacion();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(13, lista.size());	
	}
	

	@Test
	public void bamxproxy_getCatalogo_TipoPobreza_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getTipoPobreza();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(4, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_TipoAsentamiento_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListTipoAsentamiento();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(40, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_TipoVialidad_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getCatalogoTipoVialidad();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(22, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_BanoExcusado_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getBanoExcusado();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(4, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_EstadoCivil_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getEstadoCivil();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(4, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Parentesco_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getParentesco();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(15, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Escolaridad_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getEscolaridad();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Frecuencia_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getFrecuencia();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Ocupacion_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListOcupacion();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_TipoEmpleo_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListTipoEmpleo();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_DerechoHabiencia_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListDerechoHabiencia();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Motivo_DerechoHabiencia_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListMotivoDerechoHabiencia();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Documento_Identidad_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListDocIdentidad();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Tipo_Pisos_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListTipoPisos();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Tipo_Egresos_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListTipoEgreso();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Tipo_Equipamiento_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListEquipamiento();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
	@Test
	public void bamxproxy_getCatalogo_Tipo_Ingreso_Test ()
	{
		BamxProxy proxy = new BamxProxy();
		List<Catalogo> lista = new ArrayList<Catalogo>();
		
		 try {
			 lista = proxy.getListTipoIngreso();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 assertEquals(10, lista.size());	
	}
	
}
