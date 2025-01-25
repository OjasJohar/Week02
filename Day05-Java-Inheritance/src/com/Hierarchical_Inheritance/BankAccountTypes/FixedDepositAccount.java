package com.Hierarchical_Inheritance.BankAccountTypes;

class FixedDepositAccount extends BankAccount {

    protected double interestRate;

    public FixedDepositAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type  : Fixed deposit");
    }

    public void displayDetails() {
        System.out.println("\n-------Account Detail-------");
        displayAccountType();
        System.out.println("Account no.  :" + accountNumber);
        System.out.println("Balance      :" + balance);
        System.out.println("Interest Rate:" + interestRate);
    }
}


