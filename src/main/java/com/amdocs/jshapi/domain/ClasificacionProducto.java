/**
 * ClasificacionProducto.java
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
public class ClasificacionProducto {

    @Id
	@GeneratedValue
	@Column(name = "IDCentroComunitario")
	private Long id;
    
    @Column(length=30)
    private String nombre;
    
    @Column
    private int valorNutrimental;

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
	 * @return the valorNutrimental
	 */
	public int getValorNutrimental() {
		return valorNutrimental;
	}

	/**
	 * @param valorNutrimental the valorNutrimental to set
	 */
	public void setValorNutrimental(int valorNutrimental) {
		this.valorNutrimental = valorNutrimental;
	}
}
