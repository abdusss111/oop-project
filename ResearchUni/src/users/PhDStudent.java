// Class: PhDStudent
package users;

import java.util.List;
import researches.*;
public class PhDStudent {
    private String phdThesisTopic;
    private Researcher supervisor;
    private List<ResearchPaper> publishedPapers;
    private int hIndex;

    public PhDStudent(String phdThesisTopic, Researcher supervisor, List<ResearchPaper> publishedPapers, int hIndex) {
        this.phdThesisTopic = phdThesisTopic;
        this.supervisor = supervisor;
        this.publishedPapers = publishedPapers;
        this.hIndex = hIndex;
    }

    public void conductResearch() {
        System.out.println("Conducting PhD research on: " + phdThesisTopic);
    }

    public void publishPaper() {
        System.out.println("Publishing PhD research paper.");
    }

    public int calculateHIndex() {
        return hIndex;
    }
}
 // New Methods
    public void addPublishedPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }

    public String getSupervisorName() {
        return supervisor != null ? supervisor.toString() : "No supervisor";
    }

    public void incrementHIndex() {
        hIndex++;
    }
}
