package users;

import courses.Course;
/**
 * @generated
 */
public class Admin {

    private int id;
    private String username;
    private String password;

    private static List<User> users = new ArrayList<>(); // Список пользователей
    private static List<String> logs = new ArrayList<>(); // Логи действий

    public Admin(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Добавление пользователя в систему. Выбор типа пользователя: студент или сотрудник.
     */
    public void addUser(String userType, int id, String username, String password) {
        User user = null;

        // Создаем пользователя в зависимости от типа
        if (userType.equalsIgnoreCase("student")) {
            user = new Student(id, username, password);  // attendanceOrAge - в случае студента это посещаемость
        } else if (userType.equalsIgnoreCase("employee")) {
            user = new Employee(id, username, password);  // В случае сотрудника, например, создаем преподавателя
        } else {
            System.out.println("Invalid user type.");
            return;
        }

        // Проверяем, существует ли уже пользователь с таким username
        if (findUserByUsername(username) != null) {
            System.out.println("User with username " + username + " already exists.");
            return;
        }

        users.add(user); // Добавляем пользователя
        logs.add("User added: " + user.getUsername());
        System.out.println("User " + user.getUsername() + " added successfully.");
    }

    // Удаление пользователя по имени
    public void removeUser(String username) {
        User userToRemove = findUserByUsername(username);
        if (userToRemove != null) {
            users.remove(userToRemove);
            logs.add("User removed: " + username);
            System.out.println("User " + username + " removed successfully.");
        } else {
            System.out.println("User not found: " + username);
        }
    }

    // Обновление данных пользователя
    public void updateUser(String username, String newName, String newUsername, String newPassword) {
        User userToUpdate = findUserByUsername(username);
        if (userToUpdate != null) {
            userToUpdate.setName(newName);
            userToUpdate.setUsername(newUsername);
            userToUpdate.setPassword(newPassword);
            logs.add("User updated: " + username + " to " + newUsername);
            System.out.println("User updated to: " + newUsername);
        } else {
            System.out.println("User not found: " + username);
        }
    }

    // Просмотр логов
    public void viewLogs() {
        System.out.println("Action Logs:");
        for (String log : logs) {
            System.out.println(log);
        }
    }

    // Метод для поиска пользователя по имени
    private User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername() != null && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    
    public void registerToCourse(Student s, Course c) {
    	c.getStudentsList().add(s);
    }
    public void editStudentDetails(Student student, String newName, int newAge) {
//        student.setName(newName);
//        student.setAge(newAge);
        System.out.println("Student details updated: " + student);
    }

    /**
     * Method to edit discipline details
     */
    public void editDisciplineDetails(Course discipline, String newTitle, int newCredits) {
//        discipline.setTitle(newTitle);
//        discipline.setCredits(newCredits);
        System.out.println("Discipline details updated: " + discipline);
    }

    public String generateAttendanceReport(Student student) {
        return "Attendance Report for " + student.getUsername() + ": " + student.getAttendance() + "%";
    }
}
