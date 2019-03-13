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
"catalogo",
"errorCatalogos",
"errorValidaciones",
"otrosErrores",
"errorAcceso",
"error"
})
public class Response  {

@JsonProperty("FolioFamiliar")
private Object folioFamiliar;
@JsonProperty("resultado")
private String resultado;
@JsonProperty("catalogo")
private List<Catalogo> catalogo = null;
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
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("FolioFamiliar")
public Object getFolioFamiliar() {
return folioFamiliar;
}

@JsonProperty("FolioFamiliar")
public void setFolioFamiliar(Object folioFamiliar) {
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

@JsonProperty("catalogo")
public List<Catalogo> getCatalogo() {
return catalogo;
}

@JsonProperty("catalogo")
public void setCatalogo(List<Catalogo> catalogo) {
this.catalogo = catalogo;
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}