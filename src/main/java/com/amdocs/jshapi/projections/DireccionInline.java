package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Direccion;

@Projection(name = "DireccionInline", types = Direccion.class)

public interface DireccionInline {

}
