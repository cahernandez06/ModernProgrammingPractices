package FinalTest.FinalMarzo2017.prob2;

public class Course {
	private String courseTitle;
	private String primaryProfessor;
	
	public Course(String title, String professor){
		this.courseTitle=title;
		this.primaryProfessor=professor;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public String getPrimaryProfessor() {
		return primaryProfessor;
	}
	@Override
	public String toString() {
		 return courseTitle + ": " + primaryProfessor;
	}
}
