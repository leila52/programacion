package und4;

import java.util.Scanner;

// Leer una palabra de 4 letras (letra a letra) y mostrar en una línea la palabra formada y su palíndroma.
public class ej1tarea_tipoC {

	public static void main(String[] args) {
		//habilitamos la lectura
		Scanner entrada= new Scanner(System.in);
		//definimos las arrays
		char[] palabra;
		//2.construimos las array de 5 posiciones
		palabra=new char[4];
		System.out.println("Introduce una palabra de 4 letras: ");
		//3.introducimos los 4 valores
		for(int i=0;i<4;i++) {
			System.out.println("letra" + (i+1)+" :");
			palabra[i]=entrada.nextLine().charAt(0);
		}
		System.out.print("La palabra es :");
		for(int i=0;i<4;i++) {
			System.out.print(palabra[i]);
		}
		System.out.print("  la palabra formada de derecha a izquierda :");
		for(int i=3;i>=0;i--) {
			System.out.print(palabra[i]);
		}
		
		
		


	}

}
