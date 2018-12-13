package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.TipoContacto;
 
 
@Projection(name = "tipoContactoInline", types = TipoContacto.class)
public interface TipoContactoInline {

}
