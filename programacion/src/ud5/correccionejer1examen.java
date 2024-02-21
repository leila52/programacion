package ud5;

import java.util.Scanner;

public class correccionejer1examen {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String fecha;
		System.out.println("introduce una fecha");
		fecha=in.nextLine();
		if(fechaValida(fecha)== true) {
			System.out.println("esta bn escrito");
			
		}
		else {
			System.out.println("no esta bn introducida vuelva a introducirla");
			fecha=in.nextLine();
		}
		System.out.println("la nueva fecha"+cambiarformato(fecha));
		

	}
	public static boolean fechaValida(String fecha) {
		if(fecha.charAt(2)=='/'&&fecha.charAt(5)=='/')
			return true;
		if(fecha.length()==10)
			return true;
		if(fecha.charAt(3)<=1&& fecha.charAt(4)<=12)
			return true;
		return false;
	}
	public static String cambiarformato(String fecha) {
		String [] meses= {"enero","febrero","marzo","abril",
				"mayo","junio","julio","agosto","septiembre","octubre","noviuembre","diciembre"};
		String fechanueva="";
		String mes="";
		if(fecha.charAt(3)==0) {
			for(int i=0;i<=9;i++) {
				if(i==fecha.charAt(4)) {
					int mes1=i;
					mes=meses[mes1];
				}
			}
		}
		fechanueva+=fecha.charAt(0)+fecha.charAt(1)+"de"+ mes+ "de"+fecha.charAt(6)+fecha.charAt(7)+
				fecha.charAt(8)+fecha.charAt(9);
		return fechanueva;
	}
	

}
/*public static boolean tienedosbarras(String fecha) {
		//en posiciones especificas
		int cont=0;
		for(int i=0;i<fecha.length();i++) {
			if(fecha.charAt(i)=='/')
				cont++;
		}
		if(cont==2)
			return true;
		else
			return false;
	}
	public static boolean tine10carac(String fecha) {
		if(fecha.length()==10)
			return true;
		else
			return false;
	}*/