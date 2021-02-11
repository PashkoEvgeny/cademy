package by.cadememy.Deal;

public class Application {

	public static void main(String[] args) {
		
	//	Product(String type, Double price, String manufacturer, Integer quantity)
		
		Product product=new Product("milk", 1.8, "Savushkin", 15);
		
		System.out.println(product.manufacturer);

	}

}
