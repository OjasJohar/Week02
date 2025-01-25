package com.assisted_Problem.AnimalHierarchy;

public class AnimalHierarchy_01{

    public static void main(String[] args){

        Animal animal=new Animal("Janwar", 9);
        System.out.println("Age of "+animal.getName()+" is "+ animal.getAge());
        animal.makeSound();

        Dog dog=new Dog("Dog", 11);
        System.out.println("\nAge of "+dog.getName()+" is "+ dog.getAge());
        dog.makeSound();

        Cat cat=new Cat("Cat", 6);
        System.out.println("\nAge of "+cat.getName()+" is "+ cat.getAge());
        cat.makeSound();

        Bird bird=new Bird("Bird", 3);
        System.out.println("\nAge of "+bird.getName()+" is "+ bird.getAge());
        bird.makeSound();
    }
}
