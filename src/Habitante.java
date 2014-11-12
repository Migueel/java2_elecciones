
public class Habitante {
	
	private String nombre;
	private String apellido;
	private int edad = 0;
	private String dni;

	public Habitante(String nombre, String apellido, int edad, String dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getApellido(){
		return nombre;
	}
	public void setApellido(String apellido){
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