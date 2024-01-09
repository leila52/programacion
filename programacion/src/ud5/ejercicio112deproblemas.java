package ud5;
import java.util.Scanner;

public class ejercicio112deproblemas {
/*https://codeforces.com/problemset/problem/112/A */
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		String cad;
		String cad2;
			System.out.println("introduce la primera de cadena");
			cad= entrada.nextLine().toLowerCase();
			System.out.println("ingrese la segunda cadena");
			cad2=entrada.nextLine().toLowerCase();
			//comprara cadenas
			int result=comparaCad(cad,cad2);
			//mostrar por pantalla 
			if(result<0) {
				System.out.println("-1");
			}
			if(result>0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		

	}
	public static int comparaCad(String cad, String cad2) {
		for(int i=0;i<cad.length();i++) {
			//caracteres de cada cadena
			char caracad=cad.charAt(i);
			char caracad2=cad2.charAt(i);
			if(caracad<caracad2) {
				return -1;
			}
			if(caracad>caracad2) {
				return 1;
			}
		}
		//si las ccadenas son iguales
		return 0;
	}

}
