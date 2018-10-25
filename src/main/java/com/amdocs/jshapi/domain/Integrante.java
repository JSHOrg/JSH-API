package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="integrante")
public class Integrante {

	@Id
	@GeneratedValue
	@Column(name = "idintegrante")
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidopaterno")
	private String apellidopaterno;
	
	@Column(name = "apellidomaterno")
	private String apellidomaterno;
	
	@Column(name="idfamilia")
	private Long idfamilia;
	
	@Column (name = "rol")
	private String rol;
	
	@Column (name = "escolaridad")
	private String escolaridad;
	
	@Column (name ="graduacion")
	private String graduacion;
	
	public Long getId()
	{
		return id;
	}
	public void setID(Long id)
	{
		this.id =id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre= nombre;
	}
	
	public String getApellidoPaterno ()
	{
		return apellidopaterno;
	}
	
	public void setApellidoPaterno (String apellidopaterno)
	{
		this.apellidopaterno = apellidopaterno;
	}
	
	public String getApellidoMaterno ()
	{
		return apellidomaterno;
	}
	
	public void setApellidoMaterno(String apellidomaterno)
	{
		this.apellidomaterno = apellidomaterno;
	}
	
	public Long getIdFamilia ()
	{
		return idfamilia;
	}
	
	public void setIdFamilia (Long idfamilia)
	{
		this.idfamilia = idfamilia;
	}
	
	public String getRol ()
	{
		return rol;
	}
	
	public void setRol(String rol)
	{
		this.rol  = rol;
	}
	
	public String getEscolaridad ()
	{
		return escolaridad;
	}
	
	public void setEscolaridad (String escolaridad)
	{
		this.escolaridad = escolaridad;
	}
	
	public String getGraduacion ()
	{
		return graduacion;
	}
	
	public void setGraduacion(String graduacion)
	{
		this.graduacion = graduacion;
	}
}
