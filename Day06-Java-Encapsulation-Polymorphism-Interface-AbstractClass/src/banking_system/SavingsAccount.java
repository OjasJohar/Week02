package banking_system;

public class SavingsAccount extends BankAccount implements Loanable{
    private double interest;
    private boolean loan;

    public SavingsAccount(String accountNumber, double initialBalance, String holderName,double interest,boolean loan) {
        super(accountNumber, initialBalance, holderName);
        setInterest(interest);
        setLoan(loan);
    }

    public boolean isLoan() {
        return loan;
    }

    public void setLoan(boolean loan) {
        this.loan = loan;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    double calculateInterest() {
        return (getBalance()*interest)/100;
    }

    @Override
    public boolean applyForLoan() {
        return loan;
    }

    @Override
    public void calculateLoanEligibility() {
        System.out.println("Not eligible for Loan.\n");
    }
}

