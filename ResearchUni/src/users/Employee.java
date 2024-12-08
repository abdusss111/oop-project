package users;
import java.util.ArrayList;
import java.util.List;
public class Employee extends User {

    private String role;
    private String department;
    private int salary;
    private int workingHours;
    private List<String> tasks;
    /**
     * Number of vacation days available.
     */
    private int vacationDays;  
    public Employee() {
        super();
        this.role = "";
        this.department = "";
        this.salary = 0;
        this.workingHours = 0;
        this.tasks = new ArrayList<>();
        this.vacationDays = 0;
    }

    /**
     * Parameterized constructor for initializing the employee.
     *
     * @param id           Employee ID.
     * @param username     Username of the employee.
     * @param password     Password of the employee.
     * @param role         Role of the employee.
     * @param department   Department where the employee works.
     * @param salary       Salary of the employee.
     * @param workingHours Weekly working hours.
     * @param vacationDays Available vacation days.
     */
    public Employee(int id, String username, String password, String role, String department, int salary, int workingHours, int vacationDays) {
        super(id, username, password);
        this.role = role;
        this.department = department;
        this.salary = salary;
        this.workingHours = workingHours;
        this.tasks = new ArrayList<>();
        this.vacationDays = vacationDays;
    }

    /**
     * Adds a task to the employee's task list.
     *
     * @param task Task to add.
     */
    public void addTask(String task) {
        tasks.add(task);
    }

    /**
     * Displays the employee's tasks.
     */
    public void viewTasks() {
        System.out.println("Tasks assigned to " + getUsername() + ":");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }

    /**
     * Simulates the employee working on their tasks.
     */
    public void work() {
        if (tasks.isEmpty()) {
            System.out.println(getUsername() + " has no tasks to work on.");
        } else {
            System.out.println(getUsername() + " is working onsome tasks...");
        }
    }

    /**
     * Simulates the employee taking a vacation.
     */
    public void takeVacation() {
        if (vacationDays > 0) {
            vacationDays--;
            System.out.println(getUsername() + " is on vacation. Remaining days: " + vacationDays);
        } else {
            System.out.println(getUsername() + " has no vacation days left.");
        }
    }

    // Getters and Setters

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", role='" + role + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", workingHours=" + workingHours +
                ", vacationDays=" + vacationDays +
                '}';
    }
}
