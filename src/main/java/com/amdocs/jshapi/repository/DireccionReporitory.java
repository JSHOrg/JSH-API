/**
 * 
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Direccion;

@RepositoryRestResource(path = "direcciones", collectionResourceRel = "direcciones")
public interface DireccionReporitory extends PagingAndSortingRepository<Direccion, Long> {

}
