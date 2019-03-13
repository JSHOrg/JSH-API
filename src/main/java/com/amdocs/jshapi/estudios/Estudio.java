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
"_embedded",
"beneficiarioId"
})
public class Estudio {

@JsonProperty("_embedded")
private Embedded embedded;
@JsonProperty("beneficiarioId")
private Integer beneficiarioId;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("_embedded")
public Embedded getEmbedded() {
return embedded;
}

@JsonProperty("_embedded")
public void setEmbedded(Embedded embedded) {
this.embedded = embedded;
}

@JsonProperty("beneficiarioId")
public Integer getBeneficiarioId() {
return beneficiarioId;
}

@JsonProperty("beneficiarioId")
public void setBeneficiarioId(Integer beneficiarioId) {
this.beneficiarioId = beneficiarioId;
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