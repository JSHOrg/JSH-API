/**
 * EstudioNutricio.java
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
@Table(name="estudiosocionutricio")
public class EstudioNutricio {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idestudiosocionutricio")
	private Long id;
    
    @Column(name="nombreestudio")
    private String nombreEstudio;
    
    @Column(name="detalleen")
    private String detalleEstudio;

    @Column(name="timestamp")
    private Date date;
    
	@Column(name = "idbeneficiario")
	private long beneficiario;

	public EstudioNutricio() {
	}

	/**
	 * @return the id
	 */
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
	public String getDetalleEstudio() {
		return this.detalleEstudio;
	}

	/**
	 * @param detalleEstudio the detallle estudio to set
	 */
	public void setDetalleEstudio(String detalleEstudio) {
		this.detalleEstudio = detalleEstudio;
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
