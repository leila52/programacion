package ud8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class carritoCompra {
	public static void main(String[] args) {
		HashMap<Integer,String> nombres =new HashMap<Integer,String>();
		int opcion=1;
		Scanner entrada=new Scanner(System.in);
		int clave=1;
		String nombre="";
		do {
			Menu();
			System.out.println("Introduce una opción:");
			opcion=entrada.nextInt();
			switch (opcion) {
			//Insertar
			case 1:
				System.out.println("Introduce el nombre");
				nombre=entrada.nextLine();
				entrada.nextLine();
				//recorrer toda la lista,si ya existe y quiere añadir otra mas se suma la clave
				if(nombre.equals(nombre)) {
					clave++;
				}
				
				nombres.put(clave,nombre);
			break;
			//borrar , si ya hay n producto se le resta a la clave q es la cantidad en este caso
			case 2:
				System.out.println("Introduce clave a borrar");
				clave=entrada.nextInt();
				if (nombres.containsKey(clave)) 
					nombres.remove(clave);
			break;
			//listar
			case 3:
			
			Set<Integer> claves=nombres.keySet();
			for (Integer key : claves) {
				System.out.println(" nombre:"+nombres.get(key)+"cantdad"+key);
			}
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

}
