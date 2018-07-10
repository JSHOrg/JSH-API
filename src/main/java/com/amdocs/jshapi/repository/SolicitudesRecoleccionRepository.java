package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.SolicitudesRecoleccion;
import com.amdocs.jshapi.projections.SolicitudesRecoleccionInline;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "solicitudesrecoleccion", collectionResourceRel = "solicitudesrecoleccion", excerptProjection = SolicitudesRecoleccionInline.class)
public interface SolicitudesRecoleccionRepository extends PagingAndSortingRepository<SolicitudesRecoleccion, Long> {

}
