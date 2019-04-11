package com.amdocs.jshapi.bamx.translate;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.jshapi.bamx.CatESNTipoEgreso;
import com.amdocs.jshapi.bamx.CatESNTipoIngreso;
import com.amdocs.jshapi.bamx.ESNEgresoSemanal;
import com.amdocs.jshapi.bamx.ESNIngresoSemanal;
import com.amdocs.jshapi.estudios.CondicionesEconomicas;

public class IngresosTranslate {

	final static String Padre = "Padre";
	final static String Madre = "Madre";
	final static String Hijos = "Hijos";
	final static String PROSPERA = "PROSPERA";
	final static String AdultosMayores ="Adultos Mayores PROSPERA ";
	final static String Becas = "Becas";
	final static String EnvioExtranjero = "Envío extranjero";
	final static String Otros ="Otros";
	final static String Pension ="Pensión";
	
	
	public static List<ESNIngresoSemanal> TranslateIngresoSemana (CondicionesEconomicas condiciones)
	{
		List<ESNIngresoSemanal> listaIngresos = new ArrayList<ESNIngresoSemanal>();
		listaIngresos.add(createIngresoPadre(condiciones));
		listaIngresos.add(createIngresoMadre(condiciones));
		listaIngresos.add(createIngresoHijos(condiciones));
		listaIngresos.add(createIngresoProspera(condiciones));
		listaIngresos.add(createIngresoAdultosMayores(condiciones));
		listaIngresos.add(createIngresoBecas(condiciones));
		listaIngresos.add(createIngresoOtros(condiciones));
		listaIngresos.add(createIngresoPension(condiciones));
		//listaIngresos.add(createIngresoEnvioExtranjer(condiciones)); //No aparece cantidad de envios del extranjero
		return listaIngresos;
	}
	
	private static ESNIngresoSemanal createIngresoPadre(CondicionesEconomicas condiciones)
	{
		ESNIngresoSemanal ingreso  = createIngresoSemanal(Padre);
		ingreso .setRCantidad(parseInt(condiciones.getPadre()));
		return ingreso;
	}
	
	private static ESNIngresoSemanal createIngresoMadre(CondicionesEconomicas condiciones)
	{
		ESNIngresoSemanal ingreso  = createIngresoSemanal(Madre);
		ingreso .setRCantidad(parseInt(condiciones.getMadre()));
		return ingreso;
	}
	
	private static ESNIngresoSemanal createIngresoHijos(CondicionesEconomicas condiciones)
	{
		ESNIngresoSemanal ingreso  = createIngresoSemanal(Hijos);
		ingreso .setRCantidad(parseInt(condiciones.getHijos()));
		return ingreso;
	}
	private static ESNIngresoSemanal createIngresoProspera(CondicionesEconomicas condiciones)
	{
		ESNIngresoSemanal ingreso  = createIngresoSemanal(PROSPERA);
		ingreso .setRCantidad(parseInt(condiciones.getPROSPERA()));
		return ingreso;
	}
	
	private static ESNIngresoSemanal createIngresoAdultosMayores(CondicionesEconomicas condiciones)
	{
		ESNIngresoSemanal ingreso  = createIngresoSemanal(AdultosMayores);
		ingreso .setRCantidad(parseInt(condiciones.getAdultosMayores()));
		return ingreso;
	}
	
	private static ESNIngresoSemanal createIngresoBecas(CondicionesEconomicas condiciones)
	{
		ESNIngresoSemanal ingreso  = createIngresoSemanal(Becas);
		ingreso .setRCantidad(parseInt(condiciones.getBecas()));
		return ingreso;
	}
	
	private static ESNIngresoSemanal createIngresoEnvioExtranjero(CondicionesEconomicas condiciones)
	{
		ESNIngresoSemanal ingreso  = createIngresoSemanal(EnvioExtranjero);
		ingreso .setRCantidad(parseInt(condiciones.getAlguienEnElHogarRecibeDineroProvenienteDeOtrosPaises()));
		return ingreso;
	}
	private static ESNIngresoSemanal createIngresoOtros(CondicionesEconomicas condiciones)
	{
		ESNIngresoSemanal ingreso  = createIngresoSemanal(Otros);
		ingreso .setRCantidad(parseInt(condiciones.getCondicionesEconomicasOtros()));
		return ingreso;
	}
	
	private static ESNIngresoSemanal createIngresoPension(CondicionesEconomicas condiciones)
	{
		ESNIngresoSemanal ingreso  = createIngresoSemanal(Pension);
		ingreso .setRCantidad(parseInt(condiciones.getPension()));
		return ingreso;
	}
	
	
	private static ESNIngresoSemanal createIngresoSemanal(String input) {

		ESNIngresoSemanal ingreso = new ESNIngresoSemanal();
		CatESNTipoIngreso catESNTipoIngreso = new CatESNTipoIngreso();
		catESNTipoIngreso.setCValor(input);
		ingreso.setCatESNTipoIngreso(catESNTipoIngreso);
		return ingreso;
	}
	
	
	
	private static Integer parseInt (String value)
	{
		if(tryParseInt(value))
			return Integer.parseInt(value); 
		else
			return 0;
	}
	
	private static boolean tryParseInt(String value) {  
	     try {  
	         Integer.parseInt(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
}
