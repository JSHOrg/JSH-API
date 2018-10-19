package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Account;

@RepositoryRestResource(path = "usuarios", collectionResourceRel = "usuarios")
public interface AccountRepository extends PagingAndSortingRepository<Account, Long>{
	
	public Account findByNombre(@Param("nombre") String nombre);
}
