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
 * @author Roberto Gutierrez Garcia
 */
@Entity
public class CentroComunitario {

    @Id
	@GeneratedValue
	@Column(name = "IDCentroComunitario")
	private Long id;
	
	@Column(length=50, nullable=false)
	private String nombre;
	
    @Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition="DATETIME")
	private Date fechaRegistro;

    @Column
    private boolean habilitado;
    
    @OneToOne(optional=false)
    @JoinColumn(name="IDDireccion", unique=true, nullable=false, updatable=false)
    private Direccion direccion;
  
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDBancoAlimentos")
	private BancoAlimentos bancoAlimentos;//IDBancoAlimentosPerteneciente

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
     * @return the bancoAlimentos
     */
	public BancoAlimentos getBancoAlimentos() {
		return bancoAlimentos;
	}

    /**
     * @param bancoAlimentos the bancoAlimentos to set
     */
	public void setBancoAlimentos(BancoAlimentos bancoAlimentos) {
		this.bancoAlimentos = bancoAlimentos;
	}
}
