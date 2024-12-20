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
    private Set<String> disciplineList;
    private boolean isDataSaved;
    private Set<String> disciplineProfessors; 
    private Set<Student> studentList;

    
    public UniversityJournal() {
        this.disciplineList = new HashSet<>();
        this.disciplineProfessors = new HashSet<>();
        this.studentList = new HashSet<>();
        this.isDataSaved = false;
    }

    
    public Set<String> getDisciplineList() {
        return disciplineList;
    }

    public void setDisciplineList(Set<String> disciplineList) {
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
    

    
    public boolean markAttendance(Student student) {
        if (studentList.contains(student)) {
            System.out.println("Attendance marked for: " + student.getName());
            return true;
        }
        System.out.println("Student not found in the journal.");
        return false;
    }

    
    
    public void addDiscipline(String discipline) {
        disciplineList.add(discipline);
        System.out.println("Discipline added: " + discipline);
    }

    
    public void removeDiscipline(String discipline) {
        if (disciplineList.remove(discipline)) {
            System.out.println("Discipline removed: " + discipline);
        } else {
            System.out.println("Discipline not found: " + discipline);
        }
    }

   
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added: " + student.getName());
    }

    
    public void removeStudent(Student student) {
        if (studentList.remove(student)) {
            System.out.println("Student removed: " + student.getName());
        } else {
            System.out.println("Student not found: " + student.getName());
        }
    }
    
    
}



