public class ShoppingCartSystem_04{
	
	public static void main(String[] args){
		//Creating class object
		Product product=new Product("Toy", 500, 2);
		Product.displayDetails(product);
		
		Product product1=new Product("Book", 120, 5);
		Product.displayDetails(product1);
		
		Product.updateDiscount();
		
		Product.displayDetails(product);
		Product.displayDetails(product1);
	}
}
//Creating Product class
class Product{
	
	//static variable 
	static int discount=5;
	static int updateDiscount=10;
    static int count=1;	
	//final variable 
	final int productID;
	
	//Attributes(fields)
	int price, quantity;
	String productName;

	//static method 
	public static void updateDiscount(){
		System.out.println("Updated Discount : "+ updateDiscount+" %");
		discount=updateDiscount;
	}
	//Parameterized constructor
	Product(String productName, int price, int quantity){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		this.productID=1000+count;
		count++;
	}
	
	//Method to display results
	public static void displayDetails(Product product){
		if(product instanceof Product){
		    System.out.println("------Shopping Cart Details-----");
			System.out.println("Product Name : "+product.productName);//static variable
		    System.out.println("Price        : "+product.price);//non-static variable
		    System.out.println("Quantity     : "+product.quantity);//non-static variable
			System.out.println("Product ID   : "+product.productID);//final variable
			System.out.println("Discount     : "+discount+ " %");
		    System.out.println("--------------------------------");	
	    } else
			System.out.println("Object is not an instance of class ");	
	}
}