
public class Ayuntamiento {
	
	private String calle;
	private String pueblo;
	private String alcaldeNombre;
	private String alcaldeApellido;
	

	public Ayuntamiento(String calle, String pueblo, String alcaldeNombre, String alcaldeApellido){
		this.calle = calle;
		this.alcaldeNombre = alcaldeNombre;
		this.alcaldeApellido = alcaldeApellido;
		this.pueblo = pueblo;
	}

	public String getCalle(){
		return calle;
	}
	public void setCalle(String calle){
		this.calle = calle;
	}
	public String getPueblo(){
		return pueblo;
	}
	public void setPueblo(String pueblo){
		this.pueblo = pueblo;
	}
	public String getAlcaldeNombre(){
		return alcaldeNombre;
	}
	public void setAlcaldeNombre(String alcaldeNombre){
		this.alcaldeNombre = alcaldeNombre;
	}
	public String getAlcaldeApellido(){
		return alcaldeApellido;
	}
	public void setAlcaldeApellido(String alcaldeApellido){
		this.alcaldeApellido = alcaldeApellido;
	}
}				