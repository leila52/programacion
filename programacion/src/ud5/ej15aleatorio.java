package ud5;
import java.util.Random;
import java.util.Scanner;
//Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
//a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
//corazón, diamante, herradura, campana y limón.
//b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
//c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su
//moneda”.
//d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
public class ej15aleatorio {
	public static void main(String[] args) {
		
		
		int[] nums=new int [3];
		Scanner entrada=new Scanner(System.in);
		int op;
		int op2;
		do {
			System.out.println("pulse 1 para jugar");
			op=entrada.nextInt();
			System.out.println("Hay 5 figuras");
			System.out.println("1=corazon");
			System.out.println("2=diamante");
			System.out.println("3=herradura");
			System.out.println("4=campana");
			System.out.println("5=limon");
			System.out.println("pulse 1 para tirar");
			op2=entrada.nextInt();
			
			for(int i=0;i<3;i++) {
				Random ale = null;
				ale=new Random();
				int tirada;
				tirada=ale.nextInt(5)+1;
				nums[i]=tirada;
				if(tirada==1) {
					System.out.print("corazon  ");
				}
				if(tirada==2) {
					System.out.print("diamante  ");
				}
				if(tirada==3) {
					System.out.print("herradura  ");
				}
				if(tirada==4) {
					System.out.print("campana  ");
				}
				if(tirada==5) {
					System.out.print("limon  ");
				}
			}
			
			if((nums[0]!=(nums[1]))&&(nums[1]!=nums[2])&& nums[0]!=nums[2]) {
				System.out.println("Lo siento, ha perdido");
			}
			if((nums[0]==nums[1]) || (nums[1]==nums[2]) || nums[0]==nums[2]) {
				System.out.println("Bien, ha recuperado su moneda");
			}
			if(nums[0]==nums[1] && nums[1]==nums[2]&& nums[0]==nums[2]) {
				System.out.println("Enhorabuena, ha ganado 10 monedas");
			}
			
		}while(op!=1);

	}

}
