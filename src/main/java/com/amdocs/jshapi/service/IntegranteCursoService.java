package com.amdocs.jshapi.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.jshapi.domain.Curso;
import com.amdocs.jshapi.domain.CursoIntegrante;
import com.amdocs.jshapi.domain.Integrante;
import com.amdocs.jshapi.repository.CursoRepository;
import com.amdocs.jshapi.repository.IntegranteCursosRepository;
import com.amdocs.jshapi.repository.IntegranteRepository;
import com.amdocs.jshapi.requests.CursoIntegrantesRequest;
import com.amdocs.jshapi.requests.IntegranteRequest;

@Service
public class IntegranteCursoService {

	@Autowired
	private IntegranteCursosRepository integrantescursosrepository;
	@Autowired 
	private IntegranteRepository integranterepository;
	@Autowired 
	private CursoRepository cursorepository;
	
	
	//@Transactional
	public String AgregarIntegrantesCurso(CursoIntegrantesRequest cursointegrante)
	{
		System.out.println("Ingrensando al metodo de servicio");
		System.out.println(cursointegrante.getIntegrantes().size());
		//Optional<Curso> cursoentity = cursorepository.findById((long) cursointegrante.getIdCurso());

		Optional<Curso> cursoentity ;
		try 
		{
			cursoentity = cursorepository.findById((long) 2);
			System.out.println("despues del find by id");	
		//System.out.println(cursoentity.isPresent());
		
		if(cursoentity.isPresent())
		{
			System.out.println("Se encontro el curso");
			if(cursointegrante.getIntegrantes().size()> 0)
			{
				System.out.println("Mas de un integrante");
				for(final IntegranteRequest integrante : cursointegrante.getIntegrantes())
				{
					Optional<Integrante>  integranteentity = integranterepository.findById((long) integrante.getId()) ;
					if(integranteentity.isPresent())
					{
						 CursoIntegrante cursointegranteentity = 
								 new CursoIntegrante(cursoentity.get(), integranteentity.get());
						 integrantescursosrepository.save(cursointegranteentity);
					}
					else
					{
						System.out.println("No se encontro el curso 234");
						return "Algo no encontrado";
					}				
				}
			}
			else
			{
				System.out.println("No se encontro el curso 22");
				return "No encontrado";
			}
		}
		else 
		{
			System.out.println("No se encontro el curso");
			return "Aqui tampoco se encontro";
		}
		System.out.println(cursoentity.get().getNombre());
		}
		catch (HibernateException ex)
		{
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}

		System.out.println("No se encontro el curso 14");
		return "No se como llego aqui";
	}
}
