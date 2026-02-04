package lessons;

// TODO: Create an class called Employee
class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return this.name;
    }

    public double getEmployeeSalary() {
        return this.salary;
    }

    public String getDetails() {
        return "Name: " + this.name + ", Salary: " + this.salary;
    }
}

// TODO: Create a class Manager that:
// - Extends Employee

class Manager extends Employee {
    private String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDetails() {
        return "Name: " + this.getEmployeeName() + ", Salary: " + this.getEmployeeSalary() + ", Department: " + this.department;
    }

}

public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        // TODO: Print their details using getDetails()
        Employee employee = new Employee("Alice", 50000.0);
        Employee manager = new Manager("Bob", 80000.0, "IT");

        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());
    }
}
