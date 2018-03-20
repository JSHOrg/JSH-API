package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Luis Cruz
 */
@Entity
//@Table(name = "Donativo")
public class Donativo {

	@Id
	@GeneratedValue
	@Column(name = "idDonativo")
	private Long id;

	@Column(length=15)
	private String remisionBA;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition="DATETIME")
	private Date fechaRegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition="DATETIME")
	private Date fechaAcopio;

	@Column
	private String requerimientosDonador;

	@Column
	private String condicionesTransporte;

	@Column(length=30)
	private String coordinacionTransporte;

	@Column
	private int costoOperativo;

	@Column(length=2)
	private String distribucionRegional;

	@Column
	private String especificaciones;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDDonador")
	private Donador donador;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDTransportesCajas")
	private TransportesCajas transportesCajas;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDTransportesUnidades")
	private TransportesUnidades transportesUnidades;

	public Donativo(Long id, String remisionBA, Date fechaRegistro, Date fechaAcopio, String requerimientosDonador,
			String condicionesTransporte, String coordinacionTransporte, int costoOperativo,
			String distribucionRegional, String especificaciones, Donador donador, TransportesCajas transportesCajas,
			TransportesUnidades transportesUnidades) {
		this.id = id;
		this.remisionBA = remisionBA;
		this.fechaRegistro = fechaRegistro;
		this.fechaAcopio = fechaAcopio;
		this.requerimientosDonador = requerimientosDonador;
		this.condicionesTransporte = condicionesTransporte;
		this.coordinacionTransporte = coordinacionTransporte;
		this.costoOperativo = costoOperativo;
		this.distribucionRegional = distribucionRegional;
		this.especificaciones = especificaciones;
		this.donador = donador;
		this.transportesCajas = transportesCajas;
		this.transportesUnidades = transportesUnidades;
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
	 * @return the remisionBA
	 */
	public String getRemisionBA() {
		return remisionBA;
	}

	/**
	 * @param remisionBA the remisionBA to set
	 */
	public void setRemisionBA(String remisionBA) {
		this.remisionBA = remisionBA;
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
	 * @return the fechaAcopio
	 */
	public Date getFechaAcopio() {
		return fechaAcopio;
	}

	/**
	 * @param fechaAcopio the fechaAcopio to set
	 */
	public void setFechaAcopio(Date fechaAcopio) {
		this.fechaAcopio = fechaAcopio;
	}

	/**
	 * @return the requerimientosDonador
	 */
	public String getRequerimientosDonador() {
		return requerimientosDonador;
	}

	/**
	 * @param requerimientosDonador the requerimientosDonador to set
	 */
	public void setRequerimientosDonador(String requerimientosDonador) {
		this.requerimientosDonador = requerimientosDonador;
	}

	/**
	 * @return the condicionesTransporte
	 */
	public String getCondicionesTransporte() {
		return condicionesTransporte;
	}

	/**
	 * @param condicionesTransporte the condicionesTransporte to set
	 */
	public void setCondicionesTransporte(String condicionesTransporte) {
		this.condicionesTransporte = condicionesTransporte;
	}

	/**
	 * @return the coordinacionTransporte
	 */
	public String getCoordinacionTransporte() {
		return coordinacionTransporte;
	}

	/**
	 * @param coordinacionTransporte the coordinacionTransporte to set
	 */
	public void setCoordinacionTransporte(String coordinacionTransporte) {
		this.coordinacionTransporte = coordinacionTransporte;
	}

	/**
	 * @return the costoOperativo
	 */
	public int getCostoOperativo() {
		return costoOperativo;
	}

	/**
	 * @param costoOperativo the costoOperativo to set
	 */
	public void setCostoOperativo(int costoOperativo) {
		this.costoOperativo = costoOperativo;
	}

	/**
	 * @return the distribucionRegional
	 */
	public String getDistribucionRegional() {
		return distribucionRegional;
	}

	/**
	 * @param distribucionRegional the distribucionRegional to set
	 */
	public void setDistribucionRegional(String distribucionRegional) {
		this.distribucionRegional = distribucionRegional;
	}

	/**
	 * @return the especificaciones
	 */
	public String getEspecificaciones() {
		return especificaciones;
	}

	/**
	 * @param especificaciones the especificaciones to set
	 */
	public void setEspecificaciones(String especificaciones) {
		this.especificaciones = especificaciones;
	}

	/**
	 * @return the donador
	 */
	public Donador getDonador() {
		return donador;
	}

	/**
	 * @param donador the donador to set
	 */
	public void setDonador(Donador donador) {
		this.donador = donador;
	}

	/**
	 * @return the transportesCajas
	 */
	public TransportesCajas getTransportesCajas() {
		return transportesCajas;
	}

	/**
	 * @param transportesCajas the transportesCajas to set
	 */
	public void setTransportesCajas(TransportesCajas transportesCajas) {
		this.transportesCajas = transportesCajas;
	}

	/**
	 * @return the transportesUnidades
	 */
	public TransportesUnidades getTransportesUnidades() {
		return transportesUnidades;
	}

	/**
	 * @param transportesUnidades the transportesUnidades to set
	 */
	public void setTransportesUnidades(TransportesUnidades transportesUnidades) {
		this.transportesUnidades = transportesUnidades;
	}
}
