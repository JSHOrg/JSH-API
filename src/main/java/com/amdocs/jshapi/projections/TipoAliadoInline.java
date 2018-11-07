package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.TipoAliado;

@Projection(name = "tipoAliadoInline", types = TipoAliado.class)
public interface TipoAliadoInline {

	Long getId();
	String getNombre();
}
