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
"Control",
"Servicios",
"Alimentacion",
"Representante ",
"Datos generales",
"Estructura familiar",
"Estructura familiar Detalles",
"Condiciones economicas",
"Infraestructura de vivienda"
})
public class Embedded {

@JsonProperty("Control")
private Control control;
@JsonProperty("Servicios")
private Servicios servicios;
@JsonProperty("Alimentacion")
private Alimentacion alimentacion;
@JsonProperty("Representante ")
private Representante representante;
@JsonProperty("Datos generales")
private DatosGenerales datosGenerales;
@JsonProperty("Estructura familiar")
private EstructuraFamiliar estructuraFamiliar;
@JsonProperty("Estructura familiar Detalles")
private EstructuraFamiliarDetalles estructuraFamiliarDetalles;
@JsonProperty("Condiciones economicas")
private CondicionesEconomicas condicionesEconomicas;
@JsonProperty("Infraestructura de vivienda")
private InfraestructuraDeVivienda infraestructuraDeVivienda;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Control")
public Control getControl() {
return control;
}

@JsonProperty("Control")
public void setControl(Control control) {
this.control = control;
}

@JsonProperty("Servicios")
public Servicios getServicios() {
return servicios;
}

@JsonProperty("Servicios")
public void setServicios(Servicios servicios) {
this.servicios = servicios;
}

@JsonProperty("Alimentacion")
public Alimentacion getAlimentacion() {
return alimentacion;
}

@JsonProperty("Alimentacion")
public void setAlimentacion(Alimentacion alimentacion) {
this.alimentacion = alimentacion;
}

@JsonProperty("Representante ")
public Representante getRepresentante() {
return representante;
}

@JsonProperty("Representante ")
public void setRepresentante(Representante representante) {
this.representante = representante;
}

@JsonProperty("Datos generales")
public DatosGenerales getDatosGenerales() {
return datosGenerales;
}

@JsonProperty("Datos generales")
public void setDatosGenerales(DatosGenerales datosGenerales) {
this.datosGenerales = datosGenerales;
}

@JsonProperty("Estructura familiar")
public EstructuraFamiliar getEstructuraFamiliar() {
return estructuraFamiliar;
}

@JsonProperty("Estructura familiar")
public void setEstructuraFamiliar(EstructuraFamiliar estructuraFamiliar) {
this.estructuraFamiliar = estructuraFamiliar;
}

@JsonProperty("Estructura familiar Detalles")
public EstructuraFamiliarDetalles getEstructuraFamiliarDetalles() {
	return estructuraFamiliarDetalles;
}

@JsonProperty("Estructura familiar Detalles")
public void setEstructuraFamiliarDetalles(EstructuraFamiliarDetalles estructuraFamiliarDetalles) {
	this.estructuraFamiliarDetalles = estructuraFamiliarDetalles;
}

@JsonProperty("Condiciones economicas")
public CondicionesEconomicas getCondicionesEconomicas() {
return condicionesEconomicas;
}

@JsonProperty("Condiciones economicas")
public void setCondicionesEconomicas(CondicionesEconomicas condicionesEconomicas) {
this.condicionesEconomicas = condicionesEconomicas;
}

@JsonProperty("Infraestructura de vivienda")
public InfraestructuraDeVivienda getInfraestructuraDeVivienda() {
return infraestructuraDeVivienda;
}

@JsonProperty("Infraestructura de vivienda")
public void setInfraestructuraDeVivienda(InfraestructuraDeVivienda infraestructuraDeVivienda) {
this.infraestructuraDeVivienda = infraestructuraDeVivienda;
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