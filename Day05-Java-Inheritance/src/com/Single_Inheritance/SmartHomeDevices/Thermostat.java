package com.Single_Inheritance.SmartHomeDevices;

//class Thermostat
class Thermostat extends Device{

    //attribute
    protected String temperatureSetting;

    //Constructor

    Thermostat(int deviceId, String status, String temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }

    //display
    public void displayStatus(){
        System.out.println("----------------------Device Details-------------");
        System.out.println("The Device Id                           : "+deviceId);
        System.out.println("The Status of the device                : "+status);
        System.out.println("The Temperature Setting of the device   : "+temperatureSetting);
        System.out.println("--------------------------------------------------");
    }
}
