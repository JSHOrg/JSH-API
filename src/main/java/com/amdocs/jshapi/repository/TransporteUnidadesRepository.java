package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.amdocs.jshapi.domain.TransporteUnidades;

@RepositoryRestResource(path = "transportesunidades", collectionResourceRel = "transportesunidades")
public interface TransporteUnidadesRepository extends PagingAndSortingRepository<TransporteUnidades, Long> {

}
