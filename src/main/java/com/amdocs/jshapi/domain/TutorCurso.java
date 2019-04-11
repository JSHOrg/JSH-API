package com.amdocs.jshapi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity (name="TutorCurso")
@Table(name="tutor_curso")
  
	
public class TutorCurso {

	private long id;
	private Curso curso;
	private Tutor tutor;	
	private Integer habilitado;
	private Integer calificacion;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtutor_curso")
	public long getId() {
		 return id;
	}
	 
	public void setId (long id)
	{
		this.id = id;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idcurso")  
	public Curso getCurso ()
	{
		return this.curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	 @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "idtutor")
	public Tutor getTutor()
	{
		 return this.tutor;
	}
	
	public void setTutor (Tutor tutor)
	{
		this.tutor = tutor;
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
	
	@Column (name= "calificacion")
	public Integer getCalificacion ()
	{
		return this.calificacion;
	}
	
	public void setCalificacion(Integer calificacion)
	{
		this.calificacion = calificacion;
	}
}
