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
"FolioFamiliar",
"PDiagDiagnostico",
"PDiagGrupo",
"dtFechaLevantamiento",
"strCalle",
"strNoExterior",
"Telefono",
"C_DescripcionUbicacion",
"CatDirEstado",
"CatDirMunicipio",
"CatDirAsentamiento",
"CP",
"strEntreCalles",
"Cat_PGralServiciosLuz",
"Cat_PGralServiciosSanitarios",
"Cat_ESNServicioGas",
"Cat_PGralServiciosAgua",
"Cat_ESNTipoVialidad",
"Cat_ESNTipoAsentamiento",
"strNoInterior",
"strNombreAsentamiento"
})
public class esn {

@JsonProperty("FolioFamiliar")
private String folioFamiliar;
@JsonProperty("PDiagDiagnostico")
private PDiagDiagnostico pDiagDiagnostico;
@JsonProperty("PDiagGrupo")
private PDiagGrupo pDiagGrupo;
@JsonProperty("dtFechaLevantamiento")
private String dtFechaLevantamiento;
@JsonProperty("strCalle")
private String strCalle;
@JsonProperty("strNoExterior")
private String strNoExterior;
@JsonProperty("Telefono")
private String telefono;
@JsonProperty("C_DescripcionUbicacion")
private String cDescripcionUbicacion;
@JsonProperty("CatDirEstado")
private CatDirEstado catDirEstado;
@JsonProperty("CatDirMunicipio")
private CatDirMunicipio catDirMunicipio;
@JsonProperty("CatDirAsentamiento")
private CatDirAsentamiento catDirAsentamiento;
@JsonProperty("CP")
private String cP;
@JsonProperty("strEntreCalles")
private String strEntreCalles;
@JsonProperty("Cat_PGralServiciosLuz")
private CatPGralServiciosLuz catPGralServiciosLuz;
@JsonProperty("Cat_PGralServiciosSanitarios")
private CatPGralServiciosSanitarios catPGralServiciosSanitarios;
@JsonProperty("Cat_ESNServicioGas")
private CatESNServicioGas catESNServicioGas;
@JsonProperty("Cat_PGralServiciosAgua")
private CatPGralServiciosAgua catPGralServiciosAgua;
@JsonProperty("Cat_ESNTipoVialidad")
private CatESNTipoVialidad catESNTipoVialidad;
@JsonProperty("Cat_ESNTipoAsentamiento")
private CatESNTipoAsentamiento catESNTipoAsentamiento;
@JsonProperty("strNoInterior")
private Integer strNoInterior;
@JsonProperty("strNombreAsentamiento")
private String strNombreAsentamiento;
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

@JsonProperty("PDiagDiagnostico")
public PDiagDiagnostico getPDiagDiagnostico() {
return pDiagDiagnostico;
}

@JsonProperty("PDiagDiagnostico")
public void setPDiagDiagnostico(PDiagDiagnostico pDiagDiagnostico) {
this.pDiagDiagnostico = pDiagDiagnostico;
}

@JsonProperty("PDiagGrupo")
public PDiagGrupo getPDiagGrupo() {
return pDiagGrupo;
}

@JsonProperty("PDiagGrupo")
public void setPDiagGrupo(PDiagGrupo pDiagGrupo) {
this.pDiagGrupo = pDiagGrupo;
}

@JsonProperty("dtFechaLevantamiento")
public String getDtFechaLevantamiento() {
return dtFechaLevantamiento;
}

@JsonProperty("dtFechaLevantamiento")
public void setDtFechaLevantamiento(String dtFechaLevantamiento) {
this.dtFechaLevantamiento = dtFechaLevantamiento;
}

@JsonProperty("strCalle")
public String getStrCalle() {
return strCalle;
}

@JsonProperty("strCalle")
public void setStrCalle(String strCalle) {
this.strCalle = strCalle;
}

@JsonProperty("strNoExterior")
public String getStrNoExterior() {
return strNoExterior;
}

@JsonProperty("strNoExterior")
public void setStrNoExterior(String strNoExterior) {
this.strNoExterior = strNoExterior;
}

@JsonProperty("Telefono")
public String getTelefono() {
return telefono;
}

@JsonProperty("Telefono")
public void setTelefono(String telefono) {
this.telefono = telefono;
}

@JsonProperty("C_DescripcionUbicacion")
public String getCDescripcionUbicacion() {
return cDescripcionUbicacion;
}

@JsonProperty("C_DescripcionUbicacion")
public void setCDescripcionUbicacion(String cDescripcionUbicacion) {
this.cDescripcionUbicacion = cDescripcionUbicacion;
}

@JsonProperty("CatDirEstado")
public CatDirEstado getCatDirEstado() {
return catDirEstado;
}

@JsonProperty("CatDirEstado")
public void setCatDirEstado(CatDirEstado catDirEstado) {
this.catDirEstado = catDirEstado;
}

@JsonProperty("CatDirMunicipio")
public CatDirMunicipio getCatDirMunicipio() {
return catDirMunicipio;
}

@JsonProperty("CatDirMunicipio")
public void setCatDirMunicipio(CatDirMunicipio catDirMunicipio) {
this.catDirMunicipio = catDirMunicipio;
}

@JsonProperty("CatDirAsentamiento")
public CatDirAsentamiento getCatDirAsentamiento() {
return catDirAsentamiento;
}

@JsonProperty("CatDirAsentamiento")
public void setCatDirAsentamiento(CatDirAsentamiento catDirAsentamiento) {
this.catDirAsentamiento = catDirAsentamiento;
}

@JsonProperty("CP")
public String getCP() {
return cP;
}

@JsonProperty("CP")
public void setCP(String cP) {
this.cP = cP;
}

@JsonProperty("strEntreCalles")
public String getStrEntreCalles() {
return strEntreCalles;
}

@JsonProperty("strEntreCalles")
public void setStrEntreCalles(String strEntreCalles) {
this.strEntreCalles = strEntreCalles;
}

@JsonProperty("Cat_PGralServiciosLuz")
public CatPGralServiciosLuz getCatPGralServiciosLuz() {
return catPGralServiciosLuz;
}

@JsonProperty("Cat_PGralServiciosLuz")
public void setCatPGralServiciosLuz(CatPGralServiciosLuz catPGralServiciosLuz) {
this.catPGralServiciosLuz = catPGralServiciosLuz;
}

@JsonProperty("Cat_PGralServiciosSanitarios")
public CatPGralServiciosSanitarios getCatPGralServiciosSanitarios() {
return catPGralServiciosSanitarios;
}

@JsonProperty("Cat_PGralServiciosSanitarios")
public void setCatPGralServiciosSanitarios(CatPGralServiciosSanitarios catPGralServiciosSanitarios) {
this.catPGralServiciosSanitarios = catPGralServiciosSanitarios;
}

@JsonProperty("Cat_ESNServicioGas")
public CatESNServicioGas getCatESNServicioGas() {
return catESNServicioGas;
}

@JsonProperty("Cat_ESNServicioGas")
public void setCatESNServicioGas(CatESNServicioGas catESNServicioGas) {
this.catESNServicioGas = catESNServicioGas;
}

@JsonProperty("Cat_PGralServiciosAgua")
public CatPGralServiciosAgua getCatPGralServiciosAgua() {
return catPGralServiciosAgua;
}

@JsonProperty("Cat_PGralServiciosAgua")
public void setCatPGralServiciosAgua(CatPGralServiciosAgua catPGralServiciosAgua) {
this.catPGralServiciosAgua = catPGralServiciosAgua;
}

@JsonProperty("Cat_ESNTipoVialidad")
public CatESNTipoVialidad getCatESNTipoVialidad() {
return catESNTipoVialidad;
}

@JsonProperty("Cat_ESNTipoVialidad")
public void setCatESNTipoVialidad(CatESNTipoVialidad catESNTipoVialidad) {
this.catESNTipoVialidad = catESNTipoVialidad;
}

@JsonProperty("Cat_ESNTipoAsentamiento")
public CatESNTipoAsentamiento getCatESNTipoAsentamiento() {
return catESNTipoAsentamiento;
}

@JsonProperty("Cat_ESNTipoAsentamiento")
public void setCatESNTipoAsentamiento(CatESNTipoAsentamiento catESNTipoAsentamiento) {
this.catESNTipoAsentamiento = catESNTipoAsentamiento;
}

@JsonProperty("strNoInterior")
public Integer getStrNoInterior() {
return strNoInterior;
}

@JsonProperty("strNoInterior")
public void setStrNoInterior(Integer strNoInterior) {
this.strNoInterior = strNoInterior;
}

@JsonProperty("strNombreAsentamiento")
public String getStrNombreAsentamiento() {
return strNombreAsentamiento;
}

@JsonProperty("strNombreAsentamiento")
public void setStrNombreAsentamiento(String strNombreAsentamiento) {
this.strNombreAsentamiento = strNombreAsentamiento;
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