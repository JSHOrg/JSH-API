/**
 * CentroComunitarioRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.CentroComunitario;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@RepositoryRestResource(path = "comunitarios", collectionResourceRel = "comunitarios")
public interface CentroComunitarioRepository extends PagingAndSortingRepository<CentroComunitario, Long> {

	public CentroComunitario findCentroComunitarioByNombre(@Param("nombre") String nombre);
}
