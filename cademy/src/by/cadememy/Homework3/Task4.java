package by.cadememy.Homework3;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		        
		        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd MM yyyy");
		        
		        //� ������ simpleFormat2 ���������� ������� �� ������� ������
		        
		        SimpleDateFormat simpleFormat2 = new SimpleDateFormat("dd/MM/yyyy");
		        
		        //� ������ data ���������� ����������� ������
		        
		        Date date = new Date();
				try {
					date = simpleFormat2.parse(tempDate);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        //����������� ������ ���, ��� ����� �� �������
		        
		        System.out.println(simpleFormat.format(date).toUpperCase());
		        sc.close();        
		        
		        
		        //�������� ��� ��� ���
		    }
		}

