// Main class to test the implementation
public class EmployeeRecord_04 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(1001, "Engineering", 50000.0);
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + employee.employeeID);
        System.out.println("Salary: " + employee.getSalary());

        // Update salary using the setter
        employee.setSalary(55000.0);
        System.out.println("Updated Salary: " + employee.getSalary());

        System.out.println("\nManager Example:");
        // Create a Manager object
        Manager manager = new Manager(2002, "Marketing", 75000.0, "Team Alpha");
        manager.displayDetails();
    }
}

// Base class: Employee
class Employee {
    public int employeeID;         // Public attribute
    protected String department;   // Protected attribute
    private double salary;         // Private attribute

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.setSalary(salary); // Validate salary using setter
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String team;  // Additional attribute specific to Manager

    // Constructor
    Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary); // Call parent class constructor
        this.team = team;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);      // Access public member
        System.out.println("Department: " + department);       // Access protected member
        System.out.println("Salary: " + getSalary());          // Access private member via getter
        System.out.println("Team: " + team);
    }
}