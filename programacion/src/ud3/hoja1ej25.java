package ud3;
//sueldo del trabajador
public class hoja1ej25 {

	public static void main(String[] args) {
		//introducimos el sueldo y la edad
		int sueldo;
		sueldo=0;
		int edad;
		edad=0;
		System.out.println("introduce sueldo y edad");
		//leer sueldo
		//leer edad
		sueldo=40000;
		edad=2;
		//introducimos condiciones
		if (edad>10) {
			//mostramos sueldo
		System.out.println("el sueldo es "+(sueldo+(sueldo*10/100)));
		}if ((10>=edad)&&(edad>5)) {
			//mostramos sueldo
		System.out.println("el sueldo es "+(sueldo+(sueldo*7/100)));
		}if ((5>=edad)&&(edad>3)) {
			//mostramos sueldo
		System.out.println("el sueldo es "+(sueldo+(sueldo*5/100)));
		}if (edad<3) {
			//mostramos sueldo
		System.out.println("el sueldo es "+(sueldo+(sueldo*3/100)));
		}
		

	}

}
