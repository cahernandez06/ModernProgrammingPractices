package FinalTest.FinalJunio2017.prob2;

import java.util.*;

public class Admin {
	/**
	 * Returns the average gpa for all students in the studentList
     */
	public static double computeAverageGpa(List<Student> studentList) {
		//implement
		double avg=0;
		double count=0;
		for (Student s:studentList) {
			avg += s.computeGpa();
			count++;
		}
		return avg/count;
	}
}
