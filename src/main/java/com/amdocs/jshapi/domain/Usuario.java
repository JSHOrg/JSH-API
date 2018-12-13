package com.amdocs.jshapi.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")	
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDUsuario")
	private Long id;
	
	 
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "ID" ,  nullable=false)
	private TipoUsuario tipoUsuario;
	 
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="grupo")
	private String Grupo;
	
	 public Long getIdUsuario()
	 {
		 return id;
	 }
	 
	 public void setIdUsuario(Long idUsuario)
	 {
		 this.id= idUsuario;
	 }
	 
	 
	
}
