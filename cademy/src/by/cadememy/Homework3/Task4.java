package by.cadememy.Homework3;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		/* Конвертер дат
		Ввести с клавиатуры дату в формате «08/18/2013»
		Вывести на экран эту дату в виде «AUG 18, 2013».
		Воспользоваться объектом Date и SimpleDateFormat.
		*/
		
		        
		        System.out.print("Enter the date: ");
				Scanner sc = new Scanner(System.in);
				String tempDate = sc.nextLine();

		        //в объект simpleFormat записываем тот формат, который нужен
		        
		        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd MM yyyy");
		        
		        //в объект simpleFormat2 записываем текущий по заданию формат
		        
		        SimpleDateFormat simpleFormat2 = new SimpleDateFormat("dd/MM/yyyy");
		        
		        //В объект data записываем запарсенную строку
		        
		        Date date = new Date();
				try {
					date = simpleFormat2.parse(tempDate);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        //Форматируем строку так, как нужно по заданию
		        
		        System.out.println(simpleFormat.format(date).toUpperCase());
		        sc.close();        
		        
		        
		        //Напишите тут ваш код
		    }
		}

