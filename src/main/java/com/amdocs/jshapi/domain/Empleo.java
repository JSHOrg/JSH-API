/**
 * Empleo.java
 */
package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
/**
 * @author Roberto Gutierrez Garcia
 *
 */
@Entity
@Table(name = "empleo")
public class Empleo {

	
	private Long id;
	private String puesto;
	private String plazas;
	private String sexo;
	private String requisitos;
	private String escolaridad;
	private String experiencia;
	private BigDecimal sueldoMensual;
	private String horario;
	private String nombreempresa;
	private String giro;
	private String observaciones;
	
	private Contacto contacto;
	private Aliado aliado;
	private Direccion direccion;
	
	private Date fechaAlta;
	private Date vigencia;
	

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idempleo")
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
	@Column(name="puesto", length=45, nullable=false)
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return the ofertaEconomica
	 */
	@Column(name="plazas",length=10, nullable = false)
	public String getPlazas() {
		return plazas;
	}

	public void setPlazas(String plazas)
	{
		this.plazas = plazas;
	}
	@Column(name="sexo",length=20, nullable = false)
	public String getSexo()
	{
		return this.sexo;
	}
	
	public void setSexo (String sexo)
	{
		this.sexo = sexo;
	}
	
	@Column(name="requisitos",length=255)
	public String getRequisitos ()
	{
		 return this.requisitos;
	}
	
	public void setRequisitos (String requisitos)
	{
		this.requisitos = requisitos;
	}
	
	@Column(name="escolaridad",length=45)
	public String getEscolaridad ()
	{
		return this.escolaridad;
	}
	
	public void setEscolaridad(String escolaridad)
	{
		this.escolaridad = escolaridad;
	}
	
	@Column(name="experiencia",length=55)
	public String getExperiencia()
	{
		return this.experiencia;
	}
	
	public void setExperiencia (String experiencia)
	{
		this.experiencia = experiencia;
	}
	
	@Column(name="sueldomensual")
	public BigDecimal getSueldomensual()
	{
		return this.sueldoMensual;
	}
	
	public void setSueldomensual (BigDecimal sueldomensual)
	{
		this.sueldoMensual = sueldomensual;
	}
	
 
	@Column(name="horario", length=50)
	public String getHorario()
	{
		return this.horario;
	}
	
	public void setHorario(String horario)
	{
		this.horario = horario;
	}
	
	@Column(name="vigencia", nullable = false)
	public Date getVigencia() {
		return vigencia;
	}

	/**
	 * @param vigencia the vigencia to set
	 */
	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}
	
	@Column(name="fechaalta", nullable = false)
	public Date getFechaalta ()
	{
		return this.fechaAlta;
	}
	
	public void setFechaalta(Date fechaalta)
	{
		this.fechaAlta = fechaalta;
	}
	

	@Column(name="nombreempresa",length=200)
	public String getNombreempresa ()
	{
		return this.nombreempresa;
	}
	
	public void setNombreempresa(String nombreempresa)
	{
		this.nombreempresa= nombreempresa;
	}
	
	@Column(name="giro",length=45)
	public String getGiro() 
	{
		return this.giro;
	}
	
	public void setGiro(String giro)
	{
		this.giro = giro;
	}
	
	@Column(name="observaciones",length=45)
	public String getObservaciones() 
	{
		return this.observaciones;
	}
	
	public void setObservaciones(String observaciones)
	{
		this.observaciones = observaciones;
	} 
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idcontacto",referencedColumnName="idcontacto")
	public Contacto getContacto()
	{
		return this.contacto;
	}
	
	public void setContacto (Contacto contacto)
	{
		this.contacto = contacto;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idaliado",referencedColumnName="idaliado")
	public Aliado getAliado()
	{
		return this.aliado;
	}
	
	public void setAliado(Aliado aliado)
	{
		this.aliado = aliado;
	}
	 
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="iddireccion",referencedColumnName="iddireccion")
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param region the region to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
	    
}
