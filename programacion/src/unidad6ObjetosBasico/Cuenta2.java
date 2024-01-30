package unidad6ObjetosBasico;

public class Cuenta2 {
	private String numeroCuenta;
	private double Saldo;
	
	public Cuenta2(String numeroCuent) {
		numeroCuenta=numeroCuent;
		Saldo=0;
	}
	// getters
	public String toString() {
		return "numero de cuenta "+ numeroCuenta + " con un saldo de "+Saldo;
	}
	//consultar cuanto dinero tiene
	public double consultarSaldo() {
		return Saldo;
	}
	public String consultarCuenta() {
		return numeroCuenta;
	}
	
	//setters
	public boolean recibirAbono (double cantidadAbonar) {
		if(cantidadAbonar>0) {
			Saldo=Saldo+cantidadAbonar;
			return true;
		}
		return false;//no se permite abonos negativos
	}
	public boolean pagarRecibo (double cantRecibo) {
		if (cantRecibo>=0) {
			Saldo= Saldo-cantRecibo;
			return true;//si recibo es positvo
		}
		return false;//si es el saldo es negativo
	}

}
