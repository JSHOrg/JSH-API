/**
 * EntradaAlmacen.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.EntradaAlmacen;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@RepositoryRestResource(path = "entradasalmacen", collectionResourceRel = "entradasalmacen")
public interface EntradaAlmacenRepository extends PagingAndSortingRepository<EntradaAlmacen, Long> {

}
