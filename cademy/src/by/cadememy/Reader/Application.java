package by.cadememy.Reader;



public class Application {

	public static void main(String[] args) {
		
		
		/*String name;
	Integer numberReadCard;
	String faculty;
	String dateBirthday;
	String numberPhone;*/
		
		Reader petrov=new Reader();
		petrov.takeBook(5);
		
		Reader[] reader=new Reader[3];
		
		reader[0]=new Reader("petja", 4567, "mashfuk", "11 march 1889", "+375294563108");

		
		reader[0].setDateBirthday("11 july 1989");
		System.out.println(reader[0].getDateBirthday());
	}

}
