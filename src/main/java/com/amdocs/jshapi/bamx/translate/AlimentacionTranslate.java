package com.amdocs.jshapi.bamx.translate;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.jshapi.bamx.CatESNPreguntaAlimentacion;
import com.amdocs.jshapi.bamx.ESNAlimentacionRespuesta;
import com.amdocs.jshapi.estudios.Alimentacion;
import com.amdocs.jshapi.estudios.Pregunta;

public class AlimentacionTranslate {
	
	
	
	public static List<ESNAlimentacionRespuesta> translateAlimentacion (Alimentacion alimentacion, int no_menor18)
	{
		System.out.println("ultima verificacion 18");
		System.out.println(no_menor18);
		List<ESNAlimentacionRespuesta> listaPreguntas = new ArrayList<ESNAlimentacionRespuesta>();
		
		for(Pregunta item : alimentacion.getPreguntas())
		{
			if( no_menor18 == 1)
					listaPreguntas.add(translateAlimentacionRespuesta(item.getPregunta(), item.getRespuesta()));
			else 
				 if( !item.getPregunta().contains("18"))
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
