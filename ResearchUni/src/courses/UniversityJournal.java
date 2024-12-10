package courses;

import java.util.*;
import users.Student;

public class UniversityJournal {
    private String disciplineList;

    private boolean isDataSaved;
    
   
    private String disciplineProfessors;
    
   
    private Set<Student> studentList;

    private Student student;
    
    

   
    public String getDisciplineList() {
        return this.disciplineList;
    }
    
   
    public void setDisciplineList(String disciplineList) {
        this.disciplineList = disciplineList;
    }
    
    
   
    public boolean getIsDataSaved() {
        return this.isDataSaved;
    }
    
   
    public void setIsDataSaved(Boolean isDataSaved) {
        this.isDataSaved = isDataSaved;
    }
    
    
   
    public String getDisciplineProfessors() {
        return this.disciplineProfessors;
    }
    
   
    public void setDisciplineProfessors(String disciplineProfessors) {
        this.disciplineProfessors = disciplineProfessors;
    }
    
    
   
    public Set<Student> getStudentList() {
        if (this.studentList == null) {
            this.studentList = new HashSet<Student>();
        }
        return this.studentList;
    }
    
   
    public void setStudentList(Set<Student> studentList) {
        this.studentList = studentList;
    }
    

    public Student getStudent() {
        return this.student;
    }
    
   
    public void setStudent(Student student) {
        this.student = student;
    }
    

    public boolean markAttendance() {
        //TODO
        return false;
    }
    
   
    public Void addDiscipline() {
        //TODO
        return null;
    }
    
   
    public Void addStudent() {
        //TODO
        return null;
    }
    
   
    public Void removeDiscipline() {
        //TODO
        return null;
    }
    
   
    public Void removeStudent() {
        //TODO
        return null;
    }
    
    
}
