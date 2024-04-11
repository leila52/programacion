package trabajo1trimestre;

import java.util.ArrayList;
import java.util.Random;
import trabajo1trimestre.Carta;

public class Baraja {
private ArrayList<Carta> listaCartas=new ArrayList<Carta>();
	
	public Baraja() {
		for(int i=1;i<=40;i++) {
			listaCartas.add(new Carta(i));
		}
	}
	//tipo de baraja
	
	public Baraja(int tipoBaraja) {
		if(tipoBaraja==1) {
			for(int i=1;i<=40;i++) {
				listaCartas.add(new Carta(i));
			}
		}
		//para q haya 80 se suma las 40 con otras 40
		if(tipoBaraja ==2){
			listaCartas.addAll(listaCartas);
		
		}
	}
	public Baraja (int tipoBaraja,boolean barajar) {
		if(tipoBaraja ==1){
		for(int i=1;i<=40;i++) {
			listaCartas.add(new Carta(i));
			if(barajar==true) 
				barajar();
		}
		}
		//llamar a tipo baraja
		if(tipoBaraja ==2){
			for(int i=1;i<=40;i++) {
				listaCartas.add(new Carta(i));
				if(barajar==true) 
					barajar();
			}
			listaCartas.addAll(listaCartas);
			
		}
		
		
	}
	public void barajar() {
		Random rand = new Random();
	    ArrayList<Carta> nuevaBaraja = new ArrayList<Carta>();
	    while (!listaCartas.isEmpty()) {
	        int randposicion = rand.nextInt(listaCartas.size());
	        nuevaBaraja.add(listaCartas.remove(randposicion));
	    }

	    listaCartas = nuevaBaraja;
		/*funciona
		 * Random ale = new Random();
		if (listaCartas.size() <= 1) {
	        return; 
	    }
	    int corte = ale.nextInt(listaCartas.size() - 1) + 1;
	    ArrayList<Carta> nuevaBaraja = new ArrayList<Carta>();

	    for (int i = corte; i < listaCartas.size(); i++) {
	        nuevaBaraja.add(listaCartas.get(i));
	    }
	    for (int i = 0; i < corte; i++) {
	        nuevaBaraja.add(listaCartas.get(i));
	    }

	    listaCartas = nuevaBaraja;
	    
	    */
	}
	public void cortar(int pos) {
		ArrayList<Carta>listacarta2baraja=new ArrayList<Carta>();
		//añade desde la posicion hasta el final al princincipio de la segunda baraja
		for(int i=pos;i<listaCartas.size();i++) {
			listacarta2baraja.add(listaCartas.get(i));
		}
		//añaden las cartas desde el principio hasta la posicion final 
		for(int i=0;i<pos;i++) {
			listacarta2baraja.add(listaCartas.get(i));
		}
		listaCartas=listacarta2baraja;
	}
	public Carta robar() {
		if(listaCartas.isEmpty()) {
			return null;
		}
		return listaCartas.remove(0);
	}
	public void insertarCartaFinal(int id_carta) {
		listaCartas.add(new Carta(id_carta));
	}
	
	public void insertarCartaPrincipio(int id_carta) {
		// coge la posicion 0
		listaCartas.add(0, new Carta(id_carta));
	}
	
	public void insertaCartaFinal(Carta c) {
		listaCartas.add(c);
	}
	public void insertarCartaPrincipio(Carta c) {
		listaCartas.add(0, c);
	}
	
	public int getNumeroCartas() {
		return listaCartas.size();
	}
	public boolean estaVacia() {
		return listaCartas.isEmpty();
	}
}
