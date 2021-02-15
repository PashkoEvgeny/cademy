package by.cadememy.Deal;

import java.util.Scanner;

public class Person {
	String name;
	String phone;
	String email;
	Double money;
	public final static Scanner sc = new Scanner(System.in);
	
	Person(String name, Double money, String phone, String email) {
		
		this.name = name;
		this.money = money;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	
	
	public void addPerson() {
	
		
		System.out.println("¬ведите данные Name:");
		name=sc.nextLine();
		System.out.println("phone:");
		phone = sc.nextLine();
		System.out.println("email:");
		email =sc.nextLine();
		System.out.println("money (type double):");
		money = sc.nextDouble();
		
		System.out.println(" Name: "+name+"   money: "+money+"   phone: "+phone+"   email: "+email);
		
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	Person() {
		super();
		
	}

}