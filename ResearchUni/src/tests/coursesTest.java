package tests;
import users.*;

import java.util.*;
import staff.*;
import courses.*;
import databases.StudentDatabase;
public class coursesTest {
	public static void main(String[] args) {
//		reg for courses
		Teacher pakita = new Teacher("123", "pakita", "password", "lector", "IS", "PhD", 18, "SITE");
	    Teacher izbasar = new Teacher("124", "Izbasar", "password2", "Assistant", "CS", "MSc", 15, "SITE");
	    Teacher aigerim = new Teacher("125", "Aigerim", "password3", "Lecturer", "Math", "PhD", 10, "Math Department");
		Course sysdes = new ElectiveCourse("CSCI2244", "System Design", ElectiveType.MAJOR,20);
		Student abdussalam = new Student("abdussalam", "123");
		Student arlan = new Student("arlan", "23B032222");
		Student abdussalam2 = new Student("abdussalam2", "222222");
		Student abdussalam3 = new Student("abdussalam3", "101");
		List<Student> studs = new ArrayList<>();
		studs.add(abdussalam3);
		studs.add(abdussalam2);
		studs.add(arlan);
		studs.add(abdussalam);

		Course OOP = new Course("CSCI1111", "OOP", 80);
		Course PP1 = new Course("CSCI1122", "PP1", 90);

//		OOP.assignTeacher(pakita);
//		OOP.assignTeacher(izbasar);
//		OOP.registerToCourse(abdussalam);
//		System.out.println(OOP);
		
//		put mark
//		pakita.putMark(abdussalam3, OOP, new Mark(Grade.A));
//		pakita.putMark(abdussalam3, PP1, new Mark(Grade.A_MINUS));
//		System.out.println(abdussalam3.listOfMarks());
		
//		send complaint
		Manager rashidam = new Manager();
		pakita.sendComplaint(abdussalam3, rashidam, Urgency.HIGH,"too noisy");
		System.out.println(rashidam.getRequests());
//		students database
        StudentDatabase database = StudentDatabase.getInstance();
        database.addStudent(new Student("John Doe", "20"));
        database.addStudent(new Student("Jane Smith", "22"));
        database.addStudent(new Student("Jane Smith", "223"));

//        // Retrieve and print all students
//        for (Student student : database.getStudents()) {
//            System.out.println(student);
//        }
////        report generation
//        System.out.println(rashidam.reports(abdussalam3));
//        
//        Admin admin = new Admin();
//        admin.registerToCourse(abdussalam3, PP1);
//        admin.registerToCourse(abdussalam2, PP1);
//        admin.registerToCourse(abdussalam1, sysdes);
//        admin.registerToCourse(abdussalam3, sysdes);
//        
//        Manager nuray = new Manager();
//        
//		System.out.println(PP1);
//
//		System.out.println(sysdes);
//		
//		Message m = new Message(1, "alalal");
//		
//		rashidam.sendMessage(nuray, m);
//		System.out.println(nuray.getMessages());
//		
//		OOP.assignTeacher(pakita);
//		System.out.println("Преподаватели на курсе OOP:");
//		for (Teacher teacher : OOP.getInstructorsList()) {
//		    System.out.println(teacher);
//		}
//		
//		rashidam.addNews("New Semester Starts", "The new semester will start from September 1.");
//		 for (String news : rashidam.getNewsFeed()) {
//	            System.out.println(news);
//		 }
//		 
		 
		 
	
			    // Доступные клубы в университете
//			    Set<String> availableClubs = new HashSet<>(Arrays.asList("kbtu_moments", "faces", "studex"));
//
//			    // Создание студента
//			    Student student = new Student("Alice", 101);
//
//			    // Студент пытается вступить в клуб
//			    student.joinClub("kbtu_moments", Role.PRESIDENT, availableClubs);
//			    student.joinClub("faces", Role.MEMBER, availableClubs);

        
        
        
        
        OOP.assignTeacher(pakita);
        arlan.enrollInCourse(OOP);
        
        pakita.putMark(arlan, OOP, new Mark(90));
        for (Map.Entry<Course, Mark> entry : arlan.getCourses().entrySet()) {
            System.out.println("Course: " + entry.getKey().getTitle() + ", Mark: " + entry.getValue().getValue());
        }
        
//        System.out.println("Arlan is a " + arlan.getStudyYear() + " year student");
        
        }

	}
	

