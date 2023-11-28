package trimestre_1;

import java.util.Scanner;

public class for_20 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		while (true){
			System.out.println("desea salir pulse s o n ");
			String opcion = scanner.nextLine().trim().toLowerCase();
			if("s") {
				System.out.println("saliendo del programa");
				break;
			} else if("n") {
				System.out.println("realizando una acción");
			} else {
				System.out.println("opción ni válida.Introduzca s o n");
			}
		}

	}

}
