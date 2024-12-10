package researches;

import java.util.ArrayList;
import java.util.List;

public class ResearchProject {

    private String projectTitle;
    private String projectDescription;
    private String projectLeader;
    private List<String> teamMembers; // Список участников команды
    private Researcher researcher; // Ведущий исследователь

    // Constructor
    public ResearchProject(String projectTitle, String projectDescription, String projectLeader, Researcher researcher) {
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
        this.projectLeader = projectLeader;
        this.teamMembers = new ArrayList<>();
        this.researcher = researcher;
    }

    // Getters and setters

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public List<String> getTeamMembers() {
        return teamMembers;
    }

    public Researcher getResearcher() {
        return researcher;
    }

    public void setResearcher(Researcher researcher) {
        this.researcher = researcher;
    }

    // Operations

    /**
     * Adds a team member to the project.
     */
    public void addTeamMember(String member) {
        if (!teamMembers.contains(member)) {
            teamMembers.add(member);
            System.out.println("Team member added: " + member);
        } else {
            System.out.println("Team member already exists: " + member);
        }
    }

    /**
     * Removes a team member from the project.
     */
    public void removeTeamMember(String member) {
        if (teamMembers.contains(member)) {
            teamMembers.remove(member);
            System.out.println("Team member removed: " + member);
        } else {
            System.out.println("Team member not found: " + member);
        }
    }

    /**
     * Returns the details of the research project.
     */
    public String getProjectDetails() {
        return "Research Project Details:\n" +
                "Title: " + projectTitle + "\n" +
                "Description: " + projectDescription + "\n" +
                "Leader: " + projectLeader + "\n" +
                "Team Members: " + (teamMembers.isEmpty() ? "None" : String.join(", ", teamMembers));
//                "Researcher: " + (researcher != null ? researcher.getName() : "None");
    }
}
