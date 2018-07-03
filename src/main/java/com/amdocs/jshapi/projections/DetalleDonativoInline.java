package com.amdocs.jshapi.projections;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;
import com.amdocs.jshapi.domain.Account;
import com.amdocs.jshapi.domain.BancoAlimentos;
import com.amdocs.jshapi.domain.DetalleDonativo;
import com.amdocs.jshapi.domain.Donativo;
import com.amdocs.jshapi.domain.Embalaje;
import com.amdocs.jshapi.domain.Producto;

@Projection(name = "detalleDonativoInline", types = DetalleDonativo.class)
public interface DetalleDonativoInline {
    String getCantidadKg();
    String getCantidadPza();
    Date getFechaConsumoLimite();
    boolean isCosecha();
    int getPagoCosecha();
    int getCantidadEmbalaje();
    boolean isStatus();
    Date getFechaSolicitud();
    Date getFechaConfirmacion();
    Date getFechaRecepcion();
    String getCantidadRecibida();
    String getCantidadRecibidaBuenEstado();
    String getCostoOperativoAcopio();
    String getComentarios();
    String getCalificacion();
    Donativo getDonativo();
    Producto getProducto();
    Embalaje getEmbalaje();
    BancoAlimentos getBancoAlimentos();
    Account getUsuario();



}