/**
 * 
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amdocs.jshapi.domain.Grupo;
import com.amdocs.jshapi.domain.TrabajadorSocial;

/**
 * @author robergut
 *
 */
//@CrossOrigin(origins = "http://localhost:8092")
@RepositoryRestResource(path = "grupos", collectionResourceRel = "grupos")
public interface GrupoRepository extends PagingAndSortingRepository<Grupo, Long> {

	 
}
