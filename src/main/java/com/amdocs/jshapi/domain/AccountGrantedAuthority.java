package com.amdocs.jshapi.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * 
 * @author Cuauhtemoc Herrera
 */
public class AccountGrantedAuthority implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;
	
	private String authority;
	
	public AccountGrantedAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		return authority;
	}

}
