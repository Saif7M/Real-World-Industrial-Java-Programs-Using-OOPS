// File: Employee.java (inside src/employee/)
package employee;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }
}

// File: Manager.java
package employee;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary); // Call parent constructor
        this.bonus = bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager: " + name + ", Salary: $" + salary + ", Bonus: $" + bonus);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        emp.displayDetails();

        Manager mgr = new Manager("Bob", 80000, 10000);
        mgr.displayDetails();
    }
}

