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
@Table(name="curso")
public class Curso {

	@Id
	@GeneratedValue
	@Column(name = "idcurso")
	private Long id;
	
	@Column(name="descripcion", length=50)
	private String descripcion;
	
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
	
	public String getDefinicion ()
	{
		return descripcion;
	}

	public void setDescripcion (String descripcion)
	{
		this.descripcion = descripcion;
	}
	
}
