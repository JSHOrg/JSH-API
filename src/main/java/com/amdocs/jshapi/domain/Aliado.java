package com.amdocs.jshapi.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.amdocs.jshapi.enums.TipoAliado;

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
	 
	@ManyToOne
	@JoinColumn(name = "idbancoalimentos", nullable=false)
	private  BancoAlimentos bancoAlimentos; 	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "iddireccion", name="iddireccion")
	private Direccion direccion;

	@Enumerated(EnumType.STRING)
	private TipoAliado tipoaliado;
	 
	@Column (name="razonsocial")
	private String razonsocial;
	
	@Column (name="descripcion")
	private String descripcion;
	
	@Column (name="calificacion")
	private String calificacion;
	
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
		 
	public void setBancoAlimentos(BancoAlimentos  bancoAlimentos)
	{
		this.bancoAlimentos = bancoAlimentos;
	}
	
	public BancoAlimentos getBancoAlimentos ()
	{
		return bancoAlimentos;
	}
	
	public TipoAliado getTipoAliado()
	{
		return tipoaliado;
	}
	
	public void setTipoAliado(TipoAliado tipoaliado)
	{
		this.tipoaliado = tipoaliado;
	}
}

