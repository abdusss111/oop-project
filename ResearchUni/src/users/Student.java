package users;

import java.util.*;
import users.Student;
import courses.*;

/**
 * Represents a Student with specific attributes and behaviors.
 */
public class Student extends User {

    /**
     * Set of clubs the student is a member of.
     */

    /**
     * Student's major (field of study).
     */
	public Vector<Map<Mark, Course>> marks;
	
    private String major;

    /**
     * Student's transcript (list of grades for courses).
     */
    private Map<String, String> transcript; // 

    /**
     * Set of courses the student is enrolled in.
     */
    private Set<String> enrolledCourses;

    /**
     * Indicates if the student lives in a dormitory.
     */
    private boolean dormLiver;

    /**
     * Indicates if the student has a grant (scholarship).
     */
    private boolean grant;

    /**
     * Set of grades for specific courses.
     */
    private Map<String, Integer> grades; // Курс -> Балл

    /**
     * Default constructor initializes default values.
     */
    public Student(String name, int id) {
        super(name, id);
        this.marks = new Vector<Map<Mark, Course>>();
       
    }
    
    public Student() {
        super();
    }
    
    

    /**
     * Registers the student for a course.
     *
     * @param courseName The name of the course to register for.
     */
    public void registerForCourse(String courseName) {
        if (enrolledCourses.contains(courseName)) {
            System.out.println("You are already registered for the course: " + courseName);
        } else {
            enrolledCourses.add(courseName);
            System.out.println("Successfully registered for the course: " + courseName);
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
