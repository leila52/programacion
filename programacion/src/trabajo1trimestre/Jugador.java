package trabajo1trimestre;

import java.util.ArrayList;

public class Jugador {
	private ArrayList<Carta> cartasEnSuMano;
	private ArrayList<Carta> cartaGanadas;
	private boolean tieneSieteOros;
	private int numsietes,numoros,numescobas;
	//constructor
	public Jugador () {
		cartasEnSuMano=new ArrayList<Carta>();
		cartaGanadas=new ArrayList<Carta>();
		tieneSieteOros=false;
		 numsietes=0;
		 numoros=0;
		 numescobas=0;
	}
	//agregar carta
	public void agregarCartaAlaMano(Carta carta) {
		cartasEnSuMano.add(carta);
		if(carta.getNumero()==7 && carta.getPalo()==0) {
			tieneSieteOros=true;
		}
		if(carta.getNumero()==7) {
			numsietes++;
		}
		if(carta.getPalo()==0) {
			numoros++;
		}
	}
	public void jugarcarta(Carta carta) {
		cartasEnSuMano.remove(carta);
	}
	public void ganarCartas(ArrayList <Carta> cartas) {
		for(int i=0;i<cartas.size();i++) {
			Carta carta =cartas.get(i);
			cartaGanadas.add(carta);
			if(carta.getNumero()==8 ||carta.getNumero()==9||carta.getNumero()==10) {
				numescobas++;
			}
		}
	}
	public int CalcularPuntos() {
		int puntos=0;
		puntos+=numsietes;
		puntos+=numoros;
		puntos +=numescobas;
		return puntos;
	}
	public ArrayList<Carta> getCartasEnSuMano() {
		return cartasEnSuMano;
	}
	public void setCartasEnSuMano(ArrayList<Carta> cartasEnSuMano) {
		this.cartasEnSuMano = cartasEnSuMano;
	}
	public ArrayList<Carta> getCartaGanadas() {
		return cartaGanadas;
	}
	public void setCartaGanadas(ArrayList<Carta> cartaGanadas) {
		this.cartaGanadas = cartaGanadas;
	}
	public boolean isTieneSieteOros() {
		return tieneSieteOros;
	}
	public void setTieneSieteOros(boolean tieneSieteOros) {
		this.tieneSieteOros = tieneSieteOros;
	}
	public int getNumsietes() {
		return numsietes;
	}
	public void setNumsietes(int numsietes) {
		this.numsietes = numsietes;
	}
	public int getNumoros() {
		return numoros;
	}
	public void setNumoros(int numoros) {
		this.numoros = numoros;
	}
	public int getNumescobas() {
		return numescobas;
	}
	public void setNumescobas(int numescobas) {
		this.numescobas = numescobas;
	}
}
