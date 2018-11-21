package com.amdocs.jshapi.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Aliado;
import com.amdocs.jshapi.domain.Familia;
import com.amdocs.jshapi.domain.Grupo;
import com.amdocs.jshapi.projections.FamiliaInline;

@RepositoryRestResource(path = "familias", collectionResourceRel = "familias", excerptProjection = FamiliaInline.class)

public interface FamiliaRepository extends JpaRepository<Familia, Integer> {
	
	@Query(value = "select f.* from familia f where f.idgrupo =:idgrupo", nativeQuery = true)
	public Collection<Familia> findFamiliaByGroup(@Param("idgrupo") Integer idgrupo);	
	
	//@Query(value = "select f.* from familia f where f.idgrupo =:idgrupo", nativeQuery = true)
	//public Collection<Familia> findFamiliaByGroup( Integer idgrupo, Integer idbancoalimentos);	
}
