package users;

import java.util.*;

/**
 * Represents a Manager who oversees employees, handles complaints, and manages courses.
 */
public class Manager extends Employee {

    /**
     * Set of complaints submitted by employees or students.
     */
    private Set<Complaint> reports;

    /**
     * List of employee requests awaiting action.
     */
    public List<Complaint> employeeRequests;

    /**
     * Number of active projects the manager oversees.
     */
    private int activeProjects;

    /**
     * Default constructor initializes default values.
     */
 
    public Manager() {
        super();
        this.reports = new HashSet<>();
        this.employeeRequests = new ArrayList<>();
        this.activeProjects = 0;
    }
    
    
    
    public String getRequests() {
        StringBuilder requestsString = new StringBuilder();
        
        for (Complaint complaint : employeeRequests) {
            requestsString.append(complaint.toString()).append("\n"); // Add each complaint followed by a newline
        }
        
        return requestsString.toString();
    }
    
    public String reports(Student s) {
      
        return s.listOfMarks();
    }

    
    /**
     * Registers a new student in the system.
     *
     * @param studentName The name of the student to register.
     */
    public void registerStudent(String studentName) {
       
        // В реальной системе можно добавить логику добавления студента в базу данных.
    }

    /**
     * Manages and assigns courses in the system.
     *
     * @param courseName The name of the course to manage.
     */
    public void manageCourse(String courseName) {
        System.out.println("Course \"" + courseName + "\" has been added to the system.");
        // Логика добавления курса или управления может быть связана с базой данных.
    }

    /**
     * Displays all employee requests awaiting manager's action.
     */
    public void viewEmployeeRequests() {
        System.out.println("Employee Requests:");
        if (employeeRequests.isEmpty()) {
            System.out.println("No requests available.");
        } else {
            for (int i = 0; i < employeeRequests.size(); i++) {
                System.out.println((i + 1) + ". " + employeeRequests.get(i));
            }
        }
    }

    /**
     * Processes an employee request by removing it from the list.
     *
     * @param request The request to process.
     */
    public void processEmployeeRequest(String request) {
//        if (employeeRequests.contains(request)) {
//            employeeRequests.remove(request);
//            System.out.println("Request \"" + request + "\" has been processed.");
//        } else {
//            System.out.println("Request \"" + request + "\" not found.");
//        }
    }

    /**
     * Adds a complaint to the manager's report list.
     *
     * @param complaint The text of the complaint.
     */
//    public void addComplaint(String complaint) {
//        reports.add(complaint);
//        System.out.println("Complaint added: \"" + complaint + "\"");
//    }

    /**
     * Generates a summary of the manager's reports and active tasks.
     */
    public void generateSummary() {
        System.out.println("Manager's Summary:");
        System.out.println("Total Complaints: " + reports.size());
        System.out.println("Pending Employee Requests: " + employeeRequests.size());
        System.out.println("Active Projects: " + activeProjects);
    }

    // Getters and Setters

//    public Set<String> getReports() {
//        return reports;
//    }
//
//    public void setReports(Set<String> reports) {
//        this.reports = reports;
//    }

    public List<Complaint> getEmployeeRequests() {
        return employeeRequests;
    }

    public void setEmployeeRequests(List<Complaint> employeeRequests) {
        this.employeeRequests = employeeRequests;
    }

    public int getActiveProjects() {
        return activeProjects;
    }

    public void setActiveProjects(int activeProjects) {
        this.activeProjects = activeProjects;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", reports=" + reports +
                ", employeeRequests=" + employeeRequests +
                ", activeProjects=" + activeProjects +
                '}';
    }
}
