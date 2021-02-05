package by.cadememy.Homework3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task7 {

	public static void main(String[] args) {
		
		Calendar calendar = new GregorianCalendar();
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println(calendar.getTime());
		
	}

}
