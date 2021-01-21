package by.cadememy.Homework1;

public class DegreeOfNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		while (Math.pow(2,i)<=1_000_000) {
			System.out.println("2 v stepeni "+i+" = "+Math.pow(2,i));
			i=i+1;
		}	
}
	}

