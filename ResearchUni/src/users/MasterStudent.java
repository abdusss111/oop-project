// Class: MasterStudent
package users;

import java.util.List;
import researches.Researcher;

public class MasterStudent {
    private String researchTopic;
    private Researcher advisor;
    private boolean isResearcher;

    public MasterStudent(String researchTopic, Researcher advisor, boolean isResearcher) {
        this.researchTopic = researchTopic;
        this.advisor = advisor;
        this.isResearcher = isResearcher;
    }

    public void conductResearch() {
        System.out.println("Conducting research on: " + researchTopic);
    }

    public void submitThesis() {
        System.out.println("Thesis submitted on: " + researchTopic);
    }

    public void publishPaper() {
        System.out.println("Publishing research paper.");
    }
}
