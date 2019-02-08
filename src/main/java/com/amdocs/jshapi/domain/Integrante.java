package com.amdocs.jshapi.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="integrante")
public class Integrante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idintegrante")
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidopaterno")
	private String apellidopaterno;
	
	@Column(name = "apellidomaterno")
	private String apellidomaterno;
	
	 
	@Column (name = "edad")
	private String edad;

	@Column (name = "telefono")
	private String telefono;

	
	@Column (name = "rol")
	private String rol;
	
	@Column (name = "escolaridad")
	private String escolaridad;
	
	@Column (name ="graduacion")
	private String graduacion;
	
	@Column (name ="SigoID")
	private String sigoID;
	
	@Column (name ="comunidad")
	private String comunidad;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idgrupo", name="idgrupo")
	private Grupo grupo;
	
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
	
	public String getEdad()
	{
		return edad;
	}
	
	public void setEdad(String edad)
	{
		this.edad = edad;
	}
	
	public String getTelefono()
	{
		return telefono;
	}
	
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	
	public Grupo getGrupo ()
	{
		return this.grupo;
	}
	public void setGrupo (Grupo grupo)
	{
		this.grupo = grupo;
	}
	
	public String getSigoID ()
	{
		return sigoID;
	}
	
	public void setSigoID(String sigoID)
	{
		this.sigoID = sigoID;
	}
	
	public String getComunidad ()
	{
		return comunidad;
	}
	
	public void setComunidad (String comunidad)
	{
		this.comunidad = comunidad;
	}
}
