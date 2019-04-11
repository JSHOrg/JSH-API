package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mentor_integrante")
public class MentorIntegrante {
	
	private Long id;	
	private Date fechaasignacion;
	private Integer habilitado;
	private String comentarios;
	private String frecuencia;
	private Mentor mentor;
	private Integrante integrante;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idmentor_integrante")
	public Long getId ()
	{
		return this.id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	@Column (name= "comentarios")
	public String getComentarios ()
	{
		return this.comentarios;
	}
	
	public void setComentarios(String comentarios)
	{
		this.comentarios = comentarios;
	}
	
	@Column (name= "frecuencia")
	public String getFrecuencia()
	{
		return this.frecuencia;
	}
	
	public void setFrecuencia(String frecuencia)
	{
		this.frecuencia = frecuencia;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idintegrante")  
    public Integrante getIntegrante() {
        return integrante;
    }
    
    public void setIntegrante(Integrante integrante)
    {
    	this.integrante = integrante;
    }
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idmentor")  
    public Mentor getMentor() {
        return mentor;
    }
    
    public void setMentor(Mentor mentor)
    {
    	this.mentor = mentor;
    }
	
	@Temporal(TemporalType.DATE)
	@Column (name= "fechaasignacion")
	public Date getFechaAsignacion() {
		return this.fechaasignacion;
	}

	public void setFechaAsignacion(Date fechaasignacion) {
		this.fechaasignacion = fechaasignacion;
	}
	
	@Column (name= "habilitado")
	public Integer getHabilitado ()
	{
		return this.habilitado;
	}
	
	public void setHabilitado(Integer habilitado)
	{
		this.habilitado = habilitado;
	}
	
	
}
