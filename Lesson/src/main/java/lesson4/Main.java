package lesson4;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Карева Елена Викторовна","учитель","averak.gmail.com",
                89061577245L,25000, 39);
        employeeArray[1] = new Employee("Морозов Денис Викторович","оператор","morden.gmail.com",
                89003153666L,50000,37);
        employeeArray[2] = new Employee("Анюхин Александр Николаевич","охранник","anuch.gmail.com",
                89271520155L,45000,57);
        employeeArray[3] = new Employee("Тюркина Елена Васильевна","бухгалтер","tjurk.gmail.com",
                89087318900L,70000,42);
        employeeArray[4] = new Employee("Щанин Владимир Николаевич","водитель","shanin.gmail.com",
                89270034565L,40000,60);

        for(Employee employee : employeeArray) {
            employee.info();
        }

        Park.Attraction attraction = new Park().new Attraction("Колесо обозрения",300);
        attraction.printInfo();
    }
}
