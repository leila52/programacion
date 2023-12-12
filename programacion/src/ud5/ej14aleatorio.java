package ud5;

import java.util.Random;

//Realiza un generador de melodía con las siguientes condiciones:
//a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
//b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a
//28 y siempre múltiplo de 4 (4, 8, 12…).
//c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la
//barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
//d) La última nota de la melodía debe coincidir con la primera.
//Ejemplo 1:
//do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
//Ejemplo 2:
//la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
public class ej14aleatorio {
	public static void main(String[] args) {
		int[] melodia1=Melodia();
		int[] melodia2=Melodia();
		System.out.println("ejemplo1");
		syso(melodia1);
		System.out.println();
		System.out.println("ejemplo2");
		syso(melodia2);
		

	}
	public static int[] Melodia() {
		int[]notas= {0,1,2,3,4,5,6};
		//longitud de la melodia(multiplo de 4 entre 4 y 28
		Random ale=new Random();
		int larguraMelo=(ale.nextInt(7)+1)*4;
		int[] melo=new int[larguraMelo];
		for (int i=0;i<larguraMelo;i++) {
			melo[i]=notas[ale.nextInt(notas.length)];
			if(melo[i]==0) {
				System.out.println("do");
			}
		}
		//la ultima no coincida con la primera
		melo[larguraMelo-1]=melo[0];
		return melo;
	}
	public static void syso(int[]melodia) {
		for (int i = 0; i < melodia.length; i++) {
            System.out.print(melodia[i] + " ");
            if ((i + 1) % 4 == 0 && i != melodia.length - 1) {
                System.out.print("| ");
            }
        }
		System.out.print("|| ");
	}

}
