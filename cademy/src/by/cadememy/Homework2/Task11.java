package by.cadememy.Homework2;

public class Task11 {

	public static void main(String[] args) {

		
	//	Найти слово, в котором число различных символов минимально. 
	//	Если таких слов несколько, найти первое из них.
		
		
		
		
		String word1 = ("qre1wtqwerq1ty");
		System.out.println(word1);
		StringBuffer word11 = new StringBuffer(word1);

		
		for (int q=0; q<word11.length(); q++) {
		int n=word11.length();
		for (int i=q+1; i<n; n-- ) {
			if (word11.charAt(q)==word11.charAt(n-1)) {
				word11 = word11.deleteCharAt(n-1);}}}
		

		System.out.println(word11.length());
		System.out.println(word11);
		
		

	}
}
