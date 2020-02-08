package Lesson11.prob1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<Number> nums = ints;
		nums.add(3.14);*/
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		nums.add(3.14);
	}

}
