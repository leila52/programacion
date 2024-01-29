package unidad6ObjetosBasico;

public class Cuenta2 {
	private String numeroCuenta;
	private double Saldo;
	
	public Cuenta2(String numeroCuent, double Sald) {
		numeroCuenta=numeroCuent;
		Saldo=Sald;
	}
	//consultar cuanto dinero tiene
	public double consultarSaldo() {
		return Saldo;
	}
	public void IntroducirCuenta(String numeroCuent) {
		numeroCuenta=numeroCuent;
	}
	public void introduceSaldo(double Sald) {
		Saldo=Sald;
	}public void abonar (double cantidadAbonar) {
		Saldo=Saldo+cantidadAbonar;
	}public boolean pagarRecibo (double cantRecibo) {
		if (cantRecibo<=Saldo) {
			Saldo= Saldo-cantRecibo;
			return true;
		}else
			return false;
	}

}
