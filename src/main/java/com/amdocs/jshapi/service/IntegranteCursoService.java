package com.amdocs.jshapi.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
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
	public String AgregarIntegrantesCurso(CursoIntegrantesRequest cursointegranteentity)
	{
		System.out.println("Ingrensando al metodo de servicio");
		//System.out.println(cursointegrante.getIntegrantes().size());
		//Optional<Curso> cursoentity = cursorepository.findById((long) cursointegrante.getIdCurso());

		try 
		{
			Optional<Curso> curso = cursorepository.findById((long) 2);
			Optional<Integrante> integrante = integranterepository.findById((long)21);
			
			CursoIntegrante cursointegrante = new CursoIntegrante();
			cursointegrante.setCurso(curso.get());
			
			System.out.println(curso.get().getDescripcion());
			
			cursointegrante.setIntegrante(integrante.get());
			
			System.out.println(integrante.get().getApellidoPaterno());
			
			curso.get().getCursosIntegrantes().add(cursointegrante);
			cursorepository.save(curso.get());
			
			//integrantescursosrepository.save(cursointegrante);
		}
		catch(Exception ex)
		{
			System.out.println("Se obtuvo una excepcion en el service");
			 
			System.out.println(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
		}
		
		
		 return "Se hizo la insercion del registro"	;	
	}
}
