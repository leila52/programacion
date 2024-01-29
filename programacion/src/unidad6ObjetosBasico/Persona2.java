package unidad6ObjetosBasico;

public class Persona2 {
	private String DNI;
	private Cuenta[] cuentas;
	private int numCuentas;
	
	public Persona2(String dni) {
		DNI=dni; 
		this.cuentas= new Cuenta[3];
		numCuentas=0;
	}
	
	public void AgregarCuenta(Cuenta cuenta) {
		if(numCuentas<3) {
			//se añade la cuenta
			cuentas[numCuentas]=cuenta;
			numCuentas++;
		}else {
			System.out.println("no se puede ya que ha excidido el numero de cuentas por usuario");
		}
	}
	public boolean EsMorosa() {
		for(int i=0;i< numCuentas;i++) {
			// comprobar q no sea morosa con un if
		}
		return false;
	}

}
