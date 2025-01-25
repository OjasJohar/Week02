package com.Hybrid_Inheritance.VehicleManagementSystem;

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling at a petrol station.");
    }
}
