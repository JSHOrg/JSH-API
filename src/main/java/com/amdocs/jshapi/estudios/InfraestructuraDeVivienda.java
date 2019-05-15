package com.amdocs.jshapi.estudios;

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
"Cama",
"Sala",
"Horno",
"Radio",
"Estufa",
"Celular",
"Comedor",
"Lavadora",
"Tenencia",
"Licuadora",
"Television",
"Telefono",
"Automovil",
"Computadora",
"Condiciones",
"Motocicleta",
"Refrigerador",
"Tipo de casa",
"No. de cuartos ",
"Bano / escusado",
"Caracteristicas",
"VHS, DVD, Blu Ray",
"Cuartos para dormir ",
"Mayor parte de muros",
"Mayor parte de piso",
"Mayor parte de techo"
})
public class InfraestructuraDeVivienda {

@JsonProperty("Cama")
private List<Cama> cama = null;
@JsonProperty("Sala")
private List<Sala> sala = null;
@JsonProperty("Horno")
private List<Horno> horno = null;
@JsonProperty("Radio")
private List<Radio> radio = null;
@JsonProperty("Estufa")
private List<Estufa> estufa = null;
@JsonProperty("Celular")
private List<Celular> celular = null;
@JsonProperty("Comedor")
private List<Comedor> comedor = null;
@JsonProperty("Lavadora")
private List<Lavadora> lavadora = null;
@JsonProperty("Tenencia")
private String tenencia;
@JsonProperty("Licuadora")
private List<Licuadora> licuadora = null;
@JsonProperty("Television")
private List<Television> television = null;
@JsonProperty("Telefono")
private List<Telefono> telefono = null;
@JsonProperty("Automovil")
private List<Automovil> automovil = null;
@JsonProperty("Computadora")
private List<Computadora> computadora = null;
@JsonProperty("Condiciones")
private String condiciones;
@JsonProperty("Motocicleta")
private List<Motocicleta> motocicleta = null;
@JsonProperty("Refrigerador")
private List<Refrigerador> refrigerador = null;
@JsonProperty("Tipo de casa")
private String tipoDeCasa;
@JsonProperty("No. de cuartos ")
private String noDeCuartos;
 
@JsonProperty("Caracteristicas")
private String caracteristicas;
@JsonProperty("VHS, DVD, Blu Ray")
private List<VHSDVDBluRay> vHSDVDBluRay = null;
@JsonProperty("Cuartos para dormir ")
private String cuartosParaDormir;
@JsonProperty("Mayor parte de muros")
private String mayorParteDeMuros;
@JsonProperty("Mayor parte de piso")
private String mayorParteDePisos;
@JsonProperty("Mayor parte de techo")
private String mayorParteDeTecho;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Cama")
public List<Cama> getCama() {
return cama;
}

@JsonProperty("Cama")
public void setCama(List<Cama> cama) {
this.cama = cama;
}

@JsonProperty("Sala")
public List<Sala> getSala() {
return sala;
}

@JsonProperty("Sala")
public void setSala(List<Sala> sala) {
this.sala = sala;
}

@JsonProperty("Horno")
public List<Horno> getHorno() {
return horno;
}

@JsonProperty("Horno")
public void setHorno(List<Horno> horno) {
this.horno = horno;
}

@JsonProperty("Radio")
public List<Radio> getRadio() {
return radio;
}

@JsonProperty("Radio")
public void setRadio(List<Radio> radio) {
this.radio = radio;
}

@JsonProperty("Estufa")
public List<Estufa> getEstufa() {
return estufa;
}

@JsonProperty("Estufa")
public void setEstufa(List<Estufa> estufa) {
this.estufa = estufa;
}

@JsonProperty("Celular")
public List<Celular> getCelular() {
return celular;
}

@JsonProperty("Celular")
public void setCelular(List<Celular> celular) {
this.celular = celular;
}

@JsonProperty("Comedor")
public List<Comedor> getComedor() {
return comedor;
}

@JsonProperty("Comedor")
public void setComedor(List<Comedor> comedor) {
this.comedor = comedor;
}

@JsonProperty("Lavadora")
public List<Lavadora> getLavadora() {
return lavadora;
}

@JsonProperty("Lavadora")
public void setLavadora(List<Lavadora> lavadora) {
this.lavadora = lavadora;
}

@JsonProperty("Television")
public List<Television> getTelevision() {
return television;
}

@JsonProperty("Television")
public void setTelevision(List<Television> television) {
this.television = television;
}

@JsonProperty("Tenencia")
public String getTenencia() {
return tenencia;
}

@JsonProperty("Tenencia")
public void setTenencia(String tenencia) {
this.tenencia = tenencia;
}

@JsonProperty("Licuadora")
public List<Licuadora> getLicuadora() {
return licuadora;
}

@JsonProperty("Licuadora")
public void setLicuadora(List<Licuadora> licuadora) {
this.licuadora = licuadora;
}

@JsonProperty("Telefono")
public List<Telefono> getTelefono() {
return telefono;
}

@JsonProperty("Telefono")
public void setTelefono(List<Telefono> telefono) {
this.telefono = telefono;
}

@JsonProperty("Automovil")
public List<Automovil> getAutomovil() {
return automovil;
}

@JsonProperty("Automovil")
public void setAutomovil(List<Automovil> automovil) {
this.automovil = automovil;
}

@JsonProperty("Computadora")
public List<Computadora> getComputadora() {
return computadora;
}

@JsonProperty("Computadora")
public void setComputadora(List<Computadora> computadora) {
this.computadora = computadora;
}

@JsonProperty("Condiciones")
public String getCondiciones() {
return condiciones;
}

@JsonProperty("Condiciones")
public void setCondiciones(String condiciones) {
this.condiciones = condiciones;
}

@JsonProperty("Motocicleta")
public List<Motocicleta> getMotocicleta() {
return motocicleta;
}

@JsonProperty("Motocicleta")
public void setMotocicleta(List<Motocicleta> motocicleta) {
this.motocicleta = motocicleta;
}

@JsonProperty("Refrigerador")
public List<Refrigerador> getRefrigerador() {
return refrigerador;
}

@JsonProperty("Refrigerador")
public void setRefrigerador(List<Refrigerador> refrigerador) {
this.refrigerador = refrigerador;
}

@JsonProperty("Tipo de casa")
public String getTipoDeCasa() {
return tipoDeCasa;
}

@JsonProperty("Tipo de casa")
public void setTipoDeCasa(String tipoDeCasa) {
this.tipoDeCasa = tipoDeCasa;
}

@JsonProperty("No. de cuartos ")
public String getNoDeCuartos() {
return noDeCuartos;
}

@JsonProperty("No. de cuartos ")
public void setNoDeCuartos(String noDeCuartos) {
this.noDeCuartos = noDeCuartos;
}
 

@JsonProperty("Caracteristicas")
public String getCaracteristicas() {
return caracteristicas;
}

@JsonProperty("Caracteristicas")
public void setCaracteristicas(String caracteristicas) {
this.caracteristicas = caracteristicas;
}

@JsonProperty("VHS, DVD, Blu Ray")
public List<VHSDVDBluRay> getVHSDVDBluRay() {
return vHSDVDBluRay;
}

@JsonProperty("VHS, DVD, Blu Ray")
public void setVHSDVDBluRay(List<VHSDVDBluRay> vHSDVDBluRay) {
this.vHSDVDBluRay = vHSDVDBluRay;
}

@JsonProperty("Cuartos para dormir ")
public String getCuartosParaDormir() {
return cuartosParaDormir;
}

@JsonProperty("Cuartos para dormir ")
public void setCuartosParaDormir(String cuartosParaDormir) {
this.cuartosParaDormir = cuartosParaDormir;
}

@JsonProperty("Mayor parte de muros")
public String getMayorParteDeMuros() {
return mayorParteDeMuros;
}

@JsonProperty("Mayor parte de muros")
public void setMayorParteDeMuros(String mayorParteDeMuros) {
this.mayorParteDeMuros = mayorParteDeMuros;
}

@JsonProperty("Mayor parte de piso")
public String getMayorParteDePiso() {
	return mayorParteDePisos;
}

@JsonProperty("Mayor parte de piso")
public void setMayorParteDePiso(String mayorParteDePisos) {
	this.mayorParteDePisos = mayorParteDePisos;
}

@JsonProperty("Mayor parte de techo")
public String getMayorParteDeTecho() {
return mayorParteDeTecho;
}

@JsonProperty("Mayor parte de techo")
public void setMayorParteDeTecho(String mayorParteDeTecho) {
this.mayorParteDeTecho = mayorParteDeTecho;
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