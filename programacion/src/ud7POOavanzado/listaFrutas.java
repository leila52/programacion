package ud7POOavanzado;
import java.util.ArrayList;
import java.util.Random;
public class listaFrutas {

	public static void main(String[] args) {
		ArrayList<String> listaFrutas= new ArrayList<String>();
		listaFrutas.add("pera");
		listaFrutas.add("bannan");
		listaFrutas.add("manzana");
		for(String fruta:listaFrutas) {
			System.out.println(fruta);
		}
		System.out.println(listaFrutas.get(2));
		System.out.println(listaFrutas.toString());
		for(int i=0;i<listaFrutas.size();i++) {
			System.out.println(listaFrutas.get(i));
		}
		//Stringbuilder
		
		ArrayList<Miclase> lista= new ArrayList<Miclase>();
		lista.add(new Miclase(15,"hola"));
		System.out.println(lista.toString());
		
		
		
		
		ArrayList<Object>lista2=new ArrayList<Object>();
		lista2.add("hola");
		lista2.add(12);
		lista2.add(true);
		
		
		
		Random ale=new Random();
		System.out.println(ale);
		
		
	}

}
