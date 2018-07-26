/**
 * TrabajadorSocialRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.TrabajadorSocial;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@RepositoryRestResource(path = "trabajadorsocial", collectionResourceRel = "trabajadorsocial")
public interface TrabajadorSocialRepository extends PagingAndSortingRepository<TrabajadorSocial, Long> {

}
