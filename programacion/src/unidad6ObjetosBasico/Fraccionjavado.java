package unidad6ObjetosBasico;
/**
* Clase Fraccion
*
* Contiene informacion de cada fraccio 
*
* @author leila
* @version 1.0
*/
public class Fraccionjavado {
	
	//atributos
	/**
	 * numerador y denominador de la fraccion 
	 */
		private int num,den;
		//constructor
		
		/** 
		 * constructor fraccion
		 * constructor con dos parametros
		 * @param num numerador de la fraccion
		 * @param den el denominador para la fraccion
		 */
		public Fraccionjavado(int num,int den) {
			this.num=num;
			this.den=den;
		}
		/**
		 * 
		 */
		//getters
		public void mostrar() {
			System.out.println(num+"/"+den);
		}
		public int dameNumerador() {
			 return num;
		}
		
		public int dameDenominador() {
			 return den;
		}
		public Fraccion suma(Fraccion f2) {
			int numRsdo=num*f2.dameDenominador()+
					den*f2.dameNumerador();
			int denRsdo=den*f2.dameDenominador();
			Fraccionjavado fraccionResultado=new Fraccionjavado(numRsdo,denRsdo);
			return fraccionResultado;
		}
		//getters
		// resta, multiplicacion y division
		// boolean esIgualA (Fraccion)
		//setter
		// void simplificar ()
	}
