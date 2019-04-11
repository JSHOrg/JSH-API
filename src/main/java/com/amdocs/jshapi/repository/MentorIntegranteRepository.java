package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.MentorIntegrante;
import com.amdocs.jshapi.projections.MentorIntegranteInline;

@RepositoryRestResource(path = "mentorintegrantes", collectionResourceRel = "mentorintegrantes", excerptProjection=MentorIntegranteInline.class)
public interface MentorIntegranteRepository extends JpaRepository<MentorIntegrante, Long> {

}
