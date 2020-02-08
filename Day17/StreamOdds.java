package Day17;

import java.util.stream.Stream;

public class StreamOdds {
	public static void main(String[] args) {
		//Stream<Integer> odds = Stream.iterate(1,n -> n+2).limit(100);
		Stream<Integer> odds = Stream.iterate(1,n -> n+2).skip(4).limit(4);
		odds.forEach(System.out::println);
	}
}