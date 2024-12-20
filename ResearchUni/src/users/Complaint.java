package users;

import java.util.Date;

public class Complaint {
	private Urgency urgency;
    private String complaintTitle;
    private String complaintDescription;
    private String department;
    private String status; // Например: "Pending", "Resolved"
    private Date complaintDate;

    // Constructor
    public Complaint(String title, Urgency urgency) {
    	this.complaintTitle = title;
    	this.urgency = urgency;							
    }
    public Complaint(String complaintTitle, String complaintDescription, Urgency urgency) {
        this.complaintTitle = complaintTitle;
        this.complaintDescription = complaintDescription;
        this.department = department;
        this.status = "Pending"; // Начальный статус
        this.complaintDate = new Date(); // Текущая дата
    }

    // Getters and setters

    public String getComplaintTitle() {
        return complaintTitle;
    }

    public void setComplaintTitle(String complaintTitle) {
        this.complaintTitle = complaintTitle;
    }

    public String getComplaintDescription() {
        return complaintDescription;
    }

    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }

    

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public Date getComplaintDate() {
        return complaintDate;
    }

    // Methods for operations

    /**
     * Updates the status of the complaint.
     */
    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Complaint status updated to: " + newStatus);
    }

    /**
     * Checks if the complaint is resolved.
     */
    public boolean isResolved() {
        return "Resolved".equalsIgnoreCase(this.status);
    }

    /**
     * Adds remarks for the complaint with a log message.
     */


    /**
     * Returns the complaint details.
     */
    public String getComplaintDetails() {
        return "Complaint Details:\n" +
                "Title: " + complaintTitle + "\n" +
                "Description: " + complaintDescription + "\n" +
                "Department: " + department + "\n" +
                "Status: " + status + "\n" +
                "Date: " + complaintDate;
    }

	public Urgency getUrgency() {
		return urgency;
	}

	public void setUrgency(Urgency urgency) {
		this.urgency = urgency;
	}

    @java.lang.Override
    public java.lang.String toString() {
        return 
                "urgency=" + urgency +
                ", complaintTitle='" + complaintTitle + '\'' +
                '}';
    }
}
