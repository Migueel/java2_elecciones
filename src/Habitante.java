
public class Habitante {
	
	private String habitanteNombre;
	private String habitanteApellido;
	private int edad = 0;
	private String dni;

	public Habitante(String habitanteNombre, String habitanteApellido, int edad, String dni){
		this.habitanteNombre = habitanteNombre;
		this.habitanteApellido = habitanteApellido;
		this.edad = edad;
		this.dni = dni;
	}

	public String getHabitanteNombre(){
		return habitanteNombre;
	}
	public void setHabitanteNombre(String habitanteNombre){
		this.habitanteNombre = habitanteNombre;
	}
	public String getHabitanteApellido(){
		return habitanteApellido;
	}
	public void setHabitanteApellido(String habitanteApellido){
		this.habitanteApellido = habitanteApellido;
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
	
	
}				