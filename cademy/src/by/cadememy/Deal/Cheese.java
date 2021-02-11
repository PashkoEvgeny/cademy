package by.cadememy.Deal;

public class Cheese extends Product {

	int age;
	String smell;

	public Cheese(String type, double price, String manufacturer, int quantity, int age) {
		super(type, price, manufacturer, quantity);
		this.age = age;
	}

	Cheese() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSmell() {
		return smell;
	}

	public void setSmell(String smell) {
		this.smell = smell;
	}

}
