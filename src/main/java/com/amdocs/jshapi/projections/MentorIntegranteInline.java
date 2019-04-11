package com.amdocs.jshapi.projections;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Integrante;
import com.amdocs.jshapi.domain.Mentor;
import com.amdocs.jshapi.domain.MentorIntegrante;

@Projection(name = "mentorIntegranteInline", types = MentorIntegrante.class)
public interface MentorIntegranteInline {

	String getComentarios ();
	String getFrecuencia();
	Integrante getIntegrante();
	Mentor getMentor();
	Date getFechaAsignacion();
	Integer getHabilitado ();
}
