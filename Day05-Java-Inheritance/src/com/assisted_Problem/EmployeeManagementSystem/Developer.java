package com.assisted_Problem.EmployeeManagementSystem;

//creating subclass developer extending Employee
class Developer extends Employee{
    protected String programmingLanguage;

    Developer(String name, String id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    void displayDetails(){
        System.out.println("\nDeveloper Name : "+ name);
        System.out.println("id     : "+ id);
        System.out.println("Salary : "+ salary +" $");
        System.out.println("Programming Language : "+programmingLanguage);
    }
}
