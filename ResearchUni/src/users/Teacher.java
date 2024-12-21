package users;

import courses.*;
import java.util.*;
public class Teacher extends Employee {

    private List<String> courses;
    private String degree;
    private int officeHours;
    private Map<Course, Mark> courseMarks = new HashMap<>();
    
    private String faculty;
    public Teacher() {
        super();
        this.courses = new ArrayList<>();
        this.degree = "None";
        this.officeHours = 0;
        this.faculty = "Unknown";
    }

    public Teacher(String id, String username, String password, String role, String department, String degree, int officeHours, String faculty) {
        super(id, username, password, role, department);
        this.courses = new ArrayList<>();
        this.degree = degree;
        this.officeHours = officeHours;
        this.faculty = faculty;
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

    public boolean putMark(Student student, Course course, Mark mark) {
        // Проверка: студент должен быть зарегистрирован на курс
        if (!student.getCourses().containsKey(course)) {
            System.out.println("Student " + student.getName() + " is not enrolled in the course: " + course.getTitle());
            return false;
        }

        // Привязка преподавателя к курсу, если он его ещё не ведёт
        courseMarks.putIfAbsent(course, null);

        // Обновление оценки в `HashMap` студента
        student.getCourses().put(course, mark);

        // Сохранение оценки в `courseMarks` преподавателя
        courseMarks.put(course, mark);

        System.out.println("Mark " + mark.getValue() + " for " + student.getName() + " in course " + course.getTitle() + " successfully assigned.");
        return true;
    }
    

    /**
     * Views marks for students in a specific course with mock data.
     *
     * @param courseName The course name.
     */


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
