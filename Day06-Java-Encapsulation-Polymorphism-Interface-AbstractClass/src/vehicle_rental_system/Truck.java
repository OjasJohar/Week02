package vehicle_rental_system;

public class Truck extends Vehicle implements Insurable{
    private final int insurance;
    private final int days;

    public Truck(String vehicleNumber, String type, int rentalRate, int insurance, int days){
        super(vehicleNumber, type, rentalRate);
        this.insurance=insurance;
        this.days=days;
    }

    @Override
    public void calculateInsurance() {
        System.out.println("Total Insurance :"+ insurance);
    }

    @Override
    public void getInsuranceDetails() {
        calculateInsurance();
        System.out.print("Total Rental Cost for 2 days : "+ calculateRentalCost(days));
    }

    @Override
    int calculateRentalCost(int days) {
        return (getRentalRate()*days)+insurance;
    }
}
