package tests;

import researches.MasterStudent;

public class TestMasterStudent {
    public static void main(String[] args) {
        // Создаем объект MasterStudent
        MasterStudent student = new MasterStudent("Artificial Intelligence", null, true);

        // Проверяем метод getResearchTopic
        System.out.println("Current topic: " + student.getResearchTopic());

        // Проверяем метод setResearchTopic
        student.setResearchTopic("Quantum Computing");
        System.out.println("Updated topic: " + student.getResearchTopic());

        // Проверяем метод describe
        System.out.println(student.describe());
    }
}
