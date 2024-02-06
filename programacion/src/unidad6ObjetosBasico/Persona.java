package unidad6ObjetosBasico;

import java.util.Random;

public class Persona {
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	
	//constructor para solicitar todas las variables
	public Persona(String nom,int eda, String dni,char sex,double pes,double altu) {
		nombre=nom;
		edad=eda;
		//para generar un dni 
		DNI=generadni();
		//comprobar el sexo
		sexo=comprobarSexo(sex);
		peso=pes;
		altura=altu;	
	}
	public Persona(String dni) {
		nombre="";
		edad=0;
		//para generar un dni 
		DNI=generadni();
		//comprobar el sexo
		sexo=comprobarSexo('H');
		peso=0;
		altura=0;	
	}
	
	// persona que omite peso y altura
	public Persona(String nom,int eda,char sex) {
		nombre=nom;
		edad=eda;
		sexo=comprobarSexo(sex);
	}
	// persona o constructor por defecto
	public Persona(String nom,int eda,char sex,double pes,double altu) {
		nombre="";
		edad=0;
		//comprobar el sexo
		sexo='H';
		peso=0;
		altura=0;
	}
	// metodos setters de todo menos del dni
	public void cambiarNombre(String nom) {
		nombre=nom;
	}
	public void cambiarEdad(int eda) {
		edad=eda;
	}
	public void cambiarSexo(char sex) {
		sexo=comprobarSexo(sex);
	}
	public void cambiarPeso(double pes) {
		peso=pes;
	}
	public void cambiarAltura(double altu) {
		altura=altu;
	}
	
	
	
	//metodos
	
	public void comprobarSexo(char sex) {
		if(sex!='H' && sex!='M') {
			this.sexo='H';
		}else {
			this.sexo=sex;
			
		}
	}
	public String generadni() {
		//generar un string de 8 cifraz aleatorios
		String letras= "TRWAGMYFPDXBNJZSQVHLCK";
		Random ale=new Random();
		int num=ale.nextInt(100000000);
		int resto=num%23;
		return num+""+letras.charAt(resto);
		
	}
	
	//metodo peso ideal 
	/*calculara si la persona está en su peso ideal (peso en
	kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que
	20, la función devuelve un -1, si devuelve un número entre 20 y 25
	(incluidos), significa que está por debajo de su peso ideal la función
	devuelve un 0 y si devuelve un valor mayor que 25 significa que
	tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses
	constantes para devolver estos valores.*/
	public int calcularIMC() {
		double  imc=peso/ (altura*altura);
		if(imc < 20 ) {
			return -1;//ya que es por debajo del peso idal
		}
		if(imc >= 20 && imc <=25) {
			return 0; // el peso es ideal
		}else {
			return 1;//sobrepeso
		}
	}
	
	//mayor de edad
	public boolean esMayorEdad() {
		return edad>=18;
	}
	
	//toString(): devuelve toda la información del objeto.
	public String toString() {
		return "Nombre: "+ nombre+
				"\nEdad: "+edad+
				"\nSexo: "+sexo+
				"\nPeso: "+peso+
				"\nAltura: "+altura+
				"\nDNI: "+DNI;
	}
	
	//mostrar toda la inforamcion
	public void mostrarInfo() {
		int resultadoIMC= calcularIMC();
		System.out.println("Informacion personal:");
		System.out.println(toString());
		if (resultadoIMC==-1) {
			System.out.println("por debajo del peso ideal");
		}
		if(resultadoIMC==0) {
			System.out.println("esta en el peso ideal");
		}
		if(resultadoIMC==1) {
			System.out.println("se encuenrra con sobrepeso");
		}
		System.out.println("es mayor de edad : "+esMayorEdad());
	}
}

