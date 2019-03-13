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
"Grupo",
"Estado",
"Localidad",
"Municipio",
"Codigo postal",
"Clave de estado",
"Entre vialidades",
"Fecha de captura",
"Numero exterior",
"Numero interior",
"Tipo de vialidad",
"Clave de municipio",
"Nombre de vialidad",
"Telefono / celular",
"Tipo de asentamiento",
"Fecha de levantamiento",
"Nombre de asentamiento",
" Descripcion de ubicacion ",
"Nombre de la comunidad o programa"
})
public class DatosGenerales {

@JsonProperty("Grupo")
private String grupo;
@JsonProperty("Estado")
private String estado;
@JsonProperty("Localidad")
private String localidad;
@JsonProperty("Municipio")
private String municipio;
@JsonProperty("Codigo postal")
private String codigoPostal;
@JsonProperty("Clave de estado")
private String claveDeEstado;
@JsonProperty("Entre vialidades")
private String entreVialidades;
@JsonProperty("Fecha de captura")
private String fechaDeCaptura;
@JsonProperty("Numero exterior")
private String numeroExterior;
@JsonProperty("Numero interior")
private String numeroInterior;
@JsonProperty("Tipo de vialidad")
private String tipoDeVialidad;
@JsonProperty("Clave de municipio")
private String claveDeMunicipio;
@JsonProperty("Nombre de vialidad")
private String nombreDeVialidad;
@JsonProperty("Telefono / celular")
private String telefonoCelular;
@JsonProperty("Tipo de asentamiento")
private String tipoDeAsentamiento;
@JsonProperty("Fecha de levantamiento")
private String fechaDeLevantamiento;
@JsonProperty("Nombre de asentamiento")
private String nombreDeAsentamiento;
@JsonProperty(" Descripcion de ubicacion ")
private String descripcionDeUbicacion;
@JsonProperty("Nombre de la comunidad o programa")
private String nombreDeLaComunidadOPrograma;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Grupo")
public String getGrupo() {
return grupo;
}

@JsonProperty("Grupo")
public void setGrupo(String grupo) {
this.grupo = grupo;
}

@JsonProperty("Estado")
public String getEstado() {
return estado;
}

@JsonProperty("Estado")
public void setEstado(String estado) {
this.estado = estado;
}

@JsonProperty("Localidad")
public String getLocalidad() {
return localidad;
}

@JsonProperty("Localidad")
public void setLocalidad(String localidad) {
this.localidad = localidad;
}

@JsonProperty("Municipio")
public String getMunicipio() {
return municipio;
}

@JsonProperty("Municipio")
public void setMunicipio(String municipio) {
this.municipio = municipio;
}

@JsonProperty("Codigo postal")
public String getCodigoPostal() {
return codigoPostal;
}

@JsonProperty("Codigo postal")
public void setCodigoPostal(String codigoPostal) {
this.codigoPostal = codigoPostal;
}

@JsonProperty("Clave de estado")
public String getClaveDeEstado() {
return claveDeEstado;
}

@JsonProperty("Clave de estado")
public void setClaveDeEstado(String claveDeEstado) {
this.claveDeEstado = claveDeEstado;
}

@JsonProperty("Entre vialidades")
public String getEntreVialidades() {
return entreVialidades;
}

@JsonProperty("Entre vialidades")
public void setEntreVialidades(String entreVialidades) {
this.entreVialidades = entreVialidades;
}

@JsonProperty("Fecha de captura")
public String getFechaDeCaptura() {
return fechaDeCaptura;
}

@JsonProperty("Fecha de captura")
public void setFechaDeCaptura(String fechaDeCaptura) {
this.fechaDeCaptura = fechaDeCaptura;
}

@JsonProperty("Numero exterior")
public String getNumeroExterior() {
return numeroExterior;
}

@JsonProperty("Numero exterior")
public void setNumeroExterior(String numeroExterior) {
this.numeroExterior = numeroExterior;
}

@JsonProperty("Numero interior")
public String getNumeroInterior() {
return numeroInterior;
}

@JsonProperty("Numero interior")
public void setNumeroInterior(String numeroInterior) {
this.numeroInterior = numeroInterior;
}

@JsonProperty("Tipo de vialidad")
public String getTipoDeVialidad() {
return tipoDeVialidad;
}

@JsonProperty("Tipo de vialidad")
public void setTipoDeVialidad(String tipoDeVialidad) {
this.tipoDeVialidad = tipoDeVialidad;
}

@JsonProperty("Clave de municipio")
public String getClaveDeMunicipio() {
return claveDeMunicipio;
}

@JsonProperty("Clave de municipio")
public void setClaveDeMunicipio(String claveDeMunicipio) {
this.claveDeMunicipio = claveDeMunicipio;
}

@JsonProperty("Nombre de vialidad")
public String getNombreDeVialidad() {
return nombreDeVialidad;
}

@JsonProperty("Nombre de vialidad")
public void setNombreDeVialidad(String nombreDeVialidad) {
this.nombreDeVialidad = nombreDeVialidad;
}

@JsonProperty("Telefono / celular")
public String getTelefonoCelular() {
return telefonoCelular;
}

@JsonProperty("Telefono / celular")
public void setTelefonoCelular(String telefonoCelular) {
this.telefonoCelular = telefonoCelular;
}

@JsonProperty("Tipo de asentamiento")
public String getTipoDeAsentamiento() {
return tipoDeAsentamiento;
}

@JsonProperty("Tipo de asentamiento")
public void setTipoDeAsentamiento(String tipoDeAsentamiento) {
this.tipoDeAsentamiento = tipoDeAsentamiento;
}

@JsonProperty("Fecha de levantamiento")
public String getFechaDeLevantamiento() {
return fechaDeLevantamiento;
}

@JsonProperty("Fecha de levantamiento")
public void setFechaDeLevantamiento(String fechaDeLevantamiento) {
this.fechaDeLevantamiento = fechaDeLevantamiento;
}

@JsonProperty("Nombre de asentamiento")
public String getNombreDeAsentamiento() {
return nombreDeAsentamiento;
}

@JsonProperty("Nombre de asentamiento")
public void setNombreDeAsentamiento(String nombreDeAsentamiento) {
this.nombreDeAsentamiento = nombreDeAsentamiento;
}

@JsonProperty(" Descripcion de ubicacion ")
public String getDescripcionDeUbicacion() {
return descripcionDeUbicacion;
}

@JsonProperty(" Descripcion de ubicacion ")
public void setDescripcionDeUbicacion(String descripcionDeUbicacion) {
this.descripcionDeUbicacion = descripcionDeUbicacion;
}

@JsonProperty("Nombre de la comunidad o programa")
public String getNombreDeLaComunidadOPrograma() {
return nombreDeLaComunidadOPrograma;
}

@JsonProperty("Nombre de la comunidad o programa")
public void setNombreDeLaComunidadOPrograma(String nombreDeLaComunidadOPrograma) {
this.nombreDeLaComunidadOPrograma = nombreDeLaComunidadOPrograma;
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