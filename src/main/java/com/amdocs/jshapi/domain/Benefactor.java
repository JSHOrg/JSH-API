package com.amdocs.jshapi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="benefactor")
public class Benefactor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idbenefactor")
	private int id;

	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "iddireccion", name="iddireccion")
	private Direccion direccion;  
	
	 

	@Column (name="Nombre")
	private String nombre;

	@Column (name="Edad")
	private String edad;
	
	@Column (name="" )

	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public Direccion getDireccion()
	{
		return direccion;
	}
	
	public void setDireccion(Direccion direccion)
	{
		this.direccion = direccion;
	}
 
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getEdad ()
	{
		return edad;
	}
	
	public void setEdad(String edad)
	{
		this.edad = edad;
	}

}
