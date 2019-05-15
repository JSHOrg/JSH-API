package com.amdocs.jshapi.bamx.translate;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.jshapi.bamx.CatESNTipoEgreso;
import com.amdocs.jshapi.bamx.ESNEgresoSemanal;
import com.amdocs.jshapi.estudios.CondicionesEconomicas;
 

public class EgresosTranslate {


	final static String Alimentacion = "Alimentación";
	final static String Vivienda = "Vivienda";
	final static String Luz = "Luz";
	final static String Gas ="Gas";
	final static String Agua = "Agua";
	final static String Telefono = "Teléfono";
	final static String Transporte = "Transporte";
	final static String AtencionMedica ="Atención médica";
	final static String OtrosGastos = "Otros gastos";
	final static String Celular = "Celular";
	final static String Educacion = "Educación";
	
	
	public static List<ESNEgresoSemanal> TranslateEgresos (CondicionesEconomicas condiciones)
	{
		List<ESNEgresoSemanal> lista = new ArrayList<>();
		lista.add(createEgresoAlimentacion(condiciones));
		lista.add(createEgresoVivienda(condiciones));
		lista.add(createEgresoLuz(condiciones));
		lista.add(createEgresoGas(condiciones));
		lista.add(createEgresoAgua(condiciones));
		lista.add(createEgresoTelefono(condiciones));
		lista.add(createEgresoTransporte(condiciones));
		lista.add(createEgresoAtencionMedica(condiciones));
		lista.add(createEgresoOtrosGastos(condiciones));
		lista.add(createEgresoCelular(condiciones));
		lista.add(createEgresoEducacion(condiciones));
		
		return lista;
	}
	
	private static ESNEgresoSemanal createEgresoAlimentacion (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Alimentacion);
		egreso.setRCantidad(parseInt(condiciones.getAlimentacion()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoVivienda (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Vivienda);
		egreso.setRCantidad(parseInt(condiciones.getVivienda()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoLuz (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Luz);
		egreso.setRCantidad(parseInt(condiciones.getLuz()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoGas (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Gas);
		egreso.setRCantidad(parseInt(condiciones.getGas()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoAgua (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Agua);
		egreso.setRCantidad(parseInt(condiciones.getAgua()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoTelefono (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Telefono);
		egreso.setRCantidad(parseInt(condiciones.getTelefono()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoAtencionMedica (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(AtencionMedica);
		egreso.setRCantidad(parseInt(condiciones.getAtencionMedica()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoCelular (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Celular);
		egreso.setRCantidad(parseInt(condiciones.getCelular()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoEducacion (CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Educacion);
		egreso.setRCantidad(parseInt(condiciones.getEducacion()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoOtrosGastos(CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(OtrosGastos);
		egreso.setRCantidad(parseInt(condiciones.getCondicionesEconomicasOtros()));
		return egreso;
	}
	
	private static ESNEgresoSemanal createEgresoTransporte(CondicionesEconomicas condiciones)
	{
		ESNEgresoSemanal egreso = createEgresoSemanal(Transporte);
		egreso.setRCantidad(parseInt(condiciones.getTransporte()));
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
