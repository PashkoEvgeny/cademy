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

// � ������� SimpleDateFormat ���������� ������, �������� � �������, � ����������� �� ��������, � �������� ���� ��������.
// ������� ������ � ��������� �������:

   /*����: <Day>
	�����: <Month>
	Year: <Year> */
