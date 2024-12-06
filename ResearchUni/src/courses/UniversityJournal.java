package courses;
import java.util.HashSet;
import java.util.Set;

public class UniversityJournal {

    private Set<String> disciplineList; // Список дисциплин
    private boolean isDataSaved; // Сохранены ли данные
    private Set<String> disciplineProfessors; // Список преподавателей по дисциплинам
    private Set<Student> studentList; // Список студентов

    // Конструктор
    public UniversityJournal() {
        this.disciplineList = new HashSet<>();
        this.disciplineProfessors = new HashSet<>();
        this.studentList = new HashSet<>();
        this.isDataSaved = false;
    }

    // Getters и Setters
    public Set<String> getDisciplineList() {
        return disciplineList;
    }

    public void setDisciplineList(Set<String> disciplineList) {
        this.disciplineList = disciplineList;
    }

    public boolean getIsDataSaved() {
        return isDataSaved;
    }

    public void setIsDataSaved(boolean isDataSaved) {
        this.isDataSaved = isDataSaved;
    }

    public Set<String> getDisciplineProfessors() {
        return disciplineProfessors;
    }

    public void setDisciplineProfessors(Set<String> disciplineProfessors) {
        this.disciplineProfessors = disciplineProfessors;
    }

    public Set<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Set<Student> studentList) {
        this.studentList = studentList;
    }

    // Операции

    /**
     * Отметить посещение студента.
     */
    public boolean markAttendance(Student student) {
        if (studentList.contains(student)) {
            System.out.println("Attendance marked for: " + student.getName());
            return true;
        }
        System.out.println("Student not found in the journal.");
        return false;
    }

    /**
     * Добавить дисциплину.
     */
    public void addDiscipline(String discipline) {
        disciplineList.add(discipline);
        System.out.println("Discipline added: " + discipline);
    }

    /**
     * Удалить дисциплину.
     */
    public void removeDiscipline(String discipline) {
        if (disciplineList.remove(discipline)) {
            System.out.println("Discipline removed: " + discipline);
        } else {
            System.out.println("Discipline not found: " + discipline);
        }
    }

    /**
     * Добавить студента.
     */
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added: " + student.getName());
    }

    /**
     * Удалить студента.
     */
    public void removeStudent(Student student) {
        if (studentList.remove(student)) {
            System.out.println("Student removed: " + student.getName());
        } else {
            System.out.println("Student not found: " + student.getName());
        }
    }
}
