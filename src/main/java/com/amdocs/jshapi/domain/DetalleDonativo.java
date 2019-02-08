package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Roberto Gutierrez Garcia
 */
@Entity
@Table(name="donativosdetalles")
public class DetalleDonativo {

    @Id
	@GeneratedValue
	@Column(name = "iddonativodetalle")
	private Long id;
    
    @Column(name="cantidadkgs")
    private String cantidadKg;
    
    @Column(name="cantidadpiezas")
    private String cantidadPza;
    
    @Column(name="fechaconsumolimite")
    private Date fechaConsumoLimite;
    
    @Column(name="cosecha")
    private boolean cosecha;
    
    @Column(name="pagocosecha")
    private int pagoCosecha;
    
    @Column(name="cantidadembalaje")
    private int cantidadEmbalaje;
    
    @Column
    private boolean status;
    
    @Column(name="fechasolicitud")
    private Date fechaSolicitud;
    
    @Column(name="fechaconfirmacion")
    private Date fechaConfirmacion;
    
    @Column(name="fecharecepcion")
    private Date fechaRecepcion;
    
    @Column(name="cantidadrecibida", length=12)
    private String cantidadRecibida;
    
    @Column(name="cantidadrecibidabuenestado", length=12)
    private String cantidadRecibidaBuenEstado;
    
    @Column(name="costooperativoacopio", length=10)
    private String costoOperativoAcopio;
    
    @Column
    private String comentarios;
    
    @Column(length=3)
    private String calificacion;
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddonativo", name="iddonativo", unique=true, nullable=false, updatable=false)
    private Donativo donativo;
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idproducto", name="idproducto")
    private Producto producto;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idembalaje", name="idembalaje") 
    private Embalaje embalaje;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idbancoalimentos", name="idbanco") 
    private BancoAlimentos bancoAlimentos;
    
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idusuario", name="idusuario")
	private Account usuario;
    
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
	 * @return the cantidadKg
	 */
	public String getCantidadKg() {
		return cantidadKg;
	}

	/**
	 * @param cantidadKg the cantidadKg to set
	 */
	public void setCantidadKg(String cantidadKg) {
		this.cantidadKg = cantidadKg;
	}

	/**
	 * @return the cantidadPza
	 */
	public String getCantidadPza() {
		return cantidadPza;
	}

	/**
	 * @param cantidadPza the cantidadPza to set
	 */
	public void setCantidadPza(String cantidadPza) {
		this.cantidadPza = cantidadPza;
	}

	/**
	 * @return the fechaConsumoLimite
	 */
	public Date getFechaConsumoLimite() {
		return fechaConsumoLimite;
	}

	/**
	 * @param fechaConsumoLimite the fechaConsumoLimite to set
	 */
	public void setFechaConsumoLimite(Date fechaConsumoLimite) {
		this.fechaConsumoLimite = fechaConsumoLimite;
	}

	/**
	 * @return the cosecha
	 */
	public boolean isCosecha() {
		return cosecha;
	}

	/**
	 * @param cosecha the cosecha to set
	 */
	public void setCosecha(boolean cosecha) {
		this.cosecha = cosecha;
	}

	/**
	 * @return the pagoCosecha
	 */
	public int getPagoCosecha() {
		return pagoCosecha;
	}

	/**
	 * @param pagoCosecha the pagoCosecha to set
	 */
	public void setPagoCosecha(int pagoCosecha) {
		this.pagoCosecha = pagoCosecha;
	}

	/**
	 * @return the cantidadEmbalaje
	 */
	public int getCantidadEmbalaje() {
		return cantidadEmbalaje;
	}

	/**
	 * @param cantidadEmbalaje the cantidadEmbalaje to set
	 */
	public void setCantidadEmbalaje(int cantidadEmbalaje) {
		this.cantidadEmbalaje = cantidadEmbalaje;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the fechaSolicitud
	 */
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	/**
	 * @param fechaSolicitud the fechaSolicitud to set
	 */
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	/**
	 * @return the fechaConfirmacion
	 */
	public Date getFechaConfirmacion() {
		return fechaConfirmacion;
	}

	/**
	 * @param fechaConfirmacion the fechaConfirmacion to set
	 */
	public void setFechaConfirmacion(Date fechaConfirmacion) {
		this.fechaConfirmacion = fechaConfirmacion;
	}

	/**
	 * @return the fechaRecepcion
	 */
	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

	/**
	 * @param fechaRecepcion the fechaRecepcion to set
	 */
	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	/**
	 * @return the cantidadRecibida
	 */
	public String getCantidadRecibida() {
		return cantidadRecibida;
	}

	/**
	 * @param cantidadRecibida the cantidadRecibida to set
	 */
	public void setCantidadRecibida(String cantidadRecibida) {
		this.cantidadRecibida = cantidadRecibida;
	}

	/**
	 * @return the cantidadRecibidaBuenEstado
	 */
	public String getCantidadRecibidaBuenEstado() {
		return cantidadRecibidaBuenEstado;
	}

	/**
	 * @param cantidadRecibidaBuenEstado the cantidadRecibidaBuenEstado to set
	 */
	public void setCantidadRecibidaBuenEstado(String cantidadRecibidaBuenEstado) {
		this.cantidadRecibidaBuenEstado = cantidadRecibidaBuenEstado;
	}

	/**
	 * @return the costoOperativoAcopio
	 */
	public String getCostoOperativoAcopio() {
		return costoOperativoAcopio;
	}

	/**
	 * @param costoOperativoAcopio the costoOperativoAcopio to set
	 */
	public void setCostoOperativoAcopio(String costoOperativoAcopio) {
		this.costoOperativoAcopio = costoOperativoAcopio;
	}

	/**
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}

	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	/**
	 * @return the calificacion
	 */
	public String getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @return the donativo
	 */
	public Donativo getDonativo() {
		return donativo;
	}

	/**
	 * @param donativo the donativo to set
	 */
	public void setDonativo(Donativo donativo) {
		this.donativo = donativo;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the embalaje
	 */
	public Embalaje getEmbalaje() {
		return embalaje;
	}

	/**
	 * @param embalaje the embalaje to set
	 */
	public void setEmbalaje(Embalaje embalaje) {
		this.embalaje = embalaje;
	}

	/**
	 * @return the bancoAlimentos
	 */
	public BancoAlimentos getBancoAlimentos() {
		return bancoAlimentos;
	}

	/**
	 * @param bancoAlimentos the bancoAlimentos to set
	 */
	public void setBancoAlimentos(BancoAlimentos bancoAlimentos) {
		this.bancoAlimentos = bancoAlimentos;
	}

	/**
	 * @return the usuario
	 */
	public Account getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Account usuario) {
		this.usuario = usuario;
	}
}
