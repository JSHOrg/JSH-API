package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.DetalleDonativo;
import com.amdocs.jshapi.domain.Proveedor;
import com.amdocs.jshapi.domain.SolicitudesRecoleccion;

@Projection(name = "solicitudesRecoleccionInline", types = SolicitudesRecoleccion.class)
public interface SolicitudesRecoleccionInline {
    DetalleDonativo getDetalleDonativo();
    Proveedor getProveedor();
    Date getFechaProgramada();
}