package vehicle_rental_system;

public abstract class Vehicle {

    //Attributes(Fields):
    private String vehicleNumber;
    private String type;
    private int rentalRate;

    public Vehicle(String vehicleNumber, String type, int rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }

    //Getters and Setters:
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    //Getters and Setters:
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    //Getters and Setters:
    public int getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    //Abstract Method
    abstract int calculateRentalCost(int days);

    public void displayDetails(){
        System.out.println("---Vehicle Details---");
        System.out.println("Vehicle Number :"+vehicleNumber);
        System.out.println("Type :"+type);
        System.out.println("Rental Rate :"+rentalRate);
    }
}
