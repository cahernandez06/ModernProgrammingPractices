package lesson9.prob9;

import java.util.stream.Stream;

public class listSquares {
	
	public static void main(String[] args) {
		printSquares(4);
	}
	public static void printSquares(int num) {
		Stream.iterate(1.0, n -> n+1).limit(num).forEach(n -> System.out.println(n*n));
		//squares.forEach(System.out::println);
	}
}
