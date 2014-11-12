
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
	char opcion; 
	String result;

	Scanner sc = new Scanner(System.in);
	System.out.println("elige una opcion: Habitante 'H', ayuntamiento'A', espacio publico'E', inmueble'I' o partido'P'");

	opcion = sc.next();

	if (opcion = "Habitante") {
		Habitante habit = new Habitante();

		System.out.println("Introduce los siguientes datos del habitante");
		System.out.println("Nombre: ");
		
		nombre = sc.next();
		habit.setNombre(nombre);
		
	}

	}
}