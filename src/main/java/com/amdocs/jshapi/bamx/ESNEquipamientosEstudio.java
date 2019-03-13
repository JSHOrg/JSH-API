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
"I_Tiene",
"I_Sirve",
"Cat_ESNEquipamiento"
})
public class ESNEquipamientosEstudio {

@JsonProperty("I_Tiene")
private Integer iTiene;
@JsonProperty("I_Sirve")
private Integer iSirve;
@JsonProperty("Cat_ESNEquipamiento")
private CatESNEquipamiento catESNEquipamiento;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("I_Tiene")
public Integer getITiene() {
return iTiene;
}

@JsonProperty("I_Tiene")
public void setITiene(Integer iTiene) {
this.iTiene = iTiene;
}

@JsonProperty("I_Sirve")
public Integer getISirve() {
return iSirve;
}

@JsonProperty("I_Sirve")
public void setISirve(Integer iSirve) {
this.iSirve = iSirve;
}

@JsonProperty("Cat_ESNEquipamiento")
public CatESNEquipamiento getCatESNEquipamiento() {
return catESNEquipamiento;
}

@JsonProperty("Cat_ESNEquipamiento")
public void setCatESNEquipamiento(CatESNEquipamiento catESNEquipamiento) {
this.catESNEquipamiento = catESNEquipamiento;
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