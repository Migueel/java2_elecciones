
import java.util.*;
import java.io.*;

public class Elecciones {

	public static void main(String[] args) throws IOException {
	
	//String opcion;

	Scanner sc = new Scanner(System.in);
	//System.out.println("Elige una opcion: Habitante, ayuntamiento, espacio publico, inmueble o partido");
	

	//opcion = sc.next();

//HABITANTE

	//if (opcion.equalsIgnoreCase("habitante")) {
		System.out.println("Introduce los siguientes datos del habitante:");
		System.out.println(" ");

		String habitanteNombre = null;
		String habitanteApellido = null;
		int edad = 0;
		String dni = null;

	    Habitante habitante = new Habitante(habitanteNombre, habitanteApellido, edad, dni);
		
		System.out.println("Nombre del habitante: ");
		habitanteNombre = sc.next();
		
		habitante.setHabitanteNombre(habitanteNombre);

		System.out.println("Apellido del habitante: ");
		habitanteApellido = sc.next();
		
		habitante.setHabitanteApellido(habitanteApellido);
		
		System.out.println("Edad de " + habitante.getHabitanteNombre() + " " + habitante.getHabitanteApellido());
		edad = sc.nextInt();
		
		habitante.setEdad(edad);

		System.out.println("DNI de " + habitante.getHabitanteNombre() + " " + habitante.getHabitanteApellido());
		dni = sc.next();
		
		habitante.setDni(dni);

		

		//}

//AYUNTAMIENTO

	//else if (opcion.equalsIgnoreCase("ayuntamiento")) {
		System.out.println("Introduce los siguientes datos del ayuntamiento:");
		System.out.println(" ");

		String calle = null;
		String pueblo = null;
		String alcaldeNombre = null;
		String alcaldeApellido = null;
			
		Ayuntamiento ayuntamiento = new Ayuntamiento(calle, pueblo, alcaldeNombre, alcaldeApellido);
		
		System.out.println("Pueblo en el que esta situado el ayuntamiento: ");
		pueblo = sc.next();
		
		ayuntamiento.setPueblo(pueblo);

		System.out.println("Calle en la que esta situado el ayuntamiento: ");
		calle = sc.next();
		
		ayuntamiento.setCalle(calle);
		
		System.out.println("Nombre del alcalde de dicho ayuntamiento: ");
		alcaldeNombre = sc.next();
		
		ayuntamiento.setAlcaldeNombre(alcaldeNombre);

		System.out.println("Apellido del alcalde de dicho ayuntamiento: ");
		alcaldeApellido = sc.next();
		
		ayuntamiento.setAlcaldeApellido(alcaldeApellido);

		

		//}

//INMUEBLE

	//else if (opcion.equalsIgnoreCase("inmueble")) {
		System.out.println("Introduce los siguientes datos del inmueble:");
		System.out.println(" ");

		//String pueblo = null;
		//String calle = null;
		int numero = 0;
		int tamaño = 0;
		int precio = 0;
			
		Inmueble inmueble = new Inmueble(pueblo, calle, numero, tamaño, precio);
		
		System.out.println("Pueblo en el que esta situado el inmueble: ");
		pueblo = sc.next();
		
		inmueble.setPueblo(pueblo);

		System.out.println("Calle en la que esta situado el inmueble: ");
		calle = sc.next();
		
		inmueble.setCalle(calle);
		
		System.out.println("Numero de portal del inmueble: ");
		numero = sc.nextInt();
			
		inmueble.setNumero(numero);

		System.out.println("Tamaño del inmueble: ");
		tamaño = sc.nextInt();

		inmueble.setTamaño(tamaño);

		System.out.println("Precio del inmueble: ");
		precio = sc.nextInt();

		inmueble.setPrecio(precio);

		

	//	}

//ESPACIO PUBLICO	

	//else if (opcion.equalsIgnoreCase("espaciopublico")) {
		System.out.println("Introduce los siguientes datos del espacio publico:");
		System.out.println(" ");

		String ubicacion = null;
		//int tamaño = 0;
		int capacidad = 0;
			
		EspacioPublico espacio = new EspacioPublico(ubicacion, tamaño, capacidad);
		
		System.out.println("Ubicacion del espacio publico: ");
		ubicacion = sc.next();
		
		espacio.setUbicacion(ubicacion);

		System.out.println("Tamaño del espacio publico: ");
		tamaño = sc.nextInt();
		
		espacio.setTamaño(tamaño);
		
		System.out.println("Capacidad del espacio publico: ");
		capacidad = sc.nextInt();
		
		espacio.setCapacidad(capacidad);

		
			
	//	}

//PARTIDO

	//else if (opcion.equalsIgnoreCase("partido")) {
		System.out.println("Introduce los siguientes datos del partido:");
		System.out.println(" ");

		String nombrePartido = null;
		String presidenteNombre = null;
		String presidenteApellido= null;
		int afiliados = 0;
		String sede = null;
			
		Partido partido = new Partido(nombrePartido, presidenteNombre, presidenteApellido, afiliados, sede);
		
		System.out.println("Nombre del partido politico");
		nombrePartido = sc.next();

		partido.setNombrePartido(nombrePartido);

		System.out.println("Nombre del presidente del partido: ");
		presidenteNombre = sc.next();
		
		partido.setPresidenteNombre(presidenteNombre);

		System.out.println("Apellido del presidente del partido: ");
		presidenteApellido = sc.next();
		
		partido.setPresidenteApellido(presidenteApellido);

		System.out.println("Numero de afiliados del partido: ");
		afiliados = sc.nextInt();

		partido.setAfiliados(afiliados);		
		
		System.out.println("Ubicacion de la sede del partido: ");
		sede = sc.next();
		
		partido.setSede(sede);

		

	//	}

	String nombreFichero = "listadosPartidos.txt";
	String ruta = "/home/zubiri/ProyectosJava/java2_elecciones/src";
	String salida;
	
	
	/*try {
	
		File archivo = new File(ruta, nombreFichero);
		
		FileReader leer = new FileReader (archivo);
		
		BufferedReader bf = new BufferedReader (leer);
		salida = bf.readLine();
		
		List<String> aList = new ArrayList<String>(Arrays.asList(salida.split(",")));
		System.out.println("Estos son los partidos que hay disponibles: ");
		
		ArrayList <String> lista = new ArrayList <String>();
		String fila=bf.readLine();
		 
	
		for(int r=0;r<aList.size();r++){
			System.out.println("- " + aList.get(r));
		}
	}
	catch (FileNotFoundException e){
		System.out.println(e.getMessage());
	}
		*/
	File listaPartidos = new File("/home/zubiri/Proyectos_java/java2_elecciones/src/listaPartidos.txt");
	FileInputStream fis = new FileInputStream(listaPartidos);
	InputStreamReader isr = new InputStreamReader(fis);
	BufferedReader br = new BufferedReader(isr);

	ArrayList<Partido> partidosCompletos = new ArrayList<Partido>();
	String linea;
	linea = br.readLine();

	while(linea!=null){
		String [] campos = linea.split(",");
		Partido partidos = new Partido();
		
		partidos.setNombrePartido(campos[0]);
		partidos.setPresidente(campos[1]);
		int num = Integer.parseInt(campos[2]);
		partidos.setNumeroAfiliados(num);
		partidos.setSede(campos[3]);
		partidosCompletos.add(partidos);
		linea = br.readLine();
	}
	for (int j = 0; j < partidosCompletos.size(); j++) 
	partidosCompletos[j];
	}
/*
//HABITANTE
	System.out.println( "DATOS DEL HABITANTE");
	System.out.println( "Nombre: " + habitante.getHabitanteNombre());
	System.out.println( "Apellido: " + habitante.getHabitanteApellido());
	System.out.println( "Edad: " + habitante.getEdad());
	System.out.println( "DNI: " + habitante.getDni());
	
//AYUNTAMIENTO
	System.out.println( "DATOS DEL AYUNTAMIENTO DE " + ayuntamiento.getPueblo());
	System.out.println( "Pueblo: " + ayuntamiento.getPueblo());
	System.out.println( "Calle: " + ayuntamiento.getCalle());
	System.out.println( "Alcalde: " + ayuntamiento.getAlcaldeNombre() +" " + ayuntamiento.getAlcaldeApellido());
	
//INMUEBLE
	System.out.println( "DATOS DEL INMUEBLE");
	System.out.println( "Pueblo: " + inmueble.getPueblo());
	System.out.println( "Direccion: " + inmueble.getCalle() + ", nº " + inmueble.getNumero());
	System.out.println( "Tamaño: " + inmueble.getTamaño() + " m2");
	System.out.println( "Precio: " + inmueble.getPrecio() + "€");
	
//ESPACIO PUBLICO
	System.out.println( "DATOS DEL ESPACIO PUBLICO");
	System.out.println( "Ubicacion: " + espacio.getUbicacion());
	System.out.println( "Tamaño: " + espacio.getTamaño() + " m2");
	System.out.println( "Capacidad: " + espacio.getCapacidad());
	
//PARTIDO POLITICO
	System.out.println( "DATOS DEL PARTIDO POLITICO");
	System.out.println( "Presidente: " + partido.getPresidenteNombre() +" " + partido.getPresidenteApellido());
	System.out.println( "Afiliados: " + partido.getAfiliados());
	System.out.println( "Sede: " + partido.getSede());
*/
}
}




		