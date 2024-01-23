package unidad6ObjetosBasico;

public class PruebaRectangulo {

	public static void main(String[] args) {
		Rectangulo rectangulo1=new Rectangulo();
		rectangulo1.area();
		rectangulo1.perimetro();
		System.out.println("la altura es : "+ rectangulo1.damealtura()+" y la base es: "+
		rectangulo1.damebase());
		Rectangulo rectangulo2=new Rectangulo(8,9);
		rectangulo2.area();
		rectangulo2.perimetro();
		System.out.println("la altura es : "+ rectangulo2.damealtura()+" y la base es: "+
		rectangulo2.damebase());
		
		

	}

}
