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
	private Long id;

	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "idcontacto", name="idcontacto")
	private Contacto contacto;  
	
	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "iddireccion", name="iddireccion")
	private Direccion direccion;  
	
	@Column (name="Nombre")
	private String nombre;
	
	@Column(name="razonsocial")
	private String razonSocial;

	 
	
	@Column (name="idbenefactor" )

	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
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
 
	public Contacto getContacto()
	{
		return contacto;
	}
	
	public void setContacto(Contacto contacto)
	{
		this.contacto = contacto;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getRazonSocial()
	{
		return razonSocial;
	}
	
	public void setRazonSocial(String razonSocial)
	{
		this.razonSocial = razonSocial;
	}

}
