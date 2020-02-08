package lesson9.labs.prob10;

import java.util.stream.IntStream;

public class prob10a {
	public static void main(String[] args) {
		IntStream ones = IntStream.generate(() -> 1).limit(100).distinct();
		ones.forEach(System.out::println);
	}
}
