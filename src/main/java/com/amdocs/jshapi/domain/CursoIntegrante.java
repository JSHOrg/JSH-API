package com.amdocs.jshapi.domain;

import java.util.Date;
import com.amdocs.jshapi.domain.Curso;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity (name="CursoIntegrante")
@Table(name="curso_integrante")
public class CursoIntegrante {
	@EmbeddedId
	private CursoIntegranteId id;
	
 	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("idcurso")
	private Curso curso;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("idintegrante")
	private Integrante integrante;
	
	@Column (name= "created_on")
	private Date createdOn = new Date();
	
	
	private CursoIntegrante()
	{}
	
	public CursoIntegrante(Curso curso, Integrante integrante)
	{
		 this.curso = curso;
		this.integrante = integrante;
		this.id = new CursoIntegranteId(integrante.getId(),curso.getId());
		
	}
	
	 public Curso getCurso ()
	{
		return this.curso;
	}
	
	public void setCurso(Curso curso)
	{
		this.curso = curso;
	}
	 
	public Integrante getIntegrante () 
	{
		return this.integrante;
	}
	
	public void setIntegrante (Integrante integrante)
	{
		this.integrante = integrante;
	}
	
}

	

