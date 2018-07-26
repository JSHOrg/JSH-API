/**
 * 
 */
package com.amdocs.jshapi.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Roberto Gutierrez Garcia
 *
 */
@Entity
@Table(name="servicio")
public class Grupo {

	@Id
	@GeneratedValue
	@Column(name = "idgrupo")
	private Long id;
	
	@Column
    private String comunidad;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<TrabajadorSocial> trabajadorAsignado;
	
	@Column
    private int integrantes;
	
	@Column
    private float progreso;
}
