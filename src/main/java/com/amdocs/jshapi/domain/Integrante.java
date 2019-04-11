package com.amdocs.jshapi.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;
 
@Entity
@Table(name="integrante")


public class Integrante {

	
	/*public Integrante(Set<CursoIntegrante> cursosintegrantes)
	{
		this.cursosintegrantes = cursosintegrantes;
	}*/
	
	private Long id;
	
	private String nombre;
	private String apellidopaterno;
	private String apellidomaterno;
	private String edad;
	private String telefono;
	private String rol;
	private String escolaridad;
	private String graduacion;
	private String sigoID;
	
	private String comunidad;

	private Grupo grupo;
	
 //	private Set<CursoIntegrante> cursosintegrantes = new HashSet<CursoIntegrante>(0);
   

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idintegrante")
	public Long getId()
	{
		return this.id;
	}
	public void setId(Long id)
	{
		this.id =id;
	}
	
	@Column(name = "nombre")
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre= nombre;
	}
	
	@Column(name = "apellidopaterno")
	public String getApellidoPaterno ()
	{
		return apellidopaterno;
	}
	
	public void setApellidoPaterno (String apellidopaterno)
	{
		this.apellidopaterno = apellidopaterno;
	}
	
	@Column(name = "apellidomaterno")
	public String getApellidoMaterno ()
	{
		return apellidomaterno;
	}
	
	public void setApellidoMaterno(String apellidomaterno)
	{
		this.apellidomaterno = apellidomaterno;
	}
	

	@Column (name = "rol")
	public String getRol ()
	{
		return rol;
	}
	
	public void setRol(String rol)
	{
		this.rol  = rol;
	}
	
	@Column (name = "escolaridad")
	public String getEscolaridad ()
	{
		return escolaridad;
	}
	
	public void setEscolaridad (String escolaridad)
	{
		this.escolaridad = escolaridad;
	}
	
	
	@Column (name ="graduacion")
	public String getGraduacion ()
	{
		return graduacion;
	}
	
	public void setGraduacion(String graduacion)
	{
		this.graduacion = graduacion;
	}
	
	@Column (name = "edad")
	public String getEdad()
	{
		return edad;
	}
	
	public void setEdad(String edad)
	{
		this.edad = edad;
	}
	
	@Column (name = "telefono")
	public String getTelefono()
	{
		return telefono;
	}
	
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idgrupo", name="idgrupo")
	public Grupo getGrupo ()
	{
		return this.grupo;
	}
	public void setGrupo (Grupo grupo)
	{
		this.grupo = grupo;
	}
	
	@Column (name ="SigoID")
	public String getSigoID ()
	{
		return sigoID;
	}
	
	public void setSigoID(String sigoID)
	{
		this.sigoID = sigoID;
	}
	

	@Column (name ="comunidad")
	public String getComunidad ()
	{
		return comunidad;
	}
	
	public void setComunidad (String comunidad)
	{
		this.comunidad = comunidad;
	}
	
	/*@OneToMany(  mappedBy = "integrante", fetch=FetchType.LAZY )
 	public   Set<CursoIntegrante> getCursosIntegrantes ()
	{
		return this.cursosintegrantes;
	}
	 
	public void setCursosIntegrantes(Set<CursoIntegrante> cursosintegrantes )
	{
		this.cursosintegrantes = cursosintegrantes;
	}*/
}
