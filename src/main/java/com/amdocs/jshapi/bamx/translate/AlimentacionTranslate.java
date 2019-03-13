package com.amdocs.jshapi.bamx.translate;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.jshapi.bamx.CatESNPreguntaAlimentacion;
import com.amdocs.jshapi.bamx.ESNAlimentacionRespuesta;
import com.amdocs.jshapi.estudios.Alimentacion;

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
		
		listaPreguntas.add(translateAlimentacionRespuesta
				(AlgunaVezSeQuedaronSinComida
						, 
						alimentacion.getAlgunaVezSeQuedaronSinComida()));
		
		listaPreguntas.add( translateAlimentacionRespuesta
				( AlgunaVezUnMenorDe18AnosSeDurmioConHambre
						, 
						alimentacion.getAlgunaVezUnMenorDe18AnosSeDurmioConHambre()));
		
		listaPreguntas.add( translateAlimentacionRespuesta
				( AlgunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio
						, 
						alimentacion.getAlgunaVezUstedOAlgunAdultoEnSuHogarSintioHambrePeroNoComio()));
		
		listaPreguntas.add(translateAlimentacionRespuesta
				( AlgunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio
					 , 
					 alimentacion.getAlgunaVezAlgunMenorDe18AnosEnSuHogarSintioHambrePeroNoComio()
				));
		listaPreguntas.add(translateAlimentacionRespuesta
				(AlgunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar,
						alimentacion.getAlgunaVezUstedOAlgunAdultoEnSuHogarDejoDeDesayunarComerOCenar()
				));
				
		listaPreguntas.add(translateAlimentacionRespuesta
				(AlgunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar
						, 
						alimentacion.getAlgunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar()
						));
		
		listaPreguntas.add(translateAlimentacionRespuesta
				( AlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer
					 , 
						alimentacion.getAlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer()
				));
		  
		listaPreguntas.add(translateAlimentacionRespuesta
				(  AlgunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer
					 , 
					 alimentacion.getAlgunaVezUstedOAlgunAdultoEnSuHogarComioMenosDeLoQuePiensaDeberiaComer()
				));
		  
		listaPreguntas.add(translateAlimentacionRespuesta
				(  
						AlgunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad
					 , 
					 alimentacion.getAlgunaVezAlgunMenorDe18AnosEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedad()
				));
		
		listaPreguntas.add(translateAlimentacionRespuesta
				(  
						AlgunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos
					 , 
					 alimentacion.getAlgunaVezUstedOAlgunAdultoEnSuHogarTuvoUnaAlimentacionBasadaEnPocaVariedadDeAlimentos()
				));
		
		listaPreguntas.add(translateAlimentacionRespuesta
				(  
						AlgunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos
					 , 
					 alimentacion.getAlgunaVezEnSuHogarTuvieronQueDisminuirLaCantidadServidaEnLaComidaAAlgunMenorDe18Anos()
				));
		
		listaPreguntas.add(translateAlimentacionRespuesta
				(  
						AlgunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia
					 , 
					 alimentacion.getAlgunaVezUstedOAlgunAdultoEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia()
				));
		
		listaPreguntas.add(translateAlimentacionRespuesta
				(  
						AlgunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia
					 , 
					 alimentacion.getAlgunaVezAlgunMenorDe18AnosEnSuHogarSoloComioUnaVezAlDiaODejoDeComerDuranteUnDia()
				));
		
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
