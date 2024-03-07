package ud7POOavanzado;

import java.util.Scanner;

public class usoPersona { 
		static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		
		Persona [] persona=new Persona[10];
		int cantidad=0;
		int op;
		do {
			mostrarmenu1();
			op=in.nextInt();
			switch(op) {
			case 1:
				mostrarmenu();
				op=in.nextInt();
				
				switch(op) {
				case 1:
					crearprofesor(persona,cantidad);
					cantidad++;
					break;
				case 2:
					crearEstudiante(persona,cantidad);
					cantidad++;
					break;
				case 3:
					crearPersonal(persona,cantidad);
					cantidad++;
					break;
				case 4:
					System.out.println("vuelve pronto");
					break;
					default:
						System.out.println("opccion no valida");
				}
				break;
			case 2:
				mostrar(persona,cantidad);
				in.nextLine();
				break;
			case 3:
				System.out.println("vuelve pronto");
				break;
				default:
					System.out.println("opccion no valida");
			}
		}while (op<=3);
		
		
	}
	public static void mostrarmenu1() {
		System.out.println("menu:");
		System.out.println("1.crear persona");
		System.out.println("2.mostrar todo");
		System.out.println("3.salir");
	}
	public static void mostrarmenu() {
		System.out.println("menu:");
		System.out.println("1.crear profesor");
		System.out.println("2.crear alumno");
		System.out.println("3.crear personal de servicio");
		System.out.println("4.salir");
	}
	public static void crearEstudiante(Persona [] persona,int cantidad) {
		if(cantidad <persona.length) {
			System.out.println("introduce el nombre");
			String nombre=in.nextLine();
			in.nextLine();
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
		if(cantidad <persona.length) {
			System.out.print("introduce el nombre");
            String nombre = in.nextLine();
            in.nextLine();
            System.out.print("introduce apellido");
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
            int departamento = in.nextInt();

            persona[cantidad] = new Profesor(añoIncorporacion, numeroDespacho,nombre, apellidos, dni, estadoCivil, departamento);
           
		} else {
            System.out.println("No se pueden crear más personas, límite alcanzado.");
        }
	}
	
	public static void crearPersonal(Persona [] persona , int cantidad) {
		 if (cantidad <persona.length) {
	            System.out.print("introduce el nombre");
	            String nombre = in.nextLine();
	            in.nextLine();
	            System.out.print("introduce apellido");
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

	            persona[cantidad] = new PersolaServicio(añoIncorporacion, numeroDespacho,nombre, apellidos, dni, estadoCivil, seccion);
	           
		 } else {
	            System.out.println("No se pueden crear más personas, límite alcanzado.");
	        }
	}
	public static void mostrar(Persona [] persona , int cantidad) {
		System.out.println("Personas creadas:");
        for (int i = 0; i <=cantidad; i++) {
            System.out.println(persona[i].toString());
        }
	}
	/**/
}
