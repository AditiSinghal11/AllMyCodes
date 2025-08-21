abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

// Full-Time Employee
class FullTimeEmployee extends Employee {
    double salary;

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee fte = new FullTimeEmployee("Alice", 101, 5000);
        Employee pte = new PartTimeEmployee("Bob", 102, 20, 80);

        System.out.println(fte.name + "'s Salary: $" + fte.calculateSalary());
        System.out.println(pte.name + "'s Salary: $" + pte.calculateSalary());
    }
}
