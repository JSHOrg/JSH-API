package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection; 
import com.amdocs.jshapi.domain.Benefactor;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.TipoBenefactor;

@Projection(name = "benefactorInline", types = Benefactor.class)
public interface BenefactorInline {

	 Long getId();
	 Direccion getDireccion();
	 Contacto getContacto();
	 String getNombre();
	 String getRazonSocial();
}
