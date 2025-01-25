package com.Hierarchical_Inheritance.BankAccountTypes;

class CheckingAccount extends BankAccount {
    protected double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type : Checking");
    }

    public void displayDetails() {
        System.out.println("\n-------Account Detail-------");
        displayAccountType();
        System.out.println("Account no.  :" + accountNumber);
        System.out.println("Balance      :" + balance);
        System.out.println("Withdrawal Limit:" + withdrawalLimit);
    }
}

