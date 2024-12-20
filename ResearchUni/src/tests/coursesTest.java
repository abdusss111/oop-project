package tests;
import users.*;

import java.util.*;
import staff.*;
import courses.*;
import databases.StudentDatabase;
public class coursesTest {
	public static void main(String[] args) {
//		reg for courses
		Teacher pakita = new Teacher(123, "pakita", "password", "lector", "IS", "PhD", 18, "SITE");
		Course sysdes = new ElectiveCourse("CSCI2244", "System Design", ElectiveType.MAJOR);
		Student abdussalam = new Student("abdussalam", 123);
		Student abdussalam1 = new Student("abdussalam1", 456);
		Student abdussalam2 = new Student("abdussalam2", 789);
		Student abdussalam3 = new Student("abdussalam3", 101);
		List<Student> studs = new ArrayList<>();
		studs.add(abdussalam3);
		studs.add(abdussalam2);
		studs.add(abdussalam1);
		studs.add(abdussalam);

		Course OOP = new Course("CSCI1111", "OOP");
		Course PP1 = new Course("CSCI1122", "PP1");

		OOP.assignTeacher(pakita);
		OOP.registerToCourse(abdussalam);
		System.out.println(OOP);
		
//		put mark
		pakita.putMark(abdussalam3, OOP, new Mark(Grade.A));
		pakita.putMark(abdussalam3, PP1, new Mark(Grade.A_MINUS));
		System.out.println(abdussalam3.listOfMarks());
		
//		send complaint
		Manager rashidam = new Manager();
		pakita.sendComplaint(abdussalam3, rashidam, Urgency.HIGH,"too noisy");
		System.out.println(rashidam.getRequests());
//		students database
        StudentDatabase database = StudentDatabase.getInstance();
        database.addStudent(new Student("John Doe", 20));
        database.addStudent(new Student("Jane Smith", 22));
        database.addStudent(new Student("Jane Smith", 223));

        // Retrieve and print all students
        for (Student student : database.getStudents()) {
            System.out.println(student);
        }
//        report generation
        System.out.println(rashidam.reports(abdussalam3));
        
        Admin admin = new Admin();
        admin.registerToCourse(abdussalam3, PP1);
        admin.registerToCourse(abdussalam2, PP1);
        admin.registerToCourse(abdussalam1, sysdes);
        admin.registerToCourse(abdussalam3, sysdes);
        
        Manager nuray = new Manager();
        
		System.out.println(PP1);

		System.out.println(sysdes);
		
		Message m = new Message(1, "alalal");
//		send mesages
		rashidam.sendMessage(nuray, m);
		System.out.println(nuray.getMessages());

	}
}
