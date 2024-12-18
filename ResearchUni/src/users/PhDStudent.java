package users;

import java.util.List;
import researches.ResearchPaper;

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

    /**
     * Lists all published papers of the PhD student.
     */
    public void listPublishedPapers() {
        if (publishedPapers.isEmpty()) {
            System.out.println("No published papers.");
        } else {
            System.out.println("Published papers:");
            for (ResearchPaper paper : publishedPapers) {
                System.out.println("- " + paper.getTitle());
            }
        }
    }

    /**
     * Checks if the PhD student is eligible for defending their thesis.
     * A student is eligible if they have at least 3 published papers and an H-index of 5 or more.
     *
     * @return true if eligible, false otherwise.
     */
    public boolean isEligibleForDefense() {
        return publishedPapers.size() >= 3 && hIndex >= 5;
    }

    /**
     * Calculates the research impact of the PhD student.
     * The impact is defined as the product of H-index and the number of published papers.
     *
     * @return research impact value.
     */
    public double calculateResearchImpact() {
        return hIndex * publishedPapers.size();
    }
}
