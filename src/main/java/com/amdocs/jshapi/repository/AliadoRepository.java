package com.amdocs.jshapi.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Aliado;
import com.amdocs.jshapi.domain.BancoAlimentos;
import com.amdocs.jshapi.domain.Region;
import com.amdocs.jshapi.projections.AliadoInline;

@RepositoryRestResource(path = "aliados", collectionResourceRel = "aliados", excerptProjection = AliadoInline.class)

public interface AliadoRepository extends PagingAndSortingRepository<Aliado, Integer> {

	
	@Query(value = "select a.* from aliado a where a.idbancoalimentos =:idbancoalimentos", nativeQuery = true)
	  //List<User> findByFirstnameEndsWith(String firstname);
	public Collection<Aliado> findAliadoByBancoAlimentos(@Param("idbancoalimentos") Integer bancoalimentos);

}
