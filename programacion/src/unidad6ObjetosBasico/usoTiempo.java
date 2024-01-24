package unidad6ObjetosBasico;

import java.util.Scanner;

public class usoTiempo {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Tiempo tiemp=new Tiempo(17,55,45);
		System.out.println("que quiere 1.solo hora 2.horasay minutos 3 hora min y sec");
		tiemp.hora();

	}

}
