package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

import com.amdocs.jshapi.domain.Account;
import com.amdocs.jshapi.domain.BancoAlimentos;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.Donador;
import com.amdocs.jshapi.domain.Donativo;
import com.amdocs.jshapi.domain.TransporteCaja;
import com.amdocs.jshapi.domain.TransporteUnidades;;

@Projection(name = "donativoInline", types = Donativo.class)
public interface DonativoInline {
    String getRemisionBA();
    Date getFechaRegistro();
    Date getFechaAcopio();
    String getRequerimientosDonador();
    int getCostoOperativo();
    String getEspecificaciones();
    Donador getDonador();
    TransporteCaja getTransportesCajas();
    TransporteUnidades getTransportesUnidades();
    BancoAlimentos getBancoAlimentosOfertante();
    Contacto getContactoDonador();
    BancoAlimentos getBancoAlimentosPropietario();
    Account getUsuario();
    Direccion getDireccionAcopio();
}