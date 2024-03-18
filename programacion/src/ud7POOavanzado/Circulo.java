package ud7POOavanzado;

public class Circulo extends Figura{
		private Punto centro;
		private double radio;
		
		public Circulo(String nombre ,Punto centro ,double radio) {
			super(nombre);
			this.centro=centro;
			this.radio=radio;
			
			
		}
		public double dameradio() {
			return radio;
		}
		public double obtenerArea() {
			return Math.PI*radio*radio;
		}
		public double obtenerVolumen() {
			return 0;
		}
	
}
