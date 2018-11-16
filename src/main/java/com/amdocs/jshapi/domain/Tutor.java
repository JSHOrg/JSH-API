package com.amdocs.jshapi.domain;

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
@Table(name = "tutor")
public class Tutor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idtutor")
	private Long id;
	
	@Column(name="comentarios")
	private String comentarios;
	
	@Column(name="calificacion")
	private String calificacion;
	
	@Column(name="especialidad")
	private String especialidad;
	
	@Column(name = "habilitado")
	private boolean habilitado;
	
	@ManyToOne
	@JoinColumn(name="idaliado", nullable=false)
	private Aliado aliado;
	
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddireccion", name="iddireccion")
    private Direccion direccion;
	
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idcontacto", name="idcontacto")
    private Contacto contacto;
	
	public Long getId ()
	{
		return this.id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String  getComentarios()
	{
		return this.comentarios;
	}
	
	public void setComentarios(String comentarios)
	{
		this.comentarios=comentarios;
	}
	
	public String getCalificacion ()
	{
		return calificacion;
	}
	
	public void setCalificacion(String calificacion)
	{
		this.calificacion = calificacion;
	}
	
	

	public Aliado getAliado()
	{
		return aliado;
	}
	
	public void setAliado (Aliado aliado)
	{
		this.aliado = aliado;
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
	
	public String getEspecialidad()
	{
		return especialidad;
	}
	
	public void setEspecialidad(String especialidad)
	{
		this.especialidad = especialidad;
	}
	
	public boolean isHabilitado() {
		return habilitado;
	}
	
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

}
