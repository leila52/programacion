package Sanvakentin;
import Sanvakentin.Pareja;
import Sanvakentin.Persona;
import Sanvakentin.Regalo;

public class GestorSanValentin {

	public static void main(String[] args) {
		Persona perso1 = new Persona("60250079Q","cesar");
		Persona per2 = new Persona("25781596W","veronica");
		String descripcion1 ="segun una leyenda inspirada por "
				+ "la figura del mártir es que le devolvió la"
				+ " vista a una ciega y ella, en agradecimiento,"
				+ " sembró un rosal sobre su tumba, que florecía"
				+ " cada 14 de febrero, al cumplirse un año de"
				+ " su muerte, de ahí que se celebre San Valentín"
				+ " regalando rosas.";
		String descripcion2="las focas son nuestros animales favoritos";
		Regalo regalo1 = new Regalo("40 rosas",35.99,descripcion1);
		Regalo regalo2 = new Regalo("peluche foca",40.50,descripcion2);
		Pareja pareja = new Pareja(perso1,per2);
		pareja.setRegaloparapersona1(regalo1);
		pareja.setRegaloparapersona2(regalo2);
		pareja.CosteTotal();
		System.out.println("Los regalos que se han hecho: ");
		System.out.println(pareja.mostrardetalles());
		System.out.println("La informacion de la pareja junto a sus regalos:");
		System.out.println(pareja.toString());

	}

}
