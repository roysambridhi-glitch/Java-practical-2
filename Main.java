class Employee {
    private String name;
    private String department;
    private double salary;
    private static String companyName = "SR Tech Solution Pvt. Ltd.";

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", "IT", 50000);
        Employee e2 = new Employee("Rony", "Manager", 57000);
        Employee e3 = new Employee("Sheena", "IT", 50000);
        Employee e4 = new Employee("Riya", "HR", 60000);
        Employee e5 = new Employee("Priyam", "Finance", 45000);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}