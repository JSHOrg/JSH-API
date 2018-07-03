package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import com.amdocs.jshapi.domain.Producto;
import com.amdocs.jshapi.domain.ClasificacionProducto;

@Projection(name = "productoInline", types = Producto.class)
public interface ProductoInline {
    String getNombre();
    String getPerecedero();
    ClasificacionProducto getClasificacion();
}