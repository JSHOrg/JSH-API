package com.amdocs.jshapi.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
 
import com.amdocs.jshapi.domain.TipoServicio;

@RepositoryRestResource(path = "tiposservicios", collectionResourceRel = "tiposservicios")
public interface TipoServicioRepository extends PagingAndSortingRepository<TipoServicio, Integer>{

}
