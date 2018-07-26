/**
 * ServicioRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Servicio;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@RepositoryRestResource(path = "servicios", collectionResourceRel = "servicios")
public interface ServicioRepository extends PagingAndSortingRepository<Servicio, Long> {

}
