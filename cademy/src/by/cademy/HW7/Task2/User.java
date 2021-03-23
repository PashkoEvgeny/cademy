package by.cademy.HW7.Task2;

public class User extends Person{

	private String login;
	private String password;
	private String email;
	
	
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password, String email) {
		super(firstName, lastName, age, dateOfBirth);
		this.login=login;
		this.password=password;
		this.email=email;
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	 public void printUserInfo() {
	        final StringBuilder sb = new StringBuilder("User[");
	        sb.append("firstName=").append(getFirstName());
	        sb.append(", lastName=").append(getLastName());
	        sb.append(", age=").append(getAge());
	        sb.append(", dateOfBirth=").append(getDateOfBirth());
	        sb.append(", login=").append(login);
	        sb.append(", password=").append(password);
	        sb.append(", email=").append(email);
	        sb.append(']');
	       System.out.println(sb.toString());
	    }
}



//b)	Добавить класс User, который наследуется от Person, с полями: login, password, email