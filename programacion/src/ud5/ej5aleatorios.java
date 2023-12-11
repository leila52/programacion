package ud5;

import java.util.Random;

// Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
//espacios. Muestra también el máximo, el mínimo y la media de esos números.
public class ej5aleatorios {
	public static void main(String[] args) {
		//50 numeros aleatorios
		int[] nums=new int [50];
		//se rellena con numeros aleatorios
		rellenaArray(nums);
		//para encontrar el maximo y minimo dentro del array
		int result;
		result=encontrarMaximo(nums);
		System.out.println("el numero máximo es :"+result);
		int result2;
		result2=encontrarMinimo(nums);
		System.out.println("el numero minimo es :"+result2);
		double result3;
		result3=media(nums);
		System.out.println("la media total es "+result3);	
	}
	public static void rellenaArray(int[] nums) {
		for (int i=0;i<50;i++) {
			Random ale=null;
			ale=new Random();
			int num=ale.nextInt(100)+100;
			nums[i]=num;
			System.out.println(num+" ");
		}
		return;
	}
	public static int encontrarMaximo(int[] nums) {
		int max=nums[0];
		for(int i=1;i<nums.length;i++) {
			if (nums[i]>max)
				max=nums[i];
		}
		return max;
	}
	public static int encontrarMinimo(int []nums) {
		int min=nums[0];
		for(int i=1;i<nums.length;i++) {
			if (nums[i]<min)
				min=nums[i];
		}
		return min;
	}
		public static double media(int [] nums) {
			int acum=0;
			for (int i=0;i<nums.length;i++) {
				acum = acum + nums[i];
			}
			double media=acum/nums.length;
			return media;
			}

}
