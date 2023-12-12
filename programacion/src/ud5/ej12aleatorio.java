package ud5;

import java.util.Random;

// Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando
//los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.
public class ej12aleatorio {

	public static void main(String[] args) {
		Random ale = null;
		ale=new Random();
		int tirada;
		int tirada2;
		do{
			tirada=ale.nextInt(6)+1;
			tirada2=ale.nextInt(6)+1;
			System.out.println(tirada+","+tirada2);
		
		}while(tirada!=tirada2); 
		System.out.println(tirada);
		System.out.println(tirada2);

	}

}
