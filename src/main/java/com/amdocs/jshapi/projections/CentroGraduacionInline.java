package com.amdocs.jshapi.projections;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amdocs.jshapi.domain.BancoAlimentos;
import com.amdocs.jshapi.domain.CentroComunitario;
import com.amdocs.jshapi.domain.Centrograduacion;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;

@Projection(name = "centroGraduacionInline", types = Centrograduacion.class)
public interface CentroGraduacionInline {
    int getId();
	String getNombre();
    String getCentroGraduacion();
    Date getFechaRegistro();
    boolean isHabilitado();
    Direccion getDireccion();
     Contacto getContacto();
    BancoAlimentos getBancoAlimentos();
    
}