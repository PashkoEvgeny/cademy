package by.cademy.classwork.regi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {



	public static void main(String[] args) {
		String text = "���� ���� ���������";
		Pattern pattern = Pattern.compile("�.+�");
		Matcher matcher = pattern.matcher(text);
		
		System.out.println(Pattern.matches("�.+�","����"));//true
		System.out.println(Pattern.matches("�.+�","���� ���� ���������"));//false
	}
}
