import java.util.Scanner;

//Creating shopping cart class
public class SimulateShoppingCart_05{
	
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the item Name :");
		String itemName=input.nextLine();
		
		//taking input from the user
		System.out.println("Enter the price of item :");
		double price=input.nextDouble();
		
		//taking input from the user
		System.out.println("Enter the quantity of item:");
		int quantity=input.nextInt();
		
		//creating object of cartItem class
		CartItem cart=new CartItem();
		
		//adding items to the cart
		System.out.println("\nAdding items to the cart");
		cart.addCartItem(itemName,price,quantity);
		cart.displayDetails();
		
		//adding items to the cart
		System.out.println("\nRemoving items from the cart");
		cart.removeCartItem();
		cart.displayDetails();
		
		//Closing Scanner class
		input.close();
	}
}

//creating cartItem class
class CartItem{
	//creating itemName,price and quantity attributes
	private String itemName;
	private double price;
	private double totalprice;
	private int quantity;
	
	//constructor
	CartItem(){
		this.itemName=null;
		this.price=0;
		this.quantity=0;
		this.totalprice=0;
	}
	
	//method to add cart item
	public void addCartItem(String itemName, double price, int quantity){
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
		
		this.totalprice += price*quantity;
	}
	
	//method to remove cart item
	public void removeCartItem(){
		this.itemName=null;
		this.price=0;
		this.quantity=0;
		
		this.totalprice =0;
	}
	
	public void displayDetails(){
		System.out.println("-----Cart Items details----");
		System.out.println("Item name    :" + itemName);
		System.out.println("Item price   :" + price + "$");
		System.out.println("Quantity     :" + quantity);
		System.out.println("Total price  :" + totalprice + "$");
		System.out.println("---------------------------");
	}
}