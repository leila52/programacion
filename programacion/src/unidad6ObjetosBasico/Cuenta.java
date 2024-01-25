package unidad6ObjetosBasico;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta(String titu, double cantid) {
		 cambiarCuenta(titu,cantid);
		
	 }
	//setter
	public void cambiarCuenta(String titu, double cantid) {
			titular=titu;
			cantidad=cantid;
	}
	//geter
	public String dameTitular() {
		return titular;
	}
	public double dameCantidad() {
		return cantidad;
	}
	public void ingrasar(double cantingresar) {
		if(cantingresar<0) {
			cantidad=cantidad+0;
		}else{
			cantidad= cantidad+cantingresar;
		}
	}
	public void retirar(double cantretir) {
		cantidad= cantidad-cantretir;
		if (cantidad<0) {
			cantidad=0;
		}
	}
	public String dameCuenta(){
		return titular+" contiene esta cantidad:"+cantidad;
		
		
		
	}
	
}
