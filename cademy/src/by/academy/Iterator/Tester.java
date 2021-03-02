package by.academy.Iterator;


public class Tester {

	public static void main(String[] args) {
		Integer[][][] array2={{{1,2},{3,4}},{{5,6},{7,9}}};


		

		
		
	IteratorArray<Integer> iterator= new IteratorArray<>(array2);
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");	}
		
		
		
	}

	

}

