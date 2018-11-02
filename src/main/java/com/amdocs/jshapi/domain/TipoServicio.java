package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tiposervicio")
public class TipoServicio {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idtiposervicio")
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
