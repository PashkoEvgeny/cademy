package by.cadememy.Homework1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int i=1;
		
		try (Scanner input = new Scanner(System.in)) {
		System.out.print("Multiplication Table: ");
		number = input.nextInt();
		
		while (i<=10) {
			System.out.println(i+" x "+number+" = "+i*number);
			i=i+1;
		}
}
		
	}
}
