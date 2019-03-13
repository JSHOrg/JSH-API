package com.amdocs.jshapi.bamx;


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
"ESNAlimentacionRespuesta",
"ESNBeneficiario",
"ESNIngresoSemanal",
"ESNEgresoSemanal",
"ESNEquipamientosEstudio",
"PDiagDiagnostico",
"PDiagGrupo",
"dtFechaLevantamiento",
"strCalle",
"strNoExterior",
"Telefono",
"CatDirEstado",
"CatDirMunicipio",
"CatDirAsentamiento",
"CP",
"strEntreCalles",
"Cat_PGralServiciosLuz",
"Cat_PGralServiciosSanitarios",
"Cat_ESNServicioGas",
"Cat_PGralServiciosAgua",
"Cat_ESNTenencia",
"Cat_PGralParedes",
"Cat_PGralTechos",
"Cat_PGralTipoVivienda",
"Cat_PGralTiposPisos",
"No_Cuartos",
"No_CuartosParaDormir",
"CocinaSeparada",
"CuartoBano",
"Cat_ESNCondicionVivienda",
"ObservacionesVivienda",
"Cat_ESNTipoApoyo",
"Cat_PGralFrecuencia",
"Cat_GralDuracionMeses",
"No_Menor18",
"ApoyoEspecie",
"Cat_ESNTipoVialidad",
"Cat_ESNTipoAsentamiento",
"C_DescripcionUbicacion",
"Cat_ESNBanoEscusado",
"ProporcionaApoyo",
"Cat_PGralFrecuenciaApoyoEspecie",
"Remesas",
"Cat_PGralFrecuenciaRemesas",
"strNoInterior",
"strNombreAsentamiento"
})
public class ESNCompleto {

@JsonProperty("ESNAlimentacionRespuesta")
private List<ESNAlimentacionRespuesta> eSNAlimentacionRespuesta = null;
@JsonProperty("ESNBeneficiario")
private List<ESNBeneficiario> eSNBeneficiario = null;
@JsonProperty("ESNIngresoSemanal")
private List<ESNIngresoSemanal> eSNIngresoSemanal = null;
@JsonProperty("ESNEgresoSemanal")
private List<ESNEgresoSemanal> eSNEgresoSemanal = null;
@JsonProperty("ESNEquipamientosEstudio")
private List<ESNEquipamientosEstudio> eSNEquipamientosEstudio = null;
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
@JsonProperty("Cat_ESNTenencia")
private CatESNTenencia catESNTenencia;
@JsonProperty("Cat_PGralParedes")
private CatPGralParedes catPGralParedes;
@JsonProperty("Cat_PGralTechos")
private CatPGralTechos catPGralTechos;
@JsonProperty("Cat_PGralTipoVivienda")
private CatPGralTipoVivienda catPGralTipoVivienda;
@JsonProperty("Cat_PGralTiposPisos")
private CatPGralTiposPisos catPGralTiposPisos;
@JsonProperty("No_Cuartos")
private Integer noCuartos;
@JsonProperty("No_CuartosParaDormir")
private Integer noCuartosParaDormir;
@JsonProperty("CocinaSeparada")
private Integer cocinaSeparada;
@JsonProperty("CuartoBano")
private Integer cuartoBano;
@JsonProperty("Cat_ESNCondicionVivienda")
private CatESNCondicionVivienda catESNCondicionVivienda;
@JsonProperty("ObservacionesVivienda")
private String observacionesVivienda;
@JsonProperty("Cat_ESNTipoApoyo")
private CatESNTipoApoyo catESNTipoApoyo;
@JsonProperty("Cat_PGralFrecuencia")
private CatPGralFrecuencia catPGralFrecuencia;
@JsonProperty("Cat_GralDuracionMeses")
private CatGralDuracionMeses catGralDuracionMeses;
@JsonProperty("No_Menor18")
private Integer noMenor18;
@JsonProperty("ApoyoEspecie")
private String apoyoEspecie;
@JsonProperty("Cat_ESNTipoVialidad")
private CatESNTipoVialidad catESNTipoVialidad;
@JsonProperty("Cat_ESNTipoAsentamiento")
private CatESNTipoAsentamiento catESNTipoAsentamiento;
@JsonProperty("C_DescripcionUbicacion")
private String cDescripcionUbicacion;
@JsonProperty("Cat_ESNBanoEscusado")
private CatESNBanoEscusado catESNBanoEscusado;
@JsonProperty("ProporcionaApoyo")
private String proporcionaApoyo;
@JsonProperty("Cat_PGralFrecuenciaApoyoEspecie")
private CatPGralFrecuenciaApoyoEspecie catPGralFrecuenciaApoyoEspecie;
@JsonProperty("Remesas")
private Integer remesas;
@JsonProperty("Cat_PGralFrecuenciaRemesas")
private CatPGralFrecuenciaRemesas catPGralFrecuenciaRemesas;
@JsonProperty("strNoInterior")
private Integer strNoInterior;
@JsonProperty("strNombreAsentamiento")
private String strNombreAsentamiento;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("ESNAlimentacionRespuesta")
public List<ESNAlimentacionRespuesta> getESNAlimentacionRespuesta() {
return eSNAlimentacionRespuesta;
}

@JsonProperty("ESNAlimentacionRespuesta")
public void setESNAlimentacionRespuesta(List<ESNAlimentacionRespuesta> eSNAlimentacionRespuesta) {
this.eSNAlimentacionRespuesta = eSNAlimentacionRespuesta;
}

@JsonProperty("ESNBeneficiario")
public List<ESNBeneficiario> getESNBeneficiario() {
return eSNBeneficiario;
}

@JsonProperty("ESNBeneficiario")
public void setESNBeneficiario(List<ESNBeneficiario> eSNBeneficiario) {
this.eSNBeneficiario = eSNBeneficiario;
}

@JsonProperty("ESNIngresoSemanal")
public List<ESNIngresoSemanal> getESNIngresoSemanal() {
return eSNIngresoSemanal;
}

@JsonProperty("ESNIngresoSemanal")
public void setESNIngresoSemanal(List<ESNIngresoSemanal> eSNIngresoSemanal) {
this.eSNIngresoSemanal = eSNIngresoSemanal;
}

@JsonProperty("ESNEgresoSemanal")
public List<ESNEgresoSemanal> getESNEgresoSemanal() {
return eSNEgresoSemanal;
}

@JsonProperty("ESNEgresoSemanal")
public void setESNEgresoSemanal(List<ESNEgresoSemanal> eSNEgresoSemanal) {
this.eSNEgresoSemanal = eSNEgresoSemanal;
}

@JsonProperty("ESNEquipamientosEstudio")
public List<ESNEquipamientosEstudio> getESNEquipamientosEstudio() {
return eSNEquipamientosEstudio;
}

@JsonProperty("ESNEquipamientosEstudio")
public void setESNEquipamientosEstudio(List<ESNEquipamientosEstudio> eSNEquipamientosEstudio) {
this.eSNEquipamientosEstudio = eSNEquipamientosEstudio;
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

@JsonProperty("Cat_ESNTenencia")
public CatESNTenencia getCatESNTenencia() {
return catESNTenencia;
}

@JsonProperty("Cat_ESNTenencia")
public void setCatESNTenencia(CatESNTenencia catESNTenencia) {
this.catESNTenencia = catESNTenencia;
}

@JsonProperty("Cat_PGralParedes")
public CatPGralParedes getCatPGralParedes() {
return catPGralParedes;
}

@JsonProperty("Cat_PGralParedes")
public void setCatPGralParedes(CatPGralParedes catPGralParedes) {
this.catPGralParedes = catPGralParedes;
}

@JsonProperty("Cat_PGralTechos")
public CatPGralTechos getCatPGralTechos() {
return catPGralTechos;
}

@JsonProperty("Cat_PGralTechos")
public void setCatPGralTechos(CatPGralTechos catPGralTechos) {
this.catPGralTechos = catPGralTechos;
}

@JsonProperty("Cat_PGralTipoVivienda")
public CatPGralTipoVivienda getCatPGralTipoVivienda() {
return catPGralTipoVivienda;
}

@JsonProperty("Cat_PGralTipoVivienda")
public void setCatPGralTipoVivienda(CatPGralTipoVivienda catPGralTipoVivienda) {
this.catPGralTipoVivienda = catPGralTipoVivienda;
}

@JsonProperty("Cat_PGralTiposPisos")
public CatPGralTiposPisos getCatPGralTiposPisos() {
return catPGralTiposPisos;
}

@JsonProperty("Cat_PGralTiposPisos")
public void setCatPGralTiposPisos(CatPGralTiposPisos catPGralTiposPisos) {
this.catPGralTiposPisos = catPGralTiposPisos;
}

@JsonProperty("No_Cuartos")
public Integer getNoCuartos() {
return noCuartos;
}

@JsonProperty("No_Cuartos")
public void setNoCuartos(Integer noCuartos) {
this.noCuartos = noCuartos;
}

@JsonProperty("No_CuartosParaDormir")
public Integer getNoCuartosParaDormir() {
return noCuartosParaDormir;
}

@JsonProperty("No_CuartosParaDormir")
public void setNoCuartosParaDormir(Integer noCuartosParaDormir) {
this.noCuartosParaDormir = noCuartosParaDormir;
}

@JsonProperty("CocinaSeparada")
public Integer getCocinaSeparada() {
return cocinaSeparada;
}

@JsonProperty("CocinaSeparada")
public void setCocinaSeparada(Integer cocinaSeparada) {
this.cocinaSeparada = cocinaSeparada;
}

@JsonProperty("CuartoBano")
public Integer getCuartoBano() {
return cuartoBano;
}

@JsonProperty("CuartoBano")
public void setCuartoBano(Integer cuartoBano) {
this.cuartoBano = cuartoBano;
}

@JsonProperty("Cat_ESNCondicionVivienda")
public CatESNCondicionVivienda getCatESNCondicionVivienda() {
return catESNCondicionVivienda;
}

@JsonProperty("Cat_ESNCondicionVivienda")
public void setCatESNCondicionVivienda(CatESNCondicionVivienda catESNCondicionVivienda) {
this.catESNCondicionVivienda = catESNCondicionVivienda;
}

@JsonProperty("ObservacionesVivienda")
public String getObservacionesVivienda() {
return observacionesVivienda;
}

@JsonProperty("ObservacionesVivienda")
public void setObservacionesVivienda(String observacionesVivienda) {
this.observacionesVivienda = observacionesVivienda;
}

@JsonProperty("Cat_ESNTipoApoyo")
public CatESNTipoApoyo getCatESNTipoApoyo() {
return catESNTipoApoyo;
}

@JsonProperty("Cat_ESNTipoApoyo")
public void setCatESNTipoApoyo(CatESNTipoApoyo catESNTipoApoyo) {
this.catESNTipoApoyo = catESNTipoApoyo;
}

@JsonProperty("Cat_PGralFrecuencia")
public CatPGralFrecuencia getCatPGralFrecuencia() {
return catPGralFrecuencia;
}

@JsonProperty("Cat_PGralFrecuencia")
public void setCatPGralFrecuencia(CatPGralFrecuencia catPGralFrecuencia) {
this.catPGralFrecuencia = catPGralFrecuencia;
}

@JsonProperty("Cat_GralDuracionMeses")
public CatGralDuracionMeses getCatGralDuracionMeses() {
return catGralDuracionMeses;
}

@JsonProperty("Cat_GralDuracionMeses")
public void setCatGralDuracionMeses(CatGralDuracionMeses catGralDuracionMeses) {
this.catGralDuracionMeses = catGralDuracionMeses;
}

@JsonProperty("No_Menor18")
public Integer getNoMenor18() {
return noMenor18;
}

@JsonProperty("No_Menor18")
public void setNoMenor18(Integer noMenor18) {
this.noMenor18 = noMenor18;
}

@JsonProperty("ApoyoEspecie")
public String getApoyoEspecie() {
return apoyoEspecie;
}

@JsonProperty("ApoyoEspecie")
public void setApoyoEspecie(String apoyoEspecie) {
this.apoyoEspecie = apoyoEspecie;
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

@JsonProperty("C_DescripcionUbicacion")
public String getCDescripcionUbicacion() {
return cDescripcionUbicacion;
}

@JsonProperty("C_DescripcionUbicacion")
public void setCDescripcionUbicacion(String cDescripcionUbicacion) {
this.cDescripcionUbicacion = cDescripcionUbicacion;
}

@JsonProperty("Cat_ESNBanoEscusado")
public CatESNBanoEscusado getCatESNBanoEscusado() {
return catESNBanoEscusado;
}

@JsonProperty("Cat_ESNBanoEscusado")
public void setCatESNBanoEscusado(CatESNBanoEscusado catESNBanoEscusado) {
this.catESNBanoEscusado = catESNBanoEscusado;
}

@JsonProperty("ProporcionaApoyo")
public String getProporcionaApoyo() {
return proporcionaApoyo;
}

@JsonProperty("ProporcionaApoyo")
public void setProporcionaApoyo(String proporcionaApoyo) {
this.proporcionaApoyo = proporcionaApoyo;
}

@JsonProperty("Cat_PGralFrecuenciaApoyoEspecie")
public CatPGralFrecuenciaApoyoEspecie getCatPGralFrecuenciaApoyoEspecie() {
return catPGralFrecuenciaApoyoEspecie;
}

@JsonProperty("Cat_PGralFrecuenciaApoyoEspecie")
public void setCatPGralFrecuenciaApoyoEspecie(CatPGralFrecuenciaApoyoEspecie catPGralFrecuenciaApoyoEspecie) {
this.catPGralFrecuenciaApoyoEspecie = catPGralFrecuenciaApoyoEspecie;
}

@JsonProperty("Remesas")
public Integer getRemesas() {
return remesas;
}

@JsonProperty("Remesas")
public void setRemesas(Integer remesas) {
this.remesas = remesas;
}

@JsonProperty("Cat_PGralFrecuenciaRemesas")
public CatPGralFrecuenciaRemesas getCatPGralFrecuenciaRemesas() {
return catPGralFrecuenciaRemesas;
}

@JsonProperty("Cat_PGralFrecuenciaRemesas")
public void setCatPGralFrecuenciaRemesas(CatPGralFrecuenciaRemesas catPGralFrecuenciaRemesas) {
this.catPGralFrecuenciaRemesas = catPGralFrecuenciaRemesas;
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