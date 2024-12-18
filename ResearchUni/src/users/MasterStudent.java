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

    // New Methods

    /**
     * Returns the research topic of the MasterStudent.
     *
     * @return the research topic.
     */
    public String getResearchTopic() {
        return researchTopic;
    }

    /**
     * Updates the research topic of the MasterStudent.
     *
     * @param newTopic the new research topic.
     */
    public void setResearchTopic(String newTopic) {
        this.researchTopic = newTopic;
    }

    /**
     * Provides a description of the MasterStudent.
     *
     * @return a string describing the student's research and advisor.
     */
    public String describe() {
        return "MasterStudent researching: " + researchTopic + 
               ", supervised by: " + (advisor != null ? advisor.toString() : "None");
    }

    /**
     * Checks if the MasterStudent has an assigned advisor.
     *
     * @return true if the advisor is not null, false otherwise.
     */
    public boolean hasAdvisor() {
        return advisor != null;
    }

    /**
     * Simulates the MasterStudent joining a research project.
     *
     * @param projectName the name of the research project.
     */
    public void joinResearchProject(String projectName) {
        System.out.println("MasterStudent has joined the research project: " + projectName);
    }

    /**
     * Checks if the MasterStudent is actively involved in research.
     *
     * @return true if the student is a researcher, false otherwise.
     */
    public boolean isResearchActive() {
        return isResearcher;
    }
}
