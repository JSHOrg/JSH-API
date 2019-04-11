package com.amdocs.jshapi.bamx.translate;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.jshapi.bamx.CatESNTipoEgreso;
import com.amdocs.jshapi.bamx.ESNEgresoSemanal;
import com.amdocs.jshapi.estudios.CondicionesEconomicas;
 

public class EgresosTranslate {


	final static String Alimentacion = "Alimentación";
	
	public static List<ESNEgresoSemanal> TranslateEgresos (CondicionesEconomicas condiciones)
	{
		List<ESNEgresoSemanal> lista = new ArrayList<>();
		lista.add(createEgresoAlimentacion(condiciones));
		return lista;
	}
	
	private static ESNEgresoSemanal createEgresoAlimentacion (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Alimentacion);
		egreso.setRCantidad(parseInt(condiciones.getAlimentacion()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoSemanal (String input)
	{
		ESNEgresoSemanal egreso = new ESNEgresoSemanal();
		CatESNTipoEgreso catESNTipoEgreso = new CatESNTipoEgreso();
		catESNTipoEgreso.setCValor(input);
		egreso.setCatESNTipoEgreso(catESNTipoEgreso);
		return egreso;
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
