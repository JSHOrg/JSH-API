/**
 * SalidasAlmacen.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.ClasificacionProducto;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "clasificacionproducto", collectionResourceRel = "clasificacionproducto")
public interface ClasificacionProductoRepository extends PagingAndSortingRepository<ClasificacionProducto, Long> {

}
