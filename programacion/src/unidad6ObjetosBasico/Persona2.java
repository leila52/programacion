package unidad6ObjetosBasico;

public class Persona2 {
	private String DNI;
	private Cuenta2[] cuentas;
	private int numCuentasasociadas;
	
	public Persona2(String dni) {
		DNI=dni; 
		this.cuentas= new Cuenta2[3];
		numCuentasasociadas=0;
	}
	
	public boolean AgregarCuenta(String numCuenta) {
		if(numCuentasasociadas<=3) {
			//se añade la cuenta
			Cuenta2 c=new Cuenta2(numCuenta);
			cuentas[numCuentasasociadas]=c;
			numCuentasasociadas++;
			return true;
		}else 
			return false;
	}
	public String toString() {
		String cadena="dni: "+DNI;
		for(int i=0;i<numCuentasasociadas;i++) {
			cadena=cadena +cuentas[i].toString();
		}
		return cadena;
	}
	public boolean EsMorosa() {
		
		for(int i=0;i< numCuentasasociadas;i++) {
			// comprobar q no sea morosa con un if
			
		}
		return false;
	}
	public String dameDni() {
		return DNI;
	}
	public Cuenta2 damecuenta(String numCuenta) {
		for(int i=0;i<numCuentasasociadas;i++) {
			Cuenta2 c= cuentas[i];
	if(numCuenta.equals(c.consultarCuenta())) {
				return c;
			}
		}
		return null
	}

}