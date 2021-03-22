package by.cademy.classwork.regi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(-8);
		list.add(0);
		list.add(5);
		list.add(4);
		list.add(-1);
		list.add(7);

		System.out.println(list);

		Stream<Integer> strem = list.stream();
		strem.sorted().filter(x -> x > 0).map(x -> x + 10).limit(2).forEach(System.out::println);
		
		System.out.println("hi");

	}
}