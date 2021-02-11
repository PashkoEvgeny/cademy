package by.cadememy.Deal;

public class Product {

	String type;
	Double price;
	String manufacturer;
	Integer quantity;

	Product(String type, Double price, String manufacturer, Integer quantity) {
		this.type = type;
		this.price = price;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}

	Product() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

}
