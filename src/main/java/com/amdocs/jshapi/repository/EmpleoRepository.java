/**
 * EmpleoRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Empleo;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@RepositoryRestResource(path = "empleos", collectionResourceRel = "empleos")
public interface EmpleoRepository extends PagingAndSortingRepository<Empleo, Long> {

}
