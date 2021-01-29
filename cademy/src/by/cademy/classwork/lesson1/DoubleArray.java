package by.cademy.classwork.lesson1;

import java.util.Random;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Задача 14.
		// Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых
		// чисел из отрезка [10;99].
		// Вывести массив на экран.

		Random rand = new Random();

		int[][] array = new int[8][5];

		for (int i = 0; i < 8; i++) {
			for (int q = 0; q < 5; q++) {
				array[i][q] = rand.nextInt(90) + 10;
			}

		}


		
		for (int i = 0; i < 8; i++) {
			for (int q = 0; q < 5; q++) {
				System.out.print(array[i][q]+" ");
				
			}
System.out.println();
		}
		
	}

}
