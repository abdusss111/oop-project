package users;

import courses.Course;
/**
 * @generated
 */
public class Admin{

    private int id; // Называние поля приведено к стандарту Java (camelCase)
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
    
    public void registerToCourse(Student s, Course c) {
    	c.getStudentsList().add(s);
    }
    public void editStudentDetails(Student student, String newName, int newAge) {
//        student.setName(newName);
//        student.setAge(newAge);
        System.out.println("Student details updated: " + student);
    }

    /**
     * Method to edit discipline details
     */
    public void editDisciplineDetails(Course discipline, String newTitle, int newCredits) {
//        discipline.setTitle(newTitle);
//        discipline.setCredits(newCredits);
        System.out.println("Discipline details updated: " + discipline);
    }

    public String generateAttendanceReport(Student student) {
        return "Attendance Report for " + student.getUsername() + ": " + student.getAttendance() + "%";
    }
}
