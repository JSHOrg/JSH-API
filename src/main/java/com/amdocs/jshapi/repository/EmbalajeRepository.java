package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Embalaje;

@RepositoryRestResource(path = "embalajes", collectionResourceRel = "embalajes")
public interface EmbalajeRepository extends PagingAndSortingRepository<Embalaje, Long> {

}
