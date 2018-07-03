package com.amdocs.jshapi.projections;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;
import com.amdocs.jshapi.domain.BancoAlimentos;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.Region;

@Projection(name = "bancoAlimentosInline", types = BancoAlimentos.class)
public interface BancoAlimentosInline {
    String getNombre();
    String getRazonSocial();
    String getCalificacion();
    Date getFechaAfiliacion();
    Date getFechaRegistro();
    boolean isHabilitado();
    String getTelefono();
    String getEmail();
    Region getRegion();
    Direccion getDireccion();
    Contacto getContacto();
}