// Class: Mark
package marks;

public class Mark {
    private Grade value;
    private Student student;
    private Course course;

    public Mark(Grade value, Student student, Course course) {
        this.value = value;
        this.student = student;
        this.course = course;
    }

    public String getGradeValue() {
        return "Grade: " + value;
    }

    public void updateGrade(Grade newValue) {
        this.value = newValue;
    }
}
