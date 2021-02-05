package by.cadememy.Homework3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.GregorianCalendar;

public class Chernovik {

	public static void main(String[] args) {
	
		
		Calendar calendar = new GregorianCalendar();
	
		SimpleDateFormat df = new SimpleDateFormat("'Day: '<dd> \n'Month: '<MM>' \nYear: '<yyyy>");

		System.out.println(df.format(calendar.getTime()));
	}


	

}

// С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, к которому дата подходит.
// Вывести строку в следующем формате:

   /*День: <Day>
	Месяц: <Month>
	Year: <Year> */
