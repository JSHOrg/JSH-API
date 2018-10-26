package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amdocs.jshapi.domain.Curso;
import com.amdocs.jshapi.domain.TrabajadorSocial;

//@CrossOrigin(origins = "http://localhost:8092")
@RepositoryRestResource(path = "cursos", collectionResourceRel = "cursos")
public interface CursoRepository extends PagingAndSortingRepository<Curso, Long>{
	
}
