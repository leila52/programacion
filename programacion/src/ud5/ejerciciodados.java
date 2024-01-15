package ud5;

import java.util.Random;
import java.util.Scanner;

public class ejerciciodados {
/* Crea un programa en Java que simule el lanzamiento de dos dados. El programa debe generar aleatoriamente los resultados de ambos dados y mostrar la suma de los valores obtenidos. Además, el programa debe permitir al usuario lanzar los dados varias veces si así lo desea.

Requisitos:

    Utiliza la clase Random para simular el lanzamiento de los dados.

    Muestra los resultados de cada lanzamiento, incluyendo los valores obtenidos en cada dado y la suma total.

    Ofrece la opción al usuario de lanzar los dados nuevamente.

    Asegúrate de manejar correctamente la generación de números aleatorios en el rango adecuado para simular los valores de los dados (1 al 6).

Ejemplo de ejecución:

¡Bienvenido al Simulador de Dados!



Lanzamiento 1:

Dado 1: 3

Dado 2: 5

Suma total: 8



¿Quieres lanzar los dados nuevamente? (Sí/No): Sí



Lanzamiento 2:

Dado 1: 2

Dado 2: 6

Suma total: 8*/
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int suma=0;
		int lanzamiento=1;
		System.out.println("Bienvenido al Simulador de Dados!");
		char opcion=' ';
		do {
			Random ale =new Random();
			int tirada=ale.nextInt(6)+1;
			int tirada2=ale.nextInt(6)+1;
		System.out.println("lanzamiento"+lanzamiento);
		lanzamiento++;
		System.out.println("dado1: "+tirada);
		System.out.println("dado2: "+tirada2);
		suma=tirada+tirada2;
		System.out.println("la suma : "+suma);
		System.out.println("¿Quieres lanzar los dados nuevamente? (S/N)");
		opcion=entrada.nextLine().charAt(0);
		}while(opcion=='s'||opcion=='S');
		if(opcion=='n'|| opcion=='N') {
			System.out.println("saliendo");
		}
	

	}
}


