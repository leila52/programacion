package ud5;
import java.util.Random;
// Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
//total (los puntos que suman entre los tres dados).
public class ej2numaleatorio {
	public static void main(String[] args) {
		int suma=0;
		Random ale = null;
		ale=new Random();
		int tirada=ale.nextInt(6)+1;
		int tirada2=ale.nextInt(6)+1;
		int tirada3=ale.nextInt(6)+1;
		System.out.println(tirada+","+tirada2+","+tirada3);
		suma=tirada+tirada2+tirada3;
		System.out.println("la suma de los tres dados es: "+suma);
	}

}
