package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.OfertaEducativa;
import com.amdocs.jshapi.projections.OfertaEducativaInline;;

@RepositoryRestResource(path = "ofertaseducativas", collectionResourceRel = "ofertaseducativas", excerptProjection = OfertaEducativaInline.class)
public interface OfertaEducativaRepository extends JpaRepository<OfertaEducativa, Integer>{

}
