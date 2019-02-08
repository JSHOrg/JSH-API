/**
 * 
 */
package com.amdocs.jshapi.domain;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@Entity
@Table(name="grupo")
public class Grupo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idgrupo")
	private long id;
	
	 
	@Column
    private float progreso;

	/*
	 * 
	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "idcontacto", name="idcontacto")
	private Contacto contacto;  
	 */
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idtrabajadorsocial", name="idtrabajadorsocial")
	private TrabajadorSocial trabajadorSocial;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idcentrograduacion", name="idcentrograduacion")
	private CentroGraduacion centroGraduacion;
	
	@Column(name="fechainicio")
	private Date fechaInicio;
	
	@Column(name="fechafin")
	private Date fechaFin;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="estatusgrupo")
	private int estatusGrupo;
	
	
	public int getEstatusGrupo () 
	{
		return estatusGrupo; 
	}
	
	public void setEstatusGrupo (int estatusGrupo)
	{
		this.estatusGrupo = estatusGrupo;
	}
	
	public void setFechaInicio (Date fechaInicio)
	{
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaInicio ()
	{
		return fechaInicio;
	}
	
	public void setFechaFin (Date fechaFin)
	{
		this.fechaFin = fechaFin;
	}
	
	public Date getFechaFin ()
	{
		return fechaFin;
	}
	
	public String getDescripcion()
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	 
	 
	/**
	 * @return the id
	 */
	public long getIdGrupo() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setIdGrupo(long id) {
		this.id = id;
	}

	 

	/**
	 * @return the trabajadorAsignado
	 */
	public TrabajadorSocial getTrabajadorSocial() {
		return trabajadorSocial;
	}

	/**
	 * @param trabajadorAsignado the trabajadorAsignado to set
	 */
	public void setTrabajadorSocial(TrabajadorSocial trabajadorSocial) {
		this.trabajadorSocial = trabajadorSocial;
	}

	public CentroGraduacion getCentroGraduacion ()
	{
		return centroGraduacion;
	}
	
	public void setCentroGraduacion(CentroGraduacion centroGraduacion)
	{
		this.centroGraduacion = centroGraduacion;
	}
	/**
	 * @return the integrantes
 

	 

	/**
	 * @return the progreso
	 */
	public float getProgreso() {
		return progreso;
	}

	/**
	 * @param progreso the progreso to set
	 */
	public void setProgreso(float progreso) {
		this.progreso = progreso;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grupo)) return false;
        return id != 0L && id== ((Grupo) o).id;
    }
 
    @Override
    public int hashCode() {
        return 31;
    }
}
