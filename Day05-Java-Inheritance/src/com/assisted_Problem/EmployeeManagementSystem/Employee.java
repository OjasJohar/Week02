package com.assisted_Problem.EmployeeManagementSystem;

//Creating superclass employee
class Employee{
    protected String name;
    protected String id;
    protected int salary;

    Employee(String name, String id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println("Employee Name : "+ name);
        System.out.println("id     : "+ id);
        System.out.println("Salary : "+ salary +" $");
    }
}
