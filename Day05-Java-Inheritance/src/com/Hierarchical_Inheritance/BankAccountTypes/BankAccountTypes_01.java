package com.Hierarchical_Inheritance.BankAccountTypes;

public class BankAccountTypes_01 {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("101234", 10000);
        bankAccount.displayDetails();

        SavingsAccount savingsAccount=new SavingsAccount(bankAccount.getAccountNumber(), bankAccount.getBalance(), 5);
        savingsAccount.displayDetails();

        CheckingAccount checkingAccount=new CheckingAccount(bankAccount.getAccountNumber(), bankAccount.getBalance(), 5000);
        checkingAccount.displayDetails();

        FixedDepositAccount fixedDepositAccount=new FixedDepositAccount(bankAccount.getAccountNumber(), bankAccount.getBalance(), 5);
        fixedDepositAccount.displayDetails();
    }
}
