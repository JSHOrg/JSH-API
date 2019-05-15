package com.amdocs.jshapi.estudios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"CURP",
"Sexo",
"Grado",
"Nivel",
"Nombre(s)",
"Parentesco",
"Estado civil",
"Primer apellido",
"Segundo apellido",
"Fecha de nacimiento",
"Entidad de nacimiento",
"Asiste a la escuela",
"Prestaciones",
"Ocupación",
"Tipo de empleo",
"Derechohabiencia",
"Motivo derechohabiencia",
"Capacidades diferentes",
"Condiciones de salud",
"Adicciones",
"Etnia indígena",
"Peso",
"Talla",
"Jubilación o pensionado"
})
public class Integrante {
@JsonProperty("id")
private int id;
@JsonProperty("CURP")
private String cURP;
@JsonProperty("Sexo")
private String sexo;
@JsonProperty("Grado")
private String grado;
@JsonProperty("Nivel")
private String nivel;
@JsonProperty("Nombre(s)")
private String nombreS;
@JsonProperty("Parentesco")
private String parentesco;
@JsonProperty("Estado civil")
private String estadoCivil;
@JsonProperty("Primer apellido")
private String primerApellido;
@JsonProperty("Segundo apellido")
private String segundoApellido;
@JsonProperty("Fecha de nacimiento")
private String fechaDeNacimiento;
@JsonProperty("Entidad de nacimiento")
private String entidadDeNacimiento;
@JsonProperty("Asiste a la escuela")
private String asisteALaEscuela;
@JsonProperty("Prestaciones")
private List<String> prestaciones = null;
@JsonProperty("Ocupación")
private String ocupacion;
@JsonProperty("Tipo de empleo")
private String tipoempleo;
@JsonProperty("Derechohabiencia")
private String derechohabiencia;
@JsonProperty("Motivo derechohabiencia")
private String motivoderechohabiencia;
@JsonProperty("Capacidades diferentes")
private String capacidadesdiferentes;
@JsonProperty("Condiciones de salud")
private String condicionesSalud;
@JsonProperty("Adicciones")
private String adicciones;
@JsonProperty("Etnia indígena")
private String etniaIndigena;
@JsonProperty ("Peso")
private String peso;
@JsonProperty("Talla")
private String talla;
@JsonProperty("Jubilación o pensionado")
private String jubilacionopensionado;


@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public int getId() {
	return id;
}

@JsonProperty("id")
public void setId(int id)
{
	this.id = id;
}

@JsonProperty("CURP")
public String getCURP() {
return cURP;
}

@JsonProperty("CURP")
public void setCURP(String cURP) {
this.cURP = cURP;
}

@JsonProperty("Sexo")
public String getSexo() {
return sexo;
}

@JsonProperty("Sexo")
public void setSexo(String sexo) {
this.sexo = sexo;
}

@JsonProperty("Grado")
public String getGrado() {
return grado;
}

@JsonProperty("Grado")
public void setGrado(String grado) {
this.grado = grado;
}

@JsonProperty("Nivel")
public String getNivel() {
return nivel;
}

@JsonProperty("Nivel")
public void setNivel(String nivel) {
this.nivel = nivel;
}

@JsonProperty("Nombre(s)")
public String getNombreS() {
return nombreS;
}

@JsonProperty("Nombre(s)")
public void setNombreS(String nombreS) {
this.nombreS = nombreS;
}

@JsonProperty("Parentesco")
public String getParentesco() {
return parentesco;
}

@JsonProperty("Parentesco")
public void setParentesco(String parentesco) {
this.parentesco = parentesco;
}

@JsonProperty("Estado civil")
public String getEstadoCivil() {
return estadoCivil;
}

@JsonProperty("Estado civil")
public void setEstadoCivil(String estadoCivil) {
this.estadoCivil = estadoCivil;
}

@JsonProperty("Primer apellido")
public String getPrimerApellido() {
return primerApellido;
}

@JsonProperty("Primer apellido")
public void setPrimerApellido(String primerApellido) {
this.primerApellido = primerApellido;
}

@JsonProperty("Segundo apellido")
public String getSegundoApellido() {
return segundoApellido;
}

@JsonProperty("Segundo apellido")
public void setSegundoApellido(String segundoApellido) {
this.segundoApellido = segundoApellido;
}

@JsonProperty("Fecha de nacimiento")
public String getFechaDeNacimiento() {
return fechaDeNacimiento;
}

@JsonProperty("Fecha de nacimiento")
public void setFechaDeNacimiento(String fechaDeNacimiento) {
this.fechaDeNacimiento = fechaDeNacimiento;
}

@JsonProperty("Entidad de nacimiento")
public String getEntidadDeNacimiento() {
return entidadDeNacimiento;
}

@JsonProperty("Entidad de nacimiento")
public void setEntidadDeNacimiento(String entidadDeNacimiento) {
this.entidadDeNacimiento = entidadDeNacimiento;
}

@JsonProperty("Asiste a la escuela")
public String getAsisteALaEscuela() {
return asisteALaEscuela;
}

@JsonProperty("Asiste a la escuela")
public void setAsisteALaEscuela(String asisteALaEscuela) {
this.asisteALaEscuela = asisteALaEscuela;
}


@JsonProperty("Prestaciones")
public List<String> getPrestaciones() {
return prestaciones;
}

@JsonProperty("Prestaciones")
public void setPrestaciones(List<String> prestaciones) {
this.prestaciones = prestaciones;
}

@JsonProperty("Ocupación")
public String getOcupacion () {
	return ocupacion;
}
@JsonProperty("Ocupación")
public void setOcupacion(String ocupacion)
{
	this.ocupacion = ocupacion;
}

@JsonProperty("Tipo de empleo")
public String getTipoEmpleo()
{
	return tipoempleo;
}

@JsonProperty("Tipo de empleo")
public void setTipoEmpleo(String tipoempleo)
{
	this.tipoempleo = tipoempleo;
}


@JsonProperty("Derechohabiencia")
public String getDerechohabiencia () {
	return derechohabiencia;
}

@JsonProperty("Derechohabiencia")
public void setDerechohabiencia (String derechohabiencia)
{
	this.derechohabiencia = derechohabiencia;
}

@JsonProperty("Motivo derechohabiencia")
public String getMotivoderechohabiencia()
{
	return motivoderechohabiencia;
}
@JsonProperty("Motivo derechohabiencia")
public void setMotivoderechohabiencia(String motivoderechohabiencia)
{
	this.motivoderechohabiencia= motivoderechohabiencia;
}
 
@JsonProperty("Capacidades diferentes")
public String getCapacidadesdiferentes()
{
	return capacidadesdiferentes;
}

@JsonProperty("Capacidades diferentes")
public void setCapacidadesdiferentes(String capacidadesdiferentes)
{
	this.capacidadesdiferentes = capacidadesdiferentes;
}

@JsonProperty("Condiciones de salud")
public String getCondicionesSalud()
{
	return this.condicionesSalud;
}

@JsonProperty("Condiciones de salud")
public void setCondicionesSalud(String condicionesSalud)
{
	this.condicionesSalud = condicionesSalud;
}

@JsonProperty("Adicciones")
public String getAdicciones()
{
	return adicciones;
}

@JsonProperty("Adicciones")
public void setAdicciones(String adicciones) {
	this.adicciones = adicciones;
}

@JsonProperty("Etnia indígena")
public String getEtniaIndigena()
{
	return etniaIndigena;
}

@JsonProperty("Etnia indígena")
public void setEtniaIndigena(String etniaIndigena)
{
	this.etniaIndigena = etniaIndigena;
}

@JsonProperty("Jubilación o pensionado")
public String getJubilacionoPensionado()
{
	return this.jubilacionopensionado;
}
@JsonProperty("Jubilación o pensionado")
public void setJubilacionoPensionado(String jubilacionoPensionado)
{
	jubilacionopensionado = jubilacionoPensionado;
}

@JsonProperty("Peso")
public String getPeso()
{
	return peso;
}

@JsonProperty("Peso")
public void setPeso(String peso)
{
	this.peso = peso;
}

@JsonProperty("Talla")
public String getTalla()
{
	return talla;
}

@JsonProperty("Talla")
public void setTalla(String talla)
{
	this.talla = talla;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}