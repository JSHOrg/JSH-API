package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;
 
import com.amdocs.jshapi.domain.TrabajadorSocial;

@Projection(name = "TrabajadorSocialInline", types = TrabajadorSocial.class)
public interface TrabajadorSocialInline {

	 String getNombre ();
	 String getPuesto ();
	  String getCorreo ();
	 int getComunidadesAsignadas ();
}
