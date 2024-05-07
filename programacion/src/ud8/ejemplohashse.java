package ud8;

import java.util.HashSet;

public class ejemplohashse {
	public static void main(String[] args) {
		// metodo constructor new HashSet<String>();
		HashSet<String> frutas= new HashSet<String>();
		frutas.add("pera");
		frutas.add("bannana");
		frutas.add("mango");
		frutas.add("melon");
		frutas.add(null);
		// no sale ya q no se pueden repetir
		frutas.add("pera");
		System.out.println(frutas.contains("mango"));
		System.out.println(frutas);
		//puedes vaciarla
		frutas.clear();
		System.out.println(frutas);
	}

}
