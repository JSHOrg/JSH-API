/**
 * SolicitudRecoleccion.java
 */
package com.amdocs.jshapi.domain; 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



/**
 * @author Alejandro Alberto Aguilar
 *
 */
@Entity
@Table(name="solicitudrecoleccion")
public class SolicitudesRecoleccion {

    @Id
	@GeneratedValue
	@Column(name = "idsolicitudrecoleccion")
	private Long id;
    
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="iddetalledonativo", referencedColumnName="idDonativoDetalle")
	private DetalleDonativo detalleDonativo;

    @OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "idproveedor", name = "idproveedor")
    private Proveedor proveedor;

    @Column(name = "fechaprogramada")
    private Date fechaProgramada;
    
	public SolicitudesRecoleccion() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

  	/**
     	* @return the Identifier
     	*/	
	public Long getIdentifier(){
		return this.id;
    }

    /**
     * @return the detalledonativo
     */
    public DetalleDonativo getDetalledonativo() {
        return detalleDonativo;
    }

    /**
     * @param detalledonativo the detalledonativo to set
     */
    public void setDetalledonativo(DetalleDonativo detalledonativo) {
        this.detalleDonativo = detalledonativo;
    }

    /**
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the fechaProgramada
     */
    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    /**
     * @param fechaProgramada the fechaProgramada to set
     */
    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }
    
}
