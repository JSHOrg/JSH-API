package com.amdocs.jshapi.projections;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Curso;

@Projection(name = "cursoInline", types = Curso.class)
public interface CursoInline {
	 
}
