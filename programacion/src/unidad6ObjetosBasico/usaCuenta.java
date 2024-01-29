package unidad6ObjetosBasico;

import java.util.Scanner;

public class usaCuenta {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("introduce su nombre de cuenta");
		String nombre=entrada.nextLine();
		System.out.println("introduce la cantidad de dinero que tiene");
		double cantidad=entrada.nextDouble();
		Cuenta cuent1=new Cuenta(nombre,cantidad);
		entrada.nextLine();
		System.out.println(cuent1.dameCuenta());
		System.out.println("cuanto dinero quiere ingresar");
		double cant=entrada.nextDouble();
		cuent1.ingrasar(cant);
		System.out.println("el estado de su cuenta es de : "+cuent1.dameCantidad());
		System.out.println("cuanto dinero quiere retirar");
		double can=entrada.nextDouble();
		if(cuent1.retirar(can)==true) {
			System.out.println("el estado de su cuenta es de : "+cuent1.dameCantidad());
		}else {
			System.out.println("saldo insuficiente");
		}
		System.out.println("el estado de su cuenta es de : "+cuent1.dameCantidad());
	}

}
