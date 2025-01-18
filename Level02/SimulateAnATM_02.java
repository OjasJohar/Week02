import java.util.Scanner;

//Creating ATM class
public class Main{
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the name of account Holder :");
		String accountHolder=input.nextLine();
		
		//taking input from the user
		System.out.println("Enter the account Number :");
		String accountNumber=input.nextLine();
		
		//creating object of BankAccount class
		BankAccount account=new BankAccount(accountHolder,accountNumber);
	
	    //taking input from the user
		System.out.println("Enter the amount to deposite:");
		double balance=input.nextDouble();
		
		//calling deposite method
		account.depositeMoney(balance);
		account.displayDetails();
		
		//taking input from the user
		System.out.println("\nEnter the amount to withdraw:");
		balance=input.nextDouble();
		
		//calling deposite method
		account.withdrawMoney(balance);
		account.displayDetails();
		
		//Closing Scanner class
		input.close();
	}
}

//Creating BankAccount class
class BankAccount{
	//Creating accountHolder, accountNumber, balance attributes
	private String accountHolder;
	private String accountNumber;
	private double balance;
	
	//Constructor
	BankAccount(String accountHolder, String accountNumber){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=0;
	}
	
	//Method to deposite money
	public void depositeMoney(double balance){
		this.balance=this.balance + balance;
		System.out.println("Balance deposited successfully.");
	}
	
    //method to withdraw money
	public void withdrawMoney(double balance){
		if(this.balance<balance){
			System.out.println("Insufficient Balance.");
		}else{
		    this.balance=this.balance - balance;
		    System.out.println("Balance withdraw successful.");
		}
	}
	
	//method to displaying details of bank Account
	public void displayDetails(){
	     System.out.println("\n----- Bank Details -----");
		 System.out.println("Account Holder  :" + accountHolder);
		 System.out.println("Account Number  :" + accountNumber);
		 System.out.println("Balance         :" + balance + "$"); 
		 System.out.println("-------------------------");
	}
	
}