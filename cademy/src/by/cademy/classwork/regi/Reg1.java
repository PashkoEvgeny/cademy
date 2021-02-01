package by.cademy.classwork.regi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {

	
	    public static void main(String[] args) {
	        Pattern pattern = Pattern.compile("a*b*b");
	        Matcher matcher = pattern.matcher("aaaab");
	        boolean b = matcher.matches();
	        System.out.println(b);
	        
	    }
	}
