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
import javax.persistence.Table;

@Entity
@Table(name="salidaalmacen")
public class SalidaAlmacen {

	@Id
	@GeneratedValue
	@Column(name = "idsalidaalmacen")
	private Long id;
	
	@Column
	private String cantidad;
	
	@Column
	private String motivo;
	
	@Column(name="tiposalida")
	private boolean tipoSalida;
	
	@Column(name="fechasalida")
	private Date fechaSalida;

	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="idcentrocomunitario",referencedColumnName="idcentrocomunitario")
	private CentroComunitario centroComunitario;
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idusuario", name="idusuario")
	private Account usuario;

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
	 * @return the cantidad
	 */
	public String getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the motivo
	 */
	public String getMotivo() {
		return motivo;
	}

	/**
	 * @param motivo the motivo to set
	 */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	/**
	 * @return the tipoSalida
	 */
	public boolean isTipoSalida() {
		return tipoSalida;
	}

	/**
	 * @param tipoSalida the tipoSalida to set
	 */
	public void setTipoSalida(boolean tipoSalida) {
		this.tipoSalida = tipoSalida;
	}

	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * @return the centroComunitario
	 */
	public CentroComunitario getCentroComunitario() {
		return centroComunitario;
	}

	/**
	 * @param centroComunitario the centroComunitario to set
	 */
	public void setCentroComunitario(CentroComunitario centroComunitario) {
		this.centroComunitario = centroComunitario;
	}

	/**
	 * @return the usuario
	 */
	public Account getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Account usuario) {
		this.usuario = usuario;
	}
}
