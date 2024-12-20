package courses;

import java.util.*;
import users.Student;
/**
* @generated
*/
public class Transcript {
    
    /**
    * @generated
    */
    private String studentProgram;
    
    /**
    * @generated
    */
    private int semester;
    
    /**
    * @generated
    */
    private String courseName;
    
    /**
    * @generated
    */
    private String courseCode;
    
    /**
    * @generated
    */
    private Set<Grade> gradeMap;
    
    /**
    * @generated
    */
    private int amountOfAttendance;
    
    /**
    * @generated
    */
    private Student student;
    
    
    /**
    * @generated
    */
    private Student student2;
    
    

    /**
    * @generated
    */
    private String getStudentProgram() {
        return this.studentProgram;
    }
    
    /**
    * @generated
    */
    private void setStudentProgram(String studentProgram) {
        this.studentProgram = studentProgram;
    }
    
    
    /**
    * @generated
    */
    private int getSemester() {
        return this.semester;
    }
    
    /**
    * @generated
    */
    private void setSemester(Integer semester) {
        this.semester = semester;
    }
    
    
    /**
    * @generated
    */
    private String getCourseName() {
        return this.courseName;
    }
    
    /**
    * @generated
    */
    private void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
    /**
    * @generated
    */
    private String getCourseCode() {
        return this.courseCode;
    }
    
    /**
    * @generated
    */
    private void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    
    /**
    * @generated
    */
    private Set<Grade> getGradeMap() {
        if (this.gradeMap == null) {
            this.gradeMap = new HashSet<Grade>();
        }
        return this.gradeMap;
    }
    
    /**
    * @generated
    */
    private void setGradeMap(Set<Grade> gradeMap) {
        this.gradeMap = gradeMap;
    }
    
    
    /**
    * @generated
    */
    private int getAmountOfAttendance() {
        return this.amountOfAttendance;
    }
    
    /**
    * @generated
    */
    private void setAmountOfAttendance(Integer amountOfAttendance) {
        this.amountOfAttendance = amountOfAttendance;
    }
    
    
    /**
    * @generated
    */
    public Student getStudent() {
        return this.student;
    }
    
    /**
    * @generated
    */
    public void setStudent(Student student) {
        this.student = student;
    }
    
    
    
    /**
    * @generated
    */
    public Student getStudent2() {
        return this.student2;
    }
    
    
    
                                    
    
    /**
    * @generated
    */
    public Void calculateGPA() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Void getTranscriptSummary() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Void getFullTranscript() {
        //TODO
        return null;
    }
    
    
}
