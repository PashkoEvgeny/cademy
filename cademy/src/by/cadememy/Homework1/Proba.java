package by.cadememy.Homework1;

import java.util.Scanner;

public class Proba {

	public static void main(String[] args) {
		int summa;
		int vozrast;
		int itogo=0;
		
	// Ввод данных 
		try (Scanner input = new Scanner(System.in)) {
		System.out.print("summa pokupok v magazine: ");		
		summa = input.nextInt();
		System.out.print("vozrast pokupatelja: ");
		vozrast = input.nextInt();
}

	/* 1) Сумма до 100 рублей -> 5%
	2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
	3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
	4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
	5) Сумма покупки больше 400 рублей включая -> 20%

	  */


		
		
		
		
		
		System.out.print("itogo c uchetom skidki:"+ itogo);

	}
}
