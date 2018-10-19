package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Donador;
import com.amdocs.jshapi.projections.DonadorInline;

@RepositoryRestResource(path = "donadores", collectionResourceRel = "donadores", excerptProjection = DonadorInline.class)
public interface DonadorRepository extends PagingAndSortingRepository<Donador, Long> {

	public Donador findByRazonSocial(@Param("razonSocial") String razonSocial);
}
