package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.AreaOfertaEducativa;;

@Projection(name = "areaofertaeducativaInline", types = AreaOfertaEducativa.class)
public interface AreaOfertaEducativaInline {
	Integer getId();
	String getNombre();
}
