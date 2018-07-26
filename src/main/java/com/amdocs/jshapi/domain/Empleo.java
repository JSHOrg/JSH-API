/**
 * Empleo.java
 */
package com.amdocs.jshapi.domain;

import java.util.Date;

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
@Table(name = "empleo")
public class Empleo {

	@Id
	@GeneratedValue
	@Column(name = "idempleo")
	private Long id;

	@Column(name="tipoempleo", length=50, nullable=false)
	private String tipo;

	@Column(name="ofertaeconomica", nullable = false)
	private float ofertaEconomica;

	@Column(nullable = false)
	private Date vigencia;

	@Column(length = 255, nullable = false)
	private String ubicacion;

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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the ofertaEconomica
	 */
	public float getOfertaEconomica() {
		return ofertaEconomica;
	}

	/**
	 * @param ofertaEconomica the ofertaEconomica to set
	 */
	public void setOfertaEconomica(float ofertaEconomica) {
		this.ofertaEconomica = ofertaEconomica;
	}

	/**
	 * @return the vigencia
	 */
	public Date getVigencia() {
		return vigencia;
	}

	/**
	 * @param vigencia the vigencia to set
	 */
	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}

	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}
