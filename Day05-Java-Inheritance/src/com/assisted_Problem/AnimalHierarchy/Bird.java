package com.assisted_Problem.AnimalHierarchy;

public class Bird extends Animal {
    Bird(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Birds make Sound like Chirps-Chirps");
    }
}