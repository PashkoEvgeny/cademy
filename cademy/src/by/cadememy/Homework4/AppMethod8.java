package by.cadememy.Homework4;

public class AppMethod8 {

	public static void main(String[] args) {
		
		Method8 ar=new Method8();
		
		System.out.println(ar.toString());
		
		ar.addElementToLast(1);
		ar.addElementToLast(2);
		ar.addElementToLast(3);
		System.out.println(ar.toString());
	
		ar.addElementToLast(4);
		System.out.println(ar.toString());

		ar.addElementToFirst(5);
		
		System.out.println(ar.toString());
		
		ar.addElementByIndex(2,6);
		System.out.println(ar.toString());
		
		System.out.println(ar.getElemenByIndex(6));
		
		System.out.println(ar.getLastElement());
		
		System.out.println(ar.getFirstElement());
		
		System.out.println(ar.size());
		
		System.out.println(ar.getLastFullIndex());
		
		ar.removeElementByIndex(2);
		System.out.println(ar.toString());
		
		ar.removeElementByValue(3);
		System.out.println(ar.toString());
		
		
	}

}
