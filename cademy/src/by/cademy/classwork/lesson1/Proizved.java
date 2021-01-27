package by.cademy.classwork.lesson1;

public class Proizved {

	public static void main(String[] args) {

		int nor = 1;

		for (int i = 13; i < 100; i +=26) {
			if (i % 13 == 0) {
				nor = nor * i;
			}

		}

		System.out.println("Result: " + nor);

		int result = 1;

		for (int p = 11; p < 100; p += 2) {
			if (p % 13 == 0) {
				result = result * p;
			}
		}

		System.out.println("Result: " + result);

	}

}
