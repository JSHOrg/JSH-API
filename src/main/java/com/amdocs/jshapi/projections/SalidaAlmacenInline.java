package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.Account;
import com.amdocs.jshapi.domain.CentroComunitario;
import com.amdocs.jshapi.domain.SalidaAlmacen;

@Projection(name = "salidaAlmacenInline", types = SalidaAlmacen.class)
public interface SalidaAlmacenInline {
    String getCantidad();
    String getMotivo();
    boolean isTipoSalida();
    Date getFechaSalida();
    CentroComunitario getCentroComunitario();
    Account getUsuario();
}