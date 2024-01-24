package unidad6ObjetosBasico;

public class PruebaRectangulo {

	public static void main(String[] args) {
		Rectangulo rectangulo1=new Rectangulo();
		rectangulo1.area();
		rectangulo1.perimetro();
		System.out.println("El rectangulo tiene la altura es : "+ rectangulo1.damealtura()+" y la base es: "+
		rectangulo1.damebase());
		//2
		Rectangulo rectangulo2=new Rectangulo(8,9);
		rectangulo2.area();
		rectangulo2.perimetro();
		System.out.println("El rectangulo tiene la altura es : "+ rectangulo2.damealtura()+" y la base es: "+
		rectangulo2.damebase());
		//3
		Rectangulo rectangulo3=new Rectangulo(15.8,2);
		rectangulo3.area();
		rectangulo3.perimetro();
		System.out.println("El rectangulo tiene la altura es : "+ rectangulo3.damealtura()+" y la base es: "+
		rectangulo3.damebase());
		//4
		Rectangulo rectangulo4=new Rectangulo(7.7,2);
		rectangulo4.area();
		rectangulo4.perimetro();
		System.out.println("El rectangulo tiene la altura es : "+ rectangulo4.damealtura()+" y la base es: "+
		rectangulo4.damebase());
		
		

	}

}
