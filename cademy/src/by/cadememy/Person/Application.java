package by.cadememy.Person;

public class Application {

	public static void main(String[] args) {

Person person1=new Person("andrey", 34);

person1.talk("Petya");
System.out.println(person1.fullName);
System.out.println(person1.getFullName());

Person person2=new Person();
System.out.println(person2.fullName+"  "+person2.age);
	}

}
