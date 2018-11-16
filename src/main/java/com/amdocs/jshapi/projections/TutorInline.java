package com.amdocs.jshapi.projections;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.Tutor;

import antlr.collections.List;

@Projection(name = "tutorInline", types = Tutor.class)

public interface TutorInline {
	 
	 Long getId ();
	 String  getComentarios();
	 String getCalificacion ();
	 String getEspecialidad();
	 boolean isHabilitado();
	 Direccion getDireccion();
	 Contacto getContacto();
	 
}
