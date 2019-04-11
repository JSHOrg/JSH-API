package com.amdocs.jshapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jshapi.domain.Mentor;
import com.amdocs.jshapi.projections.MentorInline;


@RepositoryRestResource(path = "mentores", collectionResourceRel = "mentores", excerptProjection= MentorInline.class)
public interface MentorRepository extends JpaRepository<Mentor, Long> {

		
}
