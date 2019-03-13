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
"Tipo",
"Estatus",
"Frecuencia",
"Alguna vez se quedaron sin comida?",
"Alguna vez un menor de 18 anos se durmio con hambre?",
"Alguna vez usted o algun adulto en su hogar sintio hambre pero no comio?",
"Alguna vez algun menor de 18 anos en su hogar sintio hambre pero no comio?",
"Alguna vez usted o algun adulto en su hogar dejo de desayunar, comer o cenar?",
"Alguna vez algun menor de 18 anos en su hogar dejo de desayunar, comer o cenar?",
"Alguna vez usted o algun adulto en su hogar comio menos de lo que piensa deberia comer?",
"Alguna vez algun menor de 18 anos en su hogar comio menos de lo que piensa deberia comer?",
"Alguna vez algun menor de 18 anos en su hogar tuvo una alimentacion basada en poca variedad?",
"Alguna vez usted o algun adulto en su hogar tuvo una alimentacion basada en poca variedad de alimentos?",
"Alguna vez en su hogar tuvieron que disminuir la cantidad servida en la comida a algun menor de 18 anos?",
"Alguna vez usted o algun adulto en su hogar solo comio una vez al dia o dejo de comer durante un dia?",
"Alguna vez algun menor de 18 anos en su hogar solo comio una vez al dia o dejo de comer durante un dia?"
})
public class Alimentacion {

@JsonProperty("Tipo")
private String tipo;
@JsonProperty("Estatus")
private String estatus;
@JsonProperty("Frecuencia")
private String frecuencia;
@JsonProperty("Alguna vez se quedaron sin comida?")
private Boolean algunaVezSeQuedaronSinComida;
@JsonProperty("Alguna vez un menor de 18 anos se durmio con hambre?")
private Boolean algunaVezUnMenorDe18AnosSeDurmioConHambre;
@JsonProperty("Alguna vez usted o algun adulto en su hogar sintio hambre pero no comio?")
private Boolean algunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio;
@JsonProperty("Alguna vez algun menor de 18 anos en su hogar sintio hambre pero no comio?")
private Boolean algunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio;
@JsonProperty("Alguna vez usted o algun adulto en su hogar dejo de desayunar, comer o cenar?")
private Boolean algunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar;
@JsonProperty("Alguna vez algun menor de 18 anos en su hogar dejo de desayunar, comer o cenar?")
private Boolean algunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar;
@JsonProperty("Alguna vez usted o algun adulto en su hogar comio menos de lo que piensa deberia comer?")
private Boolean algunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer;
@JsonProperty("Alguna vez algun menor de 18 anos en su hogar comio menos de lo que piensa deberia comer?")
private Boolean algunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer;
@JsonProperty("Alguna vez algun menor de 18 anos en su hogar tuvo una alimentacion basada en poca variedad?")
private Boolean algunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad;
@JsonProperty("Alguna vez usted o algun adulto en su hogar tuvo una alimentacion basada en poca variedad de alimentos?")
private Boolean algunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos;
@JsonProperty("Alguna vez en su hogar tuvieron que disminuir la cantidad servida en la comida a algun menor de 18 anos?")
private Boolean algunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos;
@JsonProperty("Alguna vez usted o algun adulto en su hogar solo comio una vez al dia o dejo de comer durante un dia?")
private Boolean algunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia;
@JsonProperty("Alguna vez algun menor de 18 anos en su hogar solo comio una vez al dia o dejo de comer durante un dia?")
private Boolean algunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Tipo")
public String getTipo() {
return tipo;
}

@JsonProperty("Tipo")
public void setTipo(String tipo) {
this.tipo = tipo;
}

@JsonProperty("Estatus")
public String getEstatus() {
return estatus;
}

@JsonProperty("Estatus")
public void setEstatus(String estatus) {
this.estatus = estatus;
}

@JsonProperty("Frecuencia")
public String getFrecuencia() {
return frecuencia;
}

@JsonProperty("Frecuencia")
public void setFrecuencia(String frecuencia) {
this.frecuencia = frecuencia;
}

@JsonProperty("Alguna vez se quedaron sin comida?")
public Boolean getAlgunaVezSeQuedaronSinComida() {
return algunaVezSeQuedaronSinComida;
}

@JsonProperty("Alguna vez se quedaron sin comida?")
public void setAlgunaVezSeQuedaronSinComida(Boolean algunaVezSeQuedaronSinComida) {
this.algunaVezSeQuedaronSinComida = algunaVezSeQuedaronSinComida;
}

@JsonProperty("Alguna vez un menor de 18 anos se durmio con hambre?")
public Boolean getAlgunaVezUnMenorDe18AnosSeDurmioConHambre() {
return algunaVezUnMenorDe18AnosSeDurmioConHambre;
}

@JsonProperty("Alguna vez un menor de 18 anos se durmio con hambre?")
public void setAlgunaVezUnMenorDe18AnosSeDurmioConHambre(Boolean algunaVezUnMenorDe18AnosSeDurmioConHambre) {
this.algunaVezUnMenorDe18AnosSeDurmioConHambre = algunaVezUnMenorDe18AnosSeDurmioConHambre;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar sintio hambre pero no comio?")
public Boolean getAlgunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio() {
return algunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar sintio hambre pero no comio?")
public void setAlgunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio(Boolean algunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio) {
this.algunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio = algunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar sintio hambre pero no comio?")
public Boolean getAlgunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio() {
return algunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar sintio hambre pero no comio?")
public void setAlgunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio(Boolean algunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio) {
this.algunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio = algunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar dejo de desayunar, comer o cenar?")
public Boolean getAlgunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar() {
return algunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar dejo de desayunar, comer o cenar?")
public void setAlgunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar(Boolean algunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar) {
this.algunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar = algunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar dejo de desayunar, comer o cenar?")
public Boolean getAlgunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar() {
return algunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar dejo de desayunar, comer o cenar?")
public void setAlgunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar(Boolean algunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar) {
this.algunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar = algunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar comio menos de lo que piensa deberia comer?")
public Boolean getAlgunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer() {
return algunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar comio menos de lo que piensa deberia comer?")
public void setAlgunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer(Boolean algunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer) {
this.algunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer = algunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar comio menos de lo que piensa deberia comer?")
public Boolean getAlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer() {
return algunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar comio menos de lo que piensa deberia comer?")
public void setAlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer(Boolean algunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer) {
this.algunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer = algunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar tuvo una alimentacion basada en poca variedad?")
public Boolean getAlgunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad() {
return algunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar tuvo una alimentacion basada en poca variedad?")
public void setAlgunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad(Boolean algunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad) {
this.algunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad = algunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar tuvo una alimentacion basada en poca variedad de alimentos?")
public Boolean getAlgunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos() {
return algunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar tuvo una alimentacion basada en poca variedad de alimentos?")
public void setAlgunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos(Boolean algunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos) {
this.algunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos = algunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos;
}

@JsonProperty("Alguna vez en su hogar tuvieron que disminuir la cantidad servida en la comida a algun menor de 18 anos?")
public Boolean getAlgunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos() {
return algunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos;
}

@JsonProperty("Alguna vez en su hogar tuvieron que disminuir la cantidad servida en la comida a algun menor de 18 anos?")
public void setAlgunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos(Boolean algunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos) {
this.algunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos = algunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar solo comio una vez al dia o dejo de comer durante un dia?")
public Boolean getAlgunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia() {
return algunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia;
}

@JsonProperty("Alguna vez usted o algun adulto en su hogar solo comio una vez al dia o dejo de comer durante un dia?")
public void setAlgunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia(Boolean algunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia) {
this.algunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia = algunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar solo comio una vez al dia o dejo de comer durante un dia?")
public Boolean getAlgunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia() {
return algunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia;
}

@JsonProperty("Alguna vez algun menor de 18 anos en su hogar solo comio una vez al dia o dejo de comer durante un dia?")
public void setAlgunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia(Boolean algunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia) {
this.algunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia = algunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia;
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