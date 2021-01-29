package by.cadememy.Homework2;

import java.util.Arrays;
import java.util.HashMap;
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
		
		
		HashMap<Integer, String> lenfthword = new HashMap<>();

		

	     
		
		String word1 = ("qre1wtqwerq1ty");
		System.out.println(word1);
		StringBuffer word11 = new StringBuffer(word1);
		for (int q=0; q<word11.length(); q++) {
		int max=word11.length();
		for (int i=q+1; i<max; max-- ) {
			if (word11.charAt(q)==word11.charAt(max-1)) {
				word11 = word11.deleteCharAt(max-1);}}}
		lenfthword.put(word11.length(), word1);
		
		
System.out.println(lenfthword);
		
		

		
		
		
		
		
		
		
	

		sc.close();
		
		
	}
	

}
