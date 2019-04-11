package com.amdocs.jshapi.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cursooferta")
public class CursoOferta {

	private Long id;
	private String descripcion;
	private String nombre;
	private Integer habilitado; 
	
	private Direccion direccion;
	private Centrograduacion centrograduacion; 
	private Areaofertaeducativa areaofertaeducativa;
 
	/**
	 * @return the id
	 */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idcursooferta")
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	

	@Column(name="descripcion", length=255)
	public String getDescripcion ()
	{
		return descripcion;
	}

	public void setDescripcion (String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	@Column(name="nombre", length=255)
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	@Column (name="habilitado")
	public Integer getHabilitado ()
	{
		return this.habilitado; 				
	}
	
	public void setHabilitado (Integer habilitado)
	{
		this.habilitado = habilitado;
	}
	
	
	 @OneToOne(optional=false, fetch=FetchType.EAGER)
	 @JoinColumn(referencedColumnName="iddireccion", name="iddireccion")
	public Direccion getDireccion()
	{
		return direccion;
	}
	
	public void setDireccion(Direccion direccion)
	{
		this.direccion = direccion;
	}
	
	@ManyToOne(optional=false, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="idcentrograduacion", name="idcentrograduacion")
	public Centrograduacion getCentrograduacion()
	{
		return centrograduacion;
	}
	
	public void setCentrograduacion(Centrograduacion centrograduacion)
	{
		this.centrograduacion = centrograduacion;
	}
	
	@ManyToOne(optional=false, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="idareaofertaeducativa", name="idareaofertaeducativa")
	public Areaofertaeducativa getAreaofertaeducativa ()
	{
		return this.areaofertaeducativa;
	}
	
	public void setAreaofertaeducativa (Areaofertaeducativa areaofertaeducativa)
	{
		this.areaofertaeducativa = areaofertaeducativa;
	}
}
