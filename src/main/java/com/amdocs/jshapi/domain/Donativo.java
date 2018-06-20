package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Luis Cruz
 */
@Entity
@Table(name="donativo")
public class Donativo {

	@Id
	@GeneratedValue
	@Column(name = "iddonativo")
	private Long id;

	@Column(length=15, name = "remisionba")
	private String remisionBA;

	@Column(name="fecharegistro")
	private Date fechaRegistro;

	@Column(name="fechaacopio")
	private Date fechaAcopio;

	@Column(name="requerimientosdonador")
	private String requerimientosDonador;

	@Column(name="costooperativo")
	private int costoOperativo;

	@Column
	private String especificaciones;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddonador", name="iddonador")
	private Donador donador;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idtransportescajas", name="idtransportescajas")
	private TransporteCaja transportesCajas;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idtransportesunidades", name="idtransportesunidades")
	private TransporteUnidades transportesUnidades;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idbancoalimentos", name="idbancoalimentosofertante")
	private BancoAlimentos bancoAlimentosOfertante;
    
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idcontacto", name="idcontactodonador")
	private Contacto contactoDonador;
    
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idbancoalimentos", name="idbancoalimentospropietario")
	private BancoAlimentos bancoAlimentosPropietario;
    
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idusuario", name="idusuario")
	private Account usuario;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddireccion", name="iddireccionacopio")
	private Direccion direccionAcopio;
   
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
	public TransporteCaja getTransportesCajas() {
		return transportesCajas;
	}

	/**
	 * @param transportesCajas the transportesCajas to set
	 */
	public void setTransportesCajas(TransporteCaja transportesCajas) {
		this.transportesCajas = transportesCajas;
	}

	/**
	 * @return the transportesUnidades
	 */
	public TransporteUnidades getTransportesUnidades() {
		return transportesUnidades;
	}

	/**
	 * @param transportesUnidades the transportesUnidades to set
	 */
	public void setTransportesUnidades(TransporteUnidades transportesUnidades) {
		this.transportesUnidades = transportesUnidades;
	}

	/**
	 * @return the bancoAlimentosOfertante
	 */
	public BancoAlimentos getBancoAlimentosOfertante() {
		return bancoAlimentosOfertante;
	}

	/**
	 * @param bancoAlimentosOfertante the bancoAlimentosOfertante to set
	 */
	public void setBancoAlimentosOfertante(BancoAlimentos bancoAlimentosOfertante) {
		this.bancoAlimentosOfertante = bancoAlimentosOfertante;
	}

	/**
	 * @return the contactoDonador
	 */
	public Contacto getContactoDonador() {
		return contactoDonador;
	}

	/**
	 * @param contactoDonador the contactoDonador to set
	 */
	public void setContactoDonador(Contacto contactoDonador) {
		this.contactoDonador = contactoDonador;
	}

	/**
	 * @return the bancoAlimentosPropietario
	 */
	public BancoAlimentos getBancoAlimentosPropietario() {
		return bancoAlimentosPropietario;
	}

	/**
	 * @param bancoAlimentosPropietario the bancoAlimentosPropietario to set
	 */
	public void setBancoAlimentosPropietario(BancoAlimentos bancoAlimentosPropietario) {
		this.bancoAlimentosPropietario = bancoAlimentosPropietario;
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

	/**
	 * @return the direccionAcopio
	 */
	public Direccion getDireccionAcopio() {
		return direccionAcopio;
	}

	/**
	 * @param direccionAcopio the direccionAcopio to set
	 */
	public void setDireccionAcopio(Direccion direccionAcopio) {
		this.direccionAcopio = direccionAcopio;
	}
}
