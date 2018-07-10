package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.SolicitudesRecoleccion;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "solicitudesrecoleccion", collectionResourceRel = "solicitudesrecoleccion")
public interface SolicitudesRecoleccionRepository extends PagingAndSortingRepository<SolicitudesRecoleccion, Long> {

}
