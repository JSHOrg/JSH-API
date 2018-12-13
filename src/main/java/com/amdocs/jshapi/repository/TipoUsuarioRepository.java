package com.amdocs.jshapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
 
import com.amdocs.jshapi.domain.TipoUsuario;;

@RepositoryRestResource(path = "tiposusuarios", collectionResourceRel = "tiposusuarios")
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Long>{

	
}
