package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.AreaOfertaEducativa;
import com.amdocs.jshapi.projections.AreaOfertaEducativaInline;;

@RepositoryRestResource(path = "areasofertaeducativa", collectionResourceRel = "areasofertaeducativa", excerptProjection = AreaOfertaEducativaInline.class)

public interface AreaOfertaEducativaRepository extends PagingAndSortingRepository<AreaOfertaEducativa, Integer> {
	
}
