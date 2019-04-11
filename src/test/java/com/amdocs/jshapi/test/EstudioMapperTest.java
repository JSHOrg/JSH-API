package com.amdocs.jshapi.test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.amdocs.jshapi.estudios.Estudio;
import com.amdocs.jshapi.mappers.EstudioMapper;

public class EstudioMapperTest {

	@Ignore @Test
	public void Deserialize_String_Estudio()
			throws Exception
	{
		
		String input =  "{\r\n" + 
				"  \"beneficiarioId\": 100010,\r\n" + 
				"  \"_embedded\": {\r\n" + 
				"    \"Representante \": {\r\n" + 
				"      \"Comunidad\": \"Comunidad\",\r\n" + 
				"      \"Nombre del titular\": \"Nombre Tit\",\r\n" + 
				"      \"Calle\": \"Calle\",\r\n" + 
				"      \"Colonia\": \"Colonia\",\r\n" + 
				"      \"Municipio\": \"Municipio\",\r\n" + 
				"      \"Numero exterior\": \"0000\",\r\n" + 
				"      \"Numero interior\": \"0000\",\r\n" + 
				"      \"Estado\": \"Estado\",\r\n" + 
				"      \"Escolaridad\": \"Analfabeto\",\r\n" + 
				"      \"Estatus Escolaridad\": \"Completa\"\r\n" + 
				"    },\r\n" + 
				"    \"Datos generales\": {\r\n" + 
				"      \"Nombre de la comunidad o programa\": \"Comunidad\",\r\n" + 
				"      \"Grupo\": \"1\",\r\n" + 
				"      \"Fecha de levantamiento\": \"9 / 4 / 2019\",\r\n" + 
				"      \"Fecha de captura\": \"9 / 4 / 2019\",\r\n" + 
				"      \"Tipo de vialidad\": \"Andador\",\r\n" + 
				"      \"Nombre de vialidad\": \"vialidad\",\r\n" + 
				"      \"Numero exterior\": \"0000\",\r\n" + 
				"      \"Numero interior\": \"0000\",\r\n" + 
				"      \"Tipo de asentamiento\": \"Ampliacion\",\r\n" + 
				"      \"Nombre de asentamiento\": \"asentamiento\",\r\n" + 
				"      \"Codigo postal\": \"00000\",\r\n" + 
				"      \"Localidad\": \"localidad\",\r\n" + 
				"      \"Municipio\": \"Municipio\",\r\n" + 
				"      \"Clave de municipio\": \"123\",\r\n" + 
				"      \"Estado\": \"Estado\",\r\n" + 
				"      \"Clave de estado\": \"123\",\r\n" + 
				"      \"Entre vialidades\": \"Vialidades\",\r\n" + 
				"      \" Descripcion de ubicacion \": \"\",\r\n" + 
				"      \"Telefono / celular\": \"\"\r\n" + 
				"    },\r\n" + 
				"    \"Estructura familiar\": {\r\n" + 
				"      \"Integrantes\": [\r\n" + 
				"        {\r\n" + 
				"          \"Nombre(s)\": \"Nombres\",\r\n" + 
				"          \"Primer apellido\": \"Apellido Pat\",\r\n" + 
				"          \"Segundo apellido\": \"Apellido Mat\",\r\n" + 
				"          \"Fecha de nacimiento\": \"9 / 4 / 2019\",\r\n" + 
				"          \"Sexo\": \"Hombre\",\r\n" + 
				"          \"Entidad de nacimiento\": \"Entidad\",\r\n" + 
				"          \"CURP\": \"CURPCURP\",\r\n" + 
				"          \"Estado civil\": \"Casado(a)\",\r\n" + 
				"          \"Parentesco\": \"MADRE\",\r\n" + 
				"          \"Grado\": \"Analfabeto\",\r\n" + 
				"          \"Nivel\": \"TERMINADO O PASANTE\",\r\n" + 
				"          \"Asiste a la escuela…\": \"Asiste\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"Nombre(s)\": \"Nombres\",\r\n" + 
				"          \"Ocupacion\": \"Albanil\",\r\n" + 
				"          \"Tipo de empleo\": \"Asalariado\",\r\n" + 
				"          \"Derechohabiencia\": \"Derecho\",\r\n" + 
				"          \"Motivo derechohabiencia\": \"Motivo\",\r\n" + 
				"          \"Capacidades diferentes\": \"Capacidades\",\r\n" + 
				"          \"Condiciones de salud\": \"Condiciones\",\r\n" + 
				"          \"Adicciones\": \"Addicciones\",\r\n" + 
				"          \"Etnia indigena \": \"no\",\r\n" + 
				"          \"Peso\": \"100\",\r\n" + 
				"          \"Talla\": \"190\",\r\n" + 
				"          \"Jubilacion o pensionado\": \"Si\",\r\n" + 
				"          \"Prestaciones\": [\r\n" + 
				"            \"Seguridad Social\",\r\n" + 
				"            \"Vacaciones\",\r\n" + 
				"            \"Prima Vacacional\"\r\n" + 
				"          ]\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    \"Servicios\": {\r\n" + 
				"      \"Luz\": \"Sin contrato\",\r\n" + 
				"      \"Drenaje\": \"Fosa septica\",\r\n" + 
				"      \"Escusado\": \"Agua con cubeta\",\r\n" + 
				"      \"Combustible\": \"Lena, carbon\",\r\n" + 
				"      \"Agua\": \"Toma comun o fuera de vivienda\"\r\n" + 
				"    },\r\n" + 
				"    \"Infraestructura de vivienda\": {\r\n" + 
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
				"    },\r\n" + 
				"    \"Condiciones economicas\": {\r\n" + 
				"      \"Vivienda\": \"0\",\r\n" + 
				"      \"Alimentacion\": \"0\",\r\n" + 
				"      \"Luz\": \"0\",\r\n" + 
				"      \"Gas\": \"0\",\r\n" + 
				"      \"Agua\": \"0\",\r\n" + 
				"      \"Telefono\": \"0\",\r\n" + 
				"      \"Celular\": \"0\",\r\n" + 
				"      \"Atencion medica\": \"0\",\r\n" + 
				"      \"Educacion\": \"0\",\r\n" + 
				"      \"Transporte\": \"0\",\r\n" + 
				"      \"Condiciones economicas Otros\": \"0\",\r\n" + 
				"      \"Condiciones economicas TOTAL\": \"0\",\r\n" + 
				"      \"Padre\": \"0\",\r\n" + 
				"      \"Madre\": \"0\",\r\n" + 
				"      \"Hijos\": \"0\",\r\n" + 
				"      \"PROSPERA\": \"0\",\r\n" + 
				"      \"Adultos mayores \": \"0\",\r\n" + 
				"      \"Becas\": \"0\",\r\n" + 
				"      \"Pension\": \"0\",\r\n" + 
				"      \"Aportacion semanal Otros\": \"0\",\r\n" + 
				"      \"Aportacion semanal TOTAL\": \"0\",\r\n" + 
				"      \"Tipo de apoyo\": \"123\",\r\n" + 
				"      \"Quien lo proporciona\": \"Prestacion en el trabajo\",\r\n" + 
				"      \"Frecuencia del apoyo\": true,\r\n" + 
				"      \"¿Alguien en el hogar recibe dinero proveniente de otros paises?\": \"Semanal\"\r\n" + 
				"    },\r\n" + 
				"   \"Alimentacion\": {\r\n" + 
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
				"    },\r\n" + 
				"    \"Control\": {\r\n" + 
				"      \"¿A que se dedican las personas de su familia en edad productiva?\": \"Dedicacion\",\r\n" + 
				"      \"Si pudiera especializarse en alguna actividad productiva ¿Que le gustaria realizar?\": \"Construccion.\",\r\n" + 
				"      \"¿Con que conocimientos cuentan las personas de su familia economicamente activas?\": \"Algo relacionado a lo que hago actualmente. \"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		EstudioMapper mapper = new EstudioMapper();
		Estudio estudio = mapper.Deserialize(input);
		assertEquals ( Integer.valueOf(100010) , estudio.getBeneficiarioId());
		assertEquals("Nombre Tit", estudio.getEmbedded().getRepresentante().getNombreDelTitular());
		assertEquals("0", estudio.getEmbedded().getCondicionesEconomicas().getAgua());
		assertEquals("0", estudio.getEmbedded().getDatosGenerales().getClaveDeEstado());
		
	}
}
