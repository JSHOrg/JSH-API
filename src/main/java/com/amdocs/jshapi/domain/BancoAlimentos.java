package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author GGABRIEL
 */
@Entity
public class BancoAlimentos {

	@Id
	@GeneratedValue
	@Column(name = "IDBancoAlimentos")
	private Long id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Account administrativo;

	@Column(length = 50)
	private String nombre;

	@Column(length = 150)
	private String razonSocial;

	@Column(length = 3)
	private String calificacion;

	private Date fechaAfiliacion;

	private Date fechaRegistro;

	@Column
	private boolean habilitado;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "IdRegion")
	private Region region;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "IDDireccion")
	private Direccion direccion;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "IDContacto")
	private Contacto contacto;

	public BancoAlimentos() {
	}

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
	 * @return the administrativo
	 */
	public Account getAdministrativo() {
		return administrativo;
	}

	/**
	 * @param administrativo
	 *            the administrativo to set
	 */
	public void setAdministrativo(Account administrativo) {
		this.administrativo = administrativo;
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

	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial
	 *            the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the calificacion
	 */
	public String getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion
	 *            the calificacion to set
	 */
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @return the fechaAfiliacion
	 */
	public Date getFechaAfiliacion() {
		return fechaAfiliacion;
	}

	/**
	 * @param fechaAfiliacion
	 *            the fechaAfiliacion to set
	 */
	public void setFechaAfiliacion(Date fechaAfiliacion) {
		this.fechaAfiliacion = fechaAfiliacion;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro
	 *            the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the habilitado
	 */
	public boolean isHabilitado() {
		return habilitado;
	}

	/**
	 * @param habilitado
	 *            the habilitado to set
	 */
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * @param region
	 *            the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the contacto
	 */
	public Contacto getContacto() {
		return contacto;
	}

	/**
	 * @param contacto
	 *            the contacto to set
	 */
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
}
