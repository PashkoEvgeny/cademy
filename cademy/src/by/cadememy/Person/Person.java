package by.cadememy.Person;

public class Person {

	String fullName;
	int age;

	public void talk(String q) {
		System.out.println("Say "+q+": Hello!!!");
	}
	
		Person(String fullName, int age) {
			this.age=age;
			this.fullName=fullName;
		}
		
		Person(){	
			super();
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	
		
	}

