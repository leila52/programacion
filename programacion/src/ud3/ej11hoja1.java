package ud3;
//Que pida una letra y detecte si es una vocal
public class ej11hoja1 {

	public static void main(String[] args) {
		//declaracion de variable
		char letra;//letra<'0'  inicializamos
		letra='0' ;
		//mostrar "Introduce una letra"
		System.out.println("Introduce una letra");
		//leer letra
		letra='u';
		
		//comprobamos si es una vocal
		if((letra=='a')||(letra=='e')||(letra=='i')||
				(letra=='u')||(letra=='o')) {
			//mostrar "es vocal"
			System.out.println("es vocal");
		}else { //es una consonante
			System.out.println("es una consonante");
			
			
		}
		
			

	}

}
