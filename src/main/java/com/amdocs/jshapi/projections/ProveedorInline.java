package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Proveedor;
import com.amdocs.jshapi.domain.Region;
import com.amdocs.jshapi.domain.Servicio;

@Projection(name = "proveedorInline", types = Proveedor.class)
public interface ProveedorInline {
    String getNombre();
    String getComentarios();
    String getCalificacion();
    Date getFechaRegistro();
    String getHabilitado();
    Region getRegion();
    Servicio getServicio();
    Contacto getContacto();

}