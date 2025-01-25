package com.assisted_Problem.VehicleAndTransportSystem;

//creating subclass car
class Car extends Vehicle{
    protected int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }

    void displayInfo(){
        System.out.println("\n------Car Details-----");
        System.out.println("Max Speed : "+ maxSpeed+ " Km/hr");
        System.out.println("Fuel Type : "+ fuelType);
        System.out.println("Seat Capacity :"+ seatCapacity);
        System.out.println("-----------------------");
    }

}
