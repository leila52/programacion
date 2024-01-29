package unidad6ObjetosBasico;

public class PruebaCuentas {

	public static void main(String[] args) {
		//cramos dos cuentas
		Cuenta2 cuenta1= new Cuenta2("15735",0);
		Cuenta2 cuenta2 =new Cuenta2("25845",800);
		
		//creamos la persona
		Persona2 persona= new Persona2("06002579Q");
		
		//agregamos a la cuenta la persona
		persona.AgregarCuenta(cuenta1);
		persona.AgregarCuenta(cuenta2);

	}

}
