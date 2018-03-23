/**
 * Contacto.java
 */
package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author GGABRIEL
 *
 */
@Entity
public class Contacto {

	@Id
	@GeneratedValue
	@Column(name = "IDContacto")
	private Long id;

	@Column(length = 200, nullable = false)
	private String valor;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "IDTipoContacto")
	private TipoContacto tipoContacto;

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
	public Long getIdentifier(){
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
}
