package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Proveedor;
import com.amdocs.jshapi.projections.ProveedorInline;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "proveedores", collectionResourceRel = "proveedores", excerptProjection = ProveedorInline.class)
public interface ProveedorRepository extends PagingAndSortingRepository<Proveedor, Long> {

}
