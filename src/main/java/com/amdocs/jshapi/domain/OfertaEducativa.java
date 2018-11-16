package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ofertaeducativa")
public class OfertaEducativa {

	@Id
	@GeneratedValue
	@Column(name = "idofertaeducativa")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name= "descripcion")
	private String descripcion;
	
	public Integer getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getDescripcion()
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion)		
	{
		this.descripcion = descripcion;
	}
}
