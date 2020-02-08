package Lesson11.prob5;

import java.util.ArrayList;
import java.util.List;

public class Main {


	public static <T> T secondSmallest(List<T> list) {
		return list.stream().sorted().skip(1).findFirst().get();
	}
	

	public static void main(String[] args) {
		List<Integer> numbers1 = new ArrayList<>(); 
		numbers1.add(6);
		numbers1.add(16);
		numbers1.add(12);
		numbers1.add(88);
		numbers1.add(29);
		numbers1.add(5);

		List<Double> doubleElements = new ArrayList<>();
		doubleElements.add(0.5);
		doubleElements.add(6.84);
		doubleElements.add(1.3);
		doubleElements.add(1.5);
		
		List<String> stringElements = new ArrayList<>();
		stringElements.add("C");
		stringElements.add("O");
		stringElements.add("B");
		stringElements.add("O");
		stringElements.add("A");
		
	
		System.out.println("Integer : " + secondSmallest(numbers1));
		System.out.println("Double : " + secondSmallest(doubleElements));
		System.out.println("Strings : " + secondSmallest(stringElements));

	}

}