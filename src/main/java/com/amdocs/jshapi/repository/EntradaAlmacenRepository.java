/**
 * EntradaAlmacen.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.EntradaAlmacen;
import com.amdocs.jshapi.projections.EntradaAlmacenInline;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@RepositoryRestResource(path = "entradasalmacen", collectionResourceRel = "entradasalmacen", excerptProjection = EntradaAlmacenInline.class)
public interface EntradaAlmacenRepository extends PagingAndSortingRepository<EntradaAlmacen, Long> {

}
