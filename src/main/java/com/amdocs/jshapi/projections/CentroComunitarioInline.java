package com.amdocs.jshapi.projections;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;
import com.amdocs.jshapi.domain.BancoAlimentos;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;

@Projection(name = "centroComunitarioInline", types = BancoAlimentos.class)
public interface CentroComunitarioInline {
    String getNombre();
    Date getFechaRegistro();
    boolean isHabilitado();
    Direccion getDireccion();
    Contacto getContacto();
    BancoAlimentos getBancoAlimentos();
}