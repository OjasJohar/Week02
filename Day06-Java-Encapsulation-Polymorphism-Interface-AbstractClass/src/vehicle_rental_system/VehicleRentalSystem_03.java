package vehicle_rental_system;

public class VehicleRentalSystem_03 {

    public static void main(String[] args){
        Car car=new Car("MP2025", "Car", 500, 2000, 3);
        car.displayDetails();
        car.getInsuranceDetails();

        Bike bike=new Bike("MP2000", "Bike", 150, 1000, 4);
        bike.displayDetails();
        bike.getInsuranceDetails();

        Truck truck=new Truck("MP1111", "Truck", 1000, 5000, 2);
        truck.displayDetails();
        truck.getInsuranceDetails();
    }
}
