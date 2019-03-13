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
"Luz",
"Agua",
"Drenaje",
"Escusado",
"Combustible"
})
public class Servicios {

@JsonProperty("Luz")
private String luz;
@JsonProperty("Agua")
private String agua;
@JsonProperty("Drenaje")
private String drenaje;
@JsonProperty("Escusado")
private String escusado;
@JsonProperty("Combustible")
private String combustible;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Luz")
public String getLuz() {
return luz;
}

@JsonProperty("Luz")
public void setLuz(String luz) {
this.luz = luz;
}

@JsonProperty("Agua")
public String getAgua() {
return agua;
}

@JsonProperty("Agua")
public void setAgua(String agua) {
this.agua = agua;
}

@JsonProperty("Drenaje")
public String getDrenaje() {
return drenaje;
}

@JsonProperty("Drenaje")
public void setDrenaje(String drenaje) {
this.drenaje = drenaje;
}

@JsonProperty("Escusado")
public String getEscusado() {
return escusado;
}

@JsonProperty("Escusado")
public void setEscusado(String escusado) {
this.escusado = escusado;
}

@JsonProperty("Combustible")
public String getCombustible() {
return combustible;
}

@JsonProperty("Combustible")
public void setCombustible(String combustible) {
this.combustible = combustible;
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