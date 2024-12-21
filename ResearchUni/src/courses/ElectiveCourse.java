package courses;

import users.Student;

public class ElectiveCourse extends Course {
    
    public ElectiveCourse(String courseID, String title, ElectiveType et, int limit) {
		super(courseID, title,limit);
		this.type = et;
	}


    private ElectiveType type;
    

    private ElectiveType getType() {
        return this.type;
    }
    

    public void setType(ElectiveType type) {
        this.type = type;
    }
   
   
    
    
}
