//creating Vehicle registration system
public class VehicleRegistrationSystem_06{
	public static void main(String[] args){
		
		System.out.println("Vehicle details before updating registration fee");
	    Vehicle vehicle1=new Vehicle("Anush Tenguriya", "SUV");
		Vehicle.displayDetails(vehicle1);
			
	    Vehicle vehicle2=new Vehicle("Ojas Johar", "Sports car");
		Vehicle.displayDetails(vehicle2);
		
		Vehicle.updateRegistrationFee(1200);
		System.out.println("Vehicle details after updating registration fee");
		
		Vehicle.displayDetails(vehicle1);
		Vehicle.displayDetails(vehicle2);
	}
}
//creating Vehicle class
class Vehicle{
	static double registrationFee=1000;
	String ownerName;
	String vehicleType;
	final String registrationNumber;
	static int count;
	
	//constructor
	Vehicle(String ownerName, String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		count++;
		this.registrationNumber=Integer.toString(1000+count);	
	}
	
	//method to update registration number
	public static void updateRegistrationFee(double updateFee){
		registrationFee=updateFee;
		System.out.println("Registration Fee Updated.");
	}
	
	//method to display details
	public static void displayDetails(Vehicle vehicle){
	    if(vehicle instanceof Vehicle){
		    System.out.println("\n-----Vehicle Details-----");
			System.out.println("Owner Name           :" + vehicle.ownerName);
			System.out.println("Vehicle Typer        :" + vehicle.vehicleType);
			System.out.println("Registration number  :" + vehicle.registrationNumber);
			System.out.println("Registration Fee     :" + vehicle.registrationFee);
	    }else{
			System.out.println("Given Object is not an instance of Vehicle class");
		}
	}	
}