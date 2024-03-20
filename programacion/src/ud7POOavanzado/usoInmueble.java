package ud7POOavanzado;

public class usoInmueble {

	public static void main(String[] args) {
		Piso pisoNuevo = new Piso("Calle Principal 123", 80, 5, true, 3);
		Local localSegundaMano = new Local("Avenida Secundaria 456", 70, 10, false, 2);

		
		 double precioPiso = pisoNuevo.calcularPrecioFinal();
	     double precioLocal = localSegundaMano.calcularPrecioFinal();
	
	     System.out.println("precio del piso: " + precioPiso);
	        System.out.println("precio del local: " + precioLocal);
	}

}
