package UMLdiagram;

public class TestClass {

    public static void main(String[] args) {
        // Создаем администратора
        Admin admin = new Admin(1, "admin", "admin123");

        // Тест 1: Добавление пользователей
        System.out.println("--- Add Users ---");
        admin.addUser("student", 101, "student1", "password1"); // Добавляем студента
        admin.addUser("employee", 102, "employee1", "password2"); // Добавляем сотрудника
        admin.addUser("student", 103, "student1", "password3"); // Повторное имя пользователя

        // Тест 2: Обновление данных пользователя
        System.out.println("\n--- Update User ---");
        admin.updateUser("student1", "Student One", "student_updated", "newpassword1"); // Обновление существующего
        admin.updateUser("unknown_user", "Name", "newUsername", "password"); // Попытка обновить несуществующего

        // Тест 3: Удаление пользователя
        System.out.println("\n--- Remove User ---");
        admin.removeUser("employee1"); // Удаляем существующего пользователя
        admin.removeUser("employee1"); // Попытка удалить уже удаленного

        // Тест 4: Просмотр логов
        System.out.println("\n--- View Logs ---");
        admin.viewLogs();
    }
}
