package unidad6ObjetosBasico;

public class ConjutoLibros {
		int tam = 10;
		int cont;
		private Libro [] conjunto;
		
		public ConjutoLibros(int tam) {
			this.conjunto  = new Libro [tam];
			this.tam = tam;
			this.cont=0;
		}
		public ConjutoLibros() {
			
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

		public int getTam() {
			return tam;
		}
		public boolean anadirlibros(Libro libro) {
			if(cont<tam) {
			for(int i=0;i<tam;i++) {
				if(conjunto[i]== null) {
					conjunto[i]=libro;
					cont++;
				}
				return true;
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
		
		public void mostrarMayorCalificacion() {
			int maxCalif=-1;
			for(int i=0; i<cont ;i++) {
				maxCalif = Math.max(maxCalif,conjunto[i].damecalificacion());
				System.out.println("este libro tiene la mayor calificacion de "+conjunto[i].damecalificacion()+
						"y es este libro "+ conjunto[i].dameAtributos());
			}
		}
		public void mostrarMenorCalificacion() {
			int maxCalif=-1;
			for(int i=0; i<cont ;i++) {
				maxCalif = Math.min( maxCalif,conjunto[i].damecalificacion());
				System.out.println("este libro tiene la menor calificacion de "+conjunto[i].damecalificacion()+
						"y es este libro "+ conjunto[i].dameAtributos());
			}
		}
}
