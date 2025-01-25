package com.assisted_Problem.AnimalHierarchy;

public class Cat extends Animal {
    Cat(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Cats make Sound like Meow-Meow");
    }
}