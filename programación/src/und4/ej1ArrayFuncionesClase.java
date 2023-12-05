package und4;
import java.util.Scanner;
//rellenar una array
//para una array numewrica por parametro y devuela el valor máximo
public class ej1ArrayFuncionesClase {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums=new int [8];
		nums=rellenaArray(nums);
	}
	public static int[] rellenaArray(int[] nums) {
		//nums.length=8
		for (int i=0;i<8;i++) {
			System.out.println("Introduce valor");
			nums[i]=entrada.nextInt();
		}
		return nums;

	}

}
