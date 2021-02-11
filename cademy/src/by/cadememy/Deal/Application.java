package by.cadememy.Deal;

public class Application {

	public static void main(String[] args) {

		// Product(String type, Double price, String manufacturer, Integer quantity)

		Product product1 = new Product("milk", 1.8, "Savushkin", 15);
		System.out.println("Type product: " + product1.type + "   price: " + product1.price + "   manufacture: "
				+ product1.manufacturer + "   quantity:" + product1.quantity);

		Cheese product2 = new Cheese("Cheese", 25.7, "Itali", 2, 7);
		System.out.println("Type product: " + product2.type + "   price: " + product2.price + "   manufacture: "
				+ product2.manufacturer + "   quantity:" + product2.quantity + "   age: " + product2.age);

		Wine product3 = new Wine("Wine", 24.5, "Sacebeli", 20, "Georgia");
		System.out.println("Type product: " + product3.type + "   price: " + product3.price + "   manufacture: "
				+ product3.manufacturer + "   quantity:" + product3.quantity + "   country: " + product3.country);
	}

}
