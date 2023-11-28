package und4;
import java.util.Scanner;
//experimento
//rellenar una array
//para una array numewrica por parametro y devuela el valor máximo
public class ej3ArrayFuncionesClase {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums=new int [4];
		System.out.println("dirreccion de nums:"+nums);
		int[] nums2=rellenaArray(nums);
		System.out.println("dirreccion de nums2:"+nums2);
		muestraArray(nums);
		nums[1]=20;
		System.out.println(nums2[1]);
	}
	public static int[] rellenaArray(int[] nums) {
		//nums.length=4
		for (int i=0;i<4;i++) {
			System.out.println("Introduce valor");
			nums[i]=entrada.nextInt();
		
		}
		return nums;
	}
	public static void muestraArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+",");	

	}

}
