// Main class to test the program
public class GroceryStoreBillGenerationApplication_02 {
	
    public static void main(String[] args) {
        // Create products
        Product apples = new Product("Apples", 3.0, 2);  // 2 kg at $3 per kg
        Product milk = new Product("Milk", 2.0, 1);  // 1 liter at $2 per liter

        // Create customer and add products
        Customer customer = new Customer("Alice", 5);  // Can purchase up to 5 products
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Create a BillGenerator and print the bill
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.printBill(customer);
    }
}

// Class representing a Product
class Product {
    private String productName;
    private double pricePerUnit;
    private double quantity;

    // Constructor to initialize product details
    public Product(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    // Method to calculate the total price for the product
    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

// Class representing a Customer
class Customer {
    private String name;
    private Product[] products;  // Composition: Customer has products
    private int productCount;

    // Constructor to initialize customer details
    public Customer(String name, int maxProducts) {
        this.name = name;
        this.products = new Product[maxProducts];
        this.productCount = 0;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }

    // Method to add a product to the customer's product list
    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        }
    }
}

// Class for generating the bill
class BillGenerator {
    
    // Method to calculate the total bill for a customer
    public double generateBill(Customer customer) {
        double total = 0;

        // Sum up total for all products purchased by the customer
        for (Product product : customer.getProducts()) {
            if (product != null) {
                total += product.getTotalPrice();
            }
        }

        return total;
    }

    // Method to print the bill for a customer
    public void printBill(Customer customer) {
        System.out.println("Bill for " + customer.getName() + ":");
        double total = generateBill(customer);
        
        for (Product product : customer.getProducts()) {
            if (product != null) {
                System.out.println(product.getProductName() + " (" + product.getQuantity() + " units) - $"
                        + product.getPricePerUnit() + " per unit = $" + product.getTotalPrice());
            }
        }
        
        System.out.println("Total Bill: $" + total);
    }
}