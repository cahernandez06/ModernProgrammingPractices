package FinalTest.FinalMarzo2017.prob2;

import java.util.ArrayList;
import java.util.List;

public class PlanOfStudy {
	private List<Course> courses;
	PlanOfStudy(){ //Package level
		courses = new ArrayList<Course>();
	}
	public void addCourse(Course course) {
		courses.add(course);
	}
	public List<Course> getCourses() {
		return courses;
	}
	

}
