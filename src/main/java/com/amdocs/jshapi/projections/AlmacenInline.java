package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Almacen;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.BancoAlimentos;
import com.amdocs.jshapi.domain.Direccion;

@Projection(name = "almacenInline", types = Almacen.class)
public interface AlmacenInline {
    Contacto getContacto();
    BancoAlimentos getBancoAlimentos();
    Direccion getDireccion();
}