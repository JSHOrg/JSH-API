package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Donativo;

@RepositoryRestResource(path = "donativos", collectionResourceRel = "donativos")
public interface DonativoRepository extends PagingAndSortingRepository<Donativo, Long> {

}
