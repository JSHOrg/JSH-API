package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Donativo;
import com.amdocs.jshapi.projections.DonativoInline;

@RepositoryRestResource(path = "donativos", collectionResourceRel = "donativos", excerptProjection = DonativoInline.class)
public interface DonativoRepository extends PagingAndSortingRepository<Donativo, Long> {

}
