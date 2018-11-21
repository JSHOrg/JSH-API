package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Familia;

@Projection(name = "familiaInline", types = Familia.class)
public interface FamiliaInline {
	int getId();
	int getIntegrantesCount();
}
