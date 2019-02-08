package com.amdocs.jshapi.domain;
import java.beans.Transient;
import java.util.Date;
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
import javax.persistence.PostLoad;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

import com.amdocs.jshapi.domain.Direccion;

/**
 * @author Jose Eduardo Serrano
 *
 */
@Entity
@Table(name="familia")
public class Familia {

	@Formula(
		    "(select count(*) from integrante where idfamilia = idfamilia)")
		private int integrantesCount;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idfamilia")
	private int id;
	
	@Column(name="familia")
    private String familia;
    
    @Column(name="representante")
    private String representante;

    @Column(name="fechaalta")
    private Date date;
    
    
     
    @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(referencedColumnName="iddireccion", name="iddireccion")
    private Direccion direccion;
    
    @Column(name="idgrupo" )
    private long idgrupo;   
    
    public int getId()
    {
    	return id;
    }
    
    public void setId(int id)
    {
    	this.id = id;
    }
    
    public String getFamilia()
    {
    	return familia;
    }
    
    public void setFamilia(String familia)
    {
    	this.familia = familia;
    }
    
    public String getRepresentante()
    {
    	return representante;
    }
    
    public void setRepresentante(String representante)
    {
    	this.representante = representante;
    }
    
  
    
    public Direccion getDireccion()
    {
    	 return direccion;
    }
    
    public void setDireccion(Direccion direccion)
    {
    	this.direccion = direccion;
    }
    
    public Long getIdGrupo ()
    {
    	return idgrupo;
    }
    
    public void setIdGrupo (Long idgrupo)
    {
    	 this.idgrupo = idgrupo;
    }
     
    @Transient 
    public int getIntegrantesCount()
    {
    	return integrantesCount;
    }
}
