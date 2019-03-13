package com.amdocs.jshapi.bamx;


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
"I_Respuesta",
"Cat_ESNPreguntaAlimentacion"
})
public class ESNAlimentacionRespuesta {

@JsonProperty("I_Respuesta")
private Integer iRespuesta;
@JsonProperty("Cat_ESNPreguntaAlimentacion")
private CatESNPreguntaAlimentacion catESNPreguntaAlimentacion;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("I_Respuesta")
public Integer getIRespuesta() {
return iRespuesta;
}

@JsonProperty("I_Respuesta")
public void setIRespuesta(Integer iRespuesta) {
this.iRespuesta = iRespuesta;
}

@JsonProperty("Cat_ESNPreguntaAlimentacion")
public CatESNPreguntaAlimentacion getCatESNPreguntaAlimentacion() {
return catESNPreguntaAlimentacion;
}

@JsonProperty("Cat_ESNPreguntaAlimentacion")
public void setCatESNPreguntaAlimentacion(CatESNPreguntaAlimentacion catESNPreguntaAlimentacion) {
this.catESNPreguntaAlimentacion = catESNPreguntaAlimentacion;
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