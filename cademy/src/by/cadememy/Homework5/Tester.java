package by.cadememy.Homework5;

import java.util.ArrayList;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		System.out.println(list);
		
		TreeSet<Integer> list1=new TreeSet<Integer>(list);
		
		System.out.println(list1);
		
		
		list=new ArrayList<Integer>(list1);
		
		System.out.println(list);
		
		
	}

}
