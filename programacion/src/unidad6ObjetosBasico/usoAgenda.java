package unidad6ObjetosBasico;

import java.util.Scanner;

public class usoAgenda {
	static Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda();
		
		Contacto cont1= new Contacto("lara","498253");
		Contacto cont2= new Contacto("Carol","7948565");
		Contacto cont3= new Contacto("QUISO","4685313");
		Contacto cont41= new Contacto("Pedro","78953264");
		agenda.anadirContacto(cont41);
		agenda.anadirContacto(cont2);
		int op = 0;
		do {
			menu();
			op = in.nextInt();
			in.nextLine();
			switch(op) {
			case 1:
				agenda.anadirContacto(cont3);
				agenda.anadirContacto(cont1);
				break;
			case 2:
				System.out.println("Introduce el nombre  ");
				String nombre = in.nextLine();
				System.out.println("Introduce el numero");
				String numero = in.nextLine();
				Contacto cont= new Contacto(nombre,numero);
				agenda.eliminarContacto(cont);
				break;
			case 3:
				System.out.println("Introduce el nombre  ");
				nombre = in.nextLine();
				agenda.buscaContacto(nombre);
				
				break;
			case 4:
				agenda.huecoslibres();
				break;
			case 5:
				agenda.listarContactos();
				break;
			case 6:
				agenda.agendallena();
				break;
			case 7:
				System.out.println("vuelve pronto");
				break;
				default://caso por defecto
					System.out.println("opccion no valida");
		}
	}while (op !=7);
	}
	public static void menu() {
		System.out.println("elige una opccion:");
		System.out.println("1 añadir contacto");
		System.out.println("2 eliminar contacto por nombre");
		System.out.println("3 buscar contacto ");
		System.out.println("4 cuantos huecos libres quedan ");
		System.out.println("5 listar contacto ");
		System.out.println("6.esta la agenda llena");
		System.out.println("7. salir");
	}

}
