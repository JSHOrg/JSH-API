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
"C_Nombre",
"C_ApellidoPaterno",
"C_ApellidoMaterno",
"Cat_ESNSexo",
"dtFechaNacimiento",
"CatDirEstado",
"DocIdentidad",
"strEmisorCI",
"Cat_ESNEstadoCivil",
"Cat_ESNParentesco",
"Cat_ESNEscolaridad",
"Grado_Escolar",
"Cat_PGralEtniaIndigena",
"Cat_ESNCapacidadDiferente",
"Cat_ESNCondicionSalud",
"Cat_ESNAdiccion",
"Peso",
"Talla",
"IMC",
"AsisteEscuela",
"Cat_ESNOcupacion",
"Cat_ESNTipoEmpleo",
"JubiladoPensionado",
"Cat_ESNDerechoHabiencia",
"Cat_ESNMotivoDerechoHabiencia",
"pLaboral_A",
"pLaboral_B",
"pLaboral_C",
"pLaboral_D",
"pLaboral_E",
"pLaboral_F",
"pLaboral_G",
"pLaboral_H",
"pLaboral_I",
"Cat_ESNDocIdentidad"
})
public class ESNBeneficiario {

@JsonProperty("C_Nombre")
private String cNombre;
@JsonProperty("C_ApellidoPaterno")
private String cApellidoPaterno;
@JsonProperty("C_ApellidoMaterno")
private String cApellidoMaterno;
@JsonProperty("Cat_ESNSexo")
private CatESNSexo catESNSexo;
@JsonProperty("dtFechaNacimiento")
private String dtFechaNacimiento;
@JsonProperty("CatDirEstado")
private CatDirEstado catDirEstado;
@JsonProperty("DocIdentidad")
private String docIdentidad;
@JsonProperty("strEmisorCI")
private String strEmisorCI;
@JsonProperty("Cat_ESNEstadoCivil")
private CatESNEstadoCivil catESNEstadoCivil;
@JsonProperty("Cat_ESNParentesco")
private CatESNParentesco catESNParentesco;
@JsonProperty("Cat_ESNEscolaridad")
private CatESNEscolaridad catESNEscolaridad;
@JsonProperty("Grado_Escolar")
private Integer gradoEscolar;
@JsonProperty("Cat_PGralEtniaIndigena")
private CatPGralEtniaIndigena catPGralEtniaIndigena;
@JsonProperty("Cat_ESNCapacidadDiferente")
private CatESNCapacidadDiferente catESNCapacidadDiferente;
@JsonProperty("Cat_ESNCondicionSalud")
private CatESNCondicionSalud catESNCondicionSalud;
@JsonProperty("Cat_ESNAdiccion")
private CatESNAdiccion catESNAdiccion;
@JsonProperty("Peso")
private Integer peso;
@JsonProperty("Talla")
private Integer talla;
@JsonProperty("IMC")
private Integer iMC;
@JsonProperty("AsisteEscuela")
private Integer asisteEscuela;
@JsonProperty("Cat_ESNOcupacion")
private CatESNOcupacion catESNOcupacion;
@JsonProperty("Cat_ESNTipoEmpleo")
private CatESNTipoEmpleo catESNTipoEmpleo;
@JsonProperty("JubiladoPensionado")
private Integer jubiladoPensionado;
@JsonProperty("Cat_ESNDerechoHabiencia")
private CatESNDerechoHabiencia catESNDerechoHabiencia;
@JsonProperty("Cat_ESNMotivoDerechoHabiencia")
private CatESNMotivoDerechoHabiencia catESNMotivoDerechoHabiencia;
@JsonProperty("pLaboral_A")
private Integer pLaboralA;
@JsonProperty("pLaboral_B")
private Integer pLaboralB;
@JsonProperty("pLaboral_C")
private Integer pLaboralC;
@JsonProperty("pLaboral_D")
private Integer pLaboralD;
@JsonProperty("pLaboral_E")
private Integer pLaboralE;
@JsonProperty("pLaboral_F")
private Integer pLaboralF;
@JsonProperty("pLaboral_G")
private Integer pLaboralG;
@JsonProperty("pLaboral_H")
private Integer pLaboralH;
@JsonProperty("pLaboral_I")
private Integer pLaboralI;
@JsonProperty("Cat_ESNDocIdentidad")
private CatESNDocIdentidad catESNDocIdentidad;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("C_Nombre")
public String getCNombre() {
return cNombre;
}

@JsonProperty("C_Nombre")
public void setCNombre(String cNombre) {
this.cNombre = cNombre;
}

@JsonProperty("C_ApellidoPaterno")
public String getCApellidoPaterno() {
return cApellidoPaterno;
}

@JsonProperty("C_ApellidoPaterno")
public void setCApellidoPaterno(String cApellidoPaterno) {
this.cApellidoPaterno = cApellidoPaterno;
}

@JsonProperty("C_ApellidoMaterno")
public String getCApellidoMaterno() {
return cApellidoMaterno;
}

@JsonProperty("C_ApellidoMaterno")
public void setCApellidoMaterno(String cApellidoMaterno) {
this.cApellidoMaterno = cApellidoMaterno;
}

@JsonProperty("Cat_ESNSexo")
public CatESNSexo getCatESNSexo() {
return catESNSexo;
}

@JsonProperty("Cat_ESNSexo")
public void setCatESNSexo(CatESNSexo catESNSexo) {
this.catESNSexo = catESNSexo;
}

@JsonProperty("dtFechaNacimiento")
public String getDtFechaNacimiento() {
return dtFechaNacimiento;
}

@JsonProperty("dtFechaNacimiento")
public void setDtFechaNacimiento(String dtFechaNacimiento) {
this.dtFechaNacimiento = dtFechaNacimiento;
}

@JsonProperty("CatDirEstado")
public CatDirEstado getCatDirEstado() {
return catDirEstado;
}

@JsonProperty("CatDirEstado")
public void setCatDirEstado(CatDirEstado catDirEstado) {
this.catDirEstado = catDirEstado;
}

@JsonProperty("DocIdentidad")
public String getDocIdentidad() {
return docIdentidad;
}

@JsonProperty("DocIdentidad")
public void setDocIdentidad(String docIdentidad) {
this.docIdentidad = docIdentidad;
}

@JsonProperty("strEmisorCI")
public String getStrEmisorCI() {
return strEmisorCI;
}

@JsonProperty("strEmisorCI")
public void setStrEmisorCI(String strEmisorCI) {
this.strEmisorCI = strEmisorCI;
}

@JsonProperty("Cat_ESNEstadoCivil")
public CatESNEstadoCivil getCatESNEstadoCivil() {
return catESNEstadoCivil;
}

@JsonProperty("Cat_ESNEstadoCivil")
public void setCatESNEstadoCivil(CatESNEstadoCivil catESNEstadoCivil) {
this.catESNEstadoCivil = catESNEstadoCivil;
}

@JsonProperty("Cat_ESNParentesco")
public CatESNParentesco getCatESNParentesco() {
return catESNParentesco;
}

@JsonProperty("Cat_ESNParentesco")
public void setCatESNParentesco(CatESNParentesco catESNParentesco) {
this.catESNParentesco = catESNParentesco;
}

@JsonProperty("Cat_ESNEscolaridad")
public CatESNEscolaridad getCatESNEscolaridad() {
return catESNEscolaridad;
}

@JsonProperty("Cat_ESNEscolaridad")
public void setCatESNEscolaridad(CatESNEscolaridad catESNEscolaridad) {
this.catESNEscolaridad = catESNEscolaridad;
}

@JsonProperty("Grado_Escolar")
public Integer getGradoEscolar() {
return gradoEscolar;
}

@JsonProperty("Grado_Escolar")
public void setGradoEscolar(Integer gradoEscolar) {
this.gradoEscolar = gradoEscolar;
}

@JsonProperty("Cat_PGralEtniaIndigena")
public CatPGralEtniaIndigena getCatPGralEtniaIndigena() {
return catPGralEtniaIndigena;
}

@JsonProperty("Cat_PGralEtniaIndigena")
public void setCatPGralEtniaIndigena(CatPGralEtniaIndigena catPGralEtniaIndigena) {
this.catPGralEtniaIndigena = catPGralEtniaIndigena;
}

@JsonProperty("Cat_ESNCapacidadDiferente")
public CatESNCapacidadDiferente getCatESNCapacidadDiferente() {
return catESNCapacidadDiferente;
}

@JsonProperty("Cat_ESNCapacidadDiferente")
public void setCatESNCapacidadDiferente(CatESNCapacidadDiferente catESNCapacidadDiferente) {
this.catESNCapacidadDiferente = catESNCapacidadDiferente;
}

@JsonProperty("Cat_ESNCondicionSalud")
public CatESNCondicionSalud getCatESNCondicionSalud() {
return catESNCondicionSalud;
}

@JsonProperty("Cat_ESNCondicionSalud")
public void setCatESNCondicionSalud(CatESNCondicionSalud catESNCondicionSalud) {
this.catESNCondicionSalud = catESNCondicionSalud;
}

@JsonProperty("Cat_ESNAdiccion")
public CatESNAdiccion getCatESNAdiccion() {
return catESNAdiccion;
}

@JsonProperty("Cat_ESNAdiccion")
public void setCatESNAdiccion(CatESNAdiccion catESNAdiccion) {
this.catESNAdiccion = catESNAdiccion;
}

@JsonProperty("Peso")
public Integer getPeso() {
return peso;
}

@JsonProperty("Peso")
public void setPeso(Integer peso) {
this.peso = peso;
}

@JsonProperty("Talla")
public Integer getTalla() {
return talla;
}

@JsonProperty("Talla")
public void setTalla(Integer talla) {
this.talla = talla;
}

@JsonProperty("IMC")
public Integer getIMC() {
return iMC;
}

@JsonProperty("IMC")
public void setIMC(Integer iMC) {
this.iMC = iMC;
}

@JsonProperty("AsisteEscuela")
public Integer getAsisteEscuela() {
return asisteEscuela;
}

@JsonProperty("AsisteEscuela")
public void setAsisteEscuela(Integer asisteEscuela) {
this.asisteEscuela = asisteEscuela;
}

@JsonProperty("Cat_ESNOcupacion")
public CatESNOcupacion getCatESNOcupacion() {
return catESNOcupacion;
}

@JsonProperty("Cat_ESNOcupacion")
public void setCatESNOcupacion(CatESNOcupacion catESNOcupacion) {
this.catESNOcupacion = catESNOcupacion;
}

@JsonProperty("Cat_ESNTipoEmpleo")
public CatESNTipoEmpleo getCatESNTipoEmpleo() {
return catESNTipoEmpleo;
}

@JsonProperty("Cat_ESNTipoEmpleo")
public void setCatESNTipoEmpleo(CatESNTipoEmpleo catESNTipoEmpleo) {
this.catESNTipoEmpleo = catESNTipoEmpleo;
}

@JsonProperty("JubiladoPensionado")
public Integer getJubiladoPensionado() {
return jubiladoPensionado;
}

@JsonProperty("JubiladoPensionado")
public void setJubiladoPensionado(Integer jubiladoPensionado) {
this.jubiladoPensionado = jubiladoPensionado;
}

@JsonProperty("Cat_ESNDerechoHabiencia")
public CatESNDerechoHabiencia getCatESNDerechoHabiencia() {
return catESNDerechoHabiencia;
}

@JsonProperty("Cat_ESNDerechoHabiencia")
public void setCatESNDerechoHabiencia(CatESNDerechoHabiencia catESNDerechoHabiencia) {
this.catESNDerechoHabiencia = catESNDerechoHabiencia;
}

@JsonProperty("Cat_ESNMotivoDerechoHabiencia")
public CatESNMotivoDerechoHabiencia getCatESNMotivoDerechoHabiencia() {
return catESNMotivoDerechoHabiencia;
}

@JsonProperty("Cat_ESNMotivoDerechoHabiencia")
public void setCatESNMotivoDerechoHabiencia(CatESNMotivoDerechoHabiencia catESNMotivoDerechoHabiencia) {
this.catESNMotivoDerechoHabiencia = catESNMotivoDerechoHabiencia;
}

@JsonProperty("pLaboral_A")
public Integer getPLaboralA() {
return pLaboralA;
}

@JsonProperty("pLaboral_A")
public void setPLaboralA(Integer pLaboralA) {
this.pLaboralA = pLaboralA;
}

@JsonProperty("pLaboral_B")
public Integer getPLaboralB() {
return pLaboralB;
}

@JsonProperty("pLaboral_B")
public void setPLaboralB(Integer pLaboralB) {
this.pLaboralB = pLaboralB;
}

@JsonProperty("pLaboral_C")
public Integer getPLaboralC() {
return pLaboralC;
}

@JsonProperty("pLaboral_C")
public void setPLaboralC(Integer pLaboralC) {
this.pLaboralC = pLaboralC;
}

@JsonProperty("pLaboral_D")
public Integer getPLaboralD() {
return pLaboralD;
}

@JsonProperty("pLaboral_D")
public void setPLaboralD(Integer pLaboralD) {
this.pLaboralD = pLaboralD;
}

@JsonProperty("pLaboral_E")
public Integer getPLaboralE() {
return pLaboralE;
}

@JsonProperty("pLaboral_E")
public void setPLaboralE(Integer pLaboralE) {
this.pLaboralE = pLaboralE;
}

@JsonProperty("pLaboral_F")
public Integer getPLaboralF() {
return pLaboralF;
}

@JsonProperty("pLaboral_F")
public void setPLaboralF(Integer pLaboralF) {
this.pLaboralF = pLaboralF;
}

@JsonProperty("pLaboral_G")
public Integer getPLaboralG() {
return pLaboralG;
}

@JsonProperty("pLaboral_G")
public void setPLaboralG(Integer pLaboralG) {
this.pLaboralG = pLaboralG;
}

@JsonProperty("pLaboral_H")
public Integer getPLaboralH() {
return pLaboralH;
}

@JsonProperty("pLaboral_H")
public void setPLaboralH(Integer pLaboralH) {
this.pLaboralH = pLaboralH;
}

@JsonProperty("pLaboral_I")
public Integer getPLaboralI() {
return pLaboralI;
}

@JsonProperty("pLaboral_I")
public void setPLaboralI(Integer pLaboralI) {
this.pLaboralI = pLaboralI;
}

@JsonProperty("Cat_ESNDocIdentidad")
public CatESNDocIdentidad getCatESNDocIdentidad() {
return catESNDocIdentidad;
}

@JsonProperty("Cat_ESNDocIdentidad")
public void setCatESNDocIdentidad(CatESNDocIdentidad catESNDocIdentidad) {
this.catESNDocIdentidad = catESNDocIdentidad;
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