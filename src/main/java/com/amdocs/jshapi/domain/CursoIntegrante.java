package com.amdocs.jshapi.domain;

import java.util.Date;
import com.amdocs.jshapi.domain.Curso;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.JoinColumn;

@Entity (name="CursoIntegrante")
@Table(name="curso_integrante")
 
public class CursoIntegrante {
	
	private long id;
	private Curso curso;
	private Integrante integrante;	
	private Date createdOn = new Date();
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "idcursointegrante")
	 public long getId() {
		 return id;
	}
	 
    public void setId(long id) {
        this.id = id;
    }
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcurso")  
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso)
    {
    	this.curso = curso;
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
    
    
	@Temporal(TemporalType.DATE)
	@Column (name= "created_on")
	public Date getCreatedDate() {
		return this.createdOn;
	}

	public void setCreatedDate(Date createdOn) {
		this.createdOn = createdOn;
	}
	
 
}

	

