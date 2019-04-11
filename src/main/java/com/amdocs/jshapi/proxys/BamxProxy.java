package com.amdocs.jshapi.proxys;

import java.net.URI;
import java.util.List;

import com.amdocs.jshapi.proxys.responses.Beneficiario;
import com.amdocs.jshapi.proxys.responses.Catalogo;
import com.amdocs.jshapi.proxys.responses.Response;
import com.amdocs.jshapi.proxys.responses.ResponseBeneficiarios;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.client.RestTemplate;
import static com.amdocs.jshapi.proxys.EndPoints.*;

public class BamxProxy extends BaseProxy {
	
	final String urlPost = "https://webapiservice.bamx.org.mx";
	final String AccesoJsonParameter = "?accesoJSON=";
	
	final String gruposEndPoint = "/api/GruposEsn/listarGrupos";
	final String Pdiagnostico = "&idPDiagNostico=";
			
	final String beneficiariosEndPoint = "/api/EstudioSocioNutricio/getBeneficiariosRegistrados";
	final String folioFamiliarParameter = "&esnJSON=%7B%22FolioFamiliar%22:";
	
	
	public List<Beneficiario> getListBeneficiarios (String folioFamiliar) throws JsonProcessingException
	{
		//http://localhost:50559/api/EstudioSocioNutricio/getBeneficiariosRegistrados?accesoJSON={"UserName":'elsa.dominguez@prosociedad.org',"Pass":'y9Z5',"token":'4z8qt8SzrIEMIvOdYsoeWqYmbSY31QSHQL9IjBJkor0=',"idBanco":34}&esnJSON={"FolioFamiliar": "BAGDL0090993"}
		StringBuilder urlGetLisBeneficiarios = new StringBuilder(urlPost);
		urlGetLisBeneficiarios.append(beneficiariosEndPoint);
		urlGetLisBeneficiarios.append(AccesoJsonParameter);
		urlGetLisBeneficiarios.append(super.getUser());
		urlGetLisBeneficiarios.append(folioFamiliarParameter);
		urlGetLisBeneficiarios.append("%20%22" + folioFamiliar + "%22%7D");
		
		/* s.replace("{", "%7B")
		  .replace("\"", "%22")
		  .replace("}", "%7D");*/

		System.out.println(urlGetLisBeneficiarios.toString());
		
		URI uri = URI.create(urlGetLisBeneficiarios.toString());

		System.out.println(uri);
		
		RestTemplate restTemplate = new  RestTemplate();
		ResponseBeneficiarios response = restTemplate.getForObject(uri, ResponseBeneficiarios.class );
		System.out.println( response.getError());
		return response.getBeneficiarios();
	}

	public List<Catalogo> getListGrupos (int idPDiagnostico) throws JsonProcessingException
	{		 
		StringBuilder urlGetListGrupos = new StringBuilder(urlPost);
		urlGetListGrupos.append(gruposEndPoint);
		urlGetListGrupos.append(AccesoJsonParameter);
		urlGetListGrupos.append(super.getUser());
		urlGetListGrupos.append(Pdiagnostico);
		urlGetListGrupos.append(idPDiagnostico);

		
		URI uri = URI.create(urlGetListGrupos.toString());

		System.out.println(uri);
		
		RestTemplate restTemplate = new  RestTemplate();
		Response response = restTemplate.getForObject(uri, Response.class );
		System.out.println( response.getError());
		return response.getCatalogo();
	}

	public List<Catalogo> getListServiciosSanitarios () throws JsonProcessingException {
		return super.getList(serviciosSanitariosEndPoint);
	}
	
	public List<Catalogo> getListServiciosLuz () throws JsonProcessingException 
	{
		return super.getList(serviciosLuzEndPoint);
	}
	
	public List<Catalogo> getListServiciosAgua () throws JsonProcessingException 
	{
		return super.getList(serviciosAguaendPoint);
	}
	
	public List<Catalogo> getListSeriviciosGas () throws JsonProcessingException 
	{
		return super.getList(serviciosGasEndPoint);
	}
	
