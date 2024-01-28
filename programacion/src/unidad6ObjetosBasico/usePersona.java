package unidad6ObjetosBasico;

import java.util.Scanner;

public class usePersona {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el nombre");
		String nom= entrada.nextLine();
		System.out.println("ingrese la edad");
		int eda=entrada.nextInt();
		System.out.println("ingrese el sexo (H/M)");
		char sex=entrada.next().charAt(0);
		System.out.println("ingrese el peso");
		double pes=entrada.nextDouble();
		System.out.println("ingrese la altura");
		double altu=entrada.nextDouble();
		
		Persona persona1=new Persona(nom,eda,sex,pes,altu);
	
	//segunda persona omitiendo peso y altura
		System.out.println("ingrese el nombre");
		nom= entrada.nextLine();
		//se limpia el buffer
		nom= entrada.nextLine();
		System.out.println("ingrese la edad");
		eda=entrada.nextInt();
		System.out.println("ingrese el sexo (H/M)");
		sex=entrada.next().charAt(0);
		
		Persona persona2=new Persona(nom,eda,sex);
		
		//tercer caso por defercto usando el metdo setter
		Persona persona3 = new Persona(nom, eda, sex);
		persona3.cambiarNombre("Leila");
		persona3.cambiarEdad(19);
		persona3.cambiarPeso('M');
		
		// mostrar info
		persona1.mostrarInfo();
		System.out.println("\n");
		persona2.mostrarInfo();
		System.out.println("\n");
		persona3.mostrarInfo();
		
	}

}
