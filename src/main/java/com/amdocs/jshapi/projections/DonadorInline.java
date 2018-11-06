package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.Almacen;
import com.amdocs.jshapi.domain.BancoAlimentos;

@Projection(name = "donadorInline", types = Almacen.class)
public interface DonadorInline {
    String getRazonSocial();
    int getReciboFiscal();
    String getRFC();
    String getComentarios();
    String getCalificacion();
    Date getFechaRegistro();
    boolean isHabilitado();
    String getTelefono();
    String getEmail();
    String getTipo();
    String getDescripcion();
    
   // BancoAlimentos getBancoAlimentos();
}