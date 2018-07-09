/**
 * EstudioNutricioRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.EstudioNutricio;;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "estudionutricio", collectionResourceRel = "estudionutricio")
public interface EstudioNutricioRepository extends PagingAndSortingRepository<EstudioNutricio, Long> {

}
