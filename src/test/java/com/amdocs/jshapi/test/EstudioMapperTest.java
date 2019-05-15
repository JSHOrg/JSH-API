package com.amdocs.jshapi.test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.amdocs.jshapi.domain.Embalaje;
import com.amdocs.jshapi.estudios.Automovil;
import com.amdocs.jshapi.estudios.DatosGenerales;
import com.amdocs.jshapi.estudios.Embedded;
import com.amdocs.jshapi.estudios.EstructuraFamiliar;
import com.amdocs.jshapi.estudios.EstructuraFamiliarDetalles;
import com.amdocs.jshapi.estudios.Estudio;
import com.amdocs.jshapi.estudios.InfraestructuraDeVivienda;
import com.amdocs.jshapi.estudios.Integrante;
import com.amdocs.jshapi.estudios.Representante;
import com.amdocs.jshapi.mappers.EstudioMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EstudioMapperTest {

	 @Test
	public void Deserialize_String_Estudio()
			throws Exception
	{
		
		String input =  "{\"_embedded\":{\"Estructura familiar\":{},\"Estructura familiar Detalles\":{},\"Infraestructura de vivienda\":{\"Automovil\":[{\"Sirve\":true,\"Tiene\":false}]}},\"beneficiarioId\":12312321}\r\n" + 
				"";
		EstudioMapper mapper = new EstudioMapper();
		Estudio estudio = mapper.Deserialize(input);
		assertEquals ( Integer.valueOf(12312321) , estudio.getBeneficiarioId());
	//	assertEquals("aaaaaaaaaaaaa", estudio.getEmbedded().getRepresentante().getNombreDelTitular());
	//	assertEquals("0", estudio.getEmbedded().getCondicionesEconomicas().getAgua());
	//	assertEquals("0", estudio.getEmbedded().getDatosGenerales().getClaveDeEstado());
		
	}

	 @Test
	 public void Serialize() throws JsonProcessingException
	 {
		 Estudio estudio =  new Estudio();
		 Embedded embedded = new Embedded();
		 estudio.setBeneficiarioId(12312321);
		 Representante representante = new Representante();
		 representante.setNombreDelTitular("aaaaa");
		 DatosGenerales datosGenerales= new DatosGenerales();
		 datosGenerales.setNombreDeLaComunidadOPrograma("jsh");
		 EstructuraFamiliar estructuraFamiliar = new EstructuraFamiliar();
		 EstructuraFamiliarDetalles estructuraFamiliarDetalles = new EstructuraFamiliarDetalles();
		 Integrante integrante = new Integrante();
		 integrante.setAsisteALaEscuela("si");
		 List<Integrante> integrantes = new ArrayList<Integrante>();
		 integrantes.add(integrante);
		  estructuraFamiliar.setIntegrantes(integrantes);
		 
		 embedded.setRepresentante(representante);
		 embedded.setDatosGenerales(datosGenerales);
		 embedded.setEstructuraFamiliar(estructuraFamiliar);
		 embedded.setEstructuraFamiliarDetalles(estructuraFamiliarDetalles);
		 InfraestructuraDeVivienda infraestructuraDeVivienda = new InfraestructuraDeVivienda ();
		 List<Automovil> automovil = new ArrayList<Automovil>();
		 Automovil auto = new Automovil();
		 auto.setSirve(true);
		 auto.setTiene(false);
		 automovil.add(auto);
		 infraestructuraDeVivienda.setAutomovil(automovil);
		 embedded.setInfraestructuraDeVivienda(infraestructuraDeVivienda);
		 estudio.setEmbedded(embedded);
		 
		 ObjectMapper objectmapper = new ObjectMapper();
			String requestString = objectmapper.writeValueAsString(estudio);
			System.out.println(requestString);
	 }
}
