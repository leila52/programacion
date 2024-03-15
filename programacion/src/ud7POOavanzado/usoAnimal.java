package ud7POOavanzado;

import java.util.ArrayList;

public class usoAnimal {

	public static void main(String[] args) {
		ArrayList<Animal>animales=new ArrayList<Animal>();
		animales.add(new Perro("pupi","dalmata"));
		animales.add(new Pajaro("garfio","loro"));
		
		for(int i=0;i<animales.size();i++) {
			animales.get(i).DameFichaAnimal();
		}
		

	}

}
