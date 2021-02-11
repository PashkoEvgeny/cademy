package by.cadememy.Deal;

public class Product {

	String type;
	double price;
	String manufacturer;
	int quantity;

	Product(String type, double price, String manufacturer, int quantity) {
		this.type = type;
		this.price = price;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	Product() {
		super();
	}

}
