package Sanvakentin;

import java.util.Scanner;

public class GestorSanValentin2 {
	static Scanner entrada=new Scanner(System.in);
	static Pareja [] parejas = new Pareja[10];
	static int cont=0;

	public static void main(String[] args) {
		
		int op;
		do {
			menu();
			op=entrada.nextInt();
			switch(op) {
			case 1:
				agregarinfo();
				break;
			case 2:
				mostrarDetallesParejas(parejas[0]);
				break;
			case 3:
				System.out.println("vuelve pronto");
				break;
				default://caso por defecto
					System.out.println("opccion no valida");
			}
		}while(op !=3);
	}
	public static void menu() {
		System.out.println("elige una opccion:");
		System.out.println("1.agregar pareja y sus regalos");
		System.out.println("2.Mostrar detalles de las parejas y sus regalos");
		System.out.println("3.salir del programa");
	}
	
	public static void agregarinfo() {
		entrada.nextLine();
		System.out.println("introduca dni persona1 ");
		String dni1=entrada.nextLine();
		
		System.out.println("introduzca su nombre persona1 ");
		String nom1=entrada.nextLine();
		Persona perso1 = new Persona(dni1,nom1);
		
		
		System.out.println("introduca dni persona2 ");
		String dni2=entrada.nextLine();
		System.out.println("introduzca su nombre persona2 ");
		String nom2=entrada.nextLine();
		Persona perso2 = new Persona(dni2,nom2);
		
		System.out.println("el nombre del regalo");
		String nom1rega=entrada.nextLine();
		System.out.println("el precio del regalo que va a hacer");
		double precio1regalo=entrada.nextDouble();
		entrada.nextLine();
		System.out.println("la descripccion del regalo ");
		String desc1regal=entrada.nextLine();
		Regalo regalo1 = new Regalo(nom1rega,precio1regalo,desc1regal);
		
		System.out.println("el nombre del regalo");
		String nom2rega=entrada.nextLine();
		System.out.println("el precio del regalo que va a hacer");
		double precio2regalo=entrada.nextDouble();
		entrada.nextLine();
		System.out.println("la descripccion del regalo ");
		String desc2regal=entrada.nextLine();
		Regalo regalo2 = new Regalo(nom2rega,precio2regalo,desc2regal);
		
		Pareja pareja = new Pareja(perso1,perso2);
		parejas[cont]=pareja;
		pareja.setRegaloparapersona1(regalo1);
		pareja.setRegaloparapersona2(regalo2);
		cont++;
	}
	static void mostrarDetallesParejas(Pareja pareja) {
		pareja.CosteTotal();
		System.out.println("Los regalos que se han hecho: ");
		System.out.println(pareja.mostrardetalles());
		System.out.println("La informacion de la pareja junto a sus regalos:");
		System.out.println(pareja.toString());
	}
}
