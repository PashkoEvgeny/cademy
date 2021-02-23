package by.cadememy.Homework4;

public class AppMethod81 {

	public static <T> void main(String[] args) {
		
		Method81<T> box=new Method81<>(3);
		System.out.println(box.toString());
		
		Cat cat=new Cat();
		
		box.addElementToLast(cat);
		System.out.println(box.toString());
		
		box.addElementToFirst('X');
		System.out.println(box.toString());
		
		box.addElementToLast(12345);
		System.out.println(box.toString());
		
		box.addElementByIndex(1, "String");
		System.out.println(box.toString());
		
		System.out.println(box.getElemenByIndex(2));
		
		System.out.println(box.getLastElement());
		
		System.out.println(box.getFirstElement());
		
		System.out.println(box.size());
		
		System.out.println(box.getLastFullIndex());
		
		box.removeElementByIndex(1);
		System.out.println(box.toString());
		
		box.removeElementByValue(cat);
		System.out.println(box.toString());
	}

}
