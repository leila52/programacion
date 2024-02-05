package unidad6ObjetosBasico;

public class PruebaCuentas {

	public static void main(String[] args) {
		Persona2 persona= new Persona2("06002579Q");
		System.out.println(persona.dameDni());
		
		//agregamos a la cuenta la persona
		persona.AgregarCuenta("c1");
		Cuenta2 c=persona.damecuenta("c1");
		c.recibirAbono(100);
		
		System.out.println("esta persona de dni "+persona.dameDni()+"contiene este abono " +persona.damecuenta("c1").consultarSaldo() );
		persona.damecuenta("c1").pagarRecibo(120);
		System.out.println("es morrosa la persona");
		if (persona.EsMorosa()==true)
			System.out.println("es morrosa tiene q pagar");
		else
			System.out.println("no es morosa asi que se libra");
	}

}
