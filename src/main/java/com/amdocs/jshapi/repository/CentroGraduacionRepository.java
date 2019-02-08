/**
 * CentroComunitarioRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.amdocs.jshapi.domain.CentroGraduacion;
import com.amdocs.jshapi.projections.CentroGraduacionInline;

/**
 * @author Eduardo Serrano *
 */

@RepositoryRestResource(path = "centrograduacion", collectionResourceRel = "centrograduacion", excerptProjection = CentroGraduacionInline.class)
public interface CentroGraduacionRepository extends JpaRepository<CentroGraduacion, Long> {

	public CentroGraduacion findCentroGraduacionByNombre(@Param("nombre") String nombre);
	
 
	
}
