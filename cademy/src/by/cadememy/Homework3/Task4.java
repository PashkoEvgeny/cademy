package by.cadememy.Homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static void main(String[] args) throws ParseException {
		
		Pattern pattern1 = Pattern.compile("((([0-2]\\d)|(30)|(31))\\-((0\\d)|(1[0-2]))\\-((19|20)\\d\\d))");
		Pattern pattern2 = Pattern.compile("((([0-2]\\d)|(30)|(31))\\/((0\\d)|(1[0-2]))\\/((19|20)\\d\\d))");
		
		
		
		
		SimpleDateFormat df = new SimpleDateFormat("'Day: '<dd> \n'Month: '<MM>' \nYear: '<yyyy>");
		
		System.out.print("Enter the date: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Date date=new Date();
		
		Matcher matcher = pattern1.matcher(str);
		if (matcher.matches()) {
			SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
			date = df1.parse(str);
		}
		
		Matcher matcher2 = pattern2.matcher(str);
		if (matcher2.matches()) {
			SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
			date = df2.parse(str);
		}
		System.out.println(df.format(date.getTime()));
		
		

	//	SimpleDateFormat df = new SimpleDateFormat("'Day: '<dd> \n'Month: '<MM>' \nYear: '<yyyy>");
	//	SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
	//	SimpleDateFormat df2 = new SimpleDateFormat("dd-MM-yyyy");
		
	//	Date date = df1.parse(str);

	//	System.out.println(df.format(date.getTime()));

		sc.close();
	}
}
