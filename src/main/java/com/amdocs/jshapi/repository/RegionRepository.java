package com.amdocs.jshapi.repository;
import com.amdocs.jshapi.projections.RegionInline;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Region; 

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "regiones", collectionResourceRel = "regiones", excerptProjection=RegionInline.class)
public interface RegionRepository extends PagingAndSortingRepository<Region, Long> {

	public Region findRegionByNombre(@Param("nombre") String nombre);
}
