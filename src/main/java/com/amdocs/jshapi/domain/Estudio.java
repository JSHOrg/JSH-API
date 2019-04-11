package com.amdocs.jshapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Estudio {
	@JsonProperty ("detalleestudio")
	private String detalleestudio;
	
	public String getDetalleestudio ()
	{
		return detalleestudio;
	}
	
	public void setDetalleestudio (String detalleestudio)
	{
		this.detalleestudio = detalleestudio;
	}
}
