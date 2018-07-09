/**
 * Producto.java
 */
package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@Entity
@Table(name="beneficiario")
public class Beneficiario {

	@Id
	@GeneratedValue
	@Column(name = "idbeneficiario")
	private Long id;
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idcontacto", name="idcontacto")
    private Contacto contacto;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddireccion", name="iddireccion")
    private Direccion direccion;

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
	 * @return the contacto
	 */
	public Contacto getContact() {
		return this.contacto;
	}

	/**
	 * @param contact the contacto to set
	 */
	public void setNombre(Contacto contacto) {
		this.contacto = contacto;
	}

	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return this.direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setPerecedero(Direccion direccion) {
		this.direccion = direccion;
	}
}
