package com.amdocs.jshapi.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.amdocs.jshapi.domain.Aliado;
import com.amdocs.jshapi.projections.AliadoInline;

@RepositoryRestResource(path = "aliados", collectionResourceRel = "aliados", excerptProjection = AliadoInline.class)

public interface AliadoRepository extends JpaRepository<Aliado, Long> {

	@Query(value = "\r\n" + 
			"select a.* from  BancoAlimentos b\r\n" + 
			"inner join aliado a\r\n" + 
			"on b.idbancoalimentos = a.idbancoalimentos\r\n" + 
			"inner join bancoalimentosusuario ub \r\n" + 
			"on ub.idbancoalimentos = b.idbancoalimentos\r\n" + 
			"inner join usuario u\r\n" + 
			"on ub.idusuario = u.idusuario\r\n" + 
			"where u.Nombre =?#{ principal?.username }", nativeQuery = true)
	public Page<Aliado> findAliados(Pageable pageable);

}
