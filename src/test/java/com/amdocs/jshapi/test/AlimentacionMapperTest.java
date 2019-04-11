package com.amdocs.jshapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.amdocs.jshapi.estudios.Alimentacion;
import com.amdocs.jshapi.estudios.Pregunta;
import com.amdocs.jshapi.mappers.AlimentacionMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import antlr.collections.List;

public class AlimentacionMapperTest {

	@Test
	public void Serialize_String_Alimentacion () throws JsonProcessingException
	{
		Pregunta pregunta1 = new Pregunta();
		pregunta1.setPregunta("¿Alguna vez se quedaron sin comida?");
		pregunta1.setRespuesta(true);
		
		Pregunta pregunta2 = new Pregunta();
		pregunta2.setPregunta("¿Alguna vez se quedaron sin comida?");
		pregunta2.setRespuesta(true);
		
		ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
		preguntas.add(pregunta1);
		preguntas.add(pregunta2);
		
		Alimentacion alimentacion = new Alimentacion();
		alimentacion.setTipo("Cuota");
		alimentacion.setEstatus("Rechazado");
		alimentacion.setFrecuencia("Semanal");
		alimentacion.setPregunta(preguntas);
		 
		
		ObjectMapper objectmapper = new ObjectMapper();
		String requestString = objectmapper.writeValueAsString(alimentacion);
		System.out.println(requestString);
	}
	@Test
	public void Deserialize_String_Alimentacion ()
	{
		String input = "   {\r\n" + 
				"      \"Tipo\": \"Cuota\",\r\n" + 
				"      \"Estatus\": \"Rechazado\",\r\n" + 
				"      \"Frecuencia\": \"Semanal\",\r\n" + 
				"      \"Preguntas\": [\r\n" + 
				"        {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez usted o algun adulto en su hogar tuvo una alimentacion basada en poca variedad de alimentos?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez usted o algun adulto en su hogar comio menos de lo que piensa deberia comer?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"         {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez usted o algun adulto en su hogar dejo de desayunar, comer o cenar?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"         {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez se quedaron sin comida?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"         {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez usted o algun adulto en su hogar sintio hambre pero no comio?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"         {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez usted o algun adulto en su hogar solo comio una vez al dia o dejo de comer durante un dia?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez  algun menor de 18 anos en su hogar tuvo una alimentacion basada en poca variedad?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez algun menor de 18 anos en su hogar comio menos de lo que piensa deberia comer?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"         {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez algun menor de 18 anos en su hogar dejo de desayunar, comer o cenar?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"         {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez en su hogar tuvieron que disminuir la cantidad servida en la comida a algun menor de 18 anos?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"         {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez algun menor de 18 anos en su hogar sintio hambre pero no comio?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez un menor de 18 anos se durmio con hambre?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"Pregunta\": \"¿Alguna vez algun menor de 18 anos en su hogar solo comio una vez al dia o dejo de comer durante un dia?\",\r\n" + 
				"          \"Respuesta\": true\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"      ]\r\n" + 
				"    }";
		
		AlimentacionMapper mapper = new AlimentacionMapper();
		Alimentacion alimentacionObject = mapper.Deserialize(input);
		int preguntas = alimentacionObject.getPreguntas().size();
		assertEquals(13, preguntas);
		//System.out.println(alimentacionObject.getAlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer());
		//assertEquals( false, alimentacionObject.getAlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer());
	}
}
