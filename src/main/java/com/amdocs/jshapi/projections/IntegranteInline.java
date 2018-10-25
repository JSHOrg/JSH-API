package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Integrante;

@Projection(name = "integranteInline", types = Integrante.class)
public interface IntegranteInline {

}
