package unidad6ObjetosBasico;
/**
* Clase Fraccionjavado
*
* Contiene informacion de cada fraccion 
*
*la clase permite operaciones como suma resta multiplicacion etc
*
*el numerador y denominador son enteros
*
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
		 * muestra la fraccion
		 */
		//getters
		public void mostrar() {
			System.out.println(num+"/"+den);
		}
		/**
		 * obtiene el numerador
		 * @return numerador 
		 */
		
		public int dameNumerador() {
			 return num;
		}
		/**
		 * obtiene el denominador
		 * @return denominador 
		 */
		public int dameDenominador() {
			 return den;
		}
		/**
		 * realiza la suma de una fraccion con otra 
		 * @param f2  la fraccion para sumar
		 * @return el resultado de la suma  como una nueva Fraccion
		 */
		
		//getters
		// resta, multiplicacion y division
		// boolean esIgualA (Fraccion)
		//setter
		// void simplificar ()
	}
