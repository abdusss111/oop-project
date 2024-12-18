package courses;

import users.Student;

public class Mark {
    private Grade value;       // Оценка
    private Student student;   // Студент, связанный с оценкой
    private Course course;     // Курс, по которому выставлена оценка

    public Mark(Grade value, Student student, Course course) {
        this.value = value;
        this.student = student;
        this.course = course;
    }

    // Getters and Setters
    public Grade getValue() {
        return this.value;
    }

    public void setValue(Grade value) {
        this.value = value;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    // Methods

    /**
     * Returns the string representation of the grade value.
     *
     * @return the grade as a string (e.g., "A", "B+", "F").
     */
    public String getGradeValue() {
        return value != null ? value.toString() : "No grade assigned";
    }

    /**
     * Updates the current grade.
     *
     * @param newGrade the new grade to set.
     */
    public void updateGrade(Grade newGrade) {
        this.value = newGrade;
    }

    /**
     * Checks if the current grade is a passing grade.
     *
     * @return true if the grade is passing, false otherwise.
     */
    public boolean isPassingGrade() {
        return value != Grade.F && value != Grade.D && value != Grade.D_MINUS;
    }

    /**
     * Returns a detailed string representation of the Mark object.
     *
     * @return a string containing grade, student, and course information.
     */
    @Override
    public String toString() {
        return "Mark{" +
               "Grade=" + getGradeValue() +
               ", Student=" + (student != null ? student.getName() : "Unknown") +
               ", Course=" + (course != null ? course.getName() : "Unknown") +
               '}';
    }
}
