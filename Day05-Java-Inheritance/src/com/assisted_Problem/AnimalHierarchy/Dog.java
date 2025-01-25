package com.assisted_Problem.AnimalHierarchy;

public class Dog extends Animal {
    Dog(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Dogs make Sound like Bow-Bow");
    }

}