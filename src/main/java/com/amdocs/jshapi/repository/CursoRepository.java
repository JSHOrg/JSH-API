package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amdocs.jshapi.domain.Curso;
import com.amdocs.jshapi.domain.TrabajadorSocial;
import com.amdocs.jshapi.projections.CursoInline;

@RepositoryRestResource(path = "cursos", collectionResourceRel = "cursos" , excerptProjection = CursoInline.class)
public interface CursoRepository extends JpaRepository<Curso, Long>{
	
}
