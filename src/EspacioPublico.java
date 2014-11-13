public class EspacioPublico {
	
	private String ubicacion;
	private int tamaño = 0;
	private int capacidad = 0;

	public EspacioPublico(String ubicacion, int tamaño, int capacidad){
		this.ubicacion = ubicacion;
		this.tamaño = tamaño;
		this.capacidad = capacidad;
	}

	public String getUbicacion(){
		return ubicacion;
	}
	public void setUbicacion(String ubicacion){
		this.ubicacion = ubicacion;
	}
	public int getTamaño(){
		return tamaño;
	}
	public void setTamaño(int tamaño){
		this.tamaño = tamaño;
	}
	public int getCapacidad(){
		return capacidad;
	}
	public void setCapacidad(int capacidad){
		this.capacidad = capacidad;
	
			
	}
	
	
}				

