package com.Hierarchical_Inheritance.SchoolSystemWithDifferentRoles;

class Student extends Person {
    protected String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("\nThis Person is a Student.");
    }
}

