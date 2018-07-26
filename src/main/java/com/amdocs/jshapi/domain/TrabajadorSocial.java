/**
 * TrabajadorSocial.java
 */
package com.amdocs.jshapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
	@GeneratedValue
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
}
