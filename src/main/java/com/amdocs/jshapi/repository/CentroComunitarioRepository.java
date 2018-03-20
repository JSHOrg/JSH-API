/**
 * CentroComunitarioRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.amdocs.jshapi.domain.CentroComunitario;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
public interface CentroComunitarioRepository extends PagingAndSortingRepository<CentroComunitario, Long> {

	public CentroComunitario findCentroComunitarioByName(@Param("name") String name);
}
