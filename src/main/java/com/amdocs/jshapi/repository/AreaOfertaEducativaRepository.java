package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.AreaOfertaEducativa;

@RepositoryRestResource(path = "areasofertaeducativa", collectionResourceRel = "areasofertaeducativa")

public interface AreaOfertaEducativaRepository extends PagingAndSortingRepository<AreaOfertaEducativa, Integer> {
	
}
