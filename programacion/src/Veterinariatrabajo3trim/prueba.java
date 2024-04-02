package Veterinariatrabajo3trim;

public class prueba {

	public static void main(String[] args) {
		 ClinicaVeterinaria clinica = new ClinicaVeterinaria();
		Reptil reptil = new Reptil("luca", "ksksakkks", "comentarios", 12," especie", true);
		Perro perro = new Perro("Luna", "PastorAleman", "12/02/2003", 12.4, "38479382749DF39", "Se ha roto una pata.");
        Gato gato = new Gato("Molly", "Siames", "05/06/2010", 5.8, "38479382749DF40", "Necesita vacunas.");
        Pajaro pajaro = new Pajaro("Piolín", "20/04/2018","Le gusta cantar por las mañanas.", 0.1, "Canario", true);
        

        clinica.insertarAnimal(perro);
        clinica.insertarAnimal(gato);
        clinica.insertarAnimal(pajaro);
        
        Animal animalEncontrado = clinica.buscarAnimal("Luna");

	    if (animalEncontrado != null) {
	        System.out.println("El animal fue encontrado:");
	        System.out.println(animalEncontrado.DameDatosAnimal());
	    } else {
	        System.out.println("No se encontró ningún animal con ese nombre.");
	    }
	    System.out.println(clinica);
	    if(clinica.modificarComentarioAnimal("Luna", "laslaslsll")) {
			System.out.println("el comentario se modifico ");
		}else {
			System.out.println("no se encontro el animal");
		}
	    System.out.println(clinica);
	}

}
