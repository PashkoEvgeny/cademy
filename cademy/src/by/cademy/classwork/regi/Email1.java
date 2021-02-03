package by.cademy.classwork.regi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email1 {

	public static void main(String[] args) {
		
		String text = "pas123hko.belkrug@mail.ru";
		
		Pattern pattern = Pattern.compile("(\\w+[\\.-_]?\\w+)*@([a-z]{2,6}\\.{1}[a-z]{2,5})");
		
		Matcher matcher = pattern.matcher(text);

		System.out.println(matcher.matches());
		
	}

}

// ([a-zA-Z0-9]{1,}[\\-]{0,1}[a-zA-Z0-9]{1,}[\\.]{0,1}[a-zA-Z0-9]{1,})+@([a-z]{2,6}\\.{1}[a-z]{2,3})

// f2fk4klvbg+fg
