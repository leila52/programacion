package ud4;
import java.util.Scanner;
public class recursividas {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		System.out.println("introduce el nunmero");
		num=entrada.nextInt();
		fact(num);
		System.out.println(fact(num));
	}
	public static int fact (int num) {
		//caso base
		if(num<=1)
			return 1;
		//caso general
		int fact=num*fact(num-1);
		return fact;
	}
}
