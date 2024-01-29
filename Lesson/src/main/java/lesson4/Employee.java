package lesson4;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, long phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fullName + "; должность: " + position + "; email: " + email + "; телефон: " +
                phoneNumber + "; зарплата: " + salary + "; возраст: " + age);
    }
}
