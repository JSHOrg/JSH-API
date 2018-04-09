package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.amdocs.jshapi.domain.Producto;

public interface ProductoRepository extends PagingAndSortingRepository<Producto, Long> {

	public Producto findByNombre(@Param("nombre") String nombre);
}
