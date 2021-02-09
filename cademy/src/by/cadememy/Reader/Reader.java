package by.cadememy.Reader;

public class Reader {
	
	//	+++ ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
	
	//++++ takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
	
	// - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
	
	
	
	String name;
	Integer numberReadCard;
	String faculty;
	String dateBirthday;
	String numberPhone;
	
	Reader(String name, Integer numberReadCard, String faculty, String dateBirthday, String numberPhone) {
		this.name=name;
		this.numberReadCard=numberReadCard;
		this.faculty=faculty;
		this.dateBirthday=dateBirthday;
		this.numberPhone=numberPhone;
	}
	
	Reader(){
		super();
	}
	
	public void takeBook(int n) {
		System.out.println("petrov v.v. vzjal "+n+" book");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberReadCard() {
		return numberReadCard;
	}

	public void setNumberReadCard(Integer numberReadCard) {
		this.numberReadCard = numberReadCard;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDateBirthday() {
		return dateBirthday;
	}

	public void setDateBirthday(String dateBirthday) {
		this.dateBirthday = dateBirthday;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public void returnBook() {
		
	}
	
	

}
