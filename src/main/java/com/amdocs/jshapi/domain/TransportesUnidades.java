package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Table;

/**
 * 
 * @author Luis Cruz
 */
@Entity
//@Table(name = "TransportesUnidades")
public class TransportesUnidades {

	@Id
	@GeneratedValue
	@Column(name = "IDTransportesUnidades")
	private Long id;

	@Column(length=30)
	private String tipoUnidad;

	public TransportesUnidades() {
	}
	
	public TransportesUnidades(Long id, String tipoUnidad) {
		this.id = id;
		this.tipoUnidad = tipoUnidad;
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
	 * @return the tipoUnidad
	 */
	public String getTipoUnidad() {
		return tipoUnidad;
	}

	/**
	 * @param tipoUnidad the tipoUnidad to set
	 */
	public void setTipoUnidad(String tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}
}
