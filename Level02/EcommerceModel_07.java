import java.util.ArrayList;
import java.util.List;

public class ECommerceModel_07{
	
	public static void main(String[] args){
		
		Product product1=new Product("Table");
		Product product2=new Product("Chair");
		Product product3=new Product("Sofa");
		
		Order order1=new Order("A123");
		Order order2=new Order("B876");
		Order order3=new Order("D567");
		
		Customer customer1=new Customer("Ojas Johar");
		Customer customer2=new Customer("Anush Tenguriya");
		
		order1.addProduct(product1);
		order1.addProduct(product2);
	    order2.addProduct(product3);
		order2.addProduct(product1);
		order3.addProduct(product2);
		
		customer1.addOrder(order1);
		customer1.addOrder(order2);
		customer2.addOrder(order3);
		
		System.out.println(customer1.getCustomerName());
		for(Order o: customer1.getOrders()){
			System.out.println("Order ID: " + o.getOrderID());
			System.out.println("Products: ");
			for(Product p:o.getproducts()){
				System.out.println(p.getProductName());
			}
		}
		
		System.out.println();
		System.out.println(customer2.getCustomerName());
		for(Order o: customer2.getOrders()){
			System.out.println("Order ID: " + o.getOrderID());
			System.out.println("Products: ");
			for(Product p:o.getproducts()){
				System.out.println(p.getProductName());
			}
		}
	}
}

class Product{
	private String name;
	
	Product(String name){
		this.name=name;
	}
	
	public String getProductName(){
		return this.name;
	}
}
class Order{
	private String orderID;
	private List<Product> products;
	
	Order(String orderID){
		this.orderID=orderID;
		products=new ArrayList<>();
	}
	
	public void addProduct(Product product){
		if(!products.contains(product)){
			products.add(product);
		}
	}
	
	public List<Product> getproducts(){
		return products;
	}
	
	public String getOrderID(){
		return orderID;
	}	
}

class Customer{
	private String name;
	private List<Order> orders;
    
    Customer(String name){
		this.name=name;
		orders=new ArrayList<>();
	}	
	
	public void addOrder(Order order){
		if(!orders.contains(order)){
			orders.add(order);
		}
	}
	
	public List<Order> getOrders(){
		return orders;
	}
	
	public String getCustomerName(){
		return "Customer: " + name;
	}
}