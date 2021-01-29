package by.cadememy.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Задание 2. 
			Ввести n слов с консоли. 
			Найти слово, в котором число различных символов минимально. 
			Если таких слов несколько, найти первое из них.
		 */
		
		System.out.print("How many words do you want to enter?: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter "+n+" words:");
		
		String[] array= new String[n];
		sc.nextLine();
		for (int i=0; i<array.length; i++) {
			array[i]=sc.nextLine();
		
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(array.length);
		
		array[0]=Arrays.sort(array[0]);
		
		String[] array2=new Arrays.sort(array);
		
		System.out.println(Arrays.toString(Arrays.sort(array)));
		
		
		
		
		
	
	
	//	String word1 = sc.nextLine();
	//	String word2 = sc.nextLine();
		sc.close();
		
		
	}
	

}
