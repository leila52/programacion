package ud8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class carritoCompra {
	public static void main(String[] args) {
		HashMap<String, Integer> productos =new HashMap<String, Integer>();
		int opcion=1;
		Scanner entrada=new Scanner(System.in);
		
		do {
			Menu();
			System.out.println("Introduce una opción:");
			opcion=entrada.nextInt();
			entrada.nextLine();
			switch (opcion) {
			//Insertar
			case 1:
				System.out.println("Introduce el nombre del producto:");
                String nombre = entrada.nextLine();
                
                System.out.println("Introduce la cantidad:");
                int cantidad = entrada.nextInt();
                agregarProducto(productos,nombre,cantidad);
                break;
			//borrar , si ya hay n producto se le resta a la clave q es la cantidad en este caso
			case 2:
				 System.out.println("Introduce el nombre del producto a eliminar:");
                 String productoEliminar = entrada.nextLine();
                 eliminarProducto(productos, productoEliminar);
                 break;
			//listar
			case 3:
				mostrarCarrito(productos);
				break;
			default:
				System.out.println("opcion no valida,introduzca otra devuelta");
			break;
			}
		}while (opcion!=0);


	}
	public static void Menu() {
		System.out.println("0.salir");
		System.out.println("1.añladir al carrito");
		System.out.println("2.quitar del carrito");
		System.out.println("3.mostrar del carrito");
	}
	public static void agregarProducto(HashMap<String, Integer> productos, String nombre, int cantidad) {
		 if (productos.containsKey(nombre)) {
	            //si el producto ya está en el carrito, se actualiza la cantidad
	            productos.put(nombre, productos.get(nombre) + cantidad);
	        } else {
	            productos.put(nombre, cantidad);
	        }
	        System.out.println("Producto agregado al carrito.");
	}
	public static void eliminarProducto(HashMap<String, Integer> productos, String nombre) {
		if(productos.containsKey(nombre)) {
			int cantidad=productos.get(nombre);
			if(cantidad > 1 ) {
				//si ya hay mas de uno se le resta uno
				//metodo put: para agregar un nuevo elemento
				//al HashMap o para actualizar el valor asociado a una clave existente
				productos.put(nombre, cantidad -1);
				System.out.println("se ha eliminado un "+ nombre+"del carrito");
				
			}else {
				//si solo hay uno se borra completamente
				productos.remove(nombre);
				System.out.println("se ha eliminado completamente el producto : "+nombre);
				
			}
		}else {
			System.out.println("no existe el producto");
		}
	}
	
	public static void mostrarCarrito(HashMap<String, Integer> productos) {
		System.out.println("los productos del carrito de la compra: ");
		if(productos.isEmpty()) {
			System.out.println("el carrito esta vacio vacio");
		}else {
			 for (String nombreProducto : productos.keySet()) {
		            int cantidad = productos.get(nombreProducto);
		            System.out.println("producto: "+nombreProducto + " cantidad: " + cantidad);
		        }
		}
		
	}
}
