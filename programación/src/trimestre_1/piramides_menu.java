package trimestre_1;

import java.util.Scanner;

public class piramides_menu {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int reply=0;
	        double suma=0;
	        double num=0;
	        System.out.println("1:Perimetro equilatero");
	        System.out.println("2:Perimetro isosceles");
	        System.out.println("3:Perimetro escaleno");
	        System.out.println("4:salir");
	        while((reply!=4)&&(reply<=4)) {
	        	System.out.println("Introduzca un numero");
	        	Scanner entrada;
				reply=entrada.nextInt();
	        	if(reply==1) {
	        		System.out.println("Introduzca un lado");
	        		lado=entrada.nextDouble();
	        		suma=suma+suma+suma;
	        		System.out.println(suma);
	        	}
	        	if(reply==2) {
	        		System.out.println("Introduzca dos lado");
	        		lado=entrada.nextDouble();
	        		num=entrada.nextDouble();
	        		suma=suma+suma+num;
	        		System.out.println(suma);
	        	}
	        	if(reply==3) {
	        		System.out.println("Introduzca dos lado");
	        		lado=entrada.nextDouble();
	        		num=entrada.nextDouble();
	        		reply=entrada.nextDouble();
	        		suma=suma+num+reply;
	        		System.out.println(suma);
	        		if(suma>=0) {
	        			reply=0;
	        		}
	        	}
	        	if(reply>4) {
	        		System.out.println("Error");
	        		reply=0;
	        	}
	        }
	        System.out.println("Has salido");
	      
	}

}
