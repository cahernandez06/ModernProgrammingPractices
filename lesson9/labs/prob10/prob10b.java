package lesson9.labs.prob10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>() {
			{
			add("Bill");
			add("Thomas");
			add("Mary");
			}};
		//String streamNames = 
		System.out.println(names.stream().map(Object::toString).collect(Collectors.joining(", ")));
		//System.out.println(streamNames);
	}

}
