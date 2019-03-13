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
"Calle",
"Estado",
"Colonia",
"Comunidad",
"Municipio",
"Escolaridad",
"Numero exterior",
"Numero interior",
"Nombre del titular",
"Estatus Escolaridad"
})
public class Representante {

@JsonProperty("Calle")
private String calle;
@JsonProperty("Estado")
private String estado;
@JsonProperty("Colonia")
private String colonia;
@JsonProperty("Comunidad")
private String comunidad;
@JsonProperty("Municipio")
private String municipio;
@JsonProperty("Escolaridad")
private String escolaridad;
@JsonProperty("Numero exterior")
private String numeroExterior;
@JsonProperty("Numero interior")
private String numeroInterior;
@JsonProperty("Nombre del titular")
private String nombreDelTitular;
@JsonProperty("Estatus Escolaridad")
private String estatusEscolaridad;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Calle")
public String getCalle() {
return calle;
}

@JsonProperty("Calle")
public void setCalle(String calle) {
this.calle = calle;
}

@JsonProperty("Estado")
public String getEstado() {
return estado;
}

@JsonProperty("Estado")
public void setEstado(String estado) {
this.estado = estado;
}

@JsonProperty("Colonia")
public String getColonia() {
return colonia;
}

@JsonProperty("Colonia")
public void setColonia(String colonia) {
this.colonia = colonia;
}

@JsonProperty("Comunidad")
public String getComunidad() {
return comunidad;
}

@JsonProperty("Comunidad")
public void setComunidad(String comunidad) {
this.comunidad = comunidad;
}

@JsonProperty("Municipio")
public String getMunicipio() {
return municipio;
}

@JsonProperty("Municipio")
public void setMunicipio(String municipio) {
this.municipio = municipio;
}

@JsonProperty("Escolaridad")
public String getEscolaridad() {
return escolaridad;
}

@JsonProperty("Escolaridad")
public void setEscolaridad(String escolaridad) {
this.escolaridad = escolaridad;
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

@JsonProperty("Nombre del titular")
public String getNombreDelTitular() {
return nombreDelTitular;
}

@JsonProperty("Nombre del titular")
public void setNombreDelTitular(String nombreDelTitular) {
this.nombreDelTitular = nombreDelTitular;
}

@JsonProperty("Estatus Escolaridad")
public String getEstatusEscolaridad() {
return estatusEscolaridad;
}

@JsonProperty("Estatus Escolaridad")
public void setEstatusEscolaridad(String estatusEscolaridad) {
this.estatusEscolaridad = estatusEscolaridad;
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
