package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Roberto Gutierrez Garcia
 */
@Entity
@Table(name="direccion")
public class Direccion {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "iddireccion")
	private Long id;
	
	@Column(length=200, nullable=false)
    private String calle;

    @Column(length=10, nullable=false)
    private String numero;

    @Column(length=5, nullable=false)
    private String CP;

    @Column(length=50, nullable=false)
    private String ciudad;

    @Column(length=50, nullable=false)
    private String estado;

    @Column(length=12)
    private String latitud;

    @Column(length=12)
    private String longitud;
    
    @Column(length=50)
    private String colonia;
    
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
     * @return the calle
     */
	public String getCalle() {
		return calle;
	}

    /**
     * @param calle the calle to set
     */
	public void setCalle(String calle) {
		this.calle = calle;
	}

    /**
     * @return the numero
     */
	public String getNumero() {
		return numero;
	}

    /**
     * @param numero the numero to set
     */
	public void setNumero(String numero) {
		this.numero = numero;
	}

    /**
     * @return the CP
     */
	public String getCP() {
		return CP;
	}

    /**
     * @param CP the CP to set
     */
	public void setCP(String cP) {
		CP = cP;
	}

    /**
     * @return the ciudad
     */
	public String getCiudad() {
		return ciudad;
	}

    /**
     * @param ciudad the ciudad to set
     */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

    /**
     * @return the estado
     */
	public String getEstado() {
		return estado;
	}

    /**
     * @param estado the estado to set
     */
	public void setEstado(String estado) {
		this.estado = estado;
	}

    /**
     * @return the latitud
     */
	public String getLatitud() {
		return latitud;
	}

    /**
     * @param latitud the latitud to set
     */
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

    /**
     * @return the longitud
     */
	public String getLongitud() {
		return longitud;
	}

    /**
     * @param longitud the longitud to set
     */
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the colonia
	 */
	public String getColonia() {
		return colonia;
	}

	/**
	 * @param colonia the colonia to set
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
}
