package ud7POOavanzado;

import java.util.ArrayList;

public class vectordefiguras {

	public static void main(String[] args) {
		ArrayList<Figura> vector= new ArrayList<Figura>();
		Punto p= new Punto("puntito",3,5);
		Circulo c=new Circulo("circulito",p,8);
		Cilindro cil=new Cilindro("cilindri",c,4);
		vector.add(p);
		vector.add(c);
		vector.add(cil);
		for(int i=0;i<vector.size();i++) {
			System.out.println("la figura "+vector.get(i).getNombre()+":" );
			System.out.println("el area es: "+vector.get(i).obtenerArea());
			System.out.println("el volumen es: "+vector.get(i).obtenerVolumen());
			
			System.out.println("\n");
		}
		

	}

}
