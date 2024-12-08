package users;

import java.util.Date;

public class Complaint {

    private String complaintTitle;
    private String complaintDescription;
    private String complainantName;
    private String department;
    private String status; // Например: "Pending", "Resolved"
    private String remarks;
    private Date complaintDate;

    // Constructor
    public Complaint(String complaintTitle, String complaintDescription, String complainantName, String department) {
        this.complaintTitle = complaintTitle;
        this.complaintDescription = complaintDescription;
        this.complainantName = complainantName;
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

    public String getComplainantName() {
        return complainantName;
    }

    public void setComplainantName(String complainantName) {
        this.complainantName = complainantName;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
    public void addRemarks(String newRemarks) {
        this.remarks = newRemarks;
        System.out.println("Remarks added: " + newRemarks);
    }

    /**
     * Returns the complaint details.
     */
    public String getComplaintDetails() {
        return "Complaint Details:\n" +
                "Title: " + complaintTitle + "\n" +
                "Description: " + complaintDescription + "\n" +
                "Complainant: " + complainantName + "\n" +
                "Department: " + department + "\n" +
                "Status: " + status + "\n" +
                "Remarks: " + (remarks != null ? remarks : "None") + "\n" +
                "Date: " + complaintDate;
    }
}
