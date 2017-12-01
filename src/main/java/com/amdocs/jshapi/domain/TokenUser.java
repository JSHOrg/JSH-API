package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TOKENUSER")
public class TokenUser {
		
	@Id
	@Column(name = "ID_USER")
	private String Id_user;
	private String Name;
	private String Password;
	private boolean Enabled;
	
	public String getId_user() {
		return Id_user;
	}
	public void setId_user(String id_user) {
		Id_user = id_user;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public boolean isEnabled() {
		return Enabled;
	}
	public void setEnabled(boolean enabled) {
		Enabled = enabled;
	}	
	
	public TokenUser() {
		
	}
	public TokenUser(String id_user, String name, String password,
			boolean enabled) {
		this.Id_user = id_user;
		this.Name = name;
		this.Password = password;
		this.Enabled = enabled;
	}
}