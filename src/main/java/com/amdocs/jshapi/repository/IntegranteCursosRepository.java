package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.amdocs.jshapi.domain.CursoIntegrante;

@RepositoryRestResource(path = "integrantescursos", collectionResourceRel = "integrantescursos")

public interface IntegranteCursosRepository extends JpaRepository<CursoIntegrante, Long> {

}
