/**
 * Embalaje.java
 */
package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@Entity
public class Embalaje {

    @Id
	@GeneratedValue
	@Column(name = "IDCentroComunitario")
	private Long id;
    
    @Column(length=30)
	private String tipoEmbalaje;

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
	 * @return the tipoEmbalaje
	 */
	public String getTipoEmbalaje() {
		return tipoEmbalaje;
	}

	/**
	 * @param tipoEmbalaje the tipoEmbalaje to set
	 */
	public void setTipoEmbalaje(String tipoEmbalaje) {
		this.tipoEmbalaje = tipoEmbalaje;
	}
}
