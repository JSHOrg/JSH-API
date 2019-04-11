package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.AccountGrantedAuthority;

@RepositoryRestResource(path = "roles", collectionResourceRel = "roles")
public interface AccountGrantedAuthorityRepository extends JpaRepository<AccountGrantedAuthority, Long> {

}
