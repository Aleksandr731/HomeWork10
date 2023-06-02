import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя сотрудника");
        String firstName = scanner.next();
        System.out.println("Введите фамилию сотрудника");
        String lastName = scanner.next();
        System.out.println("Введите отчетсво сотрудника");
        String middleName = scanner.next();
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

    }
    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Иванов Иван Иванович";
        System.out.println(fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}