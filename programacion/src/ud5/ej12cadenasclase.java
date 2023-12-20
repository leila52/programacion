package ud5;

import java.util.Scanner;

public class ej12cadenasclase {
	/*Realizar un programa en java que gestione los datos de stock de una
	tienda de comestibles,la información a recoger será: nombre del producto(no se
	puede repetir), precio, cantidad en stock.
	La tienda dispone de 10 productos distintos. El programa debe ser capaz de:
	1. Dar de alta un producto nuevo.
	2. Buscar un producto por su nombre.
	3. Modificar el stock y precio de un producto dado */
		//Vamos a almacenar cada producto en el formato
		// "nombre;stock;precio"
		static Scanner in;
		static String[] productos;
		static int pos;
		public static void main(String[] args) {
			//Construimos un array de productos, inicialmente
			//	cada posicion es null
			productos=new String[10];
			in=new Scanner(System.in);
			int opcion=1;
			pos=0;
			do {
				
				System.out.println("1. Dar de alta un producto nuevo.");
				System.out.println("2. Buscar un producto por su nombre.");
				System.out.println("3. Modificar el stock y precio de un producto dado.");
				System.out.println("4. Salir");
				opcion=in.nextInt();
				switch(opcion) {
				case 1:
					altaProducto();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					System.out.println("Opción no válida.");
				
				}
			}while(opcion!=4);

		}
	
		public static void altaProducto() {
			String producto="",nombre,stock,precio;
			System.out.println("Introduce nombre:");
			nombre =in.nextLine();
			System.out.println("Introduce stock:");
			stock=in.nextLine();
			System.out.println("Introduce precio:");
			precio=in.nextLine();
			// construyo los datos del producto en el formato:
			// "nombre;stock;precio"
			producto=nombre+";"+stock+";"+precio;
			// almaceno el producto si hay espacio
			if (pos<10) {
				productos[pos]=producto;
				pos++;
			}else {
				System.out.println("No hay espacio. Tienes 10 productos");
			}
	}
		public static void buscarProducto() {
			//limpiamos el buffer
			in.nextLine();
			System.out.println("introduce el nombre del producto a buscar");
			String nomBusca=in.nextLine();	
			//bucle para poder buscar el producto
			int indice2=productos(nomBusca);
			//si es diferente a menos 1 se enseña el producto si no no existe
			if(indice2 !=-1) {
				System.out.println("nombre "+productos[indice2]);
			}else {
				System.out.println("no se a encontrado el producto");
			}
			}
		public static void modProd () {
			System.out.println("¿cual es el nombre del producto que quiere modificar?");
			String nombre=in.next();
			
			int indice3=productos[nombre];
			if(indice3 !=-1) {
				System.out.println("introduzca el nuevo precio del producto");
				double nuvPrecio=in.nextDouble();
				
				precios[indice3]=nuvPrecio;
				
				System.out.println("introduzca la nueva cantidaddel producto");
				int nuvCantidad=in.nextInt();
				cantidades[indice3]=nuvCantidad;
				//informar al cliente de la modificacion
				System.out.println("se a modificaco corrrectamente");
			}else {
				System.out.println("No se a encontrado producto");
			}
		}

}
