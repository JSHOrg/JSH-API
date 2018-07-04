package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Luis Cruz
 */
@Entity
@Table(name = "donador")
public class Donador {

	@Id
	@GeneratedValue
	@Column(name = "iddonador")
	private Long id;

	@Column(name = "razonsocial", length = 100, nullable = false)
	private String razonSocial;

	@Column(name = "recibofiscal")
	private int reciboFiscal;

	@Column(length = 15)
	private String RFC;

	@Column
	private String comentarios;

	@Column(length = 3)
	private String calificacion;

	@Column(name = "fecharegistro")
	private Date fechaRegistro;

	@Column
	private boolean habilitado;

	@Column
	private String telefono;

	@Column
	private String email;
	
	@Column(length = 40)
	private String tipo;
	
	@Column
	private String descripcion;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idbancoalimentos", name = "idbancoalimentosperteneciente")
	private BancoAlimentos bancoAlimentos;

	//TODO: check db definition
    @OneToOne(optional=false, fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddireccion", name="iddireccion", unique=true, nullable=false, updatable=false)
    private Direccion domicilio;
	
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
	public Long getIdentifier() {
		return this.id;
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
	 * @return the reciboFiscal
	 */
	public int getReciboFiscal() {
		return reciboFiscal;
	}

	/**
	 * @param reciboFiscal
	 *            the reciboFiscal to set
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
	 * @param rFC
	 *            the rFC to set
	 */
	public void setRFC(String rFC) {
		RFC = rFC;
	}

	/**
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}

	/**
	 * @param comentarios
	 *            the comentarios to set
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
	 * @param calificacion
	 *            the calificacion to set
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 *            the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the bancoAlimentos
	 */
	public BancoAlimentos getBancoAlimentos() {
		return bancoAlimentos;
	}

	/**
	 * @param bancoAlimentos
	 *            the bancoAlimentos to set
	 */
	public void setBancoAlimentos(BancoAlimentos bancoAlimentos) {
		this.bancoAlimentos = bancoAlimentos;
	}

	/**
	 * @return the domicilio
	 */
	public Direccion getDomicilio() {
		return domicilio;
	}

	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(Direccion domicilio) {
		this.domicilio = domicilio;
	}
}
