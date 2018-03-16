package JSH;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
import java.util.Date;
/**
 * 
 * @author Luis Cruz
 */
//@Entity
//@Table(name = "Donativo")
public class Donativo {
	//@Id
	//@GeneratedValue
	private int idDonativo;
	private String RemisionBA;
	private Date FechaRegistro;
	private Date FechaAcopio;
	private String RequerimientosDonador;
	private String CondicionesTransporte;
	private String CoordinacionTransporte;
	private int CostoOperativo;
	private String DistribucionRegional;
	private String Especificaciones;
	private int IDDonador;
	private int IDTransportesCajas;
	private int IDTransportesUnidades;
	
	public int getIdDonativo() {
		return idDonativo;
	}
	public void setIdDonativo(int idDonativo) {
		this.idDonativo = idDonativo;
	}
	public String getRemisionBA() {
		return RemisionBA;
	}
	public void setRemisionBA(String remisionBA) {
		this.RemisionBA = remisionBA;
	}
	public Date getFechaRegistro() {
		return FechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.FechaRegistro = fechaRegistro;
	}
	public Date getFechaAcopio() {
		return FechaAcopio;
	}
	public void setFechaAcopio(Date fechaAcopio) {
		this.FechaAcopio = fechaAcopio;
	}
	public String getRequerimientosDonador() {
		return RequerimientosDonador;
	}
	public void setRequerimientosDonador(String requerimientosDonador) {
		this.RequerimientosDonador = requerimientosDonador;
	}
	public String getCondicionesTransporte() {
		return CondicionesTransporte;
	}
	public void setCondicionesTransporte(String condicionesTransporte) {
		this.CondicionesTransporte = condicionesTransporte;
	}
	public String getCoordinacionTransporte() {
		return CoordinacionTransporte;
	}
	public void setCoordinacionTransporte(String coordinacionTransporte) {
		this.CoordinacionTransporte = coordinacionTransporte;
	}
	public int getCostoOperativo() {
		return CostoOperativo;
	}
	public void setCostoOperativo(int costoOperativo) {
		this.CostoOperativo = costoOperativo;
	}
	public String getDistribucionRegional() {
		return DistribucionRegional;
	}
	public void setDistribucionRegional(String distribucionRegional) {
		this.DistribucionRegional = distribucionRegional;
	}
	public String getEspecificaciones() {
		return Especificaciones;
	}
	public void setEspecificaciones(String especificaciones) {
		this.Especificaciones = especificaciones;
	}
	public int getIDDonador() {
		return IDDonador;
	}
	public void setIDDonador(int iDDonador) {
		this.IDDonador = iDDonador;
	}
	public int getIDTransportesCajas() {
		return IDTransportesCajas;
	}
	public void setIDTransportesCajas(int iDTransportesCajas) {
		this.IDTransportesCajas = iDTransportesCajas;
	}
	public int getIDTransportesUnidades() {
		return IDTransportesUnidades;
	}
	public void setIDTransportesUnidades(int iDTransportesUnidades) {
		this.IDTransportesUnidades = iDTransportesUnidades;
	}
	public Donativo(int idDonativo, String remisionBA, Date fechaRegistro,
			Date fechaAcopio, String requerimientosDonador,
			String condicionesTransporte, String coordinacionTransporte,
			int costoOperativo, String distribucionRegional,
			String especificaciones, int iDDonador, int iDTransportesCajas,
			int iDTransportesUnidades) {

		this.idDonativo = idDonativo;
		this.RemisionBA = remisionBA;
		this.FechaRegistro = fechaRegistro;
		this.FechaAcopio = fechaAcopio;
		this.RequerimientosDonador = requerimientosDonador;
		this.CondicionesTransporte = condicionesTransporte;
		this.CoordinacionTransporte = coordinacionTransporte;
		this.CostoOperativo = costoOperativo;
		this.DistribucionRegional = distribucionRegional;
		this.Especificaciones = especificaciones;
		this.IDDonador = iDDonador;
		this.IDTransportesCajas = iDTransportesCajas;
		this.IDTransportesUnidades = iDTransportesUnidades;
	}		
}
