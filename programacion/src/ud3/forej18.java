package ud3;
//Que escriba las tablas de multiplicar del 0 al 1
public class forej18 {

	public static void main(String[] args) {
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
