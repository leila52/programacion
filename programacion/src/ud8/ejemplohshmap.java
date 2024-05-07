package ud8;

import java.awt.Menu;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ejemplohshmap {
	public static void main(String[] args) {
		HashMap<Integer,String> nombres =new HashMap<Integer,String>();
		int opcion=1;
		Scanner entrada=new Scanner(System.in);
		int clave;
		String nombre="";
		do {
				Menu();
			System.out.println("Introduce una opción:");
			opcion=entrada.nextInt();
			switch (opcion) {
			//Insertar
			case 1:
				do {
					System.out.println("Introduce clave");
					clave=entrada.nextInt();
					entrada.nextLine();
				}while (nombres.containsKey(clave));
				System.out.println("Nombre");
				nombre=entrada.nextLine();
				nombres.put(clave, nombre);
			break;
			//Listar todo
			case 2:
			Set<Integer> claves=nombres.keySet();
			for (Integer key : claves) {
				System.out.println("clave:"+key+" valor:"+nombres.get(key));
			}
			break;
			//borrar
			case 3:
			System.out.println("Introduce clave a borrar");
			clave=entrada.nextInt();
			if (nombres.containsKey(clave)) 
				nombres.remove(clave);
			
			break;
			default:
				System.out.println("opcion no valida,introduzca otra devuelta");
			break;
			}
		}while (opcion!=0);


	}
	public static void Menu() {
		System.out.println("0.salir");
		System.out.println("1.insertar");
		System.out.println("2.listar");
		System.out.println("3.borrar");
	}
}
