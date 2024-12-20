package users;

import staff.Message;
import java.util.*;
public class Employee extends User {

	private List<Message> messages;
	private static final long serialVersionUID = 1L;
	private String role;
    private String department;

    public Employee() {
        super();
        this.role = "";
        this.department = "";
        messages = new ArrayList<Message>();

    }

    public Employee(int id, String username, String password, String role, String department) {
        super(id, username, password);
        this.role = role;
        this.department = department;
       
    }
    
   public void sendMessage(Employee em, Message m) {
	   m.setSender(this);
	   em.messages.add(m);
   }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMessages() {
    	StringBuilder result = new StringBuilder();
    	for(Message message: this.messages) {
    		result.append(message);
    	}
    	return result.toString();
    }
   

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", role='" + role + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
