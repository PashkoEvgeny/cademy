package by.cadememy.Homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {

		System.out.print("Enter the date: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		// проверка на кол-во дней в месяце
		// проверка на високосный год

		Pattern pattern = Pattern.compile("((([0-2]\\d)|(30)|(31))\\-((0\\d)|(1[0-2]))\\-((19|20)\\d\\d))|"
				+ "((([0-2]\\d)|(30)|(31))\\/((0\\d)|(1[0-2]))\\/((19|20)\\d\\d))");

		Matcher matcher = pattern.matcher(text);

		System.out.println(matcher.matches());
		sc.close();
	}

}
