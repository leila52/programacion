package universidad;

import java.util.Scanner;

public class usopersona2 {
	static Persona[] personas;
	final static int ESTUDIANTE=1;
	final static int PROFESOR=2;
	final static int PERSONAL_SERVICIO=3;
	static Scanner scanner;
	public static void main(String[] args) {
		
			int contadorPersonas=0;
			scanner=new Scanner(System.in);
			int opcion=0;
			personas=new Persona[10];
			do {
				showMenu();
				opcion=Integer.parseInt(scanner.nextLine());
				switch(opcion) {
				case 1: //añadir 
					showAddMenu();
					opcion=Integer.parseInt(scanner.nextLine());
					Persona persona=createPerson(opcion);
					
					if (persona!=null) {
						personas[contadorPersonas]=persona;
						contadorPersonas++;
					}else {
						System.out.println("Opción de persona no válida");
					}
					break;
				case 2: 
					showPeople();
					break;
				case 3://cambiar dpto de un profesor 
					changeTeacherDepartment();
					break;
				case 4:
					System.out.println("Hasta otra");
					break;
				default:
					System.out.println("Opción no válida");
				}
			}while(opcion!=4);
		}

		public static void changeTeacherDepartment() {
			System.out.println("¿De qué profesor quieres cambiar el departamento?"
					+ "(Introduce posicion del array)");
			int pos=Integer.parseInt(scanner.nextLine());
			if ((pos<personas.length)&&(personas[pos]!=null)) {
				if(personas[pos] instanceof Profesor) {
					System.out.println("Introduce el nuevo departamento");
					int nuevoDpto=scanner.nextInt();
					Profesor profe=(Profesor)personas[pos];
					profe.setNum_departameto(nuevoDpto);
				}else {
					System.out.println("Esa posición no es un profesor");
				}
			}
		}

		public static void showPeople() {
			for (int i=0;i<personas.length;i++) {
				if (personas[i]!=null) {
					System.out.println(personas[i]);
				}
			}
		}
		
		public static void showMenu() {
			System.out.println("Menu:");
			System.out.println("1.Añadir");
			System.out.println("2.Mostrar");
			System.out.println("3.Cambiar departamento de un profesor");
			System.out.println("4.Salir");
		}
		public static void showAddMenu() {
			System.out.println("¿Que quieres añadir?");
			System.out.println("1. Estudiante");
			System.out.println("2. Profesor");
			System.out.println("3. Personal Servicios");
		}
		public static Persona createPerson(int tipoPersona) {
			if ((tipoPersona!=ESTUDIANTE)&&
					(tipoPersona!=PROFESOR)&&(tipoPersona!=PERSONAL_SERVICIO))
				return null;
			//pido los datos de una persona	
			System.out.println("Nombre");
			String nombre=scanner.nextLine();
			System.out.println("Apellido");
			String apellido=scanner.nextLine();
			System.out.println("dni");
			String dni=scanner.nextLine();
			System.out.println("Estado civil");
			String estadoCivil=scanner.nextLine();
			
			if (tipoPersona==ESTUDIANTE) {
				System.out.println("Curso");
				String curso=scanner.nextLine();
				return new Estudiante(nombre, apellido, 
						dni, estadoCivil, curso);
			}
			//pido datos de un empleado
			System.out.println("Año incorporacion");
			int anyo=Integer.parseInt(scanner.nextLine());
			System.out.println("Número de despacho");
			int despacho=Integer.parseInt(scanner.nextLine());
			
			if (tipoPersona==PROFESOR) {
				System.out.println("Departamento");
				int dpto=scanner.nextInt();
				return new Profesor(anyo, despacho,nombre, apellido, dni, estadoCivil, dpto);
			}
			if (tipoPersona==PERSONAL_SERVICIO) {
				System.out.println("Seccion");
				String seccion=scanner.nextLine();
				return new PersolaServicio(anyo, despacho,nombre, apellido, dni, estadoCivil, seccion);
			}
			return null;
			
		}

}
