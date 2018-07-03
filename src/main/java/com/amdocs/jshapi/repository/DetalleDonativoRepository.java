/**
 * SalidasAlmacen.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.DetalleDonativo;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "detalledonativo", collectionResourceRel = "detalledonativo", excerptProjection = DetalleDonativo.class)
public interface DetalleDonativoRepository extends PagingAndSortingRepository<DetalleDonativo, Long> {

}
