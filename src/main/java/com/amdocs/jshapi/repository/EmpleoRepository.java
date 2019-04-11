/**
 * EmpleoRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Empleo;
import com.amdocs.jshapi.projections.EmpleoInline;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@RepositoryRestResource(path = "empleos", collectionResourceRel = "empleos", excerptProjection =  EmpleoInline.class)
public interface EmpleoRepository extends JpaRepository<Empleo, Long> {

}
