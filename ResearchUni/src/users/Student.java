package users;

import java.time.Year;
import java.util.*;
import users.Student;
import courses.*;

public class Student extends User {
	private Set<String> clubs;
	private Map<String, Role> clubRoles;
	public Vector<Map<Mark, Course>> marks;
    private String major;
    private Map<String, String> transcript; 
    private Set<String> enrolledCourses;
    private boolean dormLiver;
    private boolean grant;
    private Map<String, Integer> grades; // Курс -> Балл
    private HashMap<Course, Mark> courses;
    public Student(String name, String id) {
        super(name, id);
        this.marks = new Vector<Map<Mark, Course>>();
        this.clubs = new HashSet<>();
        this.clubRoles = new HashMap<>();
        this.enrolledCourses = new HashSet<>();
        this.courses = new HashMap<>();
    }
    
    public Student() {
        super();
    }
    
    public void enrollInCourse(Course course) {
        if (courses.containsKey(course)) {
            System.out.println(this.getName() + " is already enrolled in the course: " + course.getTitle());
            return;
        }

        if (course.getStudentsList().size() >= course.getLimit()) {
            System.out.println("Cannot enroll " + this.getName() + " in the course: " + course.getTitle() + ". The course is full.");
            return;
        }

        // Добавляем студента в список курса
        course.getStudentsList().add(this);

        // Добавляем курс в HashMap студента с начальной оценкой null
        this.courses.put(course, null);
        System.out.println(this.getName() + " successfully enrolled in the course: " + course.getTitle());
    }
    /**
     * Displays all courses with their respective marks.
     */
    public void viewCoursesWithMarks() {
        System.out.println("Courses and Marks for " + this.getName() + ":");
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (Map.Entry<Course, Mark> entry : courses.entrySet()) {
            	String mark = (entry.getValue() == null) ? "Not Graded" : String.valueOf(entry.getValue().getValue());
                System.out.println("- Course: " + entry.getKey().getTitle() + ", Mark: " + mark);
            }
        }
    }

    public HashMap<Course, Mark> getCourses() {
        return courses; // Поле `courses` должно быть объявлено как `HashMap<Course, Mark>`
    }
    
    public int getStudyYear() {
        // Преобразуем id в строку
        String idString = String.valueOf(id);
        if (idString.length() < 2) {
            throw new IllegalArgumentException("Invalid ID format");
        }

        try {
            // Извлекаем первые два символа ID и преобразуем в год поступления
            int admissionYear = Integer.parseInt(idString.substring(0, 2)) + 2000;
            
            // Получаем текущий год
            int currentYear = Year.now().getValue();

            // Вычисляем разницу между текущим годом и годом поступления
            return currentYear - admissionYear + 1;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("ID format must start with two digits representing the admission year");
        }
    }

    public void joinClub(String clubName, Role role, Set<String> availableClubs) {
        if (!availableClubs.contains(clubName)) {
            System.out.println("Club \"" + clubName + "\" does not exist.");
            return;
        }

        if (clubs.contains(clubName)) {
            System.out.println(this.getName() + " is already a member of \"" + clubName + "\".");
        } else {
            clubs.add(clubName);
            clubRoles.put(clubName, role);
            System.out.println(this.getName() + " has successfully joined the club \"" + clubName + "\" as " + role + ".");
        }
    }
    public void viewClubRoles() {
        if (clubRoles.isEmpty()) {
            System.out.println(this.getName() + " has no roles in any clubs.");
        } else {
            System.out.println(this.getName() + " has the following roles in clubs:");
            for (Map.Entry<String, Role> entry : clubRoles.entrySet()) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }
    public void updateRole(String clubName, Role newRole) {
        if (clubRoles.containsKey(clubName)) {
            clubRoles.put(clubName, newRole);
            System.out.println(this.getName() + "'s role in \"" + clubName + "\" has been updated to " + newRole + ".");
        } else {
            System.out.println("Student is not a member of \"" + clubName + "\".");
        }
    }
    
    

 

    public void printEnrolledCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println(this.getName() + " is not enrolled in any courses.");
        } else {
            System.out.println(this.getName() + " is enrolled in the following courses:");
            for (String courseID : enrolledCourses) {
                System.out.println("- " + courseID);
            }
        }
    }



  




    
    
    /**
     * Rates a teacher.
     *
     * @param teacherId The ID of the teacher to rate.
     * @param rating    The rating to give (1–5).
     */
    public void rateTeacher(String teacherId, int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating. Please provide a rating between 1 and 5.");
        } else {
            System.out.println("Teacher with ID " + teacherId + " has been rated " + rating + "/5.");
        }
    }

    /**
     * Views the student's transcript.
     */
    public void viewTranscript() {
        System.out.println("Transcript for " + getUsername() + ":");
        if (transcript.isEmpty()) {
            System.out.println("No grades available.");
        } else {
            transcript.forEach((course, grade) -> System.out.println(course + ": " + grade));
        }
    }

    /**
     * Joins a club.
     *
     * @param clubName The name of the club to join.
     */


    /**
     * Views all courses the student is enrolled in.
     */
    public void viewCourses() {
        System.out.println("Courses enrolled by " + getUsername() + ":");
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            enrolledCourses.forEach(course -> System.out.println("- " + course));
        }
    }

    /**
     * Gets the student's schedule (mock implementation).
     *
     * @return The student's schedule as a string.
     */
    public String getSchedule() {
        return "Schedule: [Monday: Math, Tuesday: Physics, Wednesday: Programming]";
    }

    // Getters and Setters



    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Map<String, String> getTranscript() {
        return transcript;
    }

    public void setTranscript(Map<String, String> transcript) {
        this.transcript = transcript;
    }

    public Set<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(Set<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public boolean isDormLiver() {
        return dormLiver;
    }

    public void setDormLiver(boolean dormLiver) {
        this.dormLiver = dormLiver;
    }

    public boolean isGrant() {
        return grant;
    }

    public void setGrant(boolean grant) {
        this.grant = grant;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
        		"name=" + getName() +
                ", id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", major='" + major + '\'' +
                ", dormLiver=" + dormLiver +
                ", grant=" + grant +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }

	public String getAttendance() {
		return null;
	}

	public String getUsername() {
		return null;
	}

	public Vector<Map<Mark, Course>> getMarks() {
		return marks;
	}

	public void setMarks(Vector<Map<Mark, Course>> marks) {
		this.marks = marks;
	}
	
	public String listOfMarks() {
	    StringBuilder result = new StringBuilder();
	    for (Map<Mark, Course> map : marks) {
	        for (Map.Entry<Mark, Course> entry : map.entrySet()) {
	            result.append(this.getName())
	            	  .append(" have ")
	            	  .append(entry.getKey().getValue()) // Assuming Mark has a `getValue()` method
	                  .append(" in ")
	                  .append(entry.getValue().getTitle()) // Assuming Course has a `getTitle()` method
	                  .append("\n");
	        }
	    }
	    return result.toString();
	}




}
