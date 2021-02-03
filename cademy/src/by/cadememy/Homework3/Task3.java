package by.cadememy.Homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * 3. �������� �����, ������� �������� �� ��������� ���� �� ������������
		 * �������: (������������ regexp) a) dd/MM/yyyy b) dd-MM-yyyy
		 * 
		 */

		String text = "23-12-2021";
		
		// �������� �� ���-�� ���� � ������

		Pattern pattern = Pattern.compile("((([0-2][\\d])|(30)|(31))\\-(([0][\\d])|([1][0-2]))\\-((19|20)\\d\\d))|"
				+ "((([0-2][\\d])|(30)|(31))\\/(([0][\\d])|([1][0-2]))\\/((19|20)\\d\\d))");

		Matcher matcher = pattern.matcher(text);

		System.out.println(matcher.matches());

	}

}
