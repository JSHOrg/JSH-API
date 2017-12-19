package com.amdocs.jshapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

/**
 * 
 * @author Cuauhtemoc Herrera
 */
@Entity
public class AccountGrantedAuthority implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;
	
	public AccountGrantedAuthority(){
		super();
	}
	
	@Id
	private Long id;
	
	private String authority;
	
	public AccountGrantedAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		return authority;
	}

}
