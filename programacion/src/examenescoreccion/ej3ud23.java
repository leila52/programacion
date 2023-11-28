package examenescoreccion;
import java.util.Scanner;
//tres metodos estaticos
//public static void pedir edades(int[]edades) edades de 18,99
//public static double calcularEdadMedia(int[]edades)
//public static int damepersonasenedadjubilo(int[]edades)
public class ej3ud23 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int []edades=new int[10];
		pedirEdades(edades);
		System.out.println("la media total es "+calcularEdadMedia(edades));
		System.out.println("las personas jubiladas son "+damepersonasenedadjubilo(edades));
		System.out.println("las personas que trabajan son:"+(edades.length-damepersonasenedadjubilo(edades)));
				
	}
	public static void pedirEdades(int[]edades) {
		for(int i=0;i<edades.length;i++) { 
			System.out.println("introduce edades");
			edades[i]=entrada.nextInt();
			while((edades[i]<18) ||( edades[i]>99)) {
				System.out.println("error vuelvea introducir otra edad");
				edades[i]=entrada.nextInt();
			}
			}
		}
	public static double calcularEdadMedia (int []edades) {
		int suma=0,media=0;
		for(int i=0;i<edades.length;i++) {
			suma=suma+edades[i];
		}
		media=suma/edades.length;
		return media;
		}
	public static int damepersonasenedadjubilo (int[]edades) {
		int jubi=0;
		for(int i=0;i<edades.length;i++) {
			if(edades[i]>=65) {
				jubi++;
			}
		}
		return jubi;
	}
	}
	

