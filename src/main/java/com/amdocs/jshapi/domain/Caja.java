package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Luis Cruz
 */
@Entity
@Table(name = "transportescajas")
public class Caja {

	@Id
	@GeneratedValue
	@Column(name = "idtransportescajas")
	private Long id;

	@Column(length=30, name="tipocaja")
	private String tipoCaja;

	public Caja() {
		
	}
	
	public Caja(Long id, String tipoCaja) {
		this.id = id;
		this.tipoCaja = tipoCaja;
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
	 * @return the tipoCaja
	 */
	public String getTipoCaja() {
		return tipoCaja;
	}

	/**
	 * @param tipoCaja the tipoCaja to set
	 */
	public void setTipoCaja(String tipoCaja) {
		this.tipoCaja = tipoCaja;
	}
}
