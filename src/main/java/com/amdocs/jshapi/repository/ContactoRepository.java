package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Contacto;

 

@RepositoryRestResource(path="contactos",collectionResourceRel="contactos" )
public interface ContactoRepository extends PagingAndSortingRepository<Contacto, Long>
{
	public Contacto findContactoByNombre(@Param ("nombre") String nombre);
}
