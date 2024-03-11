package ud7POOavanzado;

import java.util.ArrayList;

public class ejemploarraydinamic {

	public static void main(String[] args) {
		//definimos lista o coleccion
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		numeros.add(4);
		numeros.add(8);
		numeros.add(3);
		//for( int i=0;numeros.size();i++)
		//     numero.get(i);
		for(Integer  i:numeros) {
			System.out.println(i);
		}
		//cambiamos segundo elemento por otro numero
		numeros.set(1, 5);
		int numeroeliminado=numeros.remove(0);
		System.out.println("se ha eliminado el numero: "+numeroeliminado);
		//elimino toda la lista
		System.out.println(numeros.isEmpty());
		numeros.clear();
		System.out.println(numeros.isEmpty());

	}

}
