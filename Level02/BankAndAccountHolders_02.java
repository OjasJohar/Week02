import java.util.ArrayList;
import java.util.List;

class BankAndAccountHolders_02{
	
	public static void main(String[]args){
		
		Bank bank1 = new Bank("HDFC");
		Bank bank2 = new Bank("ICIC");
		
		Customer customer1 = new Customer("Anush");
		Customer customer2 = new Customer("Ojas");
		Customer customer3= new Customer("Om");
		
		customer1.createCustomerAccount(bank1,5000);
		customer2.createCustomerAccount(bank2,6000);
		
		customer2.createCustomerAccount(bank1,4000);
		customer3.createCustomerAccount(bank2,5000);
		
		customer1.viewBalance();
		customer2.viewBalance();
		customer3.viewBalance();
		
		bank1.displayBankDetails();
		bank2.displayBankDetails();	
	}
}
class Bank{
	private String bankName;
	private List<Customer> customers;
	
	Bank(String bankName){
		this.bankName = bankName;
		this.customers = new ArrayList<>();
	}

	public void openAccount(Customer customer){
		customers.add(customer);
		System.out.println("The Acount is created for "+customer.getName()+" at "+ bankName+" Bank");
	}
	
	public void displayBankDetails(){
		System.out.println("The Bank : "+this.bankName);
		System.out.println("The Customers are : ");
		
		for( Customer customer: customers){
			customer.displayCustomerDetails();
		}
		System.out.println();
		
	}
	public String getBankName(){
		return this.bankName;
	}
}

class Customer{
	private String customerName;
	private List<Accounts> accounts;
	
	Customer(String customerName){
		this.customerName = customerName;
		this.accounts = new ArrayList<>();
	}
	
	public void createCustomerAccount(Bank bank, double initialdeposit){
		Accounts account = new Accounts(bank, initialdeposit);
		accounts.add(account);
		bank.openAccount(this);
	}
	
	public void viewBalance(){
		System.out.println("The customer : "+customerName);
		for(Accounts account : accounts){
			account.displayAccountDetails();
		}
		System.out.println();
	}
	public String getName(){
		return customerName;
	}
	
	public void displayCustomerDetails(){
		System.out.println("The Customer name is "+customerName+", and number of accounts"+accounts.size());	
		
	}
}
 
class Accounts{
	 private Bank bank;
	 private double initialdeposit;
	 
	 Accounts(Bank bank, double initialdeposit){
		 this.bank = bank;
		 this.initialdeposit = initialdeposit;
	 }
	 
	 public void displayAccountDetails(){
		 System.out.println("The Bank : "+this.bank.getBankName()+" and the balance : "+initialdeposit);
	 
	 }
	
 }