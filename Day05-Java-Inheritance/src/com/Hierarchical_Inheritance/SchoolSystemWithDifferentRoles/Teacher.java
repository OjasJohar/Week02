package com.Hierarchical_Inheritance.SchoolSystemWithDifferentRoles;

class Teacher extends Person {
    protected String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("\nThis Person is a Teacher.");
    }
}
