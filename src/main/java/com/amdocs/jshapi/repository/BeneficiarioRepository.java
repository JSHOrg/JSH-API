package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Beneficiario;


@RepositoryRestResource(path = "beneficiarios", collectionResourceRel = "beneficiarios")
public interface  BeneficiarioRepository extends PagingAndSortingRepository<Beneficiario, Long>{

}
