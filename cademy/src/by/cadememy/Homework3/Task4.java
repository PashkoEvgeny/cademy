package by.cadememy.Homework3;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		/* ��������� ���
		������ � ���������� ���� � ������� �08/18/2013�
		������� �� ����� ��� ���� � ���� �AUG 18, 2013�.
		��������������� �������� Date � SimpleDateFormat.
		*/
		
		        
		        System.out.print("Enter the date: ");
				Scanner sc = new Scanner(System.in);
				String tempDate = sc.nextLine();

		        //� ������ simpleFormat ���������� ��� ������, ������� �����
		        
		        SimpleDateFormat simpleFormat = new SimpleDateFormat("MM dd, yyyy");
		        
		        //� ������ simpleFormat2 ���������� ������� �� ������� ������
		        
		        SimpleDateFormat simpleFormat2 = new SimpleDateFormat("MM/dd/yyyy");
		        
		        //� ������ data ���������� ����������� ������
		        
		        Date date = simpleFormat2.parse(tempDate);
		        
		        //����������� ������ ���, ��� ����� �� �������
		        
		        System.out.println(simpleFormat.format(date).toUpperCase());

		        //�������� ��� ��� ���
		    }
		}

