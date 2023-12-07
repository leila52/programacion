package ud5;

import java.util.Random;

// Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
//espacios. Muestra también el máximo, el mínimo y la media de esos números.
public class ej5aleatorios {
	public static void main(String[] args) {
		//50 numeros aleatorios
		double[] nums=new double [50];
		rellenaArray(nums);
		double result;
		result=encontrarMaximo(nums);
		System.out.println("el numero máximo es :"+result);
		double result2;
		result2=encontrarMinimo(nums);
		System.out.println("el numero minimo es :"+result2);
		double result3;
		result3=media(nums);
		System.out.println("la media total es "+result3);	
	}
	public static void rellenaArray(double[] nums) {
		for (int i=0;i<50;i++) {
			Random ale=null;
			ale=new Random();
			int num=ale.nextInt(100)+100;
			nums[i]=num;
			System.out.println(num+" ");
		}
		return;
	}
	public static double encontrarMaximo(double[] nums) {
		double max=nums[0];
		for(int i=1;i<nums.length;i++) {
			if (nums[i]>max)
				max=nums[i];
		}
		return max;
	}
	public static double encontrarMinimo(double []nums) {
		double min=nums[0];
		for(int i=1;i<nums.length;i++) {
			if (nums[i]<min)
				min=nums[i];
		}
		return min;
	}
		public static double media(double [] nums) {
			double acum=0;
			for (int i=0;i<nums.length;i++) {
				acum = acum + nums[i];
			}
			double media=acum/nums.length;
			return media;
			}

}
