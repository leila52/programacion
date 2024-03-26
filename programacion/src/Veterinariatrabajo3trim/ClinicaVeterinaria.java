package Veterinariatrabajo3trim;

import java.util.ArrayList;

public class ClinicaVeterinaria {
	private ArrayList<Animal> listaAnimal;
	
	//constructor
	public ClinicaVeterinaria() {
        listaAnimal = new ArrayList<>();
    }
	public ArrayList<Animal> getListaAnimal() {
		return listaAnimal;
	}


	public void setListaAnimal(ArrayList<Animal> listaAnimal) {
		this.listaAnimal = listaAnimal;
	}
	
	public void insertarAnimal(Animal animal) {
		listaAnimal.add(animal);
	}
	
	//buscar
	public Animal buscarAnimal(String nombre) {
		for(int i=0;i<listaAnimal.size();i++) {
			
			if(listaAnimal.get(i).getNombre().equals(nombre)){
				Animal a=listaAnimal.get(i);
				return a;
			}
		}
		return null;
	}
	
	public boolean modificarComentarioAnimal(String nombre,String nuevcoment) {
		for(int i=0;i<listaAnimal.size();i++) {
			
			if(listaAnimal.get(i).getNombre().equals(nombre)) {
				listaAnimal.get(i).setComentarios(nuevcoment);
				return true;
			}
		}return false;
	}
	
	public String toString() {
		String fichadetodo="";
		for(int i=0;i<listaAnimal.size();i++) {
			fichadetodo +=listaAnimal.get(i).DameDatosAnimal()+"\n";
		}
		return fichadetodo;
		
	}


	

}
