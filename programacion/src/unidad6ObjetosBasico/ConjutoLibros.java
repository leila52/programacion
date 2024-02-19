package unidad6ObjetosBasico;

public class ConjutoLibros {
		private final int TAM = 10;
		private int cont;
		private Libro [] conjunto;
		
		public ConjutoLibros() {
			this.conjunto  = new Libro [10];
			this.cont=0;
		}
		public int getCont() {
			return cont;
		}

		public void setCont(int cont) {
			this.cont = cont;
		}

		public Libro[] getConjunto() {
			return conjunto;
		}

		public void setConjunto(Libro[] conjunto) {
			this.conjunto = conjunto;
		}

		public boolean anadirlibros(Libro libro) {
			if(cont<TAM) {
			for(int i=0;i<TAM;i++) {
				if(conjunto[i]== null) {
					conjunto[i]=libro;
					cont++;
					return true;
				}
				
			}
			}
			return false;
		}
		public boolean eliminarlibroTitulo(String repuesta) {
			for(int i=0; i<cont;i++) {
				if(conjunto[i] != null && conjunto[i].dametitulo().equals(repuesta)) {
					conjunto[i] = null;
					cont--;
					return true;
				}
		}
		return false;
		}
		public boolean eliminarlibroAutor(String repuesta) {
			boolean eliminado=false;
			for(int i=0; i<cont;i++) {
				if(conjunto[i] != null && conjunto[i].dameautor().equals(repuesta)) {
					conjunto[i] = null;
					eliminado = true;
					cont--;
					return true;
				}
		}
		return eliminado;
		}
		private int dameprimeraPosicion() {
			for(int i=0;i < TAM;i++) {
				if(conjunto[i] != null) {
					return i;
				}
			}
			return -1;
		}
		public void mostrarMayorCalificacion() {
			int primeraposicion=dameprimeraPosicion();
			int posMaxCalificacion=primeraposicion;
			int maxCalif=0;
			if(primeraposicion != -1) { //no esta vacio{
				maxCalif = conjunto[primeraposicion].damecalificacion();
				for(int i= primeraposicion+1;i <TAM;i++) {
					if(conjunto[i]!= null) {
						if(conjunto[i].damecalificacion()>maxCalif) {
							maxCalif=conjunto[i].damecalificacion();
							posMaxCalificacion=i;
						}
					}
				}
				
			System.out.println("este libro tiene la mayor calificacion de "+conjunto[posMaxCalificacion].damecalificacion()+
				"y es este libro "+ conjunto[posMaxCalificacion].toString());
		}
		}
		public void mostrarMenorCalificacion() {
			int primeraposicion=dameprimeraPosicion();
			int posMinCalificacion=primeraposicion;
			int minCalif=0;
			if(primeraposicion != -1) { //no esta vacio{
				minCalif = conjunto[primeraposicion].damecalificacion();
				for(int i= primeraposicion+1;i <TAM;i++) {
					if(conjunto[i]!= null) {
						if(conjunto[i].damecalificacion()<minCalif) {
							minCalif=conjunto[i].damecalificacion();
							posMinCalificacion=i;
						}
					}
				}
				System.out.println("este libro tiene la menor calificacion de "+conjunto[posMinCalificacion].damecalificacion()+
						"y es este libro "+ conjunto[posMinCalificacion].toString());
			}
				
		}
		public String toString() {
			String cadena="";
			for(int i=0; i< TAM ; i++) {
				if(conjunto[i] != null) {
				cadena+=conjunto[i].toString()+"\n";
			}
			}
			return cadena;
		}
}
