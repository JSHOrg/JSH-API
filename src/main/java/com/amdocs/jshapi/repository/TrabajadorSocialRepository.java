/**
 * TrabajadorSocialRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amdocs.jshapi.domain.TrabajadorSocial;

/**
 * @author Roberto Gutierrez Garcia
 * @param <T>
 *
 */
@CrossOrigin(origins = "http://localhost:8092")
@RepositoryRestResource(path = "trabajadorsocial", collectionResourceRel = "trabajadorsocial")
public interface TrabajadorSocialRepository<T> 
	extends PagingAndSortingRepository<TrabajadorSocial, Long>, QueryByExampleExecutor<T>  {

}
