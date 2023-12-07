package ud5;
import java.util.Scanner;
public class ej7cadenas {
//Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición
//del primer carácter en la cadena por el segundo carácter
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingrsa una cadena");
		String cad=entrada.nextLine();
		char cara1,cara2;
		do {
			//pedimos al usuario el caracter y el q lo quiere sustituit
			System.out.println("introduce el primer caracte");
			cara1=entrada.nextLine().charAt(0);
			System.out.println("introduce el primer caracte");
			cara2=entrada.nextLine().charAt(0);
			if(cara1==cara2) {
				System.out.println("ERROR,el segundo caracter tiene que ser diferente");
			}
		}while(cara1==cara2);
		//el metodo .replace remplaza el primer caracter por el segundo 
		String cad2=cad.replace(cara1, cara2);
		System.out.println("la nueva cadena es: "+cad2);
	}

}
