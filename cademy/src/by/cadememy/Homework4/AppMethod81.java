package by.cadememy.Homework4;

public class AppMethod81 {

	public static <T> void main(String[] args) {
		
		Method81<T> box=new Method81<>(3);
		System.out.println(box.toString());
		
		Cat cat=new Cat();
		
		box.addElementToFirst('X');
		System.out.println(box.toString());
		
		box.addElementToLast(cat);
		System.out.println(box.toString());
		
		box.addElementByIndex(2, "String1");
		System.out.println(box.toString());
		
		box.addElementByIndex(7, "String2");
		System.out.println(box.toString());
		
		System.out.println(box.getElemenByIndex(10));
	}

}
