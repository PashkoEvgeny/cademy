package by.cadememy.Homework2;

public class Tak1 {

	public static void main(String[] args) {

		long start = System.nanoTime();
		
		
		Boolean answer = Boolean.FALSE;

		String str1 = "hello";
		String str2 = "lohel";

		if (str1.length() == str2.length()) {
			int[] symbol = new int[256];
			char[] arr1 = str1.toCharArray();

			for (int element : arr1) {
				symbol[element]++;
			}

			for (int i = 0; i < str2.length(); i++) {
				int element = str2.charAt(i);
				symbol[element]--;

				if (symbol[element] < 0) {
					answer = Boolean.FALSE;
					break;
				}
				answer = Boolean.TRUE;
			}
		}

		System.out.println("Ответ: " + answer);
		
		
		
		long finish = System.nanoTime();
		long timeConsumedMillis = finish - start;
		System.out.println(timeConsumedMillis);
	}
}

