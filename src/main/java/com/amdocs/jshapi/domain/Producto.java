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
 * @author Roberto Gutierrez Garcia
 *
 */
@Entity
@Table(name="productos")
public class Producto {

	@Id
	@GeneratedValue
	@Column(name = "idproducto")
	private Long id;
    
    @Column(length=50, nullable=false)
	private String nombre;
    
    @Column(length=1)
    private String perecedero;
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idclasificacionproducto", name="idclasificacionproducto")
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

	/**
	 * @return the perecedero
	 */
	public String getPerecedero() {
		return perecedero;
	}

	/**
	 * @param perecedero the perecedero to set
	 */
	public void setPerecedero(String perecedero) {
		this.perecedero = perecedero;
	}

	/**
	 * @return the clasificacion
	 */
	public ClasificacionProducto getClasificacion() {
		return clasificacion;
	}

	/**
	 * @param clasificacion the clasificacion to set
	 */
	public void setClasificacion(ClasificacionProducto clasificacion) {
		this.clasificacion = clasificacion;
	}
}
