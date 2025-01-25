package com.Hybrid_Inheritance.RestaurantManagementSystem;

// Main class to test the system
public class RestaurantManagementSystem_01 {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Alice", 102);

        // Call performDuties() for each instance
        chef.performDuties();
        waiter.performDuties();
    }
}
