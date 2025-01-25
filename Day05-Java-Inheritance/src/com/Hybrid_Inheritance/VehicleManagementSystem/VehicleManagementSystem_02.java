package com.Hybrid_Inheritance.VehicleManagementSystem;

// Main class to test the system
public class VehicleManagementSystem_02 {
    public static void main(String[] args) {
        // Create instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 200);
        PetrolVehicle pv = new PetrolVehicle("Toyota Fortuner", 180);

        // Call methods for each instance
        System.out.println("Electric Vehicle: " + ev.getModel() + " with max speed " + ev.getMaxSpeed() + " km/h.");
        ev.charge();

        System.out.println("Petrol Vehicle: " + pv.getModel() + " with max speed " + pv.getMaxSpeed() + " km/h.");
        pv.refuel();
    }
}
