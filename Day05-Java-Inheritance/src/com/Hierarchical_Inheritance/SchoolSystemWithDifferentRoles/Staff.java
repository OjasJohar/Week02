package com.Hierarchical_Inheritance.SchoolSystemWithDifferentRoles;

class Staff extends Person {
    protected double salary;

    public Staff(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayRole() {
        System.out.println("\nThis Person is a Staff.");
    }
}

