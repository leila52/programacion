package unidad6ObjetosBasico;

public class ConjuntoLibros2 {
	private final int TAM =10;
	private int cont;
	private Libro[] conjunto;
	
	public ConjuntoLibros2() {
		this.conjunto = new Libro [TAM];
		this.cont = 0;
	}
	public Libro[] getConjunto() {
		return conjunto;
	}
	public void setConjunto(Libro[]conjunto) {
		this.conjunto=conjunto;
	}
	public boolean agregarLibros(Libro libro) {
		if(cont < TAM) {
			conjunto[cont] = libro;
			cont++;
			return true;
		}
		return false;

	}public boolean eliminarLibroPorTitulo(String tituloLibro) {
		for(int i = 0; i < cont; i++) {
			if(tituloLibro.equals(conjunto[i].dametitulo())) {
				if(i < cont) {
					for(int j = i; j < cont-1; j++) {
					conjunto[j] = conjunto [j+1];
					conjunto [j+1] = null;
					}
					
				}else {
					conjunto[i]= null;
				}
				cont--;
				return true;
			}
		}	
		return false;
		
	}public boolean eliminarLibroPorAutor(String autorLibro) {	
		for(int i = 0; i < cont; i++) {
			if(autorLibro.equals(conjunto[i].dameautor())) {
				if(i < cont) {
					for(int j = i; j < cont-1; j++) {
					conjunto[j] = conjunto [j+1];
					conjunto [j+1] = null;
					}
					
				}else {
					conjunto[i]= null;
				}
				cont--;
				return true;
			}
		}	
		return false;
		
	}public void mejorPuntuacion() {
		int mejorNota = 0;
		int posMejorNota = 0;
		for(int i = 0; i < cont; i++) {
			if(mejorNota < conjunto[i].damecalificacion()) {
				mejorNota = conjunto[i].damecalificacion();
				posMejorNota = i;
			}
		}
		System.out.println("El libro con mejor nota: " + conjunto[posMejorNota]);
		
	}public void menorPuntuacion() {
		int menorNota = 10;
		int posMenorNota = 0;
		for(int i = 0; i < cont; i++) {
			if(menorNota > conjunto[i].damecalificacion()) {
				menorNota = conjunto[i].damecalificacion();
				posMenorNota = i;
			}
		}
		System.out.println("El libro con menor nota: " + conjunto[posMenorNota]);
		
	}public void mostrarConjunto() {
		for(int i = 0; i < cont; i++) {
			System.out.println(conjunto[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
