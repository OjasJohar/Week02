package banking_system;

public class BankSystem_04 {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("123456789", 500.0,"Anush",5,true);

        // Display account information
        account1.displayAccountInfo();

        // Deposit money
        System.out.println("Depositing money : 150 ");
        account1.deposit(150.0);
        account1.displayAccountInfo();

        // Withdraw money
        System.out.println("Withdrawing money : 100");
        account1.withdraw(100.0);
        account1.displayAccountInfo();
        account1.calculateLoanEligibility();

        CurrentAccount account2=new CurrentAccount("3757512398",1000,"Ojas",5,false);
        account2.displayAccountInfo();
        account2.calculateLoanEligibility();

    }
}
