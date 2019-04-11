package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.CursoOferta;
import com.amdocs.jshapi.projections.CursoofertaInline;

@RepositoryRestResource(path="CursoOferta",collectionResourceRel="CursoOferta",  excerptProjection = CursoofertaInline.class)
public interface CursoOfertaRepository extends JpaRepository<CursoOferta, Long>{

}
