package trimestre_1;
//Que escriba las tablas de multiplicar del 0 al 10.
public class ej22hoja2 {

	public static void main(String[] args) {
		//determina variables
				int cont;
				int num;
				int multi;
				cont=0;
				num=0;
				multi=0;
				while (cont<=10) {
					while (num<=10) {
						multi =cont * num;
						System.out.println(cont+" x " + num + " = " + multi);
						num = num +1;
					}
					cont =cont + 1;
					num=0;
					
				}

	}

}
