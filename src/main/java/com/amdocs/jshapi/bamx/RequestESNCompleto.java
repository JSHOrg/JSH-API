package com.amdocs.jshapi.bamx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.amdocs.jshapi.bamx.ESNCompleto;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"UserIntegra",
"ListESNEstudioSocioNutricio"
})
public class RequestESNCompleto {

@JsonProperty("UserIntegra")
private user userIntegra;
@JsonProperty("ListESNEstudioSocioNutricio")
private List<ESNCompleto> listESNEstudioSocioNutricio = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("UserIntegra")
public user getUserIntegra() {
return userIntegra;
}

@JsonProperty("UserIntegra")
public void setUserIntegra(user userIntegra) {
this.userIntegra = userIntegra;
}

@JsonProperty("ListESNEstudioSocioNutricio")
public List<ESNCompleto> getListESNEstudioSocioNutricio() {
return listESNEstudioSocioNutricio;
}

@JsonProperty("ListESNEstudioSocioNutricio")
public void setListESNEstudioSocioNutricio(List<ESNCompleto> listESNEstudioSocioNutricio) {
this.listESNEstudioSocioNutricio = listESNEstudioSocioNutricio;
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
