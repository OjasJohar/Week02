import java.util.Scanner;

public class CarRentalSystem_06{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		//taking input
		System.out.println("Enter the name of Customer:");
		String customerName=scanner.nextLine(); 

		//taking input
		System.out.println("Enter the model of car:");
		String carModel=scanner.nextLine();	

		//taking input
		System.out.println("Enter the number of days you want car to rent:");
		System.out.println("cost: 20$ per day.");
		int rentalDays=scanner.nextInt();

        //creating class object
		System.out.println("\nDemonstrating Total cost method");
        CarRental car=new CarRental(customerName,carModel,rentalDays);	
        car.displayDetails();	
		
		scanner.close();
	}
}

class CarRental{
	private String customerName;
	private String carModel;
	private int rentalDays;
	private int totalCost;	
	
	CarRental(String customerName, String carModel,int rentalDays){
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
		calculateTotalCost();
	}
	
	public void calculateTotalCost(){
		this.totalCost=20*rentalDays;
	}
	
	public void displayDetails(){
		System.out.println("-----Car Rent Details-----");
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Car Model      : " + carModel);
		System.out.println("Rental Days    : " + rentalDays);
		System.out.println("Total Cost     : $" + totalCost);
		System.out.println("--------------------------");
	}
}