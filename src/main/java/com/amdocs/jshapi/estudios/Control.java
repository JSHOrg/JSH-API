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
"A que se dedican las personas de su familia en edad productiva?",
"Con que conocimientos cuentan las personas de su familia economicamente activas?",
"Si pudiera especializarse en alguna actividad productiva Que le gustaria realizar?"
})
public class Control {

@JsonProperty("A que se dedican las personas de su familia en edad productiva?")
private String aQueSeDedicanLasPersonasDeSuFamiliaEnEdadProductiva;
@JsonProperty("Con que conocimientos cuentan las personas de su familia economicamente activas?")
private String conQueConocimientosCuentanLasPersonasDeSuFamiliaEconomicamenteActivas;
@JsonProperty("Si pudiera especializarse en alguna actividad productiva Que le gustaria realizar?")
private String siPudieraEspecializarseEnAlgunaActividadProductivaQueLeGustariaRealizar;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("A que se dedican las personas de su familia en edad productiva?")
public String getAQueSeDedicanLasPersonasDeSuFamiliaEnEdadProductiva() {
return aQueSeDedicanLasPersonasDeSuFamiliaEnEdadProductiva;
}

@JsonProperty("A que se dedican las personas de su familia en edad productiva?")
public void setAQueSeDedicanLasPersonasDeSuFamiliaEnEdadProductiva(String aQueSeDedicanLasPersonasDeSuFamiliaEnEdadProductiva) {
this.aQueSeDedicanLasPersonasDeSuFamiliaEnEdadProductiva = aQueSeDedicanLasPersonasDeSuFamiliaEnEdadProductiva;
}

@JsonProperty("Con que conocimientos cuentan las personas de su familia economicamente activas?")
public String getConQueConocimientosCuentanLasPersonasDeSuFamiliaEconomicamenteActivas() {
return conQueConocimientosCuentanLasPersonasDeSuFamiliaEconomicamenteActivas;
}

@JsonProperty("Con que conocimientos cuentan las personas de su familia economicamente activas?")
public void setConQueConocimientosCuentanLasPersonasDeSuFamiliaEconomicamenteActivas(String conQueConocimientosCuentanLasPersonasDeSuFamiliaEconomicamenteActivas) {
this.conQueConocimientosCuentanLasPersonasDeSuFamiliaEconomicamenteActivas = conQueConocimientosCuentanLasPersonasDeSuFamiliaEconomicamenteActivas;
}

@JsonProperty("Si pudiera especializarse en alguna actividad productiva Que le gustaria realizar?")
public String getSiPudieraEspecializarseEnAlgunaActividadProductivaQueLeGustariaRealizar() {
return siPudieraEspecializarseEnAlgunaActividadProductivaQueLeGustariaRealizar;
}

@JsonProperty("Si pudiera especializarse en alguna actividad productiva Que le gustaria realizar?")
public void setSiPudieraEspecializarseEnAlgunaActividadProductivaQueLeGustariaRealizar(String siPudieraEspecializarseEnAlgunaActividadProductivaQueLeGustariaRealizar) {
this.siPudieraEspecializarseEnAlgunaActividadProductivaQueLeGustariaRealizar = siPudieraEspecializarseEnAlgunaActividadProductivaQueLeGustariaRealizar;
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