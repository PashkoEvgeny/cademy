package by.cadememy.Homework3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Chernovik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.MINUTE, 20);
		   Date date = calendar.getTime();
		   System.out.println(date);
	

	}

}
