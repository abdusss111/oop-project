package courses;

import java.util.Map;
import java.util.HashMap;

public class Transcript {

    private String studentProgram;
    private Integer semester;
    private String courseName;
    private String courseCode;
    private Map<String, Grade> gradeMap; // Карта соответствия: код курса -> оценка
    private Integer amountOfAttendance;
    private Student student; // Ассоциация со студентом

    // Конструктор
    public Transcript(String studentProgram, Integer semester, Student student) {
        this.studentProgram = studentProgram;
        this.semester = semester;
        this.student = student;
        this.gradeMap = new HashMap<>();
        this.amountOfAttendance = 0;
    }

    // Getters и Setters
    public String getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(String studentProgram) {
        this.studentProgram = studentProgram;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Map<String, Grade> getGradeMap() {
        return gradeMap;
    }

    public void setGradeMap(Map<String, Grade> gradeMap) {
        this.gradeMap = gradeMap;
    }

    public Integer getAmountOfAttendance() {
        return amountOfAttendance;
    }

    public void setAmountOfAttendance(Integer amountOfAttendance) {
        this.amountOfAttendance = amountOfAttendance;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    // Операции

    /**
     * Добавить оценку по курсу.
     */
    public void addGrade(String courseCode, Grade grade) {
        gradeMap.put(courseCode, grade);
        System.out.println("Grade added for course: " + courseCode);
    }

    /**
     * Вычислить средний GPA.
     */
    public double calculateGPA() {
        if (gradeMap.isEmpty()) {
            System.out.println("No grades available to calculate GPA.");
            return 0.0;
        }

        double totalPoints = 0.0;
        int totalCourses = gradeMap.size();

        for (Grade grade : gradeMap.values()) {
            totalPoints += grade.getGradePoints(); // Предполагаем наличие метода getGradePoints()
        }

        return totalPoints / totalCourses;
    }

    /**
     * Получить сводную информацию о транскрипте.
     */
    public String getTranscriptSummary() {
        return "Transcript Summary:\n" +
                "Program: " + studentProgram + "\n" +
                "Semester: " + semester + "\n" +
                "Student: " + (student != null ? student.getName() : "N/A") + "\n" +
                "GPA: " + calculateGPA() + "\n" +
                "Attendance: " + amountOfAttendance + " days";
    }

    /**
     * Получить полный транскрипт.
     */
    public String getFullTranscript() {
        StringBuilder transcript = new StringBuilder();
        transcript.append("Full Transcript:\n");
        transcript.append("Student: ").append(student != null ? student.getName() : "N/A").append("\n");
        transcript.append("Program: ").append(studentProgram).append("\n");
        transcript.append("Semester: ").append(semester).append("\n");
        transcript.append("Courses and Grades:\n");

        for (Map.Entry<String, Grade> entry : gradeMap.entrySet()) {
            transcript.append("Course: ").append(entry.getKey())
                      .append(" - Grade: ").append(entry.getValue().getLetterGrade()).append("\n");
        }

        transcript.append("Attendance: ").append(amountOfAttendance).append(" days\n");
        transcript.append("GPA: ").append(calculateGPA()).append("\n");

        return transcript.toString();
    }
}

