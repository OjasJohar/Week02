package com.assisted_Problem.AnimalHierarchy;

public class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    void makeSound(){
        System.out.println("Animals can make Sound");
    }
}