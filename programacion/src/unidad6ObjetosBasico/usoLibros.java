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
		
		
		System.out.println("estos son todos los libros: "+"\n.");
		System.out.println(conjunto1.toString());
		
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
		System.out.println("2 eliminar libro por autor");
		System.out.println("3 eliminar libro por titulo");
		System.out.println("4 mostrar mayor calificacion: ");
		System.out.println("5 mostrar menor calificacion");
		System.out.println("6 salir");
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
