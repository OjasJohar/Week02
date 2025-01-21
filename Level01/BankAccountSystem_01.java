public class BankAccountSystem_01{
	
	public static void main(String[] args){
		
		//Creating class's object
		BankAccount account=new BankAccount("Ojas Johar", 111211034);
		BankAccount.displayTotalAccounts(account);
		
		BankAccount account1=new BankAccount("Anush Tenguriya", 111211002);
		BankAccount.displayTotalAccounts(account1);
	}
}
//Creating BankAccount class
class BankAccount{
	
	//final variable accountNumber
	final long accountNumber;
	//static variable bankName
	static String bankName="HDFC";
	//Static variable
	static int totalAccounts;
	
	String accountHolderName;
	
	//Parameterized constructor
	BankAccount(String accountHolderName, long accountNumber){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		totalAccounts++;
	}
	//method to get total accounts
	public static int getTotalAccounts(){
		return totalAccounts;
	}	
	
	//for display method 
	public static void displayTotalAccounts(BankAccount account){
		if(account instanceof BankAccount){	
			System.out.println("-----Bank Account Details-----");
		    System.out.println("Account Holder Name : "+account.accountHolderName);//non-static variable
		    System.out.println("Account Number      : "+account.accountNumber);//non-static variable
			System.out.println("Bank Name           : "+bankName);//static variable
			System.out.println("Total Accounts      : "+getTotalAccounts());//calling method
		    System.out.println("------------------------------");	
	    } else
			System.out.println("Object is not an instance of class ");
	}		
}