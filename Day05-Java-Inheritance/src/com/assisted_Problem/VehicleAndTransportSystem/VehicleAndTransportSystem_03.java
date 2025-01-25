package com.assisted_Problem.VehicleAndTransportSystem;

public class VehicleAndTransportSystem_03{
    public static void main(String[] args){

        //Demonstrating polymorphism by storing objects of different subclasses.
        Vehicle[] vehicle=new Vehicle[4];

        vehicle[0]=new Vehicle(140, "Petrol");
        vehicle[1]=new Car(200, "CNG", 5);
        vehicle[2]=new Truck(150, "Diesel", 4);
        vehicle[3]=new Motorcycle(210, "Petrol", "Royal Enfield");

        vehicle[0].displayInfo();
        vehicle[1].displayInfo();
        vehicle[2].displayInfo();
        vehicle[3].displayInfo();
    }
}
