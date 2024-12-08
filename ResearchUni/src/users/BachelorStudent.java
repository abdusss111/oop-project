package users;

/**
 * Represents a Bachelor Student with attributes related to internships and graduation.
 */
public class BachelorStudent extends Student {

    /**
     * The name or details of the student's current internship.
     */
    private String internship;

    /**
     * The expected year of graduation for the bachelor student.
     */
    private int expectedGraduationYear;

    /**
     * Default constructor initializes default values.
     */
    public BachelorStudent() {
        super();
        this.internship = "Not Assigned";
        this.expectedGraduationYear = 0;
    }

    /**
     * Parameterized constructor to initialize a bachelor student with specific values.
     *
     * @param username              Username of the student.
     * @param major                 Major of the student.
     * @param internship            Internship details.
     * @param expectedGraduationYear Expected graduation year.
     */
    public BachelorStudent(String username, String major, String internship, int expectedGraduationYear) {
        super();
        this.setUsername(username);
        this.setMajor(major);
        this.internship = internship;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    /**
     * Updates the details of the student's internship.
     *
     * @param internship The new internship details.
     */
    public void updateInternship(String internship) {
        this.internship = internship;
        System.out.println(getUsername() + " has updated their internship to: " + internship);
    }

    /**
     * Checks if the student is on track to graduate based on the current year.
     *
     * @param currentYear The current year.
     * @return True if the student is on track to graduate, otherwise false.
     */
    public boolean isOnTrackToGraduate(int currentYear) {
        if (expectedGraduationYear <= currentYear) {
            System.out.println(getUsername() + " is on track to graduate this year or has already graduated.");
            return true;
        } else {
            System.out.println(getUsername() + " is expected to graduate in " + expectedGraduationYear + ".");
            return false;
        }
    }

    /**
     * Displays details about the bachelor student's status.
     */
    public void displayStatus() {
        System.out.println("Bachelor Student Information:");
        System.out.println("Name: " + getUsername());
        System.out.println("Major: " + getMajor());
        System.out.println("Internship: " + internship);
        System.out.println("Expected Graduation Year: " + expectedGraduationYear);
    }

    // Getters and Setters

    public String getInternship() {
        return internship;
    }

    public void setInternship(String internship) {
        this.internship = internship;
    }

    public int getExpectedGraduationYear() {
        return expectedGraduationYear;
    }

    public void setExpectedGraduationYear(int expectedGraduationYear) {
        this.expectedGraduationYear = expectedGraduationYear;
    }

    @Override
    public String toString() {
        return "BachelorStudent{" +
                "username='" + getUsername() + '\'' +
                ", major='" + getMajor() + '\'' +
                ", internship='" + internship + '\'' +
                ", expectedGraduationYear=" + expectedGraduationYear +
                '}';
    }
}
