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
	/*@GeneratedValue*/
	@Column(name = "idservicio")
	private Long id;
    
    @Column(name="tiposervicio")
    private String tipoServicio;
    
    private String negocio;
    
    private String beneficio;
    
    private String contacto;
    
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

	/**
	 * @return the negocio
	 */
	public String getNegocio() {
		return negocio;
	}

	/**
	 * @param negocio the negocio to set
	 */
	public void setNegocio(String negocio) {
		this.negocio = negocio;
	}

	/**
	 * @return the beneficio
	 */
	public String getBeneficio() {
		return beneficio;
	}

	/**
	 * @param beneficio the beneficio to set
	 */
	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	/**
	 * @return the contacto
	 */
	public String getContacto() {
		return contacto;
	}

	/**
	 * @param contacto the contacto to set
	 */
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
}
