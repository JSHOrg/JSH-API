package com.amdocs.jshapi.repository;

import java.util.List;

 
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Aliado;
import com.amdocs.jshapi.domain.Integrante;

@RepositoryRestResource(path = "integrantes", collectionResourceRel = "integrantes")
public interface IntegranteRepository extends PagingAndSortingRepository<Integrante, Long>  {

	@Query(value = "\r\n" + 
			"select a.* from  BancoAlimentos b\r\n" + 
			"inner join integrante a\r\n" + 
			"on b.idbancoalimentos = a.idbancoalimentos\r\n" + 
			"inner join bancoalimentosusuario ub \r\n" + 
			"on ub.idbancoalimentos = b.idbancoalimentos\r\n" + 
			"inner join usuario u\r\n" + 
			"on ub.idusuario = u.idusuario\r\n" + 
			"where u.Nombre =?#{ principal?.username }", nativeQuery = true)
	public Page<Integrante> findIntegrantes(Pageable pageable);
	
	
	@Query(value = "\r\n" + 
			"\r\n" + 
			"select i.* from integrante i \r\n" + 
			"inner join grupo g\r\n" + 
			"on i.idgrupo = g.idgrupo\r\n" + 
			"where g.idgrupo = :idGrupo", nativeQuery = true)
	public Page<Integrante> findIntegrantesByGrupo(@Param("idGrupo")  int idGrupo, Pageable pageable);

}
