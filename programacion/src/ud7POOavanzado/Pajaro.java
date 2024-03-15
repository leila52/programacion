package ud7POOavanzado;

public class Pajaro extends Animal{
	private boolean canta;
	
	public Pajaro(String nombre,String especie) {
		super(nombre,especie);
		canta=true;
	}
	public void DameFichaAnimal() {
		System.out.println("Pajaro"+getNombre()+"-"+getEspecie()+"-"+canta);
	}
}
