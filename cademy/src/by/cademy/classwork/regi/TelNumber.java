package by.cademy.classwork.regi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "+375295673108";

		Pattern pattern = Pattern.compile("[+]{1}(375)+\\d+");

		Matcher matcher = pattern.matcher(text);

		System.out.println(matcher.matches());

	}

}