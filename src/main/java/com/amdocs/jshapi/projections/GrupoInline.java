package com.amdocs.jshapi.projections;


import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Grupo;
import com.amdocs.jshapi.domain.TrabajadorSocial;

@Projection(name = "grupoInline", types = Grupo.class)
public interface GrupoInline {
	int getId();
	TrabajadorSocial getTrabajadorAsignado();
}
