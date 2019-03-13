package com.amdocs.jshapi.proxys.responses;
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
"idBeneficiario",
"nombre",
"apellidoPaterno",
"apellidoMaterno",
"validaciones",
"apiAccionesQueryCatalogo",
"resultado"
})
public class Beneficiario {

@JsonProperty("idBeneficiario")
private Integer idBeneficiario;
@JsonProperty("nombre")
private String nombre;
@JsonProperty("apellidoPaterno")
private String apellidoPaterno;
@JsonProperty("apellidoMaterno")
private String apellidoMaterno;
@JsonProperty("validaciones")
private Object validaciones;
@JsonProperty("apiAccionesQueryCatalogo")
private Object apiAccionesQueryCatalogo;
@JsonProperty("resultado")
private Object resultado;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("idBeneficiario")
public Integer getIdBeneficiario() {
return idBeneficiario;
}

@JsonProperty("idBeneficiario")
public void setIdBeneficiario(Integer idBeneficiario) {
this.idBeneficiario = idBeneficiario;
}

@JsonProperty("nombre")
public String getNombre() {
return nombre;
}

@JsonProperty("nombre")
public void setNombre(String nombre) {
this.nombre = nombre;
}

@JsonProperty("apellidoPaterno")
public String getApellidoPaterno() {
return apellidoPaterno;
}

@JsonProperty("apellidoPaterno")
public void setApellidoPaterno(String apellidoPaterno) {
this.apellidoPaterno = apellidoPaterno;
}

@JsonProperty("apellidoMaterno")
public String getApellidoMaterno() {
return apellidoMaterno;
}

@JsonProperty("apellidoMaterno")
public void setApellidoMaterno(String apellidoMaterno) {
this.apellidoMaterno = apellidoMaterno;
}

@JsonProperty("validaciones")
public Object getValidaciones() {
return validaciones;
}

@JsonProperty("validaciones")
public void setValidaciones(Object validaciones) {
this.validaciones = validaciones;
}

@JsonProperty("apiAccionesQueryCatalogo")
public Object getApiAccionesQueryCatalogo() {
return apiAccionesQueryCatalogo;
}

@JsonProperty("apiAccionesQueryCatalogo")
public void setApiAccionesQueryCatalogo(Object apiAccionesQueryCatalogo) {
this.apiAccionesQueryCatalogo = apiAccionesQueryCatalogo;
}

@JsonProperty("resultado")
public Object getResultado() {
return resultado;
}

@JsonProperty("resultado")
public void setResultado(Object resultado) {
this.resultado = resultado;
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