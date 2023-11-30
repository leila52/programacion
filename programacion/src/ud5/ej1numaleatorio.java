package ud5;
import java.util.Random;
// Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
public class ej1numaleatorio {
	public static void main(String[] args) {
		Random ale = null;
		ale=new Random();
		for(int i=0;i<=20;i++) {
			int numero=ale.nextInt(10);
			System.out.println(numero);
		}
	}

}
