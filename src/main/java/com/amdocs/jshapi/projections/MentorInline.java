package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.Mentor;

@Projection(name = "mentorInline", types = Mentor.class)
public interface MentorInline {
	Long getId ();
	String  getComentarios();
	String getCalificacion ();
	Direccion getDireccion();
	Contacto getContacto();
	String getEspecialidad();
	boolean isHabilitado();
}
