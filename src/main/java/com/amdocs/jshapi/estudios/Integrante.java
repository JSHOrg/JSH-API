package com.amdocs.jshapi.estudios;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
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
"Asiste a la escuela"
})
public class Integrante {

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
@JsonProperty("Asiste a la escuela\u2026")
private String asisteALaEscuela;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}