package ud4;

import java.util.Scanner;

//rellenar una array
//para una array numewrica por parametro y devuela el valor máximo
public class EJEMPLOfUNCONESaRRAYS {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums=new int [4];
		System.out.println("dirreccion de nums:"+nums);
		rellenaArray(nums);
		muestraArray(nums);
		int maximo=encuentraMax(nums);
		System.out.println("el valor máximo del array es :"+maximo);
		
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
		return;
	}
	public static int encuentraMax(int[] nums2) {
		int max=nums2[0];
		for(int i=1;i<nums2.length;i++) {
			if (nums2[i]>max)
				max=nums2[i];
		}
		return max;
	}
}
