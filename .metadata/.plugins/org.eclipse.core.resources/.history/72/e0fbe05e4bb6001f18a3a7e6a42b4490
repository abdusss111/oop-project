package users;

import java.util.*;

/**
 * Represents a Student with specific attributes and behaviors.
 */
public class Student extends User {

    /**
     * Set of clubs the student is a member of.
     */
    private Set<String> clubs;

    /**
     * Student's major (field of study).
     */
    private String major;

    /**
     * Student's transcript (list of grades for courses).
     */
    private Map<String, String> transcript; // Курс -> Оценка

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
    public Student() {
        super();
        this.clubs = new HashSet<>();
        this.transcript = new HashMap<>();
        this.enrolledCourses = new HashSet<>();
        this.grades = new HashMap<>();
        this.major = "Undeclared";
        this.dormLiver = false;
        this.grant = false;
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
    public void participateInClub(String clubName) {
        if (clubs.contains(clubName)) {
            System.out.println("You are already a member of the club: " + clubName);
        } else {
            clubs.add(clubName);
            System.out.println("Successfully joined the club: " + clubName);
        }
    }

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

    public Set<String> getClubs() {
        return clubs;
    }

    public void setClubs(Set<String> clubs) {
        this.clubs = clubs;
    }

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
                "id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", major='" + major + '\'' +
                ", dormLiver=" + dormLiver +
                ", grant=" + grant +
                ", enrolledCourses=" + enrolledCourses +
                ", clubs=" + clubs +
                '}';
    }
}
