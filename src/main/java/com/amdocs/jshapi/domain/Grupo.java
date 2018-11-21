/**
 * 
 */
package com.amdocs.jshapi.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
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
	@GeneratedValue
	@Column(name = "idgrupo")
	private long id;
	
	 
	@Column
    private float progreso;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idtrabajadorsocial", name="idtrabajadorsocial")
	private TrabajadorSocial trabajadorSocial;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idcentrocomunitario", name="idcentrocomunitario")
	private CentroComunitario centrocomunitario;
	
	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	    })
	    @JoinTable(name = "grupo_integrante",
	        joinColumns = @JoinColumn(name = "idgrupo"),
	        inverseJoinColumns = @JoinColumn(name = "idintegrante")
	    )
	private Set<Integrante> integrantes = new HashSet<Integrante>();
	 
	public void addIntegrante (Integrante integrante)
	{
		integrantes.add(integrante);
		integrante.getGrupos().add(this);
	}
	
	public void removeIntegrante (Integrante integrante)
	{
		this.integrantes.remove(integrante);
		integrante.getGrupos().remove(this);
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
	public TrabajadorSocial getTrabajadorAsignado() {
		return trabajadorSocial;
	}

	/**
	 * @param trabajadorAsignado the trabajadorAsignado to set
	 */
	public void setTrabajadorSocial(TrabajadorSocial trabajadorSocial) {
		this.trabajadorSocial = trabajadorSocial;
	}

	/**
	 * @return the integrantes
	 */
	public Set<Integrante> getIntegrantes() {
		return integrantes;
	}

	/**
	 * @param integrantes the integrantes to set
	 */
	public void setIntegrantes(Set<Integrante> integrantes) {
		this.integrantes = integrantes;
	}

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
