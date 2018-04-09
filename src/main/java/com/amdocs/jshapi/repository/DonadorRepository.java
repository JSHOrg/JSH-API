package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.amdocs.jshapi.domain.Donador;

public interface DonadorRepository extends PagingAndSortingRepository<Donador, Long> {

	public Donador findByRazonSocial(@Param("razonSocial") String razonSocial);
}
