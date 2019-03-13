package com.amdocs.jshapi.controller;

import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.jshapi.domain.Benefactor;
import com.amdocs.jshapi.domain.Contacto;
import com.amdocs.jshapi.domain.Direccion;
import com.amdocs.jshapi.repository.BenefactorRepository;
import com.amdocs.jshapi.repository.ContactoRepository;
import com.amdocs.jshapi.repository.DireccionRepository;


@RestController
@RequestMapping("/api/Benefactores")
public class BenefactoresController {

	@Autowired
	private BenefactorRepository benefactorRepository;
	
	@Autowired 
	private DireccionRepository direccionRepository;
	
	@Autowired
	private ContactoRepository contactoRepository;
	

	
	@RequestMapping(method = RequestMethod.POST)
	public Benefactor createPost (@Valid @RequestBody Benefactor benefactor)
	{	
		benefactor.setDireccion(direccionRepository.save(benefactor.getDireccion())); 
		benefactor.setContacto(contactoRepository.save(benefactor.getContacto())); 
		
		return benefactorRepository.save(benefactor);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Collection<Benefactor>> getBenefactores() 
	{
		return new ResponseEntity<>(benefactorRepository.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Benefactor> getBenefactor(@PathVariable long id) {
		Optional<Benefactor> benefactor = benefactorRepository.findById(id);		 
		 if(benefactor.isPresent())
		 {
			 return ResponseEntity.ok(benefactor.get());
		 }
		 else 
		{
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletebenefactor(@PathVariable long id) {
		
 		benefactorRepository.deleteById(id);
 		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Benefactor> updatebenefactor(@PathVariable long id,  @Valid @RequestBody Benefactor benefactorRequest) {
		
		
		benefactorRepository.existsById(id);
		
		Contacto  contactoRequest = benefactorRequest.getContacto();
		Direccion direccionRequest = benefactorRequest.getDireccion();
		Optional<Benefactor> benefactor = benefactorRepository.findById(id);
		if(benefactor.isPresent()) {
			
			Optional<Contacto> contacto = contactoRepository.findById(benefactorRequest.getContacto().getId());
			if(contacto.isPresent())
			{
				contacto.get().setNombre(contactoRequest.getNombre());
				contacto.get().setApellido(contactoRequest.getApellido());
				contacto.get().setCelular(contactoRequest.getCelular());
				contacto.get().setDatosExtra(contactoRequest.getDatosExtra());
				contacto.get().setEmail(contactoRequest.getEmail());
				contacto.get().setExtension(contactoRequest.getExtension());
				contacto.get().setFechaRegistro(contactoRequest.getFechaRegistro());
				//contacto.get().setHabilitado(contactoRequest.get);
				contacto.get().setTelefono(contactoRequest.getTelefono());
				
				contactoRepository.save(contacto.get());
			}
			
			benefactor.get().setContacto(contacto.get());			 
			
				
			Optional<Direccion> direccion = direccionRepository.findById(benefactorRequest.getDireccion().getId());
			if(direccion.isPresent())
			{
				direccion.get().setCalle(direccionRequest.getCalle());
				direccion.get().setCiudad(direccionRequest.getCiudad());
				direccionRepository.save(direccion.get());
			}
			
			benefactor.get().setDireccion(direccion.get());
			
			benefactor.get().setNombre(benefactorRequest.getNombre());
			benefactor.get().setRazonSocial(benefactorRequest.getRazonSocial());
			return new ResponseEntity<>( benefactorRepository.save(benefactor.get()), HttpStatus.OK); 
		}
		else 
		{
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}
		
	}
}
