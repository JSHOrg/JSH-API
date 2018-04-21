package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="almacen")
public class Almacen {
	
	@Id
	@GeneratedValue
	@Column(name = "idalmacen")
	private Long id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idcontacto", name="idcontacto")
	private Contacto contacto;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idbancoalimentos", name="idbancoalimentos")
	private BancoAlimentos bancoAlimentos;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "iddireccion", name="iddireccion")
	private Direccion direccion;

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
}
