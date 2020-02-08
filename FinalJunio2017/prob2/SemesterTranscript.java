package FinalTest.FinalJunio2017.prob2;

import java.util.ArrayList;
import java.util.List;

public class SemesterTranscript {
	private List<Double> grades;

	public SemesterTranscript() {
		this.grades = new ArrayList<Double>();
	}
	public List<Double> getGrades() {
		return grades;
	}

	public void insertGrade(double grade) {
		this.grades.add(grade);
	}
}
