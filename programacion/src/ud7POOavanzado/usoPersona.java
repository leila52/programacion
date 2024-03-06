package ud7POOavanzado;

import java.util.Scanner;

public class usoPersona { 
		static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		
		Persona [] persona=new Persona[10];
		int cantidad=0;
		
		
	}
	public static void mostrarmenu() {
		System.out.println("menu:");
		System.out.println("1.crear profesor");
		System.out.println("2.crear alumno");
		System.out.println("3.crear personal de servicio");
		System.out.println("4.mostrar todo");
		System.out.println("5.salir");
	}
	public static void crearEstudiante(Persona [] persona,int cantidad) {
		if(cantidad <10) {
			System.out.println("introduce el nombre");
			String nombre=in.nextLine();
			System.out.println("introduce apellido");
			String apellido=in.nextLine();
			System.out.println("introduce dni");
			String dni=in.nextLine();
			System.out.println("introduce estado_civil");
			String estado_civil=in.nextLine();
			System.out.println("introde el curso");
			String curso=in.nextLine();
			persona[cantidad]=new Estudiante(nombre, apellido,dni,estado_civil,curso);
			
		}else {
			System.out.println("no se pueden crear mas personas");
		}
	}
	public static void crearprofesor(Persona [] persona,int cantidad) {
		if(cantidad <10) {
			System.out.print("Nombre: ");
            String nombre = in.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = in.nextLine();
            System.out.print("DNI: ");
            String dni = in.nextLine();
            System.out.print("Estado Civil: ");
            String estadoCivil = in.nextLine();
            System.out.print("Año de Incorporación: ");
            int añoIncorporacion = in.nextInt();
            System.out.print("Número de Despacho: ");
            int numeroDespacho = in.nextInt();
            in.nextLine();  

            System.out.print("Departamento: ");
            String departamento = in.nextLine();

            persona[cantidad] = new Profesor(nombre, apellidos, dni, estadoCivil, añoIncorporacion, numeroDespacho, departamento);
        } else {
            System.out.println("No se pueden crear más personas, límite alcanzado.");
        }
	}
	
	public static void crearPersonal(Persona [] persona , int cantidad) {
		 if (cantidad < 10) {
	            System.out.print("Nombre: ");
	            String nombre = in.nextLine();
	            System.out.print("Apellidos: ");
	            String apellidos = in.nextLine();
	            System.out.print("DNI: ");
	            String dni = in.nextLine();
	            System.out.print("Estado Civil: ");
	            String estadoCivil = in.nextLine();
	            System.out.print("Año de Incorporación: ");
	            int añoIncorporacion = in.nextInt();
	            System.out.print("Número de Despacho: ");
	            int numeroDespacho = in.nextInt();
	            in.nextLine();

	            System.out.print("Sección: ");
	            String seccion = in.nextLine();

	            persona[cantidad] = new PersolaServicio(nombre, apellidos, dni, estadoCivil, añoIncorporacion, numeroDespacho, seccion);
	        } else {
	            System.out.println("No se pueden crear más personas, límite alcanzado.");
	        }
	}
	public static void mostrar(Persona [] persona , int cantidad) {
		System.out.println("Personas creadas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(persona[i]);
        }
	}
}
