package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Proveedor;
import com.amdocs.jshapi.domain.TrabajadorSocial;
import com.amdocs.jshapi.domain.Tutor;
import com.amdocs.jshapi.projections.TutorInline;

@RepositoryRestResource(path = "tutores", collectionResourceRel = "tutores", excerptProjection= TutorInline.class)
public interface TutorRepository 
extends JpaRepository<Tutor, Long>{
	
}
