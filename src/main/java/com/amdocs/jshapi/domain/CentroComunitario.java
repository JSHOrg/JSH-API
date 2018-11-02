package com.amdocs.jshapi.domain;

/**
 * TipoContacto.java
 */
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

/**
 * 
 * @author Roberto Gutierrez Garcia
 */
@Entity
@Table(name="centrocomunitario")
public class CentroComunitario {

    @Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	@Column(name = "idcentrocomunitario")
	private Long id;
	
	@Column(length=50, nullable=false)
	private String nombre;
	
	@Column(name="centrocomunitario", length=50)
	private String centroComunitario;
	
	@Column(name="fecharegistro")
	private Date fechaRegistro;

	@Column
    private boolean habilitado;
    
	@Column(name="numerofamilias")
	private int numeroFamilias;
	
	@Column(name="indicemarginacion", length=12)
	private String indiceMarginacion;
	
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddireccion", name="iddireccion")
    private Direccion direccion;
  
    @OneToOne(optional=false, fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idcontacto", name="idcontacto")
    private Contacto contacto;
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idbancoalimentos", name="idbancoalimentosperteneciente")
	private BancoAlimentos bancoAlimentos;

     
	

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
     * @return the nombre
     */
	public String getNombre() {
		return nombre;
	}

    /**
     * @param nombre the nombre to set
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
	 * @return the centroComunitario
	 */
	public String getCentroComunitario() {
		return centroComunitario;
	}

	/**
	 * @param centroComunitario the centroComunitario to set
	 */
	public void setCentroComunitario(String centroComunitario) {
		this.centroComunitario = centroComunitario;
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

	/**
	 * @return the numeroFamilias
	 */
	public int getNumeroFamilias() {
		return numeroFamilias;
	}

	/**
	 * @param numeroFamilias the numeroFamilias to set
	 */
	public void setNumeroFamilias(int numeroFamilias) {
		this.numeroFamilias = numeroFamilias;
	}

	/**
	 * @return the indiceMarginacion
	 */
	public String getIndiceMarginacion() {
		return indiceMarginacion;
	}

	/**
	 * @param indiceMarginacion the indiceMarginacion to set
	 */
	public void setIndiceMarginacion(String indiceMarginacion) {
		this.indiceMarginacion = indiceMarginacion;
	}

 

	
    /**
     * @return the direccion
     */
	public Direccion getDireccion() {
		return direccion;
	}

    /**
     * @param direccion the direccion to set
     */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

  
	/**
     * @return the comtact
     */
	 public Contacto getContacto() {
		return contacto;
	}

    /**
     * @param contacto the contact to set
     */
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

   
	
}
