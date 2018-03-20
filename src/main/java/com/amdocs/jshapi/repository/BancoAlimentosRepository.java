/**
 * BancoAlimentosRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.amdocs.jshapi.domain.BancoAlimentos;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
public interface BancoAlimentosRepository extends PagingAndSortingRepository<BancoAlimentos, Long> {

	public BancoAlimentos findByNombre(@Param("nombre") String nombre);
}
