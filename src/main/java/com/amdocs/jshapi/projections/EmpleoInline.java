package com.amdocs.jshapi.projections;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Aliado;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.Empleo;

@Projection(name = "empleoInline", types = Empleo.class)
public interface EmpleoInline {

	Long getId();
	String getPuesto();
	String getPlazas();
	String getSexo();
	String getRequisitos ();
	String getEscolaridad ();
	String getExperiencia();
	BigDecimal getSueldomensual();
	String getHorario();
	Date getVigencia();
	Date getFechaalta ();
	String getNombreempresa ();
	String getGiro();
	String getObservaciones(); 
	Contacto getContacto();
	Aliado getAliado();
	Direccion getDireccion();

}
