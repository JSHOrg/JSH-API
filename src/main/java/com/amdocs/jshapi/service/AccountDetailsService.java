package com.amdocs.jshapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.amdocs.jshapi.domain.Account;
import com.amdocs.jshapi.repository.AccountRepository;

/**
 * 
 * @author Cuauhtemoc Herrera
 */
@Service
public class AccountDetailsService implements UserDetailsService{
	
	@Autowired
	private AccountRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = repository.findByNombre(username);
		if(account != null) {
			return new User( 
					account.getNombre(),
					account.getPassword(),
					account.getHabilitado(),
					account.getHabilitado(),
					account.getHabilitado(),
					account.getHabilitado(),
					account.getGrantedAuthorities()
				);
		} else {
			throw new UsernameNotFoundException("User not found: '" + username + "'");
		}
	}
}
