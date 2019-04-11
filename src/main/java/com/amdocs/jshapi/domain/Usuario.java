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
	
	
	private Long id;
	
	 
	/*@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "ID" ,  nullable=false)
	private TipoUsuario tipoUsuario;*/
	 
	
	private String nombre;
	
	
	private String password;
	
	@Column(name="grupo")
	private String Grupo;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDUsuario")
	 public Long getIdUsuario()
	 {
		 return id;
	 }
	 
	 public void setIdUsuario(Long idUsuario)
	 {
		 this.id= idUsuario;
	 }
	 
	 @Column(name="nombre")
	 public String getNombre()
	 {
		 return this.nombre;
	 }
	 
	 public void setNombre (String nombre)
	 {
		 this.nombre = nombre;
	 }
	 
	 @Column(name="Password")
	 public String getPassword ()
	 {
		 return this.password; 
		  
	 }
	 
	 public void setPassword(String password)
	 {
		 this.password = password;
	 }
	 
}
