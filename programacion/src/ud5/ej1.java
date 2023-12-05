package ud5;
import java.util.Random;
//lo del dado
public class ej1 {
	public static void main(String[] args) {
		//1.definir y construir un objeto
		//            de tipo random(class random)+
		// defino objeto:
		//clase nombre_objeto
		//pulsas el random como en el scanner
		Random ale = null;
		//construirlo el objeto:reservamos RAM
		//nombre del objeto=new Constructor(párametro)
		ale=new Random();
		//2.usarlo a través de sus métodos
		//nombre_objeto.método(párametro)
		int tirada=ale.nextInt(6)+1;
		System.out.println(tirada);
		

	}

}
