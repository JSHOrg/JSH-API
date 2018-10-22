package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Aliado;
import com.amdocs.jshapi.projections.AliadoInline;

@RepositoryRestResource(path = "aliados", collectionResourceRel = "aliados", excerptProjection = AliadoInline.class)

public interface AliadoRepository extends PagingAndSortingRepository<Aliado, Integer> {

}
