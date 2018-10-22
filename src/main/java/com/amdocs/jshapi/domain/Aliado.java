package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="aliado")
public class Aliado {

	@Id
	@GeneratedValue
	@Column(name = "idaliado")
	private Long id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idcontacto", name="idcontacto")
	private Contacto contacto;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idbancoalimentos", name="idbancoalimentos")
	private BancoAlimentos bancoAlimentos;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "iddireccion", name="iddireccion")
	private Direccion direccion;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idtipoaliado", name="idtipoaliado")
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
	
	public BancoAlimentos getBancoAlimentos ()
	{
		return bancoAlimentos;
	}
	
	public void setBancoAlimentos(BancoAlimentos bancoalimentos)
	{
		this.bancoAlimentos = bancoalimentos;
	}
	
	public Contacto getContacto()
	{
		return contacto;
	}
	
	public void setContacto(Contacto contacto)
	{
		this.contacto = contacto;
	}
	
	public TipoAliado getTipoAliado()
	{
		return tipoaliado;
	}
	
	public void setTipoAliado (TipoAliado tipoaliado)
	{
		this.tipoaliado = tipoaliado;
	}
	
}
