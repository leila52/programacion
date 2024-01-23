package unidad6ObjetosBasico;

public class Coche {
	//definimos los atributos y encapsulamos con el private
	private String matricula;
	private int ruedas;
	private String color;
	private int puertas;
	
	//este metodo siempre se hace el constructor 
	//que se llamara igual q la clase
	//definimos el metodo constructor
	//sirve para :
	//1 reservar memoria ram 
	//2 cuando se crea el objeto llevarlo a un estado inicial conocido(inicializar todos los atributos
	public Coche() {
		// no tiene parametro
		matricula="1234a";
		ruedas=4;
		color="gris";
		puertas=5;
	}
	//sobrecarga de constructores
	public Coche(String matriculaIni, String colorIn, int pertasIni) {
		matricula=matriculaIni;
		color=colorIn;
		puertas=pertasIni;
		ruedas=4;
	}
	
	
	//definimos metodos getter:lectura
	public String dameMatricula() {
		return matricula;
	}
	//usamos un metodo setter para poder cambiarlo
	public void cambiaMatricula(String Nuevamatricula) {
		//cambiamos el atributo al valor q pasamos por parametro
		matricula=Nuevamatricula;
	}
	public int dameRuedas() {
		return ruedas;
	}
	public String dameColor() {
		return color;
	}
	public int damepuertas() {
		return puertas;
	}
	public void cambiaCOlor(String Nuevocolor) {
		//cambiamos el atributo al valor q pasamos por parametro
		color=Nuevocolor;
	}
	//definimos los metodos
	public void arrancar () {
		System.out.println("el coche ha arrancado");
	}
	public void acelerar() {
		System.out.println("Coche esta acelerando");
	}

}
