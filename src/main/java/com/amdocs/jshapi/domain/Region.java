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
//@Table(name = "Region")
public class Region {    
	//@Id
	//@GeneratedValue
	private int idRegion;
	private String Nombre;
	private int Habilitado;
    
	//@Id
	//@GeneratedValue
	public int getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public int getHabilitado() {
		return Habilitado;
	}
	public void setHabilitado(int habilitado) {
		this.Habilitado = habilitado;
	}
	
	public Region(int idRegion, String nombre, int habilitado) {
		this.idRegion = idRegion;
		this.Nombre = nombre;
		this.Habilitado = habilitado;
	}
}
