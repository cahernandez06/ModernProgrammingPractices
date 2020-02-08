package lesson9.labs.prob10;

import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob10c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> myIntStreams = Stream.of(1,2,3,4,5);
		
		IntSummaryStatistics myStats=myIntStreams.collect(Collectors.summarizingInt(n->n));
		int minVal = myStats.getMin();
		int maxVal = myStats.getMax();
		System.out.printf("Min: %d, Max: %d",minVal,maxVal);
	}

}
