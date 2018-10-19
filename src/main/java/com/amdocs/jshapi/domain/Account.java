package com.amdocs.jshapi.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Cuauhtemoc Herrera
 */
@Entity
@Table(name = "Usuario")
public class Account {
	
	@Id
	@GeneratedValue
	@Column(name = "idusuario")
	private Long id;
	
	private String nombre;
	
	private Boolean grupo;
	
	private Boolean habilitado;
	
    @Column(name="ultimologin")
    private Date ultimoLogin;
	
    @Column(name="fecharegistro")
    private Date fechaRegistro;
    
	@JsonIgnore
	private String password;
	
    @OneToOne(optional=false, fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="id", name="idtipousuario")
    private TipoUsuario tipo;

	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinTable(name="ACCOUNT_GRANTED_AUTHORITIES",joinColumns={
		@JoinColumn(name="account", referencedColumnName="idusuario") 
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
     	* @return the Identifier
     	*/	
	public Long getIdentifier(){
		return this.id;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the habilitado
	 */
	public Boolean getHabilitado() {
		return habilitado;
	}

	/**
	 * @param habilitado the habilitado to set
	 */
	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
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

	/**
	 * @return the grupo
	 */
	public Boolean getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(Boolean grupo) {
		this.grupo = grupo;
	}

	/**
	 * @return the ultimoLogin
	 */
	public Date getUltimoLogin() {
		return ultimoLogin;
	}

	/**
	 * @param ultimoLogin the ultimoLogin to set
	 */
	public void setUltimoLogin(Date ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the tipo
	 */
	public TipoUsuario getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
}
