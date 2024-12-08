package users;
public class GraduateStudent extends Student {

    /**
     * Research topic of the graduate student.
     */
    private String researchTopic;

    /**
     * Advisor of the graduate student.
     */
    private String advisor;

    /**
     * Indicates if the graduate student is also a teaching assistant.
     */
    private boolean isTeachingAssistant;

    /**
     * Default constructor initializes default values.
     */
    public GraduateStudent() {
        super();
        this.researchTopic = "Not Assigned";
        this.advisor = "Not Assigned";
        this.isTeachingAssistant = false;
    }

    /**
     * Parameterized constructor to initialize a graduate student with specific values.
     *
     * @param username         Username of the student.
     * @param major            Major of the student.
     * @param researchTopic    Research topic of the graduate student.
     * @param advisor          Advisor of the graduate student.
     * @param isTeachingAssistant Whether the student is a teaching assistant.
     */
    public GraduateStudent(String username, String major, String researchTopic, String advisor, boolean isTeachingAssistant) {
        super();
        this.setUsername(username);
        this.setMajor(major);
        this.researchTopic = researchTopic;
        this.advisor = advisor;
        this.isTeachingAssistant = isTeachingAssistant;
    }

    /**
     * Conducts research related to the student's topic.
     */
    public void conductResearch() {
        System.out.println(getUsername() + " is conducting research on: " + researchTopic);
    }

    /**
     * Submits the thesis for approval.
     */
    public void submitThesis() {
        System.out.println(getUsername() + " has submitted the thesis on: " + researchTopic + " under the guidance of " + advisor);
    }

    /**
     * Teaches or assists in teaching if the student is a teaching assistant.
     */
    public void teach() {
        if (isTeachingAssistant) {
            System.out.println(getUsername() + " is assisting in teaching.");
        } else {
            System.out.println(getUsername() + " is not a teaching assistant.");
        }
    }

    // Getters and Setters

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public boolean isTeachingAssistant() {
        return isTeachingAssistant;
    }

    public void setTeachingAssistant(boolean teachingAssistant) {
        isTeachingAssistant = teachingAssistant;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "username='" + getUsername() + '\'' +
                ", major='" + getMajor() + '\'' +
                ", researchTopic='" + researchTopic + '\'' +
                ", advisor='" + advisor + '\'' +
                ", isTeachingAssistant=" + isTeachingAssistant +
                '}';
    }
}
