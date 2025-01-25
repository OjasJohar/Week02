package com.Hybrid_Inheritance.RestaurantManagementSystem;

// Subclass: Waiter
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (ID: " + id + ") is serving customers at their tables.");
    }
}
