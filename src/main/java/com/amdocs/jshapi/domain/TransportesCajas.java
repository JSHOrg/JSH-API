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
//@Table(name = "TransportesCajas")
public class TransportesCajas {
	//@Id
	//@GeneratedValue
	private int IDTransportesCajas;
	private String TipoCaja;
	
	public int getIDTransportesCajas() {
		return IDTransportesCajas;
	}
	public void setIDTransportesCajas(int iDTransportesCajas) {
		this.IDTransportesCajas = iDTransportesCajas;
	}
	public String getTipoCaja() {
		return TipoCaja;
	}
	public void setTipoCaja(String tipoCaja) {
		this.TipoCaja = tipoCaja;
	}
	
	public TransportesCajas(int iDTransportesCajas, String tipoCaja) {
		this.IDTransportesCajas = iDTransportesCajas;
		this.TipoCaja = tipoCaja;
	}
	
	
	
}
