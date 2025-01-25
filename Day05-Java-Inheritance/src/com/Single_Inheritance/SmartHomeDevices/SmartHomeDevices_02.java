package com.Single_Inheritance.SmartHomeDevices;

// Smart Home Devices
public class SmartHomeDevices_02{
    public static void main(String[]args){
        // Device class object
        Device device = new Device(1233, "Refurbished");

        device.displayStatus();


        // Thermostat class object
        Thermostat thermostat = new Thermostat(1353, "New", "normal");

        thermostat.displayStatus();

        System.out.println("The new Status of the device : "+thermostat.getStatus());
    }
}

