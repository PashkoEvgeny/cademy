package by.cadememy.Deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDate {
	
	
	// Pattern pattern2 = Pattern.compile("((([0-2]\\d)|(30)|(31))\\/((0\\d)|(1[0-2]))\\/((19|20)\\d\\d))");
	
	public static void main(String...args) throws ParseException {
		
		
		String dateV="12-10-2020";
		Pattern pattern = Pattern.compile("((([0-2]\\d)|(30)|(31))\\-((0\\d)|(1[0-2]))\\-((19|20)\\d\\d))");
		Matcher matcher = pattern.matcher(dateV);
		

		SimpleDateFormat df = new SimpleDateFormat("'Day: '<dd> \n'Month: '<MM>' \nYear: '<yyyy>");
		Date date=new Date();
	
		if (matcher.matches()==true) {
			SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
		
				date = df1.parse(dateV);
				System.out.println(df.format(date.getTime()));
			
		}
	}

}

