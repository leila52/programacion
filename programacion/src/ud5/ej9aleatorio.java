package ud5;

import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
//termine de generar números hasta que no saque el 24. El programa deberá decir al final cuántos
//números se han generado.
public class ej9aleatorio {

	public static void main(String[] args) {
		Random ale = null;
		ale=new Random();
		int cont=0;
		int num;
		do {
			//genera numeros pares y al estar entre 0 y 100 solo hay 50
			num=ale.nextInt(51)*2;
			System.out.print("El numero aleatorio: "+num+",");
			//incrememntamos cont para asi mostrar las veces q a regenerado numeros
			cont++;
		//sale del while cuando el numero sea 24	
		}while(num!=24);
		System.out.println();
		System.out.println("se han generado "+cont+" numeros");
	}

}
