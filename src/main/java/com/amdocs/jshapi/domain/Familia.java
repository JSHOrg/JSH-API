package com.amdocs.jshapi.domain;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.domain.Beneficiario;

/**
 * @author Jose Eduardo Serrano
 *
 */
@Entity
@Table(name="familia")
public class Familia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idfamilia")
	private long id;
	
	@Column(name="familia")
    private String familia;
    
    @Column(name="representante")
    private String representante;

    @Column(name="fechaalta")
    private Date date;
    
    @Column(name="integrantes")
    private int integrantes;
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddireccion", name="iddireccion")
    private Direccion direccion;
    
    @Column(name="idgrupo", insertable=false, updatable=false)
    private long idgrupo;   
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumns(foreignKey = @ForeignKey(name="fk_familia_grupo"), value = { @JoinColumn(name="idgrupo") })
    private Grupo grupo;

    public long getId()
    {
    	return id;
    }
    
    public void setId(long id)
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
    
    public int getIntegrantes()
    {
    	return integrantes;
    }
    
    public void setIntegrantes(int integrantes)
    {
    	this.integrantes = integrantes;
    }
    
    public Direccion getDireccion()
    {
    	 return direccion;
    }
    
    public void setDireccion(Direccion direccion)
    {
    	this.direccion = direccion;
    }
    
     
}
