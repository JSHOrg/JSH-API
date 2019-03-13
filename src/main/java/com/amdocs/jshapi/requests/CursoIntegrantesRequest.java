package com.amdocs.jshapi.requests;

import java.util.List;

public class CursoIntegrantesRequest {

	private int idCurso;
	private List<IntegranteRequest> integrantes;
	
	public int getIdCurso()
	{
		return idCurso;
	}
	
	public void setIdCurso (int idCurso)
	{
		this.idCurso= idCurso;
	}
	
	public List<IntegranteRequest> getIntegrantes()
	{
		return this.integrantes ;
	}
	
	public void setIntegrantes(List<IntegranteRequest> integrantes)
	{
		this.integrantes = integrantes;
	}
	
	
}
	 
	
	

