package by.cadememy.Homework4;

import java.time.LocalDate;



public class Date {
	
	//LocalDate
	
	//Calendar calendar = new GregorianCalendar(2017, 0 , 25);
	
	private Date date;  //dd-mm-yyyy
	
	/* 
	 * ������� 1.
	������� ������ ������ Date, ��������� ��������� ������ ���, �����, ����. 
	
	
	������: ������ ����, ������� �� ������� ���� ������ �� �������� ����. 
	���� ������ ����������� � ���� ������������. 
	
	
	���� �� ������������� - ������ � ������� dd-mm-yyyy, �������� ��������� ��� ���� ������. 
	
	����� ��������� � ������������ ������� ������� ������ Year, Month, Day.
	
	
	 

	if Validate true ->
	Year  parse (4 dig)
	Month  parse (2 big)
	Day   parse (2 dig)     */
	
	
	public Date getDate() {
		return date;
	}

	
	public void setDate1(Date date) {
		this.date = date;
	}
	
	public void printDate(Date date) {
		System.out.println("Day of week=");
		
	}
	
	
	
		//Calendar calendar = new GregorianCalendar(new Date);
		
	

		
	
	
		
	//int getDayOfYear();         ���������� ����� ��� � ������ ����

		
	
	//	calendar.set(Calendar.YEAR, 2017); 			class Year parse date YEAR
	//	calendar.set(Calendar.MONTH, 0);			class Month parse date MONTH
	//	calendar.set(Calendar.DAY_OF_MONTH, 25);	class Day parse date DAY_OF_MONTH
		
		
	
	
	
}
