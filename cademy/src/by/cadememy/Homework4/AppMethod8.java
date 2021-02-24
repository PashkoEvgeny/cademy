package by.cadememy.Homework4;

public class AppMethod8 {

	public static void main(String[] args) {

		Method8 ar = new Method8();

		System.out.println(ar.toString());

		ar.addElementToLast(1);
		ar.addElementToLast(2);
		ar.addElementToLast(5);
		ar.addElementToLast(null);
		ar.addElementToLast(3);
		ar.addElementToLast(3);
		ar.addElementToLast(null);
		ar.addElementToLast(5);
		ar.addElementByIndex(3, null);
		ar.addElementToLast(5);
		System.out.println(ar.toString());
		
	
		ar.removeElementByIndex(1);
		System.out.println(ar.toString());
		ar.removeElementByIndex(1);
		
		System.out.println(ar.toString());
		
		ar.addElementByIndex(11, 7);
		
		System.out.println(ar.toString());
		
		System.out.println(ar.getElemenByIndex(11));
		
		System.out.println(ar.getLastElement());
		System.out.println(ar.getFirstElement());

		System.out.println(ar.size());
		
		System.out.println(ar.getLastFullIndex());
		
		
		ar.removeElementByIndex(17);
		System.out.println(ar.toString());
	
		ar.addElementToFirst(1);
		ar.addElementToFirst(1);
		ar.addElementToFirst(1);
		ar.addElementToFirst(1);
		ar.addElementToFirst(1);
		ar.addElementToFirst(2);
		ar.addElementToFirst(3);
		
		System.out.println(ar.toString());
		
		System.out.println(ar.getElemenByIndex(100));
		

	}

}
