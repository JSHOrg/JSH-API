package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.amdocs.jshapi.domain.TransporteCaja;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "transportescajas", collectionResourceRel = "transportescajas")
public interface TransporteCajaRepository extends PagingAndSortingRepository<TransporteCaja, Long> {

}
