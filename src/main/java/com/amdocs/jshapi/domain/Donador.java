package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Luis Cruz
 */
@Entity
public class Donador {

	@Id
	@GeneratedValue
	@Column(name="iddonador")
	private Long id;

	@Column(name="razonsocial", length=100, nullable=false)
	private String razonSocial;

	@Column(name="recibofiscal")
	private int reciboFiscal;

	@Column(name="rfc", length=15)
	private String RFC;

	@Column(name="folioacuseconvenio", length=15)
	private String folioAcuseConvenio;

	@Column(name="vigenciaconvenio")
	private Date vigenciaConvenio;

	@Column
	private String comentarios;

	@Column(length=3)
	private String calificacion;

	@Column(name="fecharegistro")
	private Date fechaRegistro;

	@Column
	private boolean habilitado;

	public Donador() {}
	
	public Donador(String razonSocial, int reciboFiscal, String RFC, String folioAcuseConvenio, Date vigenciaConvenio,
			String comentarios, String calificacion, Date fechaRegistro, boolean habilitado) {
		this.razonSocial = razonSocial;
		this.reciboFiscal = reciboFiscal;
		this.RFC = RFC;
		this.folioAcuseConvenio = folioAcuseConvenio;
		this.vigenciaConvenio = vigenciaConvenio;
		this.comentarios = comentarios;
		this.calificacion = calificacion;
		this.fechaRegistro = fechaRegistro;
		this.habilitado = habilitado;
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
     	* @return the Identifier
     	*/	
	public Long getIdentifier(){
		return this.id;
	} 
	
	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the reciboFiscal
	 */
	public int getReciboFiscal() {
		return reciboFiscal;
	}

	/**
	 * @param reciboFiscal the reciboFiscal to set
	 */
	public void setReciboFiscal(int reciboFiscal) {
		this.reciboFiscal = reciboFiscal;
	}

	/**
	 * @return the rFC
	 */
	public String getRFC() {
		return RFC;
	}

	/**
	 * @param rFC the rFC to set
	 */
	public void setRFC(String rFC) {
		RFC = rFC;
	}

	/**
	 * @return the folioAcuseConvenio
	 */
	public String getFolioAcuseConvenio() {
		return folioAcuseConvenio;
	}

	/**
	 * @param folioAcuseConvenio the folioAcuseConvenio to set
	 */
	public void setFolioAcuseConvenio(String folioAcuseConvenio) {
		this.folioAcuseConvenio = folioAcuseConvenio;
	}

	/**
	 * @return the vigenciaConvenio
	 */
	public Date getVigenciaConvenio() {
		return vigenciaConvenio;
	}

	/**
	 * @param vigenciaConvenio the vigenciaConvenio to set
	 */
	public void setVigenciaConvenio(Date vigenciaConvenio) {
		this.vigenciaConvenio = vigenciaConvenio;
	}

	/**
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}

	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	/**
	 * @return the calificacion
	 */
	public String getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
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
	 * @param habilitado the habilitado to set
	 */
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
}
