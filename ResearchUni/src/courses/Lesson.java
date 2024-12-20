package courses;

import java.util.*;

import users.Student;
/**
* @generated
*/
public class Lesson {
    
	private Course course;
    /**
    * @generated
    */
    private Time time;
    
    /**
    * @generated
    */
    private LessonType type;
    
    /**
    * @generated
    */
    private Set<Student> students;
    
    /**
    * @generated
    */
    private int room;
    
    
    /**
    * @generated
    */
    
    /**
    * @generated
    */
    
    

    /**
    * @generated
    */
    private Time getTime() {
        return this.time;
    }
    
    /**
    * @generated
    */
    private void setTime(Time time) {
        this.time = time;
    }
    
    
    /**
    * @generated
    */
    private LessonType getType() {
        return this.type;
    }
    
    /**
    * @generated
    */
    private void setType(LessonType type) {
        this.type = type;
    }
    
    
    /**
    * @generated
    */
    private Set<Student> getStudents() {
        if (this.students == null) {
            this.students = new HashSet<Student>();
        }
        return this.students;
    }
    
    /**
    * @generated
    */
    private void setStudents(Set<Student> students) {
        this.students = students;
    }
    
    
    /**
    * @generated
    */
    private int getRoom() {
        return this.room;
    }
    
    /**
    * @generated
    */
    private void setRoom(Integer room) {
        this.room = room;
    }
    
    
    
    /**
    * @generated
    */

    /**
    * @generated
    */

    
    
    /**
    * @generated
    */
    public Course getCourse() {
        return this.course;
    }
    
    /**
    * @generated
    */
    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    

    //                          Operations                                  
    
    
}
