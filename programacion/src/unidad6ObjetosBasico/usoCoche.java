package unidad6ObjetosBasico;

public class usoCoche {

	public static void main(String[] args) {
		//vamos a crear un coche
		//clase nombre_objeto = new constructor(parametros)
		Coche fiat500=new Coche();
		//usamos los metodos, definidos en la clase
		fiat500.arrancar();
		fiat500.acelerar();
		System.out.println("La matricula es "+ fiat500.dameMatricula());
		fiat500.cambiaMatricula("256b");
		System.out.println("La nueva matricula es "+ fiat500.dameMatricula());
		Coche BMW=new Coche("9999b","negro",3);
		System.out.println("la matricula es "+BMW.dameMatricula()+
				" Las ruedas "+ BMW.dameRuedas()+" El color es "+ BMW.dameColor());
	}

}
