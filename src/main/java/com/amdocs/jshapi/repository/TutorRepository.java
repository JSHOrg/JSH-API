package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Proveedor;
import com.amdocs.jshapi.domain.TrabajadorSocial;

@RepositoryRestResource(path = "tutores", collectionResourceRel = "tutores")
public interface TutorRepository 
extends PagingAndSortingRepository<Proveedor, Long>{
	
}
