package databases;


import users.*;
import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    private static final String FILE_NAME = "students.txt"; // File to store the students
    private static StudentDatabase instance;
    private List<Student> students;

    private StudentDatabase() {
        students = new ArrayList<>();
        loadData();  
    }

    public static StudentDatabase getInstance() {
        if (instance == null) {
            synchronized (StudentDatabase.class) {
                if (instance == null) {
                    instance = new StudentDatabase();
                }
            }
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.add(student);
        saveData();  
    }

    public List<Student> getStudents() {
        return students;
    }

    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<Student>) ois.readObject();  
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous data found, starting fresh.");
        }
    }

    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

