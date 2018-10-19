package com.amdocs.jshapi.projections;
import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.Empleo;

@Projection(name = "empleoInline", types = Empleo.class)
public interface EmpleoInline {

	 Long getId();	
	 String getTipo();
     String getOfertaEconomica();  
	 String getVigencia();
	 Direccion getDireccion();
}
