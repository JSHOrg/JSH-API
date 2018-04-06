package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.amdocs.jshapi.domain.Region;

public interface RegionRepository extends PagingAndSortingRepository<Region, Long> {

	public Region findRegionByNombre(@Param("nombre") String nombre);
}
