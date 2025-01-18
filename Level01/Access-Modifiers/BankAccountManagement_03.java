// Main class to test the implementation
public class BankAccountManagement_03 {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount(10101, "Om Tamrakar", 1000.0);
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit and withdraw money
        account.deposit(500.0);
        account.withdraw(300.0);
        System.out.println("Final Balance: " + account.getBalance());

        System.out.println("\nSavings Account Example:");
        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount(20202, "Ojas johar", 2000.0, 5.0);
        savings.displayAccountDetails();

    }
}

// Base class: BankAccount
class BankAccount {
    public int accountNumber;         // Public attribute
    protected String accountHolder;   // Protected attribute
    private double balance;           // Private attribute

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.setBalance(initialBalance); // Using setter for initial balance validation
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount. Balance cannot be negative.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Specific to SavingsAccount

    // Constructor
    SavingsAccount(int accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance); // Call parent constructor
        this.interestRate = interestRate;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);     // Access public member
        System.out.println("Account Holder: " + accountHolder);     // Access protected member
        System.out.println("Balance       : " + getBalance());             // Access private member via getter
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}