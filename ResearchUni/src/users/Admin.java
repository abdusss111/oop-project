package users;

/**
 * @generated
 */
public class Admin extends Employee {

    private Integer id; // Называние поля приведено к стандарту Java (camelCase)
    private String username;
    private String password;

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Methods for Admin actions

    /**
     * Method to edit student details
     */
    public void editStudentDetails(Student student, String newName, int newAge) {
        student.setName(newName);
        student.setAge(newAge);
        System.out.println("Student details updated: " + student);
    }

    /**
     * Method to edit discipline details
     */
    public void editDisciplineDetails(Discipline discipline, String newTitle, int newCredits) {
        discipline.setTitle(newTitle);
        discipline.setCredits(newCredits);
        System.out.println("Discipline details updated: " + discipline);
    }

    /**
     * Method to view student attendance
     */
    public void viewStudentAttendance(Student student) {
        System.out.println("Attendance for " + student.getName() + ": " + student.getAttendance());
    }

    /**
     * Method to generate a student report
     */
    public String generateStudentReport(Student student) {
        return "Report for " + student.getName() + ": GPA = " + student.getGpa();
    }

    /**
     * Method to generate a discipline report
     */
    public String generateDisciplineReport(Discipline discipline) {
        return "Discipline: " + discipline.getTitle() + ", Credits: " + discipline.getCredits();
    }

    /**
     * Method to generate attendance report
     */
    public String generateAttendanceReport(Student student) {
        return "Attendance Report for " + student.getName() + ": " + student.getAttendance() + "%";
    }
}