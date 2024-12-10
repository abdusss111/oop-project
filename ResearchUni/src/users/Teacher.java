package users;

import courses.*;
import java.util.*;
public class Teacher extends Employee {

    private List<String> courses;
    private String degree;
    private int officeHours;

 
    private String faculty;
    public Teacher() {
        super();
        this.courses = new ArrayList<>();
        this.degree = "None";
        this.officeHours = 0;
        this.faculty = "Unknown";
    }

    public Teacher(int id, String username, String password, String role, String department, String degree, int officeHours, String faculty) {
        super(id, username, password, role, department);
        this.courses = new ArrayList<>();
        this.degree = degree;
        this.officeHours = officeHours;
        this.faculty = faculty;
    }


    public void addCourse(Course course) {
//        if (!courses.contains(course)) {
//            courses.add(course);
//            System.out.println("Course \"" + course + "\" has been added to " + getUsername() + "'s list.");
//        } else {
//            System.out.println("Course \"" + course + "\" is already in the list.");
//        }
    }

    
    public void manageCourses() {
        System.out.println("Courses managed by " + getUsername() + ":");
        if (courses.isEmpty()) {
            System.out.println("No courses assigned yet.");
        } else {
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i));
            }
        }
    }

    /**
     * Assigns a mark to a student for a specific course with validation.
     *
     * @param studentName The name of the student.
     * @param courseName  The course for which the mark is assigned.
     * @param mark        The mark to assign (must be between 0 and 100).
     */
    public void putMark(Student student, Course course, Mark mark) {
        Map<Mark, Course> newEntry = new HashMap<>();
        newEntry.put(mark, course); // Create a new map entry for the course and mark
        student.marks.add(newEntry); // Add this map to the vector
    }


    /**
     * Views marks for students in a specific course with mock data.
     *
     * @param courseName The course name.
     */
    public void viewMarks(String courseName) {
    	
    }

    /**
     * Checks the attendance for a course and prints a mock report.
     *
     * @param courseName The course name.
     */
    public void checkAttendance(String courseName) {
        System.out.println("Attendance report for course \"" + courseName + "\":");
        System.out.println("John Doe: Present");
        System.out.println("Jane Smith: Absent");
        System.out.println("Alex Brown: Present");
    }

    /**
     * Sends a detailed complaint to the administration with context.
     *
     * @param complaintTitle The title of the complaint.
     * @param complaintBody  The body of the complaint.
     */
    public void sendComplaint(Student s, Manager m, Urgency urg, String title) {
    	m.employeeRequests.add(new Complaint(title, urg));    
    }

    // Getters and Setters

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
  

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", degree='" + degree + '\'' +
                ", officeHours=" + officeHours +
                ", faculty='" + faculty + '\'' +
                ", courses=" + courses +
                '}';
    }
}
