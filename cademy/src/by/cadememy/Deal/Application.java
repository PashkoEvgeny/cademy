package by.cadememy.Deal;

public class Application {

	public static void main(String[] args) {

		// Product(String type, Double price, String manufacturer, Integer quantity)

		

		Cheese cheese = new Cheese("Cheese", 25.7, "Itali", 2, 7);
		System.out.println("Type product: " + cheese.type + "   price: " + cheese.price + "   manufacture: "
				+ cheese.manufacturer + "   quantity:" + cheese.quantity + "   age: " + cheese.age);

		Wine wine = new Wine("Wine", 24.5, "Sacebeli", 20, "Georgia");
		System.out.println("Type product: " + wine.type + "   price: " + wine.price + "   manufacture: "
				+ wine.manufacturer + "   quantity:" + wine.quantity + "   country: " + wine.country);
		
		Milk milk = new Milk("Milk", 1.7, "Prostokvashino", 12, 1.5);
		System.out.println("Type product: " + milk.type + "   price: " + milk.price + "   manufacture: "
				+ milk.manufacturer + "   quantity:" + milk.quantity + "   percentFat: " + milk.percentFat);
	}

}
