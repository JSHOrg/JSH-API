package com.amdocs.jshapi.projections;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Proveedor;
import com.amdocs.jshapi.domain.Region;
import com.amdocs.jshapi.domain.Servicio;

import antlr.collections.List;

@Projection(name = "tutorInline", types = Proveedor.class)

public interface TutorInline {
	 String getNombre();
	    String getComentarios();
	     
}
