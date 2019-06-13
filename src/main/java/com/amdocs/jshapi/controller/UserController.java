package com.amdocs.jshapi.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amdocs.jshapi.service.AccountDetailsService;

/**
 * 
 * @author Roberto Gutierrez Garcia
 */
@Controller
public class UserController {

	@Autowired
	private AccountDetailsService accountDetailService;

	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
	@ResponseBody
	public UserDetails currentUserDetails(Authentication authentication) {
		return accountDetailService.loadUserByUsername(authentication.getName());
	}
	
	@RequestMapping(value = "/nombreusuario", method = RequestMethod.GET)
	@ResponseBody
	public String currentUserName(Authentication authentication) {
		return authentication.getName();
	}
	
	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	@ResponseBody
	public Collection<? extends GrantedAuthority> currentGrantedAuthorities(Authentication authentication) {
		return authentication.getAuthorities();
	}
}
