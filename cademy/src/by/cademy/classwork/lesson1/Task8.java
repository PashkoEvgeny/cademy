package by.cademy.classwork.lesson1;

import java.util.Arrays;
import java.util.Random;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * —оздайте массив из 12 случайных целых чисел из отрезка [-15;15]. ќпределите
		 * какой элемент €вл€етс€ в этом массиве максимальным и сообщите индекс его
		 * последнего вхождени€ в массив.
		 */

		int[] array1 = new int[12];
		int max;
		int r=0;

		for (int i = 0; i < array1.length; i++) {
			Random rand = new Random();
			array1[i] = rand.nextInt(31) - 15;

		}

		System.out.println(Arrays.toString(array1));
		int[] array2= new int[12];
		array2=Arrays.copyOf(array1, array1.length);
				
		Arrays.sort(array2);
		
		
		max = array2[array2.length - 1];
		System.out.println("максимальный элемент: "+max);
		
		
		for (int q=0;q<array1.length; q++) {
			if (array1[q]==max) {
				r=q;
			}
			
		}
		System.out.println("позици€ максимального последнего = "+r);

	}

}
