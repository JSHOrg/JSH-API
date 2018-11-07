package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.TipoAliado;
import com.amdocs.jshapi.projections.TipoAliadoInline;

@RepositoryRestResource(path = "tiposaliados", collectionResourceRel = "tiposaliados", excerptProjection = TipoAliadoInline.class)
public interface TipoAliadosRepository extends PagingAndSortingRepository<TipoAliado, Integer> {

}
