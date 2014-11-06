
public class Habitante {
	
	String nombre;
	int edad = 0;
	String dni;

	public Habitante(String nombre, int edad, String dni){
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public String getDni(){
		return dni;
	}
	public void setDni(String dni){
		this.dni = dni;
	}
	
	public boolean puedeVotar(){
		
		if (this.edad>=18) {
			return true;
			
		}
		else {
			return false;
		}

	}
}				