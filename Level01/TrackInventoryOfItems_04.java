import java.util.Scanner;

public class main{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Take user input.
		System.out.println("Enter the Item Code : ");
		int itemCode =input.nextInt();
		input.nextLine();
		
		//Take user input.
		System.out.println("Enter the Item Name: ");
		String itemName = input.nextLine();
		
		//Take user input.
		System.out.println("Enter the price : ");
		int price=input.nextInt();
		
		//Create item object
		Item item=new Item(itemCode, itemName, price);
		item.displayDetails();
		
		//Take user input.
		System.out.println("Enter the quantity you want to buy :");
		int quantity=input.nextInt();
		item.calculateTotalCost(quantity);
		
		//Closing Scanner class
		input.close();
	}
}
//Creating class Item
class Item{
	//Creating Fields(Attributes)
	String itemName;
	int itemCode, priceOfItem;
	
	//Parameterized Constructor
	Item(int itemCode, String itemName, int price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		priceOfItem=price;
	}
	void calculateTotalCost(int quantity){
		System.out.println("Total cost for a given quantity : "+ quantity*priceOfItem);
	}
	//Method to display item details
	void displayDetails(){
		System.out.println("=====Item Details=====");
		System.out.println("ItemCode : "+ itemCode);
		System.out.println("ItemName : "+ itemName);
		System.out.println("Price    : "+ priceOfItem);
		System.out.println("----------------------");
	}
}