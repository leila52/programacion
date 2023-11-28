package und4;
import java.util.Scanner;
//rellenar una array
//para una array numewrica por parametro y devuela el valor máximo
public class ej4ArrayFuncionesClase {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums=new int [4];
		System.out.println("dirreccion de nums:"+nums);
		rellenaArray(nums);;
		muestraArray(nums);
	}
	public static void rellenaArray(int[] nums2) {
		//nums.length=4
		for (int i=0;i<nums2.length;i++) {
			System.out.println("Introduce valor");
			nums2[i]=entrada.nextInt();
		
		}
		return ;
	}
	public static void muestraArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+",");
		}

	}

}
