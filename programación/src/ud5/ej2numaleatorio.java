package ud5;
import java.util.Random;
//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
//total (los puntos que suman entre los tres dados).
public class ej2numaleatorio {
	public static void main(String[] args) {
		int suma=0;
		for(int i=0;i<3;i++) {
			Random ale = null;
			ale=new Random();
			int tirada=ale.nextInt(6)+1;
			System.out.println(tirada);
			suma=suma+tirada;
	}
		System.out.println("la suma de los tres dados es"+suma);
	}

}
