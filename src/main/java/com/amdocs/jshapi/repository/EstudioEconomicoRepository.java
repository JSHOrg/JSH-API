/**
 * EstudioEconomicoRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.EstudioEconomico;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "estudioseconomicos", collectionResourceRel = "estudioseconomicos")
public interface EstudioEconomicoRepository extends PagingAndSortingRepository<EstudioEconomico, Long> {

}
