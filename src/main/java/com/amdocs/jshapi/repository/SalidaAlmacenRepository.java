/**
 * SalidasAlmacen.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.SalidaAlmacen;
import com.amdocs.jshapi.projections.SalidaAlmacenInline;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "salidasalmacen", collectionResourceRel = "salidasalmacen", excerptProjection = SalidaAlmacenInline.class)
public interface SalidaAlmacenRepository extends PagingAndSortingRepository<SalidaAlmacen, Long> {

}
