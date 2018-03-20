/**
 * EntradaAlmacen.java
 */
package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.amdocs.jshapi.domain.EntradaAlmacen;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
public interface EntradaAlmacenRepository extends PagingAndSortingRepository<EntradaAlmacen, Long> {

}
