package com.amdocs.jshapi.projections;

import java.util.Date;
import java.util.Set;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Centrograduacion;
import com.amdocs.jshapi.domain.Curso;
import com.amdocs.jshapi.domain.CursoIntegrante;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.TutorCurso;

@Projection(name = "cursoInline", types = Curso.class)
public interface CursoInline {
	Long getId();
	String getDescripcion ();
	String getNombre();

	String getCalificacion ();
	String getFrecuencia ();

	String getNosesiones();
	String getPatrocinado ();
	Date getFechaCurso();
	Direccion getDireccion();
	Centrograduacion getCentrograduacion();
	Set<CursoIntegrante> getCursosIntegrantes ();
	Set<TutorCurso> getTutorcurso ();

}
