package com.amdocs.jshapi.domain;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.amdocs.jshapi.domain.CentroComunitario;
import com.amdocs.jshapi.domain.Direccion;;
@Entity
@Table(name="curso")
public class Curso {

	@Id
	@GeneratedValue
	@Column(name = "idcurso")
	private Long id;
	
	@Column(name="descripcion", length=255)
	private String descripcion;
	
	@Column(name="nombre", length=255)
	private String nombre;
	
	@Column(name="patrocinado", length=255)
	private String patrocinado;
	
	@Column(name="impartido", length=255)
	private String impartido;
	
	@Column(name="calificacion", length=255)
	private String calificacion;
	
	@Column(name="fechacurso")
    private Date fechaCurso;
	
    @OneToOne(optional=false, fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddireccion", name="iddireccion")
	private Direccion direccion;
	
	 
    @OneToOne(optional=false, fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idcentrocomunitario", name="idcentrocomunitario")
	private CentroComunitario centrocomunitario; 
    
    
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDefinicion ()
	{
		return descripcion;
	}

	public void setDescripcion (String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getPatrocinado ()
	{
		return patrocinado;
	}
	 
	public void setPatrocinado (String patrocinado)
	{
		this.patrocinado = patrocinado;
	}
	
	public String getImpartido ()
	{
		return impartido;
	}
	
	public void setImpartido(String impartido)
	{
		this.impartido = impartido;
	}
	
	public String getCalificacion () 
	{
		return calificacion;
	}
	
	public void setCalificacion(String calificacion)
	{
		this.calificacion = calificacion;
	}
	
	public Date getFechacurso()
	{
		return fechaCurso;
	}
	
	public void setFechaCurso(Date fechaCurso)
	{
		this.fechaCurso = fechaCurso;
	}
	
	public Direccion getDireccion()
	{
		return direccion;
	}
	
	public void setDireccio(Direccion direccion)
	{
		this.direccion = direccion;
	}
	
	public CentroComunitario getCentroComunitario()
	{
		return centrocomunitario;
	}
	
	public void setCentroComunitario(CentroComunitario centrocomunitario)
	{
		this.centrocomunitario = centrocomunitario;
	}
}

