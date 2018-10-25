package com.amdocs.jshapi.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PostFilter;

import com.amdocs.jshapi.domain.Aliado;
import com.amdocs.jshapi.domain.BancoAlimentos;
import com.amdocs.jshapi.domain.Region;
import com.amdocs.jshapi.projections.AliadoInline;

@RepositoryRestResource(path = "aliados", collectionResourceRel = "aliados", excerptProjection = AliadoInline.class)

public interface AliadoRepository extends PagingAndSortingRepository<Aliado, Long> {

	@Query(value = "\r\n" + 
			"select a.* from  BancoAlimentos b\r\n" + 
			"inner join aliado a\r\n" + 
			"on b.idbancoalimentos = a.idbancoalimentos\r\n" + 
			"inner join usuariobanco ub \r\n" + 
			"on ub.idbancoalimentos = b.idbancoalimentos\r\n" + 
			"inner join usuario u\r\n" + 
			"on ub.idusuario = u.idusuario\r\n" + 
			"where u.Nombre =?#{ principal?.username }", nativeQuery = true)
	public Collection<Aliado> findAliados();

}
