package ud7POOavanzado;

import java.util.Scanner;

public class usoPersona { 
		static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		
		Persona [] persona=new Persona[10];
		String nombre, apellido,dni,estado_civil;
		for(int i=0; i<persona.length;i++) {
			System.out.println("que quieres q se añada un estudiante,un profesor o un personal");
			String respuest=in.nextLine();
			if(respuest.equals("estudiante")) {
				System.out.println("introduce el nombre");
				System.out.println("introduce apellido");
				System.out.println("introduce dni");
				System.out.println("introduce estado_civil");
				System.out.println("introde el curso");
				
			}
		}
	}

}
