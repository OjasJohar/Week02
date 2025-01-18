import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Take user input
		System.out.println("Enter the phone brand : ");
		String brand= input.nextLine();
		
		//Take user input
		System.out.println("Enter the model : ");
		String model= input.nextLine();
		
		//Take user input
		System.out.println("Enter the price : ");
		int price=input.nextInt();
		
		//Create mobilePhone object
	    MobilePhone mobilePhone=new MobilePhone(brand, model, price);
		mobilePhone.displayDetails();
		
		//Closing Scanner class
		input.close();
	}
}
//Creating class MobilePhone
class MobilePhone{
	//Creating Fields(Attributes)
	String brand, model;
	int priceOfItem;
	
	//Parameterized Constructor
	MobilePhone(String brand, String model, int price){
		this.brand=brand;
		this.model=model;
		priceOfItem=price;
	}
	//Method to display phone details
	void displayDetails(){
		System.out.println("=====Phone Details=====");
		System.out.println("Brand    : "+ brand);
		System.out.println("Model    : "+ model);
		System.out.println("Price    : "+ priceOfItem);
		System.out.println("-----------------------");
	}
}