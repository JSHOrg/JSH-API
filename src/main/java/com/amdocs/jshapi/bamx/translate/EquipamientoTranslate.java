package com.amdocs.jshapi.bamx.translate;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.jshapi.bamx.CatESNEquipamiento;
import com.amdocs.jshapi.bamx.ESNEquipamientosEstudio;
import com.amdocs.jshapi.estudios.InfraestructuraDeVivienda;

public class EquipamientoTranslate {

	final static String Refrigerador = "Refrigerador";	
	final static String Estufa = "Estufa";
	final static String VideoVHSBlueRay = "Video, DVD, Blu-ray";
	final static String Lavadora = "Lavadora";
	final static String Licuadora = "Licuadora";	
	final static String Television = "Televisión";  // pendiente
	final static String Automovil = "Automóvil"; 
	final static String Radio = "Radio";
	final static String Sala = "Sala";
	final static String Comedor = "Comedor";
	final static String Cama = "Cama";
	final static String Celular = "Celular";
	final static String Motocicleta = "Motocicleta";
	final static String Computadora = "Computadora";
	final static String Horno = "Horno";
	final static String Telefono = "Teléfono";   
	
	
	
	public static List<ESNEquipamientosEstudio> translateEquipamientos (InfraestructuraDeVivienda infraestructura)
	{		
		List<ESNEquipamientosEstudio> lista = new ArrayList<ESNEquipamientosEstudio>();
		try 
		{
			System.out.println("Previo a obtener el equipamiento");
			lista.add(translateRefrigerador(infraestructura));
			lista.add(translateEstufa(infraestructura));
			lista.add(translateLavadora(infraestructura));
			lista.add(translateLicuadora(infraestructura));
			lista.add(translateVideoDVDBlueRay(infraestructura));
			lista.add(translateRadio(infraestructura));
			lista.add(translateSala(infraestructura));
			lista.add(translateComedor(infraestructura));
			lista.add(translateCama(infraestructura));
			lista.add(translateCelular(infraestructura));
			lista.add(translateComputadora(infraestructura));
			lista.add(translateHorno(infraestructura));
			lista.add(translateAutomovil(infraestructura));
			lista.add(translateTelefono(infraestructura));
			System.out.println("terminar de  obtener el equipamiento");
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	public static ESNEquipamientosEstudio getObjectEquipamieto(String elemento)
	{
		ESNEquipamientosEstudio equipamiento = new ESNEquipamientosEstudio();
		CatESNEquipamiento catESNEquipamiento = new CatESNEquipamiento();
		catESNEquipamiento.setCValor(elemento);
		equipamiento.setCatESNEquipamiento(catESNEquipamiento);	
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateRefrigerador (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Refrigerador);
			
		com.amdocs.jshapi.estudios.Refrigerador source =
				infraestructura.getRefrigerador().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateEstufa (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Estufa);	
		com.amdocs.jshapi.estudios.Estufa source = 
				infraestructura.getEstufa().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateVideoDVDBlueRay (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(VideoVHSBlueRay);	
		com.amdocs.jshapi.estudios.VHSDVDBluRay source = 
				infraestructura.getVHSDVDBluRay().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateLavadora (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Lavadora);	
		com.amdocs.jshapi.estudios.Lavadora source = 
				infraestructura.getLavadora().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateLicuadora (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Licuadora);	
		com.amdocs.jshapi.estudios.Licuadora source = 
				infraestructura.getLicuadora().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateRadio (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Radio);	
		com.amdocs.jshapi.estudios.Radio source = 
				infraestructura.getRadio().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateSala (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Sala);	
		com.amdocs.jshapi.estudios.Sala source = 
				infraestructura.getSala().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateComedor (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Comedor);	
		com.amdocs.jshapi.estudios.Comedor  source = 
				infraestructura.getComedor().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateCama (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Cama);	
		com.amdocs.jshapi.estudios.Cama  source = 
				infraestructura.getCama().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateCelular (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Celular);	
		com.amdocs.jshapi.estudios.Celular  source = 
				infraestructura.getCelular().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateComputadora (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Computadora);	
		com.amdocs.jshapi.estudios.Computadora   source = 
				infraestructura.getComputadora().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateHorno (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Horno);	
		com.amdocs.jshapi.estudios.Horno   source = 
				infraestructura.getHorno().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateAutomovil (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Automovil);	
		com.amdocs.jshapi.estudios.Automovil   source = 
				infraestructura.getAutomovil().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
	public static ESNEquipamientosEstudio translateTelefono (InfraestructuraDeVivienda infraestructura)
	{
		ESNEquipamientosEstudio equipamiento = getObjectEquipamieto(Telefono);	
		com.amdocs.jshapi.estudios.Telefono   source = 
				infraestructura.getTelefono().iterator().next();
		equipamiento.setITiene(source.getTiene()?1:0);
		equipamiento.setISirve(source.getSirve()?1:0);
		return equipamiento;
	}
	
}
