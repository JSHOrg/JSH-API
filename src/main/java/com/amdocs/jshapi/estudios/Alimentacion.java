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
"Tipo",
"Estatus",
"Frecuencia",
"Integrantes"
})
public class Alimentacion {

@JsonProperty("Tipo")
private String tipo;
@JsonProperty("Estatus")
private String estatus;
@JsonProperty("Frecuencia")
private String frecuencia;
@JsonProperty("Preguntas")
private List<Pregunta> preguntas = null;


@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Tipo")
public String getTipo() {
return tipo;
}

@JsonProperty("Tipo")
public void setTipo(String tipo) {
this.tipo = tipo;
}

@JsonProperty("Estatus")
public String getEstatus() {
return estatus;
}

@JsonProperty("Estatus")
public void setEstatus(String estatus) {
this.estatus = estatus;
}

@JsonProperty("Frecuencia")
public String getFrecuencia() {
return frecuencia;
}

@JsonProperty("Frecuencia")
public void setFrecuencia(String frecuencia) {
this.frecuencia = frecuencia;
}

@JsonProperty("Preguntas")
public List<Pregunta> getPreguntas() {
return preguntas;
}

@JsonProperty("Preguntas")
public void setPregunta(List<Pregunta> preguntas) {
this.preguntas = preguntas;
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