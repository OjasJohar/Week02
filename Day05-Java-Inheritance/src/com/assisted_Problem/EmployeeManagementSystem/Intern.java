package com.assisted_Problem.EmployeeManagementSystem;

//creating subclass intern extending Employee
class Intern extends Employee{
    protected String duration;

    Intern(String name, String id, int salary, String duration){
        super(name, id, salary);
        this.duration=duration;
    }

    @Override
    void displayDetails(){
        System.out.println("\nIntern Name : "+ name);
        System.out.println("id     : "+ id);
        System.out.println("Salary : "+ salary +" $");
        System.out.println("Duration : "+ duration);
    }
}
