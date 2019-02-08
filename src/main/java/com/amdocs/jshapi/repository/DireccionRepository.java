package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Direccion; 

@RepositoryRestResource(path = "direcciones", collectionResourceRel = "direcciones")

public interface DireccionRepository extends JpaRepository<Direccion, Long>{

}
