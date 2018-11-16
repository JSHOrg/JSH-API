package com.amdocs.jshapi.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="aliado")
public class Aliado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idaliado")
	private Long id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idcontacto", name="idcontacto")
	private Contacto contacto;
	 
	
	@Column(name = "idbancoalimentos")
	private Long idbancoalimentos; 
	
	 
	
	@ManyToOne
	@JoinColumn(name="idtipoaliado", nullable=false)
	private TipoAliado tipoaliado;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "iddireccion", name="iddireccion")
	private Direccion direccion;

	 
	@Column (name="razonsocial")
	private String razonsocial;
	
	@Column (name="descripcion")
	private String descripcion;
	
	@Column (name="calificacion")
	private String calificacion;
	
	 @OneToMany (mappedBy="aliado")
	 private Set<Tutor> Tutores;

	public Long getId ()
	{
		return id;
	}
	
	public void setId (Long id)
	{
		this.id = id;
	}
	
	public String getRazonSocial()
	{
		return razonsocial;
	}
	
	public void setRazonSocial(String razonsocial)
	{
		 this.razonsocial =razonsocial;
	}
	
	public String getDescripcion ()
	{
		return descripcion;
	}
	
	public void setDescripcion (String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	 
	public Contacto getContacto()
	{
		return contacto;
	}
	
	public void setContacto(Contacto contacto)
	{
		this.contacto = contacto;
	}
	
	 
	public void setTipoAliado(TipoAliado tipoaliado)
	{
		this.tipoaliado = tipoaliado;
	}
	
	public TipoAliado getTipoAliado ()
	{
		return tipoaliado;
	}
	
	public void setIdBancoAlimentos(long idbancoalimentos)
	{
		this.idbancoalimentos = idbancoalimentos;
	}
	
	public Long getIdBancoAlimentos ()
	{
		return idbancoalimentos;
	}
}

