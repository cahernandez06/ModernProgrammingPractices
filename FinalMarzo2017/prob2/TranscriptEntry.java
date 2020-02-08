package FinalTest.FinalMarzo2017.prob2;

import java.time.LocalDate;

public class TranscriptEntry {
	private LocalDate dateTaken;
	private String grade;
	private Course course;
	
	public TranscriptEntry(LocalDate dateTaken, String grade, Course course){
		this.dateTaken=dateTaken;
		this.grade=grade;
		this.course=course;
	}
	public LocalDate getDateTaken() {
		return dateTaken;
	}
	public String getGrade() {
		return grade;
	}
	public Course getCourse() {
		return course;
	}
	
	

}
