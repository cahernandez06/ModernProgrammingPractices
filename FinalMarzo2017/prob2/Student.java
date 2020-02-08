package FinalTest.FinalMarzo2017.prob2;

public class Student {
	private String FirstName;
	private String LastName;
	private Transcript transcript;
	private PlanOfStudy planofstudy;
	
	public Student(String firstName, String lastName) {
		this.FirstName=firstName;
		this.LastName=lastName;
		planofstudy = new PlanOfStudy();
		transcript = new Transcript();
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public Transcript getTranscript() {
		return transcript;
	}
	public PlanOfStudy getPlanOfStudy() {
		return planofstudy;
	}
}
