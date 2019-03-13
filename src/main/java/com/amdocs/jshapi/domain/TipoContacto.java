/**
 * TipoContacto.java
 */
package com.amdocs.jshapi.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


public enum TipoContacto {
	PERSONAL, PROFESIONAL
}
