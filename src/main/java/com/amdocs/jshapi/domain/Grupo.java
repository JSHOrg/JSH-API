/**
 * 
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
@Table(name="grupo")
public class Grupo {

	@Id
	@GeneratedValue
	@Column(name = "idgrupo")
	private Long id;
	
	@Column
    private String comunidad;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idtrabajadorsocial", name="idtrabajadorsocial")
	private TrabajadorSocial trabajadorAsignado;
	
	@Column
    private int integrantes;
	
	@Column
    private float progreso;

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
	 * @return the comunidad
	 */
	public String getComunidad() {
		return comunidad;
	}

	/**
	 * @param comunidad the comunidad to set
	 */
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	/**
	 * @return the trabajadorAsignado
	 */
	public TrabajadorSocial getTrabajadorAsignado() {
		return trabajadorAsignado;
	}

	/**
	 * @param trabajadorAsignado the trabajadorAsignado to set
	 */
	public void setTrabajadorAsignado(TrabajadorSocial trabajadorAsignado) {
		this.trabajadorAsignado = trabajadorAsignado;
	}

	/**
	 * @return the integrantes
	 */
	public int getIntegrantes() {
		return integrantes;
	}

	/**
	 * @param integrantes the integrantes to set
	 */
	public void setIntegrantes(int integrantes) {
		this.integrantes = integrantes;
	}

	/**
	 * @return the progreso
	 */
	public float getProgreso() {
		return progreso;
	}

	/**
	 * @param progreso the progreso to set
	 */
	public void setProgreso(float progreso) {
		this.progreso = progreso;
	}
}
