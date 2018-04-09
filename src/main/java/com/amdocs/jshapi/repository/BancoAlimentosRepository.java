/**
 * BancoAlimentosRepository.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.BancoAlimentos;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@RepositoryRestResource(path = "bancoalimentos", collectionResourceRel = "bancoalimentos")
public interface BancoAlimentosRepository extends PagingAndSortingRepository<BancoAlimentos, Long> {

	public BancoAlimentos findByNombre(@Param("nombre") String nombre);
}
