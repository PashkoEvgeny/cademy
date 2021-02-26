package by.cadememy.Homework4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
	
	/*Задание 1.
	Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
	
	
	Методы: задать дату, вывести на консоль день недели по заданной дате. 
	День недели представить в виде перечисления. 
	Рассчитать количество дней, в заданном временном промежутке.
	Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
	После валидации в конструкторе создаем объекты класса Year, Month, Day.
	Добавить метод, который проверяет высокосный ли год или нет. */

	public
	
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
