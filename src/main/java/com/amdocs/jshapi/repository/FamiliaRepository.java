package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Familia;
import com.amdocs.jshapi.domain.Grupo;

@RepositoryRestResource(path = "familias", collectionResourceRel = "familias")

public interface FamiliaRepository extends PagingAndSortingRepository<Familia, Integer> {

}
