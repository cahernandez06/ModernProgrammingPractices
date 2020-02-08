package FinalTest.FinalMarzo2017.prob2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transcript {
	private List<TranscriptEntry> transcriptentry;
	
	Transcript(){  //package level
		this.transcriptentry=new ArrayList<TranscriptEntry>();
	}
	public List<TranscriptEntry> getTranscriptEntries() {
		return transcriptentry;
	}
	public void addTranscriptEntry(LocalDate courseDate, String grade, Course course){
		TranscriptEntry te = new TranscriptEntry(courseDate, grade, course);
		transcriptentry.add(te);	
	}

}
