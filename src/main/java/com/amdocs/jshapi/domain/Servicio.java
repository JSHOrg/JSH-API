/**
 * Servicio.java
 */
package com.amdocs.jshapi.domain; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Alejandro Alberto Aguilar
 *
 */
@Entity
@Table(name="servicio")
public class Servicio {

    @Id
	@GeneratedValue
	@Column(name = "idservicio")
	private Long id;
    
    @Column(name="tiposervicio")
    private String tipoServicio;
    
	public Servicio() {
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
     * @return the tipoServicio
     */
    public String getTipoServicio() {
        return tipoServicio;
    }

    /**
     * @param tipoServicio the tipoServicio to set
     */
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
