package unidad6ObjetosBasico;

public class ConjutoLibros {
		final int tam = 10;
		int cont;
		private Libro [] conjunto = new Libro [tam];
		
		public ConjutoLibros(Libro [] conjunto) {
			this.conjunto= conjunto;
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
			for(int i=0;i<cont;i++) {
			if(conjunto[i].equals(null)) {
				if(i<10) {
				conjunto[i]=libro;
				cont++;
				}
				return true;
			}
			}
			return false;
		}
		public void eliminarlibroTitulo(String repuesta) {
			for(int i=0; i<conjunto.length;i++) {
				if(repuesta.equals(conjunto[i].dametitulo()) ) {
					if(i<cont) {
						for(int j=0;i<cont;j++) {
							conjunto[j]= conjunto[j+1];
						}
					}else {
						conjunto[i]=null;
					}
				}
				if(repuesta.equals(conjunto[i].dameautor()) ) {
					if(i<cont) {
						for(int j=0;i<cont;j++) {
							conjunto[j]= conjunto[j+1];
						}
					}else {
						conjunto[i]=null;
					}
				}
			}
		}
		
		                                                                                                                                                                                                                                           

}
