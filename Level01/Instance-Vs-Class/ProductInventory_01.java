public class ProductInventory_01{
	
	public static void main(String[] args){
		//Creating class object
		Product product1=new Product("Toy", 1000);
		Product product2=new Product("Chocolate", 125);
		
		//Calling methods
		product1.displayProductDetails();
		//Product.displayTotalProducts(); // Accessing class method
		
		product2.displayProductDetails();
		Product.displayTotalProducts(); // Accessing class method
	}
}
//Creating Product class
class Product{
	
	//Instance Variables
	String productName;
	int price;
	//Class Variables
	static int totalProducts;
	
	//Constructor
	Product(String productName, int price){
		this.productName=productName;
		this.price=price;
		totalProducts++;
	}
	
	//Instance method
	public void displayProductDetails(){
		System.out.println("Product Name : "+productName);
		System.out.println("Price        : "+price+" $");
		System.out.println("---------------------------");
	}
	
	//Class method
	public static void displayTotalProducts(){
		System.out.println("Total Product Quantity : "+totalProducts);
		System.out.println("---------------------------");
	}
}