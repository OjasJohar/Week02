package com.assisted_Problem.VehicleAndTransportSystem;

//Creating superclass Vehicle
class Vehicle{
    protected int maxSpeed;
    protected String fuelType;

    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("-----Vehicle Details----");
        System.out.println("Max Speed : "+ maxSpeed+ " Km/hr");
        System.out.println("Fuel Type : "+ fuelType);
        System.out.println("------------------------");
    }
}
