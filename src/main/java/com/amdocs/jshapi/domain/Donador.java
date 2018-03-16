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
//@Table(name = "Donador")
public class Donador {
	//@Id
	//@GeneratedValue
	private int IDDonador;
	private String RazonSocial;
	private int ReciboFiscal;
	private String RFC;
	private String FolioAcuseConvenio;
	private Date VigenciaConvenio;
	private String Comentarios;
	private String Calificacion;
	private Date FechaRegistro;
	private String Habilitado;

	public int getIDDonador() {
		return IDDonador;
	}
	public void setIDDonador(int iDDonador) {
		this.IDDonador = iDDonador;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.RazonSocial = razonSocial;
	}
	public int getReciboFiscal() {
		return ReciboFiscal;
	}
	public void setReciboFiscal(int reciboFiscal) {
		this.ReciboFiscal = reciboFiscal;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		this.RFC = rFC;
	}
	public String getFolioAcuseConvenio() {
		return FolioAcuseConvenio;
	}
	public void setFolioAcuseConvenio(String folioAcuseConvenio) {
		this.FolioAcuseConvenio = folioAcuseConvenio;
	}
	public Date getVigenciaConvenio() {
		return VigenciaConvenio;
	}
	public void setVigenciaConvenio(Date vigenciaConvenio) {
		this.VigenciaConvenio = vigenciaConvenio;
	}
	public String getComentarios() {
		return Comentarios;
	}
	public void setComentarios(String comentarios) {
		this.Comentarios = comentarios;
	}
	public String getCalificacion() {
		return Calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.Calificacion = calificacion;
	}
	public Date getFechaRegistro() {
		return FechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.FechaRegistro = fechaRegistro;
	}
	public String getHabilitado() {
		return Habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.Habilitado = habilitado;
	}
	
	public Donador(int iDDonador, String razonSocial, int reciboFiscal,
			String rFC, String folioAcuseConvenio, Date vigenciaConvenio,
			String comentarios, String calificacion, Date fechaRegistro,
			String habilitado) {

		this.IDDonador = iDDonador;
		this.RazonSocial = razonSocial;
		this.ReciboFiscal = reciboFiscal;
		this.RFC = rFC;
		this.FolioAcuseConvenio = folioAcuseConvenio;
		this.VigenciaConvenio = vigenciaConvenio;
		this.Comentarios = comentarios;
		this.Calificacion = calificacion;
		this.FechaRegistro = fechaRegistro;
		this.Habilitado = habilitado;
	}	
}
