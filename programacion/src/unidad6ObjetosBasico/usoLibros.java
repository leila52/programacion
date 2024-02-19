package unidad6ObjetosBasico;

import java.util.Scanner;

public class usoLibros {
	static Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
		ConjutoLibros conjunto1 = new  ConjutoLibros();
		
		Libro libro = new Libro("quijote","cervantes",456,8);
		conjunto1.anadirlibros(libro);
		Libro libro1 = new Libro("cuento perfecto","bennet",4896,9);
		conjunto1.anadirlibros(libro1);
		Libro libro2 = new Libro("divergente","cusco",896,7);
		conjunto1.anadirlibros(libro2);
		
		conjunto1.mostrarMayorCalificacion();
		conjunto1.mostrarMenorCalificacion();
		conjunto1.eliminarlibroAutor("bennet");
		
		
		System.out.println("estos son todos los libros: "+"\n.");
		System.out.println(conjunto1.toString());
		
		
		
		System.out.println();
		ConjuntoLibros2 conj1 = new ConjuntoLibros2();
		
		Libro libroA = new Libro ("Los juegos del hambre", "Sussy", 300, 9);
		Libro libroB = new Libro ("Orgullo y prejuicio", "Jane Austin", 400, 4);
		Libro libroC = new Libro ("La Celestina", "Fer", 250, 6);
		Libro libroD = new Libro ("La Celestina", "per", 250, 6);
		
		conj1.agregarLibros(libroA);
		conj1.agregarLibros(libroB);
		
		
		int op = 0;
		do {
			menu();
			op = in.nextInt();
			in.nextLine();
			switch(op) {
			case 1:
				if(conj1.agregarLibros(libroC)) {
					System.out.println("Se ha agregado correctamente.");
				}else {
					System.out.println("ERROR: el conjunto ya está lleno.");
				}
				break;
			case 2:
				System.out.println("Introduce el nombre o título del libro: ");
				String nombre = in.nextLine();
				if(conj1.eliminarLibroPorAutor(nombre)) {
					System.out.println("Se ha podido eliminar correctamente por el nombre del autor.");
				}else if(conj1.eliminarLibroPorTitulo(nombre)){
					System.out.println("Se ha podido eliminar correctamente por el nombre del titulo.");
				}else {
					System.out.println("ERROR: no se ha podido eliminar.");
				}
				break;
			case 3:
				conj1.mejorPuntuacion();
				conj1.menorPuntuacion();
				break;
				
			case 4: 
				conj1.mostrarConjunto();
				break;
			case 6:
				conj1.agregarLibros(libroD);
				break;
			}
			}while(op != 5);
		
		
		
		// TODO Auto-generated method stub
		/*ConjutoLibros conjunto1 = new  ConjutoLibros();
		int opcion;
		//menú
		do {
			menu();
			//leemos opcion
			opcion=in.nextLine().charAt(0);
			switch(opcion) {
			case 1:
				in.nextLine();
				añadirlibro(conjunto1);
				break;
			case 2:
				System.out.println("dime el autor");
				String autor=in.nextLine();
				eliminarporautor(autor,conjunto1);
				break;
			case 3:
				System.out.println("dime el titulo");
				String titulo=in.nextLine();
				eliminarportitulo(titulo,conjunto1);
				break;
			case 4 :
				conjunto1.mostrarMayorCalificacion();
				break;
			case 5:
				conjunto1.mostrarMenorCalificacion();
				break;
			case 6 :
				System.out.println("vuelve pronto");
				break;
				default://caso por defecto
					System.out.println("opccion no valida");
			}
		}while(opcion !=7);
		
		*/
	}
	public static void menu() {
		System.out.println("elige una opccion:");
		System.out.println("1 añadir libro");
		System.out.println("2 eliminar libro por autor o titulo");
		System.out.println("3 mostrar mayor calificacion y mostrar menor calificacion ");
		System.out.println("4 mostrar conjunto ");
		System.out.println("5. salir");
	}
	public static void añadirlibro(ConjutoLibros conjunto1) {
		System.out.println("dame el titulo del lirbo");
		String titulo =in.nextLine();
		System.out.println("dame el autor del libro");
		String autor = in.nextLine();
		System.out.println("introduce el numero de paginas que tiene");
		int numPag = in.nextInt();
		System.out.println("introduce la calificacion:");
		int calificacion = in.nextInt();
		Libro book = new Libro(titulo,autor, numPag, calificacion);
		if(conjunto1.anadirlibros(book)== true) {
			System.out.println("se ha añadido correctamente");
		}else {
			System.out.println(" no se a podido añadir");
		}
		
	}
	public  static void eliminarporautor(String autor,ConjutoLibros conjunto1) {
		if(conjunto1.eliminarlibroAutor(autor)==true) {
			System.out.println("se a eliminado correctamente");
		}else {
			System.out.println("no se ha podido eliminar");
		}
	}
	public  static void eliminarportitulo(String titulo,ConjutoLibros conjunto1) {
		if(conjunto1.eliminarlibroAutor(titulo)==true) {
			System.out.println("se a eliminado correctamente");
		}else {
			System.out.println("no se ha podido eliminar");
		}
	}
	
	
}
