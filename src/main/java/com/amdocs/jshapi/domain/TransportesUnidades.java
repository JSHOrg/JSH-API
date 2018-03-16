package JSH;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
/**
 * 
 * @author Luis Cruz
 */
//@Entity
//@Table(name = "TransportesUnidades")
public class TransportesUnidades {
	//@Id
	//@GeneratedValue	
	private int IDTransportesUnidades;
	private String TipoUnidad;
	
	public int getIDTransportesUnidades() {
		return IDTransportesUnidades;
	}
	public void setIDTransportesUnidades(int iDTransportesUnidades) {
		IDTransportesUnidades = iDTransportesUnidades;
	}
	public String getTipoUnidad() {
		return TipoUnidad;
	}
	public void setTipoUnidad(String tipoUnidad) {
		TipoUnidad = tipoUnidad;
	}
	
	public TransportesUnidades(int iDTransportesUnidades, String tipoUnidad) {
		this.IDTransportesUnidades = iDTransportesUnidades;
		this.TipoUnidad = tipoUnidad;
	}

	
}
