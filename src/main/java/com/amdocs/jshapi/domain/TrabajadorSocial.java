/**
 * TrabajadorSocial.java
 */
package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@Entity
@Table(name="trabajadorsocial")
public class TrabajadorSocial {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idtrabajadorsocial")
	private Long id;
	
	@Column(length = 50)
	private String nombre;
	
	@Column(length = 50)
	private String puesto;
	
	@Column(length = 50)
	private String correo;
	
	@Column(name = "comunidadesasignadas")
	private int comunidadesAsignadas;
	
	@Column(name = "gruposasignados")
	private int gruposAsignados;
	
	
	public Long getId ()
	{
		return id;
	}
	
	public void setId (Long id)
	{
		this.id = id;
	}
	
	public String getNombre ()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getPuesto ()
	{
		return puesto;
	}
	
	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}
	
	public String getCorreo ()
	{
		return correo;
	}
	
	public void setCorreo(String correo)
	{
		this.correo = correo;
	}
	
	public int getComunidadesAsignadas ()
	{
		return comunidadesAsignadas;
	}
	
	public void setComunidadesAsignadas(int comunidadesasignadas)
	{
		this.comunidadesAsignadas = comunidadesasignadas;
	}
	
	public int getGruposAsignados()
	{
		return gruposAsignados;
	}
	
	public void setGruposAsignados(int gruposAsignados)
	{
		this.gruposAsignados = gruposAsignados;
	}
	
}
