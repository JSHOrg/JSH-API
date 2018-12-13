/**
 * TipoContacto.java
 */
package com.amdocs.jshapi.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author GGABRIEL
 *
 */
@Entity
@Table(name="tipocontacto")
public class TipoContacto {

	@Id
	@GeneratedValue
	@Column(name = "idtipocontacto")
	private Long id;

	@Column(length = 50, nullable = false)
	private String nombre;

	 @OneToMany (mappedBy="tipoContacto")
	 private Set<Contacto> Contactos;
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
}
