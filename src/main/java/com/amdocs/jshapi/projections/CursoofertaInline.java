package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Areaofertaeducativa;
import com.amdocs.jshapi.domain.Centrograduacion;
import com.amdocs.jshapi.domain.CursoOferta;
import com.amdocs.jshapi.domain.Direccion;

@Projection(name = "cursoofertaInline", types = CursoOferta.class)

public interface CursoofertaInline {

	Long getId();
		String getDescripcion ();
		String getNombre();
		Integer getHabilitado ();
		Direccion getDireccion();
		Centrograduacion getCentrograduacion();
		Areaofertaeducativa getAreaofertaeducativa ();
}
