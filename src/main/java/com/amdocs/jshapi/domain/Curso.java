package com.amdocs.jshapi.domain;


import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.amdocs.jshapi.domain.Centrograduacion;
import com.amdocs.jshapi.domain.Direccion;;
@Entity
@Table(name="curso")
public class Curso {

	
	private Long id;
	private String descripcion;
	private String nombre;
	private String calificacion;
	private Date fechaCurso;
	private String frecuencia;
	private String noSesiones;
	private String patrocinado;
	private Direccion direccion;
	private Centrograduacion centrograduacion; 
	private Areaofertaeducativa areaofertaeducativa;
    private Set<CursoIntegrante> cursosIntegrantes = new HashSet<CursoIntegrante>(0);
    private Set<TutorCurso> tutoresCurso = new HashSet<TutorCurso>(0);

    
    public Curso (){
    	
    }
    
    public Curso(Set<CursoIntegrante> cursosIntegrante)
    {
    	this.cursosIntegrantes = cursosIntegrante;
    }
    
    
	/**
	 * @return the id
	 */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idcurso")
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

	@Column(name="calificacion", length=255)
	public String getCalificacion () 
	{
		return calificacion;
	}
	
	public void setCalificacion(String calificacion)
	{
		this.calificacion = calificacion;
	}
	
	@Column(name="frecuencia")
	public String getFrecuencia ()
	{
		return this.frecuencia;
	}
	
	public void setFrecuencia(String frecuencia)
	{
		this.frecuencia = frecuencia;
	}
	
	@Column(name="nosesiones")
	public String getNosesiones()
	{
		return this.noSesiones;
	}
	
	public void setNosesiones (String nosesiones)
	{
		this.noSesiones = nosesiones;
	}
	
	@Column (name="patrocinado")
	public String getPatrocinado ()
	{
		return this.patrocinado;
	}
	
	public void setPatrocinado(String patrocinado)
	{
		this.patrocinado = patrocinado;
	}
	
	@Column(name="fechacurso")
	public Date getFechaCurso()
	{
		return fechaCurso;
	}
	
	public void setFechaCurso(Date fechaCurso)
	{
		this.fechaCurso = fechaCurso;
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
	
	@OneToOne(optional=false, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="idcentrograduacion", name="idcentrograduacion")
	public Centrograduacion getCentrograduacion()
	{
		return centrograduacion;
	}
	
	public void setCentrograduacion(Centrograduacion centrograduacion)
	{
		this.centrograduacion = centrograduacion;
	}
	
	@OneToOne(optional=false, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="idareaofertaeducativa", name="idareaofertaeducativa")
	public Areaofertaeducativa getAreaofertaeducativa ()
	{
		return this.areaofertaeducativa;
	}
	
	public void setAreaofertaeducativa (Areaofertaeducativa areaofertaeducativa)
	{
		this.areaofertaeducativa = areaofertaeducativa;
	}
	
	 @OneToMany(mappedBy = "curso",
	            cascade = CascadeType.ALL)
	public Set<CursoIntegrante> getCursosIntegrantes ()
	{
		return this.cursosIntegrantes;
	}
	
	public void setCursosIntegrantes(Set<CursoIntegrante> cursosintegrantes )
	{
		this.cursosIntegrantes = cursosintegrantes;
	}
	
	@OneToMany (mappedBy ="curso",
				cascade = CascadeType.ALL)
	public Set<TutorCurso> getTutorcurso ()
	{
		return this.tutoresCurso;
	}
	
	public void setTutorcurso (Set<TutorCurso> tutorescurso)
	{
		this.tutoresCurso = tutorescurso;
	}
}

