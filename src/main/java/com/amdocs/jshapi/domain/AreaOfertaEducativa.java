package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.amdocs.jshapi.enums.Area;
import com.amdocs.jshapi.enums.TipoAliado;


@Entity
@Table(name="areaofertaeducativa")
public class AreaOfertaEducativa {

	@Id
	@GeneratedValue
	@Column(name = "idareaofertaeducativa")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name= "descripcion")
	private String descripcion;
	
	@Enumerated(EnumType.STRING)
	private Area area;
	
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
	
	public Area getArea()
	{
		return this.area;
	}
	
	public void setArea (Area area)
	{
		this.area = area;
	}

}
