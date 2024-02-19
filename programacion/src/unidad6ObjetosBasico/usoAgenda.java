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
		agenda.huecoslibres();
		agenda.listarContactos();
		agenda.buscaContacto("Pedro");
		agenda.anadirContacto(cont3);
		agenda.listarContactos();
		agenda.eliminarContacto(cont3);
		agenda.listarContactos();
	}

}
