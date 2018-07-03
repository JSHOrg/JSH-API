package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.Account;
import com.amdocs.jshapi.domain.DetalleDonativo;
import com.amdocs.jshapi.domain.EntradaAlmacen;

@Projection(name = "entradaAlmacenInline", types = EntradaAlmacen.class)
public interface EntradaAlmacenInline {
    String getFolioInterno();
    String getCantidadOriginal();
    String getCantidadActual();
    String getSeccionAlmacenamiento();
    Date getFechaEntrada();
    boolean isStatus();
    DetalleDonativo getDetalleDonativo();
    Account getUsuario();
}