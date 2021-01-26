package by.cadememy.Homework1;

import java.util.Arrays;

public class CaseSwitch {

	public static void main(String[] args) {
		System.out.println("Hello");

		int n = 0;

		for (int i = 1; i <= 99; i++) {
			if (i % 2 == 1) {
				n++;
			}

		}
		System.out.println(n);

		int[] array = new int[n];

		System.out.println(Arrays.toString(array));

	
		for (int r = 1, q=0;r <= 99; r++) {
			if (r % 2 == 1) {
				array[q] = r;
				q++;

			}

		}

		System.out.println(Arrays.toString(array));

		for (int a = array.length - 1; a >= 0; a--) {
			System.out.print(array[a] + "  ");
		}

	}
}
