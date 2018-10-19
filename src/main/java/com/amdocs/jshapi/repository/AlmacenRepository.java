package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Almacen;
import com.amdocs.jshapi.projections.AlmacenInline;

@RepositoryRestResource(path = "almacenes", collectionResourceRel = "almacenes", excerptProjection = AlmacenInline.class)
public interface AlmacenRepository extends PagingAndSortingRepository<Almacen, Long> {

}
