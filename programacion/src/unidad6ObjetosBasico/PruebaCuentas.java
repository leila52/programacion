package unidad6ObjetosBasico;

public class PruebaCuentas {

	public static void main(String[] args) {
		Persona2 persona= new Persona2("06002579Q");
		System.out.println(persona.dameDni());
		
		//agregamos a la cuenta la persona
		persona.AgregarCuenta("c1");
		persona.damecuenta("c1").recibirAbono(100)
		
		System.out.println("esta persona de dni "+persona.dameDni()+"contiene este abono");

	}

}
