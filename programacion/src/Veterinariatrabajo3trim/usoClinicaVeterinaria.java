package Veterinariatrabajo3trim;

import java.util.ArrayList;
import java.util.Scanner;

public class usoClinicaVeterinaria {
	static ClinicaVeterinaria clinica=new ClinicaVeterinaria();
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int op;
		do {
			menu();
			op=in.nextInt();
			switch(op) {
			case 1:
				agregarAnimal(clinica);
				break;
			case 2:
				in.nextLine();
				System.out.println("ingresa el nombre al animal q quieres buscar");
				String nombre=in.nextLine();
				
				
				 Animal animalEncontrado = clinica.buscarAnimal(nombre);

				    if (animalEncontrado != null) {
				        System.out.println("El animal fue encontrado:");
				        System.out.println(animalEncontrado.DameDatosAnimal());
				    } else {
				        System.out.println("No se encontró ningún animal con ese nombre.");
				    }
				break;
			case 3:
				modificarcomentario(clinica);
				break;
			case 4:
				System.out.println("la ficha de animales de la clinica: ");
				System.out.println(clinica.toString());
				break;	
			case 5:
				System.out.println("saliendo bye bye");
				break;	
			default:
				System.out.println("opcion erronea elige otra opccion");
				
				
			}
			
			
		}while(op!=5);
	

	}
	public static void menu() {
		System.out.println("---clinica veterinaria---");
		System.out.println("1.añadir animal");
		System.out.println("2. buscar animal con el nombre");
		System.out.println("3.modificar comentario de un animal");
		System.out.println("4.mostrar todas las fichas de animales");
		System.out.println("5.salir");
		System.out.println("elige una opccion");
		
	}
	
	//agregar animal
	public static void agregarAnimal(ClinicaVeterinaria clinica) {
		System.out.println("ingresa los datos del animalito");
		in.nextLine();
		System.out.println("introduzca el nombre");
		String nombre=in.nextLine();
		
		System.out.println("introduce fecha de nacimiento");
		String fechaNacimiento=in.nextLine();
		System.out.println("introduzca el comentario");
		String comentarios=in.nextLine();
		System.out.println("introduce el peso");
		double peso=in.nextDouble();
		in.nextLine();
		System.out.println("que tipo de animal quiere");
		System.out.println("1.perro");
		System.out.println("2.gato");
		System.out.println("3.pajaro");
		System.out.println("4.reptil");
		System.out.println("elige una opcion");
		int opcionAnimal=in.nextInt();
		in.nextLine();
		switch(opcionAnimal) {
		case 1:
			agregarPerro(clinica,nombre,fechaNacimiento,comentarios,peso);
			break;
		case 2:
			agregarGato(clinica,nombre,fechaNacimiento,comentarios,peso);
			break;
		case 3:
			agregarPajaro(clinica,nombre,fechaNacimiento,comentarios,peso);
			break;
		case 4:
			agregarReptil(clinica,nombre,fechaNacimiento,comentarios,peso);
			break;
		default:
			System.out.println("opcion no valida el animal no a sido agregado");
		}
	}
	
	
	private static void agregarPerro(ClinicaVeterinaria clinica, String nombre, String fechaNacimiento, String comentarios, double peso) {
		System.out.println("introduce la raza : PastorAleman, Husky o FoxTerrier  ");
		String raza=in.nextLine();
		System.out.println("introduce el microchip ");
		String microchip =in.nextLine();
		Perro perro=new Perro(nombre, fechaNacimiento, comentarios, peso, raza, microchip);
		clinica.insertarAnimal(perro);
		System.out.println("perro agregado");
	}
	private static void agregarGato(ClinicaVeterinaria clinica, String nombre, String fechaNacimiento, String comentarios, double peso) {
	    System.out.print("introduce la raza :  Comun, Siames, Persa, Angora, ScottishFold. ");
	    String raza = in.nextLine();
	    System.out.print("introduce el microchip ");
	    String microchip = in.nextLine();
	    Gato gato = new Gato(nombre, fechaNacimiento, comentarios, peso, raza, microchip);
	    clinica.insertarAnimal(gato);
	    System.out.println(" gato agregado");
	}

	private static void agregarPajaro(ClinicaVeterinaria clinica, String nombre, String fechaNacimiento, String comentarios, double peso) {
	    System.out.print("introduce la especie : Canario, Periquito, Agapornis. ");
	    String especie = in.nextLine();
	    System.out.print("es cantor (true/false) ");
	    boolean cantor = in.nextBoolean();
	    in.nextLine(); 
	    Pajaro pajaro = new Pajaro(nombre, fechaNacimiento, comentarios, peso, especie, cantor);
	    clinica.insertarAnimal(pajaro);
	    System.out.println("pájaro agregado ");
	}

	private static void agregarReptil(ClinicaVeterinaria clinica, String nombre, String fechaNacimiento, String comentarios, double peso) {
	    System.out.print("introduce la especie :  Tortuga, Iguana, DragonDeComodo. ");
	    String especie = in.nextLine();
	    System.out.print("es venenoso (true/false) ");
	    boolean venenoso = in.nextBoolean();
	    in.nextLine();
	    Reptil reptil = new Reptil(nombre, fechaNacimiento, comentarios, peso, especie, venenoso);
	    clinica.insertarAnimal(reptil);
	    System.out.println("El reptil  agregado ");
	}
	
	
	//modificacion de comentario
	public static void modificarcomentario(ClinicaVeterinaria clinica) {
		in.nextLine();
		System.out.println("ingresa el nombre del cual quieres modificar comentario");
		String nombre=in.nextLine();
		System.out.println("ingresa el comentario");
		String comentario=in.nextLine();
		if(clinica.modificarComentarioAnimal(nombre, comentario)) {
			System.out.println("el comentario se modifico ");
		}else {
			System.out.println("no se encontro el animal");
		}
	}
	
	
	
	
}
