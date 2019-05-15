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
"Gas",
"Luz",
"Agua",
"Becas",
"Hijos",
"Madre",
"Padre",
"Celular",
"PROSPERA",
"Pension",
"Vivienda",
"Telefono",
"Educacion",
"Transporte",
"Alimentacion",
"Tipo de apoyo",
"Adultos mayores ",
"Atencion medica",
"Frecuencia del apoyo",
"Quien lo proporciona",
"Aportacion semanal Otros",
"Aportacion semanal TOTAL",
"Condiciones economicas Otros",
"Condiciones economicas TOTAL",
"Alguien en el hogar recibe dinero proveniente de otros paises?"
})
public class CondicionesEconomicas {

@JsonProperty("Gas")
private String gas;
@JsonProperty("Luz")
private String luz;
@JsonProperty("Agua")
private String agua;
@JsonProperty("Becas")
private String becas;
@JsonProperty("Hijos")
private String hijos;
@JsonProperty("Madre")
private String madre;
@JsonProperty("Padre")
private String padre;
@JsonProperty("Celular")
private String celular;
@JsonProperty("PROSPERA")
private String pROSPERA;
@JsonProperty("Pension")
private String pension;
@JsonProperty("Vivienda")
private String vivienda;
@JsonProperty("Telefono")
private String telefono;
@JsonProperty("Educacion")
private String educacion;
@JsonProperty("Transporte")
private String transporte;
@JsonProperty("Alimentacion")
private String alimentacion;
@JsonProperty("Tipo de apoyo")
private String tipoDeApoyo;
@JsonProperty("Adultos mayores ")
private String adultosMayores;
@JsonProperty("Atencion medica")
private String atencionMedica;
@JsonProperty("Frecuencia del apoyo")
private String frecuenciaDelApoyo;
@JsonProperty("Quien lo proporciona")
private String quienLoProporciona;
@JsonProperty("Aportacion semanal Otros")
private String aportacionSemanalOtros;
@JsonProperty("Aportacion semanal TOTAL")
private String aportacionSemanalTOTAL;
@JsonProperty("Condiciones economicas Otros")
private String condicionesEconomicasOtros;
@JsonProperty("Condiciones economicas TOTAL")
private String condicionesEconomicasTOTAL;
@JsonProperty("Alguien en el hogar recibe dinero proveniente de otros paises?")
private String alguienEnElHogarRecibeDineroProvenienteDeOtrosPaises;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Gas")
public String getGas() {
return gas;
}

@JsonProperty("Gas")
public void setGas(String gas) {
this.gas = gas;
}

@JsonProperty("Luz")
public String getLuz() {
return luz;
}

@JsonProperty("Luz")
public void setLuz(String luz) {
this.luz = luz;
}

@JsonProperty("Agua")
public String getAgua() {
return agua;
}

@JsonProperty("Agua")
public void setAgua(String agua) {
this.agua = agua;
}

@JsonProperty("Becas")
public String getBecas() {
return becas;
}

@JsonProperty("Becas")
public void setBecas(String becas) {
this.becas = becas;
}

@JsonProperty("Hijos")
public String getHijos() {
return hijos;
}

@JsonProperty("Hijos")
public void setHijos(String hijos) {
this.hijos = hijos;
}

@JsonProperty("Madre")
public String getMadre() {
return madre;
}

@JsonProperty("Madre")
public void setMadre(String madre) {
this.madre = madre;
}

@JsonProperty("Padre")
public String getPadre() {
return padre;
}

@JsonProperty("Padre")
public void setPadre(String padre) {
this.padre = padre;
}

@JsonProperty("Celular")
public String getCelular() {
return celular;
}

@JsonProperty("Celular")
public void setCelular(String celular) {
this.celular = celular;
}

@JsonProperty("PROSPERA")
public String getPROSPERA() {
return pROSPERA;
}

@JsonProperty("PROSPERA")
public void setPROSPERA(String pROSPERA) {
this.pROSPERA = pROSPERA;
}

@JsonProperty("Pension")
public String getPension() {
return pension;
}

@JsonProperty("Pension")
public void setPension(String pension) {
this.pension = pension;
}

@JsonProperty("Vivienda")
public String getVivienda() {
return vivienda;
}

@JsonProperty("Vivienda")
public void setVivienda(String vivienda) {
this.vivienda = vivienda;
}

@JsonProperty("Telefono")
public String getTelefono() {
return telefono;
}

@JsonProperty("Telefono")
public void setTelefono(String telefono) {
this.telefono = telefono;
}

@JsonProperty("Educacion")
public String getEducacion() {
return educacion;
}

@JsonProperty("Educacion")
public void setEducacion(String educacion) {
this.educacion = educacion;
}

@JsonProperty("Transporte")
public String getTransporte() {
return transporte;
}

@JsonProperty("Transporte")
public void setTransporte(String transporte) {
this.transporte = transporte;
}

@JsonProperty("Alimentacion")
public String getAlimentacion() {
return alimentacion;
}

@JsonProperty("Alimentacion")
public void setAlimentacion(String alimentacion) {
this.alimentacion = alimentacion;
}

@JsonProperty("Tipo de apoyo")
public String getTipoDeApoyo() {
return tipoDeApoyo;
}

@JsonProperty("Tipo de apoyo")
public void setTipoDeApoyo(String tipoDeApoyo) {
this.tipoDeApoyo = tipoDeApoyo;
}

@JsonProperty("Adultos mayores ")
public String getAdultosMayores() {
return adultosMayores;
}

@JsonProperty("Adultos mayores ")
public void setAdultosMayores(String adultosMayores) {
this.adultosMayores = adultosMayores;
}

@JsonProperty("Atencion medica")
public String getAtencionMedica() {
return atencionMedica;
}

@JsonProperty("Atencion medica")
public void setAtencionMedica(String atencionMedica) {
this.atencionMedica = atencionMedica;
}

@JsonProperty("Frecuencia del apoyo")
public String getFrecuenciaDelApoyo() {
return frecuenciaDelApoyo;
}

@JsonProperty("Frecuencia del apoyo")
public void setFrecuenciaDelApoyo(String frecuenciaDelApoyo) {
this.frecuenciaDelApoyo = frecuenciaDelApoyo;
}

@JsonProperty("Quien lo proporciona")
public String getQuienLoProporciona() {
return quienLoProporciona;
}

@JsonProperty("Quien lo proporciona")
public void setQuienLoProporciona(String quienLoProporciona) {
this.quienLoProporciona = quienLoProporciona;
}

@JsonProperty("Aportacion semanal Otros")
public String getAportacionSemanalOtros() {
return aportacionSemanalOtros;
}

@JsonProperty("Aportacion semanal Otros")
public void setAportacionSemanalOtros(String aportacionSemanalOtros) {
this.aportacionSemanalOtros = aportacionSemanalOtros;
}

@JsonProperty("Aportacion semanal TOTAL")
public String getAportacionSemanalTOTAL() {
return aportacionSemanalTOTAL;
}

@JsonProperty("Aportacion semanal TOTAL")
public void setAportacionSemanalTOTAL(String aportacionSemanalTOTAL) {
this.aportacionSemanalTOTAL = aportacionSemanalTOTAL;
}

@JsonProperty("Condiciones economicas Otros")
public String getCondicionesEconomicasOtros() {
return condicionesEconomicasOtros;
}

@JsonProperty("Condiciones economicas Otros")
public void setCondicionesEconomicasOtros(String condicionesEconomicasOtros) {
this.condicionesEconomicasOtros = condicionesEconomicasOtros;
}

@JsonProperty("Condiciones economicas TOTAL")
public String getCondicionesEconomicasTOTAL() {
return condicionesEconomicasTOTAL;
}

@JsonProperty("Condiciones economicas TOTAL")
public void setCondicionesEconomicasTOTAL(String condicionesEconomicasTOTAL) {
this.condicionesEconomicasTOTAL = condicionesEconomicasTOTAL;
}

@JsonProperty("Alguien en el hogar recibe dinero proveniente de otros paises?")
public String getAlguienEnElHogarRecibeDineroProvenienteDeOtrosPaises() {
return alguienEnElHogarRecibeDineroProvenienteDeOtrosPaises;
}

@JsonProperty("Alguien en el hogar recibe dinero proveniente de otros paises?")
public void setAlguienEnElHogarRecibeDineroProvenienteDeOtrosPaises(String alguienEnElHogarRecibeDineroProvenienteDeOtrosPaises) {
this.alguienEnElHogarRecibeDineroProvenienteDeOtrosPaises = alguienEnElHogarRecibeDineroProvenienteDeOtrosPaises;
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