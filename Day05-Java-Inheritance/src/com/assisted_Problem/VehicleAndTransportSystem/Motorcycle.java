package com.assisted_Problem.VehicleAndTransportSystem;

//creating subclass motorcycle extending vehicle class
class Motorcycle extends Vehicle{
    protected String brand;

    Motorcycle(int maxSpeed, String fuelType, String brand){
        super(maxSpeed, fuelType);
        this.brand=brand;
    }

    void displayInfo(){
        System.out.println("\n---Motorcycle Details---");
        System.out.println("Max Speed : "+ maxSpeed+ " Km/hr");
        System.out.println("Fuel Type : "+ fuelType);
        System.out.println("Brand : "+ brand);
        System.out.println("------------------------");
    }
}
