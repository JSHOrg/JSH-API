package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.amdocs.jshapi.domain.Contacto;

public interface ContactoRepository extends PagingAndSortingRepository<Contacto, Integer> {

	public Contacto findContactoByNombre(@Param("nombre") String nombre);
}
