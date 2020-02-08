package FinalTest.FinalJunio2017.prob2;
import java.util.*;
public class ParttimeTranscriptRecord {
	
	private List<Double> grades;

	public ParttimeTranscriptRecord() {
		this.grades = new ArrayList<Double>();
	}

	public List<Double> getGrades() {
		return grades;
	}

	public void insertGrade(double grade) {
		this.grades.add(grade);
	}
	
	
}
