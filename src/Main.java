
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
	String opcion;

	Scanner sc = new Scanner(System.in);
	System.out.println("Elige una opcion: Habitante, ayuntamiento, espacio publico, inmueble o partido");

	opcion = sc.next();

	if (opcion.equalsIgnoreCase("habitante")) {
		String nombre = null;
		String apellido = null;
		int edad = 0;
		String dni = null;
			
		Habitante habitante = new Habitante(nombre, apellido, edad, dni);
		
		System.out.println("Introduce el nombre del habitante");
		nombre = sc.next();
		
		habitante.setNombre(nombre);

		System.out.println("Introduce el apellido");
		apellido = sc.next();
		
		habitante.setApellido(apellido);
		
		System.out.println("Introduce la edad de " + habitante.getNombre() + " " + habitante.getApellido());
		edad = sc.nextInt();
		
		habitante.setEdad(edad);

		System.out.println("Introduce el DNI de " + habitante.getNombre() + " " + habitante.getApellido());
		dni = sc.next();
		
		habitante.setDni(dni);

		
		System.out.println( "DATOS DEL HABITANTE");
		System.out.println( "Nombre: " + habitante.getNombre());
		System.out.println( "Apellido: " + habitante.getApellido());
		System.out.println( "Edad: " + habitante.getEdad());
		System.out.println( "DNI: " + habitante.getDni());
		}

	else if (opcion.equalsIgnoreCase("ayuntamiento")) {
		String calle = null;
		String pueblo = null;
		String alcaldeNombre = null;
		String alcaldeApellido = null;
			
		Ayuntamiento ayuntamiento = new Ayuntamiento(calle, pueblo, alcaldeNombre, alcaldeApellido);
		
		System.out.println("Introduce el pueblo en el que esta situado el ayuntamiento ");
		pueblo = sc.next();
		
		ayuntamiento.setPueblo(pueblo);

		System.out.println("Introduce la calle");
		calle = sc.next();
		
		ayuntamiento.setCalle(calle);
		
		System.out.println("Introduce el nombre del alcalde de dicho ayuntamiento");
		alcaldeNombre = sc.next();
		
		ayuntamiento.setAlcaldeNombre(alcaldeNombre);

		System.out.println("Introduce el apellido del alcalde de dicho ayuntamiento");
		alcaldeApellido = sc.next();
		
		ayuntamiento.setAlcaldeApellido(alcaldeApellido);

		
		System.out.println( "DATOS DEL AYUNTAMIENTO DE " + ayuntamiento.getPueblo());
		System.out.println( "Pueblo: " + ayuntamiento.getPueblo());
		System.out.println( "Calle: " + ayuntamiento.getCalle());
		System.out.println( "Alcalde: " + ayuntamiento.getAlcaldeNombre() +" " + ayuntamiento.getAlcaldeApellido());
			
		}

	else if (opcion.equalsIgnoreCase("inmueble")) {
		String pueblo = null;
		String calle = null;
		int numero = 0;
		int tamaño = 0;
		int precio = 0;
			
		Inmueble inmueble = new Inmueble(pueblo, calle, numero, tamaño, precio);
		
		System.out.println("Introduce el pueblo en el que esta situado el inmueble");
		pueblo = sc.next();
		
		inmueble.setPueblo(pueblo);

		System.out.println("Introduce la calle");
		calle = sc.next();
		
		inmueble.setCalle(calle);
		
		System.out.println("Introduce el numero del portal");
		numero = sc.nextInt();
		
		inmueble.setNumero(numero);

		System.out.println("Introduce el tamaño del inmueble");
		tamaño = sc.nextInt();

		inmueble.setTamaño(tamaño);

		System.out.println("Introduce el precio del inmueble");
		precio = sc.nextInt();

		inmueble.setPrecio(precio);

		
		System.out.println( "DATOS DEL INMUEBLE");
		System.out.println( "Pueblo: " + inmueble.getPueblo());
		System.out.println( "Direccion: " + inmueble.getCalle() + ", nº " + inmueble.getNumero());
		System.out.println( "Tamaño: " + inmueble.getTamaño() + " m2");
		System.out.println( "Precio: " + inmueble.getPrecio() + "€");
		
		}

	else if (opcion.equalsIgnoreCase("Espacio")) {
		String ubicacion = null;
		int tamaño = 0;
		int capacidad = 0;
			
		EspacioPublico espacio = new EspacioPublico(ubicacion, tamaño, capacidad);
		
		System.out.println("Introduce el lugar en el que esta ubicado este espacio publico");
		ubicacion = sc.next();
		
		espacio.setUbicacion(ubicacion);

		System.out.println("Introduce el tamaño");
		tamaño = sc.nextInt();
		
		espacio.setTamaño(tamaño);
		
		System.out.println("Introduce la capacidad de la que dispone dicho espacio");
		capacidad = sc.nextInt();
		
		espacio.setCapacidad(capacidad);

		
		System.out.println( "DATOS DEL ESPACIO PUBLICO");
		System.out.println( "Ubicacion: " + espacio.getUbicacion());
		System.out.println( "Tamaño: " + espacio.getTamaño() + " m2");
		System.out.println( "Capacidad: " + espacio.getCapacidad());
			
		}

	else if (opcion.equalsIgnoreCase("partido")) {
		String presidenteNombre = null;
		String presidenteApellido= null;
		int afiliados = 0;
		String sede = null;
			
		Partido partido = new Partido(presidenteNombre, presidenteApellido, afiliados, sede);
		
		System.out.println("Introduce el nombre del presidente del partido");
		presidenteNombre = sc.next();
		
		partido.setPresidenteNombre(presidenteNombre);

		System.out.println("Introduce su apellido");
		presidenteApellido = sc.next();
		
		partido.setPresidenteApellido(presidenteApellido);

		System.out.println("Introduce el numero de afiliados del partido");
		afiliados = sc.nextInt();

		partido.setAfiliados(afiliados);		
		
		System.out.println("Introduce la ubicacion de la sede del partido");
		sede = sc.next();
		
		partido.setSede(sede);

		
		System.out.println( "DATOS DEL PARTIDO POLITICO");
		System.out.println( "Presidente: " + partido.getPresidenteNombre() +" " + partido.getPresidenteApellido());
		System.out.println( "Afiliados: " + partido.getAfiliados());
		System.out.println( "Sede: " + partido.getSede());

		}
	}
}


		