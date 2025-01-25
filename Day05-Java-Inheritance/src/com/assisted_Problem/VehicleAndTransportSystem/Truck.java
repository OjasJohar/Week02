package com.assisted_Problem.VehicleAndTransportSystem;

//creating subclass truck
class Truck extends Vehicle{
    protected int wheels;

    Truck(int maxSpeed, String fuelType, int wheels){
        super(maxSpeed, fuelType);
        this.wheels=wheels;
    }
    void displayInfo(){
        System.out.println("\n-----Truck Details-----");
        System.out.println("Max Speed : "+ maxSpeed+ " Km/hr");
        System.out.println("Fuel Type : "+ fuelType);
        System.out.println("Wheels : "+ wheels);
        System.out.println("------------------------");
    }
}
