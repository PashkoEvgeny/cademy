package by.cadememy.Homework1;

import java.util.Arrays;
import java.util.Random;

public class CaseSwitch {
	
	public static void sort(int arr[]) {
		for (int q=0; q<arr.length; q++ ) {
		for (int i=0; i<arr.length-1; i++) {
			
			if (arr[i]>arr[i+1]) {
				int f;
				f=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=f;
			}
		}
		
	}
	}

	public static void main(String[] args) {

		int[] array= new int[10];
		Random rand=new Random();
		
		for (int i=0; i<array.length; i++) {
			array[i]=rand.nextInt(10);
		}
		System.out.println(Arrays.toString(array));
		
		sort(array);
		
		System.out.println(Arrays.toString(array));
		
	}

}
