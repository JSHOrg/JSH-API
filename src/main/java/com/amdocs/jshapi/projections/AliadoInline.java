package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Aliado;
import com.amdocs.jshapi.domain.BancoAlimentos;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.TipoAliado;

@Projection(name = "aliadoInline", types = Aliado.class)
public interface AliadoInline {
	String getRazonSocial();
    Contacto getContacto();
    BancoAlimentos getBancoAlimentos();
    Direccion getDireccion();
    TipoAliado getTipoAliado();
}