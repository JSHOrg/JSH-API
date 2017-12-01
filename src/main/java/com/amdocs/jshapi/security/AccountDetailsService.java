package com.amdocs.jshapi.security;

import java.util.ArrayList;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailsService implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
      
      ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
      grantedAuthorities.add(new AccountGrantedAuthority("USER"));
      return new User( 
    		"testuser", 
    		"abc", //TODO encryption 
    		true,true,true,true,
    		grantedAuthorities
    	);
    }
}
