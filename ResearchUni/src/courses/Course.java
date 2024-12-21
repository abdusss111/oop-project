package courses;

import users.*;
import java.util.*;


public class Course {
	private Faculty faculty;
    private String courseID;
    private String title;
    private Set<Student> studentsList;
    private List<Teacher> instructorsList;
    private Set<Lesson> Schedule;
    private Lesson lesson;
    private Mark mark;
    private int limit;


    public Course(String courseID, String title, int limit){
        this.courseID = courseID;
        this.title = title;
        this.limit = limit;
        this.instructorsList = new ArrayList<Teacher>();
        this.studentsList = new HashSet<Student>();
    }

    public String getCourseID() {
        return courseID;
    }
    

    public String getTitle() {
        return this.title;
    }


    public Set<Student> getStudentsList() {
        if (this.studentsList == null) {
            this.studentsList = new HashSet<Student>();
        }
        return (Set<Student>) this.studentsList;
    }

    public List<Teacher> getInstructorsList() {
        if (this.instructorsList == null) {
            this.instructorsList = new ArrayList<Teacher>();
        }
        return this.instructorsList;
    }


    public Set<Lesson> getSchedule() {
        if (this.Schedule == null) {
            this.Schedule = new HashSet<Lesson>();
        }
        return this.Schedule;
    }

    public void assignTeacher(Teacher teacher) {
        if (!instructorsList.contains(teacher)) { // Проверяем, добавлен ли уже преподаватель
            instructorsList.add(teacher);
            System.out.println("Teacher " + teacher.getName() + " assigned to the course " + this.title);
        } else {
            System.out.println("Teacher " + teacher.getName() + " is already assigned to the course " + this.title);
        }
    }


    public void registerToCourse(Student[] students) {
    	for (Student student : students) {
            this.studentsList.add(student); // Add each student to the list
        }
    }
    // limit set by ourselves
    public void registerToCourse(Student s) {
        if (this.studentsList.size() >= limit) {
            System.out.println("Cannot register student " + s.getName() + ". The course is full.");
        } else {
            this.studentsList.add(s);
            System.out.println("Student " + s.getName() + " successfully registered for the course " + this.title + ".");
        }
    }

    @Override
    public String toString() {
        StringBuilder studentNames = new StringBuilder();
        for (Student student : this.studentsList) {
            studentNames.append(student.getName()).append(", ");
        }

        if (studentNames.length() > 0) {
            studentNames.setLength(studentNames.length() - 2);
        }

        return this.courseID + " " + this.title + " [Students: " + studentNames + "] " + this.instructorsList;
    }

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}


}
