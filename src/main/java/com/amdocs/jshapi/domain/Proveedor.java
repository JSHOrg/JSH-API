/**
 * Proveedor.java
 */
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
 * @author Alejandro Alberto Aguilar
 *
 * 4/10/2018 Se remueve servicio del catalogo de proveedor 
 * 
 */
@Entity
@Table(name="proveedor")
public class Proveedor {

    @Id
	@GeneratedValue
	@Column(name = "idproveedor")
	private Long id;
    
    @Column(name="nombre")
    private String nombre;

    @Column(name="comentarios")
    private String comentarios;
    
    @Column(name="calificacion")
    private String calificacion;
    
    @Column(name="fecharegistro")
    private Date fechaRegistro;
    
    @Column(name="habilitado")
    private String habilitado;
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="idregion",referencedColumnName="idregion")
    private Region region;
      
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="idcontacto",referencedColumnName="idcontacto")
    private Contacto contacto;
    
	public Proveedor() {
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
    public String getHabilitado() {
        return habilitado;
    }

    /**
     * @param habilitado the habilitado to set
     */
    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    /**
     * @return the region
     */
    public Region getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(Region region) {
        this.region = region;
    }
    
     

    /**
     * @return the contacto
     */
    public Contacto getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}
