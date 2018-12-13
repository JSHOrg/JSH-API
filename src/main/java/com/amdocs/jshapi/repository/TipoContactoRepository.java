package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.TipoContacto; 
import com.amdocs.jshapi.projections.TipoContactoInline;

@RepositoryRestResource(path = "tiposcontacto", collectionResourceRel = "tiposcontacto", excerptProjection = TipoContactoInline.class)
public interface TipoContactoRepository extends JpaRepository<TipoContacto, Long> {

}
