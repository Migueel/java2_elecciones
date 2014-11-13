
public class Inmueble {
	
	private String pueblo;
	private String calle;
	private int numero = 0;
	private int tamaño = 0;
	private int precio= 0;

	public Inmueble(String pueblo, String calle, int numero, int tamaño, int precio){
		this.pueblo = pueblo;
		this.calle = calle;
		this.numero = numero;
		this.tamaño = tamaño;
		this.precio = precio;
	}

	public String getPueblo(){
		return pueblo;
	}
	public void setPueblo(String pueblo){
		this.pueblo = pueblo;
	}
	public String getCalle(){
		return calle;
	}
	public void setCalle(String calle){
		this.calle = calle;
	}
	public int getNumero(){
		return numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getTamaño(){
		return tamaño;
	}
	public void setTamaño(int tamaño){
		this.tamaño = tamaño;
	}
	public int getPrecio(){
		return precio;
	}
	public void setPrecio(int precio){
		this.precio = precio;
	}
	
	
}				