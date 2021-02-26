package by.cadememy.Homework4;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class AppDate {

	public static void main(String[] args) throws ParseException {
		
		
		
		
		String d1 = "00.02.2021";
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date date1 = null;
		Date date2 = new Date();
		
		    date1 = format.parse(d1);
		   
		
		long difference = date2.getTime()-date1.getTime();
		long days =  difference / (24 * 60 * 60 * 1000);
		System.out.println("days=" + days);

	}

}
