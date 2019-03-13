package com.amdocs.jshapi.test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

import com.amdocs.jshapi.estudios.Estudio;
import com.amdocs.jshapi.mappers.EstudioMapper;

public class EstudioMapperTest {

	@Test
	public void Deserialize_String_Estudio()
			throws Exception
	{
		
		String input = "{\r\n" + 
				"  \"_embedded\": {\r\n" + 
				"    \"Control\": {\r\n" + 
				"      \"¿A qué se dedican las personas de su familia en edad productiva?\": \"\",\r\n" + 
				"      \"¿Con qué conocimientos cuentan las personas de su familia económicamente activas?\": \"Algo relacionado a lo que hago actualmente. \",\r\n" + 
				"      \"Si pudiera especializarse en alguna actividad productiva ¿Qué le gustaría realizar?\": \"Construcción.\"\r\n" + 
				"    },\r\n" + 
				"    \"Servicios\": {\r\n" + 
				"      \"Luz\": \"Servicio público\",\r\n" + 
				"      \"Agua\": \"Toma domiciliaria\",\r\n" + 
				"      \"Drenaje\": \"Red pública\",\r\n" + 
				"      \"Escusado\": \"Descarga directa\",\r\n" + 
				"      \"Combustible\": \"Gas tanque\"\r\n" + 
				"    },\r\n" + 
				"    \"Alimentacion\": {\r\n" + 
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
				"    },\r\n" + 
				"    \"Representante \": {\r\n" + 
				"      \"Calle\": \"\",\r\n" + 
				"      \"Estado\": \"\",\r\n" + 
				"      \"Colonia\": \"\",\r\n" + 
				"      \"Comunidad\": \"\",\r\n" + 
				"      \"Municipio\": \"\",\r\n" + 
				"      \"Escolaridad\": \"PREESCOLAR O KINDER\",\r\n" + 
				"      \"Número exterior\": \"\",\r\n" + 
				"      \"Número interior\": \"\",\r\n" + 
				"      \"Nombre del titular\": \"\",\r\n" + 
				"      \"Estatus Escolaridad\": \"Completa\"\r\n" + 
				"    },\r\n" + 
				"    \"Datos generales\": {\r\n" + 
				"      \"Grupo\": \"\",\r\n" + 
				"      \"Estado\": \"\",\r\n" + 
				"      \"Localidad\": \"\",\r\n" + 
				"      \"Municipio\": \"\",\r\n" + 
				"      \"Código postal\": \"\",\r\n" + 
				"      \"Clave de estado\": \"\",\r\n" + 
				"      \"Entre vialidades\": \"\",\r\n" + 
				"      \"Fecha de captura\": \"\",\r\n" + 
				"      \"Número exterior\": \"\",\r\n" + 
				"      \"Número interior\": \"\",\r\n" + 
				"      \"Tipo de vialidad\": \"AMPLIACIÓN\",\r\n" + 
				"      \"Clave de municipio\": \"\",\r\n" + 
				"      \"Nombre de vialidad\": \"\",\r\n" + 
				"      \"Teléfono / celular\": \"\",\r\n" + 
				"      \"Tipo de asentamiento\": \"AEROPUERTO\",\r\n" + 
				"      \"Fecha de levantamiento\": \"\",\r\n" + 
				"      \"Nombre de asentamiento\": \"\",\r\n" + 
				"      \" Descripción de ubicación \": \"\",\r\n" + 
				"      \"Nombre de la comunidad o programa\": \"\"\r\n" + 
				"    },\r\n" + 
				"    \"Estructura familiar\": {\r\n" + 
				"      \"Integrantes\": [\r\n" + 
				"        {\r\n" + 
				"          \"CURP\": \"\",\r\n" + 
				"          \"Sexo\": \"Hombre\",\r\n" + 
				"          \"Grado\": \"PREESCOLAR O KINDER\",\r\n" + 
				"          \"Nivel\": \"TERMINADO O PASANTE\",\r\n" + 
				"          \"Nombre(s)\": \"\",\r\n" + 
				"          \"Parentesco\": \"MADRE\",\r\n" + 
				"          \"Estado civil\": \"SOLTERO(A)\",\r\n" + 
				"          \"Primer apellido\": \"\",\r\n" + 
				"          \"Segundo apellido\": \"\",\r\n" + 
				"          \"Fecha de nacimiento\": \"\",\r\n" + 
				"          \"Entidad de nacimiento\": \"\",\r\n" + 
				"          \"Asiste a la escuela…\": \"\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    \"Condiciones económicas\": {\r\n" + 
				"      \"Gas\": \"\",\r\n" + 
				"      \"Luz\": \"\",\r\n" + 
				"      \"Agua\": \"\",\r\n" + 
				"      \"Becas\": \"\",\r\n" + 
				"      \"Hijos\": \"\",\r\n" + 
				"      \"Madre\": \"\",\r\n" + 
				"      \"Padre\": \"\",\r\n" + 
				"      \"Celular\": \"\",\r\n" + 
				"      \"PROSPERA\": \"\",\r\n" + 
				"      \"Pensión\": \"\",\r\n" + 
				"      \"Vivienda\": \"\",\r\n" + 
				"      \"Teléfono\": \"\",\r\n" + 
				"      \"Educación\": \"\",\r\n" + 
				"      \"Transporte\": \"\",\r\n" + 
				"      \"Alimentación\": \"\",\r\n" + 
				"      \"Tipo de apoyo\": \"\",\r\n" + 
				"      \"Adultos mayores \": \"\",\r\n" + 
				"      \"Atención médica\": \"\",\r\n" + 
				"      \"Frecuencia del apoyo\": false,\r\n" + 
				"      \"Quien lo proporciona\": \"\",\r\n" + 
				"      \"Aportación semanal Otros\": \"\",\r\n" + 
				"      \"Aportación semanal TOTAL\": \"\",\r\n" + 
				"      \"Condiciones económicas Otros\": \"\",\r\n" + 
				"      \"Condiciones económicas TOTAL\": \"\",\r\n" + 
				"      \"¿Alguien en el hogar recibe dinero proveniente de otros países?\": \"\"\r\n" + 
				"    },\r\n" + 
				"    \"Infraestructura de vivienda\": {\r\n" + 
				"      \"Cama\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Sala\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Horno\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Radio\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Estufa\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Celular\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Comedor\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Lavadora\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Tenencia\": \"Propia\",\r\n" + 
				"      \"Licuadora\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Teléfono\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Automóvil\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Computadora\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Condiciones\": \"Buena\",\r\n" + 
				"      \"Motocicleta\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Refrigerador\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Tipo de casa\": \"Independiente\",\r\n" + 
				"      \"No. de cuartos \": \"1\",\r\n" + 
				"      \"Baño / escusado\": \"Madera, duela\",\r\n" + 
				"      \"Características\": \"Cocina separada\",\r\n" + 
				"      \"VHS, DVD, Blu Ray\": [\r\n" + 
				"        {\r\n" + 
				"          \"Sirve\": false,\r\n" + 
				"          \"Tiene\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Cuartos para dormir \": \"1\",\r\n" + 
				"      \"Mayor parte de muros\": \"Lámina metálica, asbesto\",\r\n" + 
				"      \"Mayor parte de techo\": \"Cemento, losa o viguetas\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  \"beneficiarioId\": 80008\r\n" + 
				"}";
		EstudioMapper mapper = new EstudioMapper();
		Estudio estudio = mapper.Deserialize(input);
		assertEquals ( Integer.valueOf(80008) , estudio.getBeneficiarioId());
	}
}
