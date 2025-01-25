package com.Hierarchical_Inheritance.BankAccountTypes;

public class BankAccount {

    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void displayDetails() {
        System.out.println("\n-------Account Detail-------");
        System.out.println("Account no.  :" + accountNumber);
        System.out.println("Balance      :" + balance);
    }
}

