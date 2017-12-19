package com.amdocs.jshapi.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Cuauhtemoc Herrera
 */
@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nickname;
	
	private Boolean enabled;
	
	private String email;
	
	@JsonIgnore
	private String password;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinTable(name="ACCOUNT_GRANTED_AUTHORITIES",joinColumns={
		@JoinColumn(name="account", referencedColumnName="id") 
	},inverseJoinColumns={
		@JoinColumn(name="authority", referencedColumnName="id")
	})
	private List<AccountGrantedAuthority> authorities;

	public List<AccountGrantedAuthority> getGrantedAuthorities(){
		return authorities;
	}
	
	public void setAuthorities(List<AccountGrantedAuthority> authorities){
		this.authorities = authorities;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
