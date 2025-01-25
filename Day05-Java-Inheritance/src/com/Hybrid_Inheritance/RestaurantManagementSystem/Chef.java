package com.Hybrid_Inheritance.RestaurantManagementSystem;

// Subclass: Chef
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (ID: " + id + ") is preparing meals in the kitchen.");
    }
}

