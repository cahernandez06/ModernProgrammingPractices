package problem3;

import java.util.List;

//DO NOT MODIFY METHOD SIGNATURE OR STATIC QUALIFIER
public class FindOldestPerson {
	public static Person findOldestPerson(List<Person> persons) {
		Person	p = persons.stream()
			  .reduce((a, b) -> {
				   if (a.getAge() > b.getAge())
						return a;
				   else
						return b;
				})
				.get();
		return p;                       
	}
	
	
}
