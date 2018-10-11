package com.amdocs.jshapi.projections;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;
import com.amdocs.jshapi.domain.Beneficiario;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;

@Projection(name = "beneficiarioInline", types = Beneficiario.class)
public class BeneficiarioInline {

}
