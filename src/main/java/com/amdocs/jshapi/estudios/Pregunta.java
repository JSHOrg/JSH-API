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
"Pregunta",
"Respuesta"
})
public class Pregunta {

@JsonProperty("Pregunta")
private String pregunta;
@JsonProperty("Respuesta")
private Boolean respuesta;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Pregunta")
public String getPregunta() {
return pregunta;
}

@JsonProperty("Pregunta")
public void setPregunta(String pregunta) {
this.pregunta = pregunta;
}

@JsonProperty("Respuesta")
public Boolean getRespuesta() {
return respuesta;
}

@JsonProperty("Respuesta")
public void setRespuesta(Boolean respuesta) {
this.respuesta = respuesta;
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
