package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Benefactor;
import com.amdocs.jshapi.domain.Region;
import com.amdocs.jshapi.projections.BenefactorInline;

@RepositoryRestResource(path = "benefactores", collectionResourceRel = "benefactores", excerptProjection = BenefactorInline.class)
public interface BenefactorRepository extends JpaRepository<Benefactor, Long>{
	
	public Benefactor findBenefactorByNombre(@Param("nombre") String nombre);
	
}
