/**
 * Embalaje.java
 */
package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@Entity
@Table(name="embalaje")
public class Embalaje {

    @Id
	@GeneratedValue
	@Column(name = "idembalaje")
	private Long id;
    
    @Column(length=30, name="tipoembalaje")
	private String tipoEmbalaje;

	public Embalaje() {
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
