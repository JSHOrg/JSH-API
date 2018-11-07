package com.amdocs.jshapi.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipoaliado")

public class TipoAliado {

	@Id
	@Column(name = "idtipoaliado")
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
	
	 @OneToMany (mappedBy="tipoaliado")
	 private Set<Aliado> Aliados;
	
	public int getId()
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
