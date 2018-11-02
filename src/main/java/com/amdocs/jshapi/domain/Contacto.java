/**
 * Contacto.java
 */
package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author GGABRIEL
 *
 */
@Entity
@Table(name="contacto")
public class Contacto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idcontacto")
	private Long id;

	@Column(length = 200)
	private String valor;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idtipocontacto", name = "idtipocontacto")
	private TipoContacto tipoContacto;

	@Column(length = 50)
	private String nombre;

	@Column(length = 50)
	private String apellido;

	@Column(length = 15)
	private String telefono;

	@Column(name = "extension")
	private int extension;

	@Column(length = 10)
	private String celular;

	@Column(length = 70)
	private String email;

	@Column(length = 40)
	private String password;

	@Column(columnDefinition = "SMALLINT")
	private int grupo;

	@Column(name = "ultimologin")
	private Date ultimoLogin;

	@Column(name = "fecharegistro")
	private Date fechaRegistro;

	@Column(name = "habilitado")
	private boolean habilitado;

	@Column(name = "datosextra")
	private String datosExtra;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the Identifier
	 */
	public Long getIdentifier() {
		return this.id;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * @return the tipoContacto
	 */
	public TipoContacto getTipoContacto() {
		return tipoContacto;
	}

	/**
	 * @param tipoContacto
	 *            the tipoContacto to set
	 */
	public void setTipoContacto(TipoContacto tipoContacto) {
		this.tipoContacto = tipoContacto;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 *            the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 *            the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the extension
	 */
	public int getExtension() {
		return extension;
	}

	/**
	 * @param extension
	 *            the extension to set
	 */
	public void setExtension(int extension) {
		this.extension = extension;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular
	 *            the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
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
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the grupo
	 */
	public int getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo
	 *            the grupo to set
	 */
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	/**
	 * @return the ultimoLogin
	 */
	public Date getUltimoLogin() {
		return ultimoLogin;
	}

	/**
	 * @param ultimoLogin
	 *            the ultimoLogin to set
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
	 * @param fechaRegistro
	 *            the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the habilitado
	 */
	public boolean isHabilitado() {
		return habilitado;
	}

	/**
	 * @param habilitado
	 *            the habilitado to set
	 */
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	/**
	 * @return the datosExtra
	 */
	public String getDatosExtra() {
		return datosExtra;
	}

	/**
	 * @param datosExtra
	 *            the datosExtra to set
	 */
	public void setDatosExtra(String datosExtra) {
		this.datosExtra = datosExtra;
	}
}
