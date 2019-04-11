package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Areaofertaeducativa;

@RepositoryRestResource(path = "areasofertaeducativa", collectionResourceRel = "areasofertaeducativa")

public interface AreaofertaeducativaRepository extends JpaRepository<Areaofertaeducativa, Integer> {
	
}
