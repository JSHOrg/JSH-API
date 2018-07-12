/**
 * SalidasAlmacen.java
 */
package com.amdocs.jshapi.repository;

import java.util.Date;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.DetalleDonativo;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@RepositoryRestResource(path = "detalledonativo", collectionResourceRel = "detalledonativo", excerptProjection = DetalleDonativo.class)
public interface DetalleDonativoRepository extends PagingAndSortingRepository<DetalleDonativo, Long> {

	public DetalleDonativo findByStatusAndFechaConsumoLimite(@Param("status") String status, @Param("fechaConsumoLimite") Date fechaConsumoLimite);
}
