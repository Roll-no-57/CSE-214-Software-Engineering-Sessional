public interface Loan {
    void getLoan(double amount);
    void payLoan(double amount);
    double getLoanAmount();
    double getInterestRate();
    double totalInterest(double years);
}
