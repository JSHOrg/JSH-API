package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.OfertaEducativa;

@Projection(name = "ofertaEducativaInline", types = OfertaEducativa.class)
public interface OfertaEducativaInline {
	Integer getId();
	String getNombre();
	String getDescripcion();
}
