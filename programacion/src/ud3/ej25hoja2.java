package ud3;
//que escriba los primeros 25 digitos de la sucesión de fibonacci
public class ej25hoja2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //variables
		int num1;
		num1=0;
		int num2;
		num2=1;
		int acum;
		acum=1;
		int cont;
		cont=1;
		System.out.println(num1);
		while (cont<25) {
			System.out.println(acum);
 			acum=(num1+num2);
			num1= num2;
			num2=acum;
			cont=cont+1;
		}
		
	}

}
