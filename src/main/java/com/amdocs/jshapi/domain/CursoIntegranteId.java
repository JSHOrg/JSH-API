package com.amdocs.jshapi.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CursoIntegranteId
	implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Column(name="integrante_id")
	private Long integranteId;
	
	@Column(name="curso_id")
	private Long cursoId;
	
	private CursoIntegranteId() {}
	
	public CursoIntegranteId (Long integranteId, Long cursoId) {
		this.cursoId = cursoId;
		this.integranteId = integranteId;
	}
	
	public Long getCursoId()
	{
		return this.cursoId;
	}
	
	public void setIdCurso(Long cursoId)
	{
		this.cursoId = cursoId;
	}
	
	public Long getIntegrante()
	{
		return this.integranteId;
	}
	
	public void setIntegrante(Long integranteId)
	{
		this.integranteId = integranteId;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(this==o) return true;
		
		if(o== null || getClass() !=o.getClass())
			return false;
		
		CursoIntegranteId that = (CursoIntegranteId) o;
		return Objects.equals(cursoId,that.cursoId) &&
				Objects.equals(integranteId,that.integranteId);
	}
	
	@Override 
	public int hashCode ()
	{
		return Objects.hash(cursoId, integranteId);
	}
}
