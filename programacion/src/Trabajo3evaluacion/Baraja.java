package Trabajo3evaluacion;

import java.util.ArrayList;

public class Baraja {
	private ArrayList<Carta> listaCartas=new ArrayList<Carta>();
	
	public Baraja() {
		for(int i=1;i<=40;i++) {
			listaCartas.add(new Carta(i));
		}
	}
	//tipo de baraja
	
	public Baraja(int tipoBaraja) {
		//para q haya 80 se suma las 40 con otras 40
		if(tipoBaraja ==2){
			listaCartas.addAll(listaCartas);
		}
	}
	public Baraja (int tipoBaraja,boolean barajar) {
		//llamar a tipo baraja
		if(barajar==true) {
			barajar();
		}
	}
	public void barajar() {
		
	}
	public void cortar(int pos) {
		
	}
	public Carta robar() {
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
