package com.Single_Inheritance.SmartHomeDevices;

//class device
class Device{

    //attributes
    protected int deviceId;
    protected String status;

    //constructor
    Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    //set method
    public void setStatus(String status){
        this.status = status;
    }
    //get method
    public String getStatus(){
        return status;
    }
    //method for displaying the status
    public void displayStatus(){
        System.out.println("----------Device Details-------------");
        System.out.println("The Device Id              : "+deviceId);
        System.out.println("The Status of the device   : "+status);
        System.out.println("--------------------------------------");
    }

}

