package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.TutorCurso;

@RepositoryRestResource(path = "TutorCurso", collectionResourceRel = "TutorCurso")

public interface TutorCursoRepository extends JpaRepository<TutorCurso, Long>{

}
