package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.TipoServicio;
 
@Projection(name = "tiposServicioInline", types = TipoServicio.class)
public interface TipoServicioInline {
	
	Integer getId();
	String getNombre();
}
