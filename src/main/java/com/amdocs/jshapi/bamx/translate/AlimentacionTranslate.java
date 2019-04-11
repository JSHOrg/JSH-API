package com.amdocs.jshapi.bamx.translate;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.jshapi.bamx.CatESNPreguntaAlimentacion;
import com.amdocs.jshapi.bamx.ESNAlimentacionRespuesta;
import com.amdocs.jshapi.estudios.Alimentacion;
import com.amdocs.jshapi.estudios.Pregunta;

public class AlimentacionTranslate {
	
	final static String AlgunaVezSeQuedaronSinComida 
	    = "¿Alguna vez se quedaron sin comida?";
	
	final static String AlgunaVezUnMenorDe18AnosSeDurmioConHambre 
		= "¿Alguna vez un menor de 18 años se durmió con hambre?";
	
	final static String AlgunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio 
	   	= "¿Alguna vez usted o algún adulto en su hogar sintió hambre pero no comió?";
	
	final static String AlgunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio
	  =  "¿Alguna vez algún menor de 18 años en su hogar sintió hambre pero no comió?";
	
	final static String AlgunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar
		= "¿Alguna vez usted o algún adulto en su hogar dejó de desayunar, comer o cenar?";
	
	final static String AlgunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar
	  = "¿Alguna vez algún menor de 18 años en su hogar dejó de desayunar, comer o cenar?";
	
	final static String AlgunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer 
	 =  "¿Alguna vez usted o algún adulto en su hogar comió menos de lo que piensa debería comer?";
	
	final static String AlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer 
		= "¿Alguna vez usted o algún adulto en su hogar comió menos de lo que piensa debería comer?";
	
	final static String AlgunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad
		= "¿Alguna vez  algún menor de 18 años en su hogar tuvo una alimentación basada en poca variedad?";
	
	final static String AlgunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos
		= "¿Alguna vez usted o algún adulto en su hogar tuvo una alimentación basada en poca variedad de alimentos?";
	
	final static String AlgunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos
		= "¿Alguna vez en su hogar tuvieron que disminuir la cantidad servida en la comida a algún menor de 18 años?";
	
	final static String AlgunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia
		= "¿Alguna vez usted o algún adulto en su hogar sólo comió una vez al día o dejó de comer durante un día?";
	
	final static String AlgunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia
		= "¿Alguna vez algún menor de 18 años en su hogar sólo comió una vez al día o dejó de comer durante un día?";
	
	
	public static List<ESNAlimentacionRespuesta> translateAlimentacion (Alimentacion alimentacion)
	{
		List<ESNAlimentacionRespuesta> listaPreguntas = new ArrayList<ESNAlimentacionRespuesta>();
		
		for(Pregunta item : alimentacion.getPreguntas())
		{
			listaPreguntas.add(translateAlimentacionRespuesta(item.getPregunta(), item.getRespuesta()));
		}
		return listaPreguntas;
		
	}
	
	
	public static ESNAlimentacionRespuesta translateAlimentacionRespuesta (String pregunta, Boolean respuesta)
	{
		ESNAlimentacionRespuesta esnAlimentacionRespuesta = new ESNAlimentacionRespuesta ();
		esnAlimentacionRespuesta.setCatESNPreguntaAlimentacion(translatePreguntaAlimentacion(pregunta));
		esnAlimentacionRespuesta.setIRespuesta(respuesta?1:0);
		return esnAlimentacionRespuesta;
	}
	
	public static CatESNPreguntaAlimentacion translatePreguntaAlimentacion(String pregunta)
	{
		CatESNPreguntaAlimentacion catEsnPreguntaAlimentacion = new CatESNPreguntaAlimentacion();
		catEsnPreguntaAlimentacion.setCValor(pregunta);
		return catEsnPreguntaAlimentacion;
	}
}