	public List<Catalogo> getListTenencia () throws JsonProcessingException
	{
		return super.getList(esnTenenciaEndPoint);
	}
	
	public List<Catalogo> getListParedes () throws JsonProcessingException
	{
		return super.getList(catParedesEndPoint);
	}
	
	public List<Catalogo> getListTechos () throws JsonProcessingException
	{
		return super.getList(catTechosEndPoint);
	}
	
	public List<Catalogo> getListTipoVivienda() throws JsonProcessingException
	{
		return super.getList(catTipoViviendaEndPoint);
	}
	
	public List<Catalogo> getCondicionesVivienda () throws JsonProcessingException
	{
		return super.getList(catEsnCondicionViviendaEndPoint );
	}
	
	public List<Catalogo> getTipoApoyo () throws JsonProcessingException
	{
		return super.getList(catEsnTipoApoyoEndPoint);
	}
	
	public List<Catalogo> getFrecuencia () throws JsonProcessingException
	{
		return super.getList(catPgralFrecuenciaEndPoint);
	}
	
	public List<Catalogo> getDuracionMeses () throws JsonProcessingException
	{
		return super.getList(catGralDuracionMesesEndPoint);
	}
	
	public List<Catalogo> getInseguridadAlimentaria () throws JsonProcessingException
	{
		return super.getList(catInseguridadalimentariaEndPoint);
	}
	
	public List<Catalogo> getTipoPobreza () throws JsonProcessingException
	{
		return super.getList(catTipoPobrezaEndPoint);
	}
	
	public List<Catalogo> getPreguntasAlimentacion () throws JsonProcessingException
	{
		return super.getList(catPreguntaAlimentacionEndPoint);	
	}
	
	public List<Catalogo> getCatalogoTipoVialidad () throws JsonProcessingException
	{
		return super.getList(catTipoVialidadEndPoint);
	}
	
	public List<Catalogo> getListTipoAsentamiento () throws JsonProcessingException
	{
		return super.getList(catTipoAsentamientoEndPoint);
	}
	
	public List<Catalogo> getBanoExcusado () throws JsonProcessingException
	{
		return super.getList(catBanoExcusadoEndPoint);
	}
	
	public List<Catalogo> getEstadoCivil () throws JsonProcessingException
	{
		return super.getList(catEstadoCivilEndPoint);
	}
	
	public List<Catalogo> getParentesco () throws JsonProcessingException
	{
		return super.getList(catParentescoEndPoint);
	}
	
	public List<Catalogo> getEscolaridad () throws JsonProcessingException
	{
		return super.getList(catEscolaridadEndPoint);
	}
	
	public List<Catalogo> getListOcupacion() throws JsonProcessingException
	{
		return super.getList(catOcupacionEndPoint);
	}
	
	public List<Catalogo> getListTipoEmpleo () throws JsonProcessingException
	{
		return super.getList(catTipoempleoEndPoint);
	}	
	
	public List<Catalogo> getListDerechoHabiencia () throws JsonProcessingException
	{
		return super.getList(catDerechoHabienciaEndPoint);
	}
	
	public List<Catalogo> getListMotivoDerechoHabiencia () throws JsonProcessingException
	{
		return super.getList(catMotivoDerechoHabienciaEndPoint);
	}
	
	public List<Catalogo> getListDocIdentidad () throws JsonProcessingException
	{
		return super.getList(catDocIdentidadEndPoint);
	}
	
	public List<Catalogo> getListTipoPisos () throws JsonProcessingException
	{
		return super.getList(catGralTipoPisosEndPoint);
	}

	public List<Catalogo> getListTipoEgreso () throws JsonProcessingException
	{
		return super.getList(catTipoEgresoEndPoint);
	}
	
	public List<Catalogo> getListEquipamiento () throws JsonProcessingException
	{
		return super.getList(catEquipamientoEndPoint);
	}
	
	public List<Catalogo> getListTipoIngreso () throws JsonProcessingException
	{
		return super.getList(catTipoIngresoEndPoint);
	}
	
	public List<Catalogo> getListComunidades() throws JsonProcessingException
	{
		return super.getList(listaComunidadesEndPoint);
	}
}
