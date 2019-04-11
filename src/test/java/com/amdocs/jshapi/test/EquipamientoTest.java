package com.amdocs.jshapi.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.amdocs.jshapi.estudios.Estudio;
import com.amdocs.jshapi.estudios.InfraestructuraDeVivienda;
import com.amdocs.jshapi.estudios.Refrigerador;
import com.amdocs.jshapi.mappers.InfraestructuraDeViviendaMapper;

public class EquipamientoTest {

	@Test 
	public void Deserialize_Equipamiento ()
	{
		String input =
				" {\r\n" + 
				"      \"Tenencia\": \"Rentada\",\r\n" + 
				"      \"Tipo de casa\": \"Duplex\",\r\n" + 
				"      \"Mayor parte de muros\": \"Madera\",\r\n" + 
				"      \"Mayor parte de piso\": \"Mosaico, vinil\",\r\n" + 
				"      \"Mayor parte de techo\": \"Lamina de carton\",\r\n" + 
				"      \"Caracteristicas\": \"Cocina separada\",\r\n" + 
				"      \"Condiciones\": \"Regular\",\r\n" + 
				"      \"No. de cuartos \": \"1\",\r\n" + 
				"      \"Cuartos para dormir \": \"1\",\r\n" + 
				"      \"Refrigerador\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Estufa\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"VHS, DVD, Blu Ray\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Lavadora\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Licuadora\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Radio\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Sala\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Comedor\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Automovil\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Cama\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Celular\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": true,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Motocicleta\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": false,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Computadora\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": false,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Horno\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": false,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Telefono\": [\r\n" + 
				"        {\r\n" + 
				"          \"Tiene\": false,\r\n" + 
				"          \"Sirve\": false\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    }";
		
		InfraestructuraDeViviendaMapper mapper= new InfraestructuraDeViviendaMapper();
		
		InfraestructuraDeVivienda infraestructura = mapper.Deserialize(input);
		assertEquals(infraestructura.getCelular().size(), 1);
		
		Refrigerador item = infraestructura.getRefrigerador().iterator().next();
		System.out.println(item.getSirve());
		System.out.println(item.getTiene());
	}
}
