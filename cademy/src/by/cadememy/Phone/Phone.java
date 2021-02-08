package by.cadememy.Phone;

public class Phone {
	String number;
	String model;
	int weight;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void receiveCall(String name) {
		System.out.println("call "+name);
	}
	
	Phone(String number, String model, int weight){
		this.number=number;
		this.model=model;
		this.weight=weight;
		
	}
	
	Phone(String number, String model){
		
	}
	
	Phone(){
		
	}
	
	

}
