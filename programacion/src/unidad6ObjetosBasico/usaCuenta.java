package unidad6ObjetosBasico;

public class usaCuenta {

	public static void main(String[] args) {
		Cuenta cuent1=new Cuenta("jorge",45);
		System.out.println(cuent1.dameCuenta());
		cuent1.ingrasar(40);
		System.out.println(cuent1.dameCantidad());
		cuent1.retirar(90);
		System.out.println(cuent1.dameCantidad());
	}

}
