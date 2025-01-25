package com.assisted_Problem.EmployeeManagementSystem;

public class EmployeeManagementSystem_02{

    public static void main(String[] args){

        Employee employee=new Employee("Ojas Johar", "111AS034", 100000);
        employee.displayDetails();

        Manager manager=new Manager("Anush Tenguriya", "111AS002", 75000, 30);
        manager.displayDetails();

        Developer developer=new Developer("Om Sharma", "111AS035", 41000, "JAVA");
        developer.displayDetails();

        Intern intern=new Intern("Sejal Gupta", "111AS056", 9000, "3-Months");
        intern.displayDetails();
    }
}
