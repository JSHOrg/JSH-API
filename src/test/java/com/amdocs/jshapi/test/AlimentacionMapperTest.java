package com.amdocs.jshapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.amdocs.jshapi.estudios.Alimentacion;
import com.amdocs.jshapi.mappers.AlimentacionMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AlimentacionMapperTest {

	@Test
	public void Serialize_String_Alimentacion () throws JsonProcessingException
	{
		Alimentacion alimentacion = new Alimentacion();
		alimentacion.setTipo("Cuota");
		alimentacion.setEstatus("Rechazado");
		alimentacion.setFrecuencia("Semanal");
		alimentacion.setAlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer(true);
		alimentacion.setAlgunaVezAlgunMenorDe18AnosEnSuHogarDejoDeDesayunarComerOCenar(true);
		
		
		ObjectMapper objectmapper = new ObjectMapper();
		String requestString = objectmapper.writeValueAsString(alimentacion);
		System.out.println(requestString);
	}
	@Test
	public void Deserialize_String_Alimentacion ()
	{
		String input = "  {\r\n" + 
				"      \"Tipo\": \"Cuota \",\r\n" + 
				"      \"Estatus\": \"Rechazado \",\r\n" + 
				"      \"Frecuencia\": \"Semanal \",\r\n" + 
				"      \"¿Alguna vez se quedaron sin comida?\": false,\r\n" + 
				"      \"¿Alguna vez un menor de 18 años se durmió con hambre?\": false,\r\n" + 
				"      \"¿Alguna vez usted o algún adulto en su hogar sintió hambre pero no comió?\": false,\r\n" + 
				"      \"¿Alguna vez algún menor de 18 años en su hogar sintió hambre pero no comió?\": false,\r\n" + 
				"      \"¿Alguna vez usted o algún adulto en su hogar dejó de desayunar, comer o cenar?\": false,\r\n" + 
				"      \"¿Alguna vez algún menor de 18 años en su hogar dejó de desayunar, comer o cenar?\": false,\r\n" + 
				"      \"¿Alguna vez usted o algún adulto en su hogar comió menos de lo que piensa debería comer?\": false,\r\n" + 
				"      \"¿Alguna vez algún menor de 18 años en su hogar comió menos de lo que piensa debería comer?\": false,\r\n" + 
				"      \"¿Alguna vez  algún menor de 18 años en su hogar tuvo una alimentación basada en poca variedad?\": false,\r\n" + 
				"      \"¿Alguna vez usted o algún adulto en su hogar tuvo una alimentación basada en poca variedad de alimentos?\": false,\r\n" + 
				"      \"¿Alguna vez en su hogar tuvieron que disminuir la cantidad servida en la comida a algún menor de 18 años?\": false,\r\n" + 
				"      \"¿Alguna vez usted o algún adulto en su hogar sólo comió una vez al día o dejó de comer durante un día?\": false,\r\n" + 
				"      \"¿Alguna vez algún menor de 18 años en su hogar sólo comió una vez al día o dejó de comer durante un día?\": false\r\n" + 
				"    }";
		
		AlimentacionMapper mapper = new AlimentacionMapper();
		Alimentacion alimentacionObject = mapper.Deserialize(input);
		System.out.println(alimentacionObject.getAlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer());
		assertEquals( false, alimentacionObject.getAlgunaVezAlgunMenorDe18AnosEnSuHogarComioMenosDeLoQuePiensaDeberiaComer());
	}
}
