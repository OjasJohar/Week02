public class VehicleRegistration_03{
	
	public static void main(String[] args){
		
		//Creating class object
		Vehicle vehicle1=new Vehicle("Ojas Johar","Car",350);
		vehicle1.displayVehicleDetails();
		Vehicle vehicle2=new Vehicle("Anush Tenguriya","SUV",350);
		vehicle2.displayVehicleDetails();
		
		Vehicle.updateRegistrationFee();
		//Calling methods after updation:
		vehicle1.displayVehicleDetails();
		vehicle2.displayVehicleDetails();
		
	}
}
//Creating Vehicle class
class Vehicle{
	//Instance Variables: 
	String ownerName, vehicleType;
	//Class Variable:
    static int registrationFee;
	
	//Constructor
	Vehicle(String ownerName, String vehicleType, int registrationFee){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		Vehicle.registrationFee=registrationFee;
	}
	
	//Instance method
    public void displayVehicleDetails(){
		System.out.println("-------Vehicle Details------");
		System.out.println("Owner Name        : "+ownerName);
		System.out.println("Vehicle Type      : "+vehicleType);
		System.out.println("Registration fees : "+registrationFee+" $");
		System.out.println("-----------------------------");
	}
	
	//Class method 
	public static void updateRegistrationFee(){
		registrationFee=500;
		System.out.println("Updated registration fee :"+registrationFee);
	}
}