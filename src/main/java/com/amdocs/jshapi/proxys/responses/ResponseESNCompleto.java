package com.amdocs.jshapi.proxys.responses;

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
"FolioFamiliar",
"resultado",
"Beneficiarios",
"errorCatalogos",
"errorValidaciones",
"otrosErrores",
"errorAcceso",
"error",
"errorBeneficiarios"
})
public class ResponseESNCompleto {

@JsonProperty("FolioFamiliar")
private String folioFamiliar;
@JsonProperty("resultado")
private String resultado;
@JsonProperty("Beneficiarios")
private List<Beneficiario> beneficiarios = null;
@JsonProperty("errorCatalogos")
private Object errorCatalogos;
@JsonProperty("errorValidaciones")
private Object errorValidaciones;
@JsonProperty("otrosErrores")
private Object otrosErrores;
@JsonProperty("errorAcceso")
private Object errorAcceso;
@JsonProperty("error")
private Object error;
@JsonProperty("errorBeneficiarios")
private Object errorBeneficiarios;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("FolioFamiliar")
public String getFolioFamiliar() {
return folioFamiliar;
}

@JsonProperty("FolioFamiliar")
public void setFolioFamiliar(String folioFamiliar) {
this.folioFamiliar = folioFamiliar;
}

@JsonProperty("resultado")
public String getResultado() {
return resultado;
}

@JsonProperty("resultado")
public void setResultado(String resultado) {
this.resultado = resultado;
}

@JsonProperty("Beneficiarios")
public List<Beneficiario> getBeneficiarios() {
return beneficiarios;
}

@JsonProperty("Beneficiarios")
public void setBeneficiarios(List<Beneficiario> beneficiarios) {
this.beneficiarios = beneficiarios;
}

@JsonProperty("errorCatalogos")
public Object getErrorCatalogos() {
return errorCatalogos;
}

@JsonProperty("errorCatalogos")
public void setErrorCatalogos(Object errorCatalogos) {
this.errorCatalogos = errorCatalogos;
}

@JsonProperty("errorValidaciones")
public Object getErrorValidaciones() {
return errorValidaciones;
}

@JsonProperty("errorValidaciones")
public void setErrorValidaciones(Object errorValidaciones) {
this.errorValidaciones = errorValidaciones;
}

@JsonProperty("otrosErrores")
public Object getOtrosErrores() {
return otrosErrores;
}

@JsonProperty("otrosErrores")
public void setOtrosErrores(Object otrosErrores) {
this.otrosErrores = otrosErrores;
}

@JsonProperty("errorAcceso")
public Object getErrorAcceso() {
return errorAcceso;
}

@JsonProperty("errorAcceso")
public void setErrorAcceso(Object errorAcceso) {
this.errorAcceso = errorAcceso;
}

@JsonProperty("error")
public Object getError() {
return error;
}

@JsonProperty("error")
public void setError(Object error) {
this.error = error;
}

@JsonProperty("errorBeneficiarios")
public Object getErrorBeneficiarios() {
return errorBeneficiarios;
}

@JsonProperty("errorBeneficiarios")
public void setErrorBeneficiarios(Object errorBeneficiarios) {
this.errorBeneficiarios = errorBeneficiarios;
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
