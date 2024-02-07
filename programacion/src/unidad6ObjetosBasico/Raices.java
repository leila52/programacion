package unidad6ObjetosBasico;

public class Raices {
	private double a ;
	private double b ;
	private double c ;
	public Raices(double numa,double numb,double numc) {
		a=numa;
		b=numb;
		c=numc;
	}public double getDiscriminate() {
		double potencia;
		potencia=Math.pow(b,2);
		double resta= 4*a*c;
		double discriminate=potencia - resta;
		return discriminate;
	}
	public void obtenerRaices() {
		double raizprincipal=Math.sqrt(getDiscriminate());
		if(tieneRaices()==true) {
			double soluy1;
			soluy1=(-b+ raizprincipal)/2*a;
			double solu2;
			solu2=(-b - raizprincipal)/2*a;
			System.out.println("hay dos soluciones: "+soluy1+" y esta solucion "+solu2);
		}
		
	}public void obtenerRaice() {
		double raizpri=Math.sqrt(getDiscriminate());
		if(tieneRaice()==true) {
			double solucion=-b/2*a;
			System.out.println("solo hay una solucion : "+solucion);
		}
	}public boolean tieneRaices() {
		double raizprincipal=Math.sqrt(getDiscriminate());
		if(raizprincipal > 0) {
			return true;
		}else 
			return false;
	}

	public boolean tieneRaice() {
		double raizprincipal=Math.sqrt(getDiscriminate());
		if(raizprincipal == 0) {
			return true;
		}else 
			return false;
	}
	public void Calcular() {
		if(tieneRaices()) {
			obtenerRaices();
		}else if(tieneRaice()) {
			obtenerRaice();
		}else {
			System.out.println("no tiene raices");
		}
	}
}

