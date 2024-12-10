package courses;


public class ElectiveCourse extends Course {
    
    public ElectiveCourse(String courseID, String title, ElectiveType et) {
		super(courseID, title);
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
