package by.cademy.classwork.regi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {



	public static void main(String[] args) {
		String text = "Егор Алла Александр";
		Pattern pattern = Pattern.compile("А.+а");
		Matcher matcher = pattern.matcher(text);
		
		System.out.println(Pattern.matches("А.+а","Алла"));//true
		System.out.println(Pattern.matches("А.+а","Егор Алла Александр"));//false
	}
}
