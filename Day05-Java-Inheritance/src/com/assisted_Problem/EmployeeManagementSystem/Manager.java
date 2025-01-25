package com.assisted_Problem.EmployeeManagementSystem;

//creating subclass manager extending Employee
class Manager extends Employee{
    protected int teamSize;

    Manager(String name, String id, int salary, int teamSize){
        super(name, id, salary);
        this.teamSize=teamSize;
    }

    @Override
    void displayDetails(){
        System.out.println("\nManager Name : "+ name);
        System.out.println("id     : "+ id);
        System.out.println("Salary : "+ salary +" $");
        System.out.println("Manager's TeamSize : "+ teamSize);
    }
}
