package FinalTest.FinalJunio2017.prob2;
import java.util.*;
public class ParttimeStudent extends Student {
	private Student student;
	private ParttimeTranscriptRecord record;
	
	ParttimeStudent(String name, ParttimeTranscriptRecord record){
		super(name);
		this.record=record;
	}
	@Override
	double computeGpa() {
		double sum=0;
		double count=0;
		for (double g:record.getGrades()) {
			sum += g;
			count++;
		}
		return sum/count;
	}
	
}
