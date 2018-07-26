/**
 * 
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Grupo;

/**
 * @author robergut
 *
 */
@RepositoryRestResource(path = "grupos", collectionResourceRel = "grupos")
public interface GrupoRepository extends PagingAndSortingRepository<Grupo, Long> {

}
