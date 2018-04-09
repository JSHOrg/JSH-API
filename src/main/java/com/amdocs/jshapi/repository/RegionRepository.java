package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Region;

@RepositoryRestResource(path = "regiones", collectionResourceRel = "regiones")
public interface RegionRepository extends PagingAndSortingRepository<Region, Long> {

	public Region findRegionByNombre(@Param("nombre") String nombre);
}
