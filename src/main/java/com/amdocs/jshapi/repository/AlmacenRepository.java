package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.CentroComunitario;

@RepositoryRestResource(path = "almacenes", collectionResourceRel = "almacenes")
public interface AlmacenRepository extends PagingAndSortingRepository<CentroComunitario, Long> {

}
