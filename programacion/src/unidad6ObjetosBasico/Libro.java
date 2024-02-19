package unidad6ObjetosBasico;

public class Libro {
	private String titulo, autor;
	private int numPag, calificacion;
	
	public Libro(String titulo,String autor, int numPag, int calificacion) {
		this.titulo=titulo;
		this.autor=autor;
		this.numPag=numPag;
		this.calificacion=calificacion;
	}
	
	public String dametitulo() {
		return titulo;
	}
	public String dameautor() {
		return autor;
	}
	public int damenumPag() {
		return numPag;
	}
	public int damecalificacion() {
		return calificacion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + ", calificacion=" + calificacion
				+ "]";
	}
	
	
}
