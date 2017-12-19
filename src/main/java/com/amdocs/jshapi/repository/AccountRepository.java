package com.amdocs.jshapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.amdocs.jshapi.domain.Account;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long>{
	
	public Account findByNickname(@Param("nickname") String nickname);
}
