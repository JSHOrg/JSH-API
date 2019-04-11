/**
 * EstudioEconomico.java
 */
package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Alejandro Alberto Aguilar Morales
 *
 */
@Entity
@Table(name="estudiosocioeconomico")
public class EstudioEconomico {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idestudiosocioeconomico")
	private Long id;
    
    @Column(name="nombreestudio")
    private String nombreEstudio;
    
    @Column(name="detallees")
    private String detalleestudio;

    @Column(name="timestamp")
    private Date date;
    
	@Column(name = "idbeneficiario")
	private Long beneficiario;

	public EstudioEconomico() {
	}

	/**
	 * @return the id
	 *
	public Long getId() {
		return this.id;
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
	 * @return the nombre estudio
	 */
	public String getNombreEstudio() {
		return this.nombreEstudio;
	}

	/**
	 * @param estudio the estudio to set
	 */
	public void setNombreEstudio(String estudio) {
		this.nombreEstudio = estudio;
    }
    
    /**
	 * @return the detalle de estudio
	 */
	 
	public String getDetalleestudio() {
		return this.detalleestudio;
	}

	/**
	 * @param detalleEstudio the detallle estudio to set
	 */
	public void setDetalleestudio(String detalleEstudio) {
		this.detalleestudio = detalleEstudio;
    }
    
    /**
	 * @return the date
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
    }
    
        /**
	 * @return the beneficiario
	 */
	public Long getbeneficiario() {
		return this.beneficiario;
	}

	/**
	 * @param beneficiario
	 *            the beneficiario to set
	 */
	public void setbeneficiario(Long beneficiario) {
		this.beneficiario = beneficiario;
	}
}
