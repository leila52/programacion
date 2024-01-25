package unidad6ObjetosBasico;

import java.util.Scanner;

public class usoTiempo {

	public static void main(String[] args) {
		Tiempo tiemp=new Tiempo(23,59,59);
		Tiempo tiempt=new Tiempo(17,51,32);
		System.out.println(tiemp.dameHora());
		//llamamos a la funcion de ahumentar segundo para que cambie todo
		tiemp.aumentaunsegundo();
		System.out.println(tiemp.dameHora());
		

	}

}
