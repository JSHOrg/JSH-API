package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Integrante;

@RepositoryRestResource(path = "integrantes", collectionResourceRel = "integrantes")
public interface IntegranteRepository extends PagingAndSortingRepository<Integrante, Long>  {

}
