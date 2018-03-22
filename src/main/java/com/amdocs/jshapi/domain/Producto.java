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
import javax.persistence.ManyToOne;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@Entity
public class Producto {

	@Id
	@GeneratedValue
	@Column(name = "IDProducto")
	private Long id;
    
    @Column(length=50, nullable=false)
	private String nombre;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IdClasificacionProducto")
    private ClasificacionProducto clasificacion;

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
}
