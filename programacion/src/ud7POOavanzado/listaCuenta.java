package ud7POOavanzado;

import java.util.ArrayList;
import java.util.Scanner;

import unidad6ObjetosBasico.Cuenta;

public class listaCuenta {
	static Scanner in=new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Cuenta> cuenta= new ArrayList<Cuenta>();
		int op;
		do {
			menu();
			op=in.nextInt();
			switch(op) {
			case 1:
				System.out.println("dame el nombre del titular");
				String nombre=in.nextLine();
				in.nextLine();
				System.out.println("dame la cantidad de dinero");
				double cantidad=in.nextDouble();
				Cuenta cuent1=new Cuenta(nombre,cantidad);
				cuenta.add(cuent1);
				System.out.println("se ha añadido correctamente");
				
				break;
			case 2:
				System.out.println("q posicion quieres eliminar");
				int eliminar=in.nextInt();
				if(cuenta.size()>eliminar) {
					cuenta.remove(eliminar);
					System.out.println("se ha eliminado el numero: "+eliminar);
				}
				
				break;
			case 3:
				System.out.println("introduce el nombre que buscas");
				String nombr=in.nextLine();
				in.nextLine();
				for(int i=0;i<cuenta.size();i++) {
					if(cuenta.get(i).dameTitular().equals(nombr)) {
						System.out.println(cuenta.get(i).dameCuenta());
					}else {
						System.out.println("no hay");
					}
				}
				break;
			case 4:
				System.out.println("vuelve pronto");
				break;
				default:
					System.out.println("opccion no valida");
			}
		}while (op<=4);

	}
	public static void menu() {
		System.out.println("1.añadir nueva cuenta");
		System.out.println("2eliminar cuenta");
		System.out.println("3.listar cuentas por titula");
		System.out.println("4.salir");
	}

}
