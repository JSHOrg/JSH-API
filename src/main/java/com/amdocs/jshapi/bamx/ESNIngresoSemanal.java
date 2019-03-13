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
"R_Cantidad",
"Cat_ESNTipoIngreso"
})
public class ESNIngresoSemanal {

@JsonProperty("R_Cantidad")
private Integer rCantidad;
@JsonProperty("Cat_ESNTipoIngreso")
private CatESNTipoIngreso catESNTipoIngreso;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("R_Cantidad")
public Integer getRCantidad() {
return rCantidad;
}

@JsonProperty("R_Cantidad")
public void setRCantidad(Integer rCantidad) {
this.rCantidad = rCantidad;
}

@JsonProperty("Cat_ESNTipoIngreso")
public CatESNTipoIngreso getCatESNTipoIngreso() {
return catESNTipoIngreso;
}

@JsonProperty("Cat_ESNTipoIngreso")
public void setCatESNTipoIngreso(CatESNTipoIngreso catESNTipoIngreso) {
this.catESNTipoIngreso = catESNTipoIngreso;
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