package FinalTest.FinalJunio2017.prob2;

import java.util.List;

public class FulltimeStudent extends Student {
	private FulltimeTranscriptRecord record;

	public FulltimeStudent(String name,	FulltimeTranscriptRecord fulltimeTranscriptRecord) {
		super(name);
		this.record = fulltimeTranscriptRecord;
	}

	@Override
	double computeGpa() {
		double sum=0;
		double count=0;
		for (double g:record.getFallTranscript().getGrades()) {
			sum += g;
			count++;
		}
		for (double g:record.getSpringTranscript().getGrades()) {
			sum += g;
			count++;
		}		
		return sum/count;
	}
	
}
