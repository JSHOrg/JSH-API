package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Producto;
import com.amdocs.jshapi.projections.ProductoInline;

@RepositoryRestResource(path = "productos", collectionResourceRel = "productos", excerptProjection = ProductoInline.class)
public interface ProductoRepository extends PagingAndSortingRepository<Producto, Long> {

	public Producto findByNombre(@Param("nombre") String nombre);
}