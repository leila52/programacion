package ud5;

import java.util.Scanner;

public class ej12cadenas {
/*Realizar un programa en java que gestione los datos de stock de una
tienda de comestibles,la información a recoger será: nombre del producto(no se
puede repetir), precio, cantidad en stock.
La tienda dispone de 10 productos distintos. El programa debe ser capaz de:
1. Dar de alta un producto nuevo.
2. Buscar un producto por su nombre.
3. Modificar el stock y precio de un producto dado */
	static Scanner entrada=new Scanner(System.in);
	//ya q son globales para q funcionen en las funciones
	static String[] nombres=new String[10];
	static double[] precios = new double[10];
    static int[] cantidades = new int[10];
    static int cantProd = 0;
	public static void main(String[] args) {
		int opcion;
		do {
		mostrarMenu();
		opcion=entrada.nextInt();
		switch(opcion) {
		case 1:
			darAlta();
			break;
		case 2:
			busProdNom();
			break;
		case 3:
			modProd();
			break;
		case 4:
			System.out.println("Saliendo del proograma");
			default:
				System.out.println("opcion no valida,intentelo de nuevo");
		}
	}while(opcion!=4);
	}
	public static void mostrarMenu() {
		System.out.println("Seleccione una opciób: ");
		System.out.println("1.Dar de alta un producto nuevo");
		System.out.println("2. Buscar un producto por su nombre");
		System.out.println("3. Modificar el stock y precio de un producto");
		System.out.println("4.Salir");
	}
	public static void darAlta() {
		if(cantProd <nombres.length) {
			System.out.println("introduce el nombre del producto");
			String nombre=entrada.next();
			//creamos un indice de productos
			int indice=buscPod(nombre);
			if(indice==-1) {
				System.out.println("ingresa el precio");
				double precio=entrada.nextDouble();
				System.out.println("ingrseala cantidad");
				int cantidad=entrada.nextInt();
				nombres[cantProd]=nombre;
				precios[cantProd]=precio;
				cantidades[cantProd]=cantidad;
				cantProd++;
				System.out.println("ya se a dado de alta el producto");
				}else {
					System.out.println("ya existe un producto con ese nombre");
				}
		}else {
			System.out.println("No hay mas espacio para mas productos");
		}
		
	}
	// funcion para buscar el producto
	public static int buscPod(String nombre) {
		for(int i=0;i<cantProd;i++) {
			// metodo equalsIgnoreCase(String cadena2) → método que compara dos cadenas
			//(ignorando mayúsculas y minúsculas) y devuelve el resultado
			if(nombres[i].equalsIgnoreCase(nombre)) {
				return i;
			}
		}
		//no se el xq
		return -1;
	}
	public static void busProdNom () {
		System.out.println("¿cual es el nombre del producto que quiere buscar?");
		String nombre=entrada.next();
		
		int indice2=buscPod(nombre);
		//si es diferente a menos 1 se enseña el producto si no no existe
		if(indice2 !=-1) {
			System.out.println("nombre "+nombres[indice2]);
			System.out.println("precio "+precios[indice2]);
			System.out.println("Cantidad en almacen "+cantidades[indice2]);
		}else {
			System.out.println("no se a encontrado el producto");
		}
	}
	public static void modProd () {
		System.out.println("¿cual es el nombre del producto que quiere modificar?");
		String nombre=entrada.next();
		
		int indice3=buscPod(nombre);
		if(indice3 !=-1) {
			System.out.println("introduzca el nuevo precio del producto");
			double nuvPrecio=entrada.nextDouble();
			
			precios[indice3]=nuvPrecio;
			
			System.out.println("introduzca la nueva cantidaddel producto");
			int nuvCantidad=entrada.nextInt();
			cantidades[indice3]=nuvCantidad;
			//informar al cliente de la modificacion
			System.out.println("se a modificaco corrrectamente");
		}else {
			System.out.println("No se a encontrado producto");
		}
	}
}